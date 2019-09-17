package models.dao;

import java.sql.Connection;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.FirstLevelFeedbackAssociationDto;
import utilities.TrimmedBeanHandler;

public class FirstLevelFeedbackAssociationDao {

	
	public static FirstLevelFeedbackAssociationDto retrieveActionGroup(String mot, String eng) throws ConfigurationException, Exception {
			
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			FirstLevelFeedbackAssociationDto actionGroup = qRunner.query(conn, FileQueryReader.getQuery("FIRST_LEVEL_FEEDBACK_S01"), new TrimmedBeanHandler<FirstLevelFeedbackAssociationDto>(FirstLevelFeedbackAssociationDto.class),new Object[]{eng, mot});
			
            return actionGroup;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
		
	}
}
	