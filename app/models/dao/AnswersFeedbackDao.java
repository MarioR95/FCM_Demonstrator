package models.dao;

import java.sql.Connection;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.AnswersFeedbackDto;
import utilities.TrimmedBeanHandler;

public class AnswersFeedbackDao {

	public static AnswersFeedbackDto retrieveAnswersFeedbackByQuestionId(int questionId) throws ConfigurationException, Exception {	
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			AnswersFeedbackDto answ = qRunner.query(conn, FileQueryReader.getQuery("ANSWERS_FEEDBACK_S01"),new TrimmedBeanHandler<AnswersFeedbackDto>(AnswersFeedbackDto.class),new Object[]{questionId});
			
            return answ;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
}
