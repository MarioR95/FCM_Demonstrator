package models.dao;

import java.sql.Connection;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.LearningContentDto;
import utilities.TrimmedBeanHandler;

public class LearningContentDao {
	
	
	public static void doUpdateRecord(String courseId, String userId, String contentType, String topic, int elapsedTime, int completed) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("LEARNING_CONTENT_S01"), new Object[]{courseId,userId,contentType,topic,elapsedTime,completed,elapsedTime,completed});
		}
	
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	
	public static int retrieveElapsedTimeByTopic(String courseId, String userId, String topic) throws ConfigurationException, Exception {
		Connection conn = null;
				
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			LearningContentDto dto = qRunner.query(conn, FileQueryReader.getQuery("LEARNING_CONTENT_S02"),new TrimmedBeanHandler<LearningContentDto>(LearningContentDto.class),new Object[]{courseId,userId, topic});
			if(dto != null) {
				return dto.getElapsedTime();
			}
		      
		}
		
		finally {
			ConnectionPool.close(conn);
		}
		
		return -1;
	}
	
	
}
