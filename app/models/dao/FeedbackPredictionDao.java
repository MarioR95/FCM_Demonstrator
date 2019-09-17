package models.dao;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.FeedbackPredictionDto;
import utilities.TrimmedBeanListHandler;

public class FeedbackPredictionDao {

	
	public static List<FeedbackPredictionDto> retrieveImprovementsByActionId(int actionGroupId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<FeedbackPredictionDto> list = qRunner.query(conn, FileQueryReader.getQuery("FEEDBACK_PREDICTION_S01"),new TrimmedBeanListHandler<FeedbackPredictionDto>(FeedbackPredictionDto.class),new Object[]{actionGroupId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
}
