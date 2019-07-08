package utilities;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationUtils;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.io.FileUtils;
import org.megadix.jfcm.CognitiveMap;
import org.megadix.jfcm.Concept;
import org.megadix.jfcm.utils.FcmIO;

import constants.IConstants;
import models.dao.CourseWeekDao;
import models.dao.SurveyDao;
import models.dao.UserHistoryDao;
import models.dao.UserMeasureDao;
import models.dto.CourseWeekDto;
import models.dto.UserHistoryDto;
import models.dto.UserMeasureDto;

public class MapHandler {

	private static final int MAX_EPOCHS = 4;
	//private static final double MAX_DELTA = 0.1;
	private static final double C = 5.5;

	public static final double MINIMAMENTE = 0.125;
	public static final double POCO = 0.25;
	public static final double MEDIOCRAMENTE = 0.375;
	public static final double MEDIAMENTE = 0.50;
	public static final double DISCRETAMENTE = 0.625;
	public static final double SUFFICIENTEMENTE = 0.75;
	public static final double ABBASTANZA = 0.875;
	public static final double MOLTO = 1.00;


	/**
	 * Load the modelled XML CognitiveMap.
	 * @throws MalformedURLException 
	 * @throws ConfigurationException 
	 * 
	 * @RETURN: the CognitiveMap object that corresponds to a FCM model
	 * 
	 */
	public static CognitiveMap loadFromXML() throws MalformedURLException, ConfigurationException {
		CognitiveMap map = null;

		try {
			map = FcmIO.loadXml("conf\\XMLMap.xml").get(0);
			map.reset(); // INITIALIZE
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}

		return map;
	}


	/**
	 * Initialize the leaf concepts output using values from the established user
	 * data.
	 * @throws Exception 
	 * @throws ConfigurationException 
	 * 
	 * @PARAMS: the CognitiveMap object model, the UserRetentionBean corresponding
	 *          to user current data.
	 **/
	public static void setConceptsValues(CognitiveMap map, UserHistoryDto user, int weekNumber) throws ConfigurationException, Exception {

		int[] i_motivation_votes = new int[] { user.getCuriosity(), user.getEnjoyment(), user.getGeneralInterest() };
		int[] e_motivation_votes = new int[] { user.getCertificate(), user.getCredential(), user.getAcademic(),
				user.getJob() };
		int[] s_motivation_votes = new int[] { user.getConnection(), user.getFriendship() };

		CourseWeekDto courseWeek = CourseWeekDao.retrieveWeeklyCourseInfoById(user.getCourseId(), weekNumber);
		List<Integer> allForumPostsDone = UserHistoryDao.retrieveNPostsByCourseId(user.getCourseId());
		double norm = Normalizer.normalize(allForumPostsDone);

		//map.setOutput("c1", 0.0);// retention
		map.setOutput("c2", 0.0);// motivation
		map.setOutput("c3", 0.0);// engagement

		map.setOutput("c4", SurveyDao.retriveSurveysAssociation(i_motivation_votes));// intrinsic mot
		map.setOutput("c5", SurveyDao.retriveSurveysAssociation(e_motivation_votes));// estrinsic mot
		map.setOutput("c6", SurveyDao.retriveSurveysAssociation(s_motivation_votes));// social mot

		map.setOutput("c7", 0.0);// forumActivities
		map.setOutput("c9", (new Double(user.getnPosts()) / norm));// nPost

		map.setOutput("c10", 0.0);// AVGSession
		map.setOutput("c11", (new Double(user.getnChapters()) / courseWeek.getnChapters()));// nChapter

		map.setOutput("c12", (new Double(user.getnPlayVideo()) / courseWeek.getnVideos()));// nPlayVdeos

		map.setOutput("c13", user.getPercVideoViewed());// percVideoViewed

		map.setOutput("c8", computeMapDatesValue(DateUtil.convertFromDMY(user.getLastForumView())));// lastForumActivities
		map.setOutput("c14", computeMapDatesValue(DateUtil.convertFromDMY(user.getLastLesson())));// lastLesson
		map.setOutput("c15", computeMapDatesValue(DateUtil.convertFromDMY(user.getLastEvent())));// lastEvent

		map.setOutput("c16", 0.0);// assignment
		map.setOutput("c17", 0.0);// interactions
		map.setOutput("c18", (new Double(user.getTasksDone()) / courseWeek.getnTasks()));// tasksDone

	}

