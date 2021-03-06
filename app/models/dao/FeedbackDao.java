package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.FeedbackDto;
import models.dto.UserMeasureDto;
import utilities.ActionAssociation;
import utilities.DateUtil;
import utilities.TrimmedBeanHandler;
import utilities.TrimmedBeanListHandler;

public class FeedbackDao {
	
	
	public static void createBaseFeedback(String courseId, String userId, int weekNumber) throws ConfigurationException, Exception {
		Calendar calendar = Calendar.getInstance();
		GregorianCalendar currentDate =  (GregorianCalendar) calendar;
		
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			ResultSetHandler<Integer> rsh=new ResultSetHandler<Integer>() {
				@Override
				public Integer handle(ResultSet rs) throws SQLException {
					return 1;
				}
			};
						
			UserMeasureDto lastMeasure = UserMeasureDao.retieveLastUserMeasure(courseId, userId, weekNumber);
			
			String c_mot= ActionAssociation.getConceptQualifier(lastMeasure.getC2());
			String c_eng= ActionAssociation.getConceptQualifier(lastMeasure.getC3());
			
			int type = MeasurementsAssociationDao.doRetrieveAssociation(c_mot, c_eng).getFeedbackType();
			
			qRunner.insert(conn, FileQueryReader.getQuery("FEEDBACK_S05"), rsh, new Object[]{DateUtil.format(currentDate), courseId, userId, type});
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static void updateFeedback(String feedbackDate, int actionId, String actionType, String name, String content, String courseId, String userId, String measureDate) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("FEEDBACK_S06"),new Object[]{feedbackDate, name, content, actionType, actionId, courseId, userId, measureDate});

			
		} finally {
			ConnectionPool.close(conn);
		}
		
		
	}

	public static void updateFeedbackEfficacy(String courseId, String userId, String feedbackDate, int efficacy) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("FEEDBACK_S07"),new Object[]{efficacy, courseId, userId, feedbackDate});

			
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<FeedbackDto> retrieveFeedbackList(String courseId, String userId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<FeedbackDto> list = qRunner.query(conn, FileQueryReader.getQuery("FEEDBACK_S01"),new TrimmedBeanListHandler<FeedbackDto>(FeedbackDto.class),new Object[]{courseId,userId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<FeedbackDto> retrieveFeedbackListByCourse(String courseId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<FeedbackDto> list = qRunner.query(conn, FileQueryReader.getQuery("FEEDBACK_S02"),new TrimmedBeanListHandler<FeedbackDto>(FeedbackDto.class),new Object[]{courseId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<FeedbackDto> retrieveFeedbackListByUser(String userId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			List<FeedbackDto> list = qRunner.query(conn, FileQueryReader.getQuery("FEEDBACK_S03"),new TrimmedBeanListHandler<FeedbackDto>(FeedbackDto.class),new Object[]{userId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static FeedbackDto retrieveFeedbacByDate(String courseId, String userId, String date) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			FeedbackDto feedback = qRunner.query(conn, FileQueryReader.getQuery("FEEDBACK_S04"),new TrimmedBeanHandler<FeedbackDto>(FeedbackDto.class),new Object[]{courseId,userId,date});
			
            return feedback;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
}
