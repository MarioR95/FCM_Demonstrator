package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;

public class ContentsResultsDao {
	//STORE RESULTS
	public static void doSaveContentResult(String courseId, String userId, String contentType, String topic, int elapsedTime, int achievedScore, int totalScore) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			ResultSetHandler<Integer> rsh=new ResultSetHandler<Integer>() {
				@Override
				public Integer handle(ResultSet rs) throws SQLException {
					return 1;
				}
			};
			
			qRunner.insert(conn, FileQueryReader.getQuery("CONTENTS_RESULTS_S01"), rsh, 
					new Object[]{courseId, userId, contentType, topic, elapsedTime, achievedScore, totalScore}
			);
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	
	}
	
}
