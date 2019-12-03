package models.dao;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.QuestionsDto;
import utilities.TrimmedBeanListHandler;

public class QuestionsDao {

	public static List<QuestionsDto> retrieveQuestionsList(String contentType,String topic) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<QuestionsDto> list = qRunner.query(conn, FileQueryReader.getQuery("QUESTIONS_S01"),new TrimmedBeanListHandler<QuestionsDto>(QuestionsDto.class),new Object[]{contentType, topic});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
}
