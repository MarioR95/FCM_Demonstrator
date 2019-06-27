package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.dto.CourseDto;
import models.database.FileQueryReader;
import models.dto.UserDto;
import utilities.TrimmedBeanHandler;

public class CourseDao {

	public static CourseDto doRetrieveCourseById(String courseId) throws ConfigurationException, Exception {

		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			CourseDto course = qRunner.query(conn, FileQueryReader.getQuery("COURSE_S01"),new TrimmedBeanHandler<CourseDto>(CourseDto.class),new Object[]{courseId});
			
            return course;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	
}
