package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.UserHistoryDto;
import utilities.TrimmedBeanHandler;
import utilities.TrimmedBeanListHandler;

public class UserHistoryDao {

	public static List<UserHistoryDto> retrieveAllStudentsByCourseId(String courseId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserHistoryDto> list = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S01"),new TrimmedBeanListHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{courseId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static UserHistoryDto retrieveStudentHistoryById(String courseId, String userId) throws ConfigurationException, Exception {

		Connection conn = null;
		

		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			UserHistoryDto user = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S02"),new TrimmedBeanHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{courseId, userId});

			return user;
			
		} finally {
			ConnectionPool.close(conn);
		}

		
	}
	
	public static void resetMotivationValues(String courseId, String userId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("USER_HISTORY_S03"),new Object[]{courseId, userId});

			
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<Double> retrieveNPostsByCourseId(String courseId) throws ConfigurationException, Exception{
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<Double> nForums = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S04"),new TrimmedBeanListHandler<Double>(Double.class),new Object[]{courseId});

			return nForums;
			
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	
}
