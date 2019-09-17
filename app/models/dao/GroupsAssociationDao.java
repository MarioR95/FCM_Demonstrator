package models.dao;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.GroupsAssociationDto;
import utilities.TrimmedBeanListHandler;

public class GroupsAssociationDao {
	
	public static List<GroupsAssociationDto> retrieveActionsList(String groupId) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<GroupsAssociationDto> list = qRunner.query(conn, FileQueryReader.getQuery("GROUPS_ASSOCIATION_S01"),new TrimmedBeanListHandler<GroupsAssociationDto>(GroupsAssociationDto.class),new Object[]{groupId});
            return list;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
}