	/**
	 * Compare the user's previous measures with the currentMeasures.
	 * 
	 * @PARAM: the UserRetentionBean which represents the previous user's
	 *         measurement, the Measures object which represents the current
	 *         measures.
	 * @RETURN: the new Measures object which represents the values that must be
	 *          stored.
	 **/
	private static Measures compareUserHistory(Measures previousMeasures, Measures currentMeasures, GregorianCalendar lastEvent) {

		Measures newMeasure = new Measures();

		double alpha = 0.0;
		double beta = 0.0;
		double alpha_mot = 0.0, alpha_eng = 0.0;
		double beta_mot = 0.0, beta_eng = 0.0;

		// If engagement and motivation equal to 0 mean that this is the first measuring
		if (previousMeasures.getEngagement_value() == 0 && previousMeasures.getMotivation_value() == 0) {
			alpha = 0.0;
		} else {
			alpha = computeAlpha(DateUtil.datesDifference(lastEvent));

			alpha_mot = alpha * previousMeasures.getMotivation_value();
			alpha_eng = alpha * previousMeasures.getEngagement_value();
		}

		beta = 1 - alpha;
		
		beta_mot = beta * currentMeasures.getMotivation_value();
		beta_eng = beta * currentMeasures.getEngagement_value();
		
		newMeasure.setMotivation_value(alpha_mot + beta_mot);
		newMeasure.setEngagement_value(alpha_eng + beta_eng);

		return newMeasure;
	}

	/**
	 * @throws Exception 
	 * @throws ConfigurationException 
	 * 
	 **/
	public static void execute(CognitiveMap map, UserHistoryDto user, int weekNumber) throws ConfigurationException, Exception {
		//SimpleFcmRunner runner = new SimpleFcmRunner(map, -MAX_DELTA, MAX_EPOCHS);
		//runner.converge();
		GregorianCalendar currentDate= new GregorianCalendar(2019,4-1,19);
		MapHandler.printMapHeader(map, "\t");
		for(int i = 0; i < MAX_EPOCHS; i++) {
			map.execute();
			MapHandler.printMapState(map);
			UserMeasureDao.doSaveMapIteration(user.getCourseId(), user.getUserId(), weekNumber, i+1, map, DateUtil.format(currentDate));
		}
		

		// Retrieve oldMeasure if exists
		UserMeasureDto oldMeasuresDto;
		Measures oldMeasures = new Measures();
		if (weekNumber > 0) {
			oldMeasuresDto = UserMeasureDao.retieveUserMeasure(user.getCourseId(), user.getUserId(),
					(weekNumber - 1));
			
			oldMeasures.setMotivation_value(oldMeasuresDto.getC2());
			oldMeasures.setEngagement_value(oldMeasuresDto.getC3());
			
		} else {
			oldMeasuresDto = new UserMeasureDto();
		}

		
		Measures currentMeasures = new Measures();
		currentMeasures.setEngagement_value(map.getConcept("c3").getOutput());
		currentMeasures.setMotivation_value(map.getConcept("c2").getOutput());

		Measures newMeasures = compareUserHistory(oldMeasures, currentMeasures, DateUtil.convertFromDMY(user.getLastEvent()));
		UserMeasureDao.doUpdateMeasures(user.getCourseId(), user.getUserId(), weekNumber, newMeasures);
		
		if(weekNumber%2 == 0) {
			UserHistoryDao.resetMotivationValues(user.getCourseId(), user.getUserId());
		}

	}


	public static void printMapHeader(CognitiveMap map, String sep) {
		System.out.println(
				map.getConcepts().values().stream().map(concept -> concept.getName()).collect(Collectors.joining(sep)));
	}


	public static void printMapState(CognitiveMap map) {
		printMapState(map, "\t", new DecimalFormat("#.##"));
	}


	public static void printMapState(final CognitiveMap map, final String sep, final NumberFormat nf) {
		System.out.println(map.getConcepts().values().stream().map(Concept::getOutput).map(out -> {
			if (out == null) {
				return "";
			}
			return nf != null ? nf.format(out) : out.toString();
		}).collect(Collectors.joining(sep)));
	}


	private static double computeAlpha(int inactivityTime) {
		if (inactivityTime >= 0 && inactivityTime <= 14) {
			return 0.35;
		} else if (inactivityTime > 14) {
			return (C / inactivityTime);
		} else {
			return 0.0;
		}
	}

	private static double computeMapDatesValue(GregorianCalendar date) {

		int diff = DateUtil.datesDifference(date);
		return ((Math.pow(Math.E, (4.8 - (0.2 * diff)))) / 100);

	}

	
}
