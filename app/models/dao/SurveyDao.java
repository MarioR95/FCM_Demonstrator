package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.SurveyDto;
import utilities.TrimmedBeanHandler;

public class SurveyDao {
	
	
	public static double retriveSurveysAssociation(int... votes) throws ConfigurationException, Exception {

	
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			double avg = 0.0;
			double value = 0.0;
	
			for (int vote : votes) {
				avg += vote;
			}
	
			avg = Math.floor((avg /= votes.length) * 100) / 100;
			
			if(avg>=0 && avg <1) {
				return 0;
			}
			
			else {
				SurveyDto survey = qRunner.query(conn, FileQueryReader.getQuery("SURVEY_S01"),new TrimmedBeanHandler<SurveyDto>(SurveyDto.class),new Object[]{avg, avg});
			
				return survey.getNormalized_value();
			}
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	
	}
	
}
