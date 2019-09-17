package models.dao;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.SecondLevelFeedbackAssociationDto;
import utilities.TrimmedBeanListHandler;

public class SecondLevelFeedbackAssociationDao {

	public static List<SecondLevelFeedbackAssociationDto> retrieveActionsList(String actionGroupId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<SecondLevelFeedbackAssociationDto> list = qRunner.query(conn, FileQueryReader.getQuery("SECOND_LEVEL_FEEDBACK_S01"),new TrimmedBeanListHandler<SecondLevelFeedbackAssociationDto>(SecondLevelFeedbackAssociationDto.class),new Object[]{actionGroupId});
			
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
}
