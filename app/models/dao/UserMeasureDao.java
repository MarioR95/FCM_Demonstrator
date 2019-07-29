package models.dao;

import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.megadix.jfcm.CognitiveMap;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.UserMeasureDto;
import utilities.MapHandler;
import utilities.Measures;
import utilities.TrimmedBeanHandler;
import utilities.TrimmedBeanListHandler;

public class UserMeasureDao {

	public static UserMeasureDto retieveUserMeasure(String courseId, String userId, int weekNumber) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			UserMeasureDto userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S01"),new TrimmedBeanHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId,weekNumber});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<UserMeasureDto> retieveUserMeasure(String courseId, String userId) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserMeasureDto> userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S04"),new TrimmedBeanListHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<UserMeasureDto> retrieveWeekInterations(String courseId, String userId, int weekNumber) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserMeasureDto> userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S05"),new TrimmedBeanListHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId,weekNumber});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static void doUpdateMeasures(String courseId, String userId, int weekNumber, Measures measures) throws ConfigurationException, Exception {				
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("USER_MEASURE_S02"),new Object[]{measures.getMotivation_value(), measures.getEngagement_value(), courseId, userId, weekNumber});
		}
	
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static void doSaveMapIteration(String courseId, String userId, int weekNumber,int iterationNumber, CognitiveMap map, String date) throws ConfigurationException, Exception {
		DecimalFormat df2 = new DecimalFormat("#.##");
		df2.setRoundingMode(RoundingMode.DOWN);
		
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
			
			double var = Double.parseDouble(df2.format(map.getConcept("c7").getOutput()));
			System.out.println("valore = " + var);

			MapHandler.printMapHeader(map, "\t");
			MapHandler.printMapState(map);
			
			qRunner.insert(conn, FileQueryReader.getQuery("USER_MEASURE_S03"), rsh,
					new Object[]{courseId, userId, weekNumber, iterationNumber, date,
							Double.parseDouble(df2.format(map.getConcept("c2").getOutput())),Double.parseDouble(df2.format(map.getConcept("c3").getOutput())),Double.parseDouble(df2.format(map.getConcept("c4").getOutput())),Double.parseDouble(df2.format(map.getConcept("c5").getOutput())),Double.parseDouble(df2.format(map.getConcept("c6").getOutput())),
							Double.parseDouble(df2.format(map.getConcept("c7").getOutput())),Double.parseDouble(df2.format(map.getConcept("c8").getOutput())),Double.parseDouble(df2.format(map.getConcept("c9").getOutput())),Double.parseDouble(df2.format(map.getConcept("c10").getOutput())),Double.parseDouble(df2.format(map.getConcept("c11").getOutput())),
							Double.parseDouble(df2.format(map.getConcept("c12").getOutput())),Double.parseDouble(df2.format(map.getConcept("c13").getOutput())),Double.parseDouble(df2.format(map.getConcept("c14").getOutput())),Double.parseDouble(df2.format(map.getConcept("c15").getOutput())),Double.parseDouble(df2.format(map.getConcept("c16").getOutput())),
							Double.parseDouble(df2.format(map.getConcept("c17").getOutput())),Double.parseDouble(df2.format(map.getConcept("c18").getOutput()))});
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	
	}
	
}
