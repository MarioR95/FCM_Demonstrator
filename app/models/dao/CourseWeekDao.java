package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.dto.CourseWeekDto;
import models.database.FileQueryReader;
import utilities.TrimmedBeanHandler;

public class CourseWeekDao {

	public static CourseWeekDto retrieveWeeklyCourseInfoById(String courseID, int week_number) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			CourseWeekDto week = qRunner.query(conn, FileQueryReader.getQuery("COURSE_WEEK_S01"),new TrimmedBeanHandler<CourseWeekDto>(CourseWeekDto.class),new Object[]{courseID,week_number});
			
            return week;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
			
}
	
