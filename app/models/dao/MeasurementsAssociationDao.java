package models.dao;

import java.sql.Connection;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.MeasurementsAssociationDto;
import utilities.TrimmedBeanHandler;

public class MeasurementsAssociationDao {

	public static MeasurementsAssociationDto doRetrieveAssociation(String mot, String eng) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			MeasurementsAssociationDto measurements = qRunner.query(conn, FileQueryReader.getQuery("MEASUREMENTS_ASSOCIATION_S01"),new TrimmedBeanHandler<MeasurementsAssociationDto>(MeasurementsAssociationDto.class),new Object[]{mot, eng});
			
            return measurements;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
}
