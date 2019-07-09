package models.dao;

import java.sql.Connection;
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
	
	public static List<Integer> retrieveNPostsByCourseId(String courseId) throws ConfigurationException, Exception{
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserHistoryDto> users = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S01"),new TrimmedBeanListHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{courseId});
			
			List<Integer> nForums = new ArrayList<Integer>();
			
			for(UserHistoryDto u : users) {
				nForums.add(u.getnPosts());
			}
			
			return nForums;
			
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static UserHistoryDto retrieveStudentHistoryById(String userId) throws ConfigurationException, Exception {
		Connection conn = null;
	
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			UserHistoryDto user = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S02"),new TrimmedBeanHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{userId});
			
			return user;
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static String retrieveLastEventByUserId(String userId) throws ConfigurationException, Exception {
		Connection conn = null;
	
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			String lastEvent= qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S02"),new TrimmedBeanHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{userId}).getLastEvent();
			return lastEvent;
		} finally {
			ConnectionPool.close(conn);
		}
	}
	
	
	public static String retrieveStartDate(String courseId, String userId) throws ConfigurationException, Exception {
		  Connection conn = null;
		  
		  try {
		   conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
		   QueryRunner qRunner = new QueryRunner();
		   
		   String startDate = qRunner.query(conn, FileQueryReader.getQuery("USER_HISTORY_S02"),new TrimmedBeanHandler<UserHistoryDto>(UserHistoryDto.class),new Object[]{userId}).getStartTime();
		   
		     return startDate;
		  }
		  
		  finally {
		   ConnectionPool.close(conn);
		  }
	 }
	
	
}
