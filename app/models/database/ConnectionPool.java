package models.database;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.TimeZone;

import javax.sql.DataSource;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationUtils;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool.impl.GenericObjectPool;

import constants.IConstants;

public class ConnectionPool{
		
	private static HashMap<String, DataSource> dsCollection = new HashMap<String, DataSource>();
	
	private static XMLConfiguration config;
	
	private static Log _log = LogFactory.getLog(ConnectionPool.class);
	
	private ConnectionPool() {}
	
	public static void close(Connection conn) {
		try {
			DbUtils.close(conn);
		} catch (SQLException e) {
			_log.error("Errore nella chiusura della connessione: " + e.getMessage());
		}
	}
	
	public static Connection getSingleton(String key) throws ConfigurationException, Exception {
		String lKey = (key == null ? "dataset" : key);
		_log.info(new StringBuilder("Key nel singleton: ").append(key));
		if (!dsCollection.containsKey(lKey)) {
			URL url = ConfigurationUtils.getURL(IConstants.CONFIG_DIR, IConstants.DB_FILE);
			config = new XMLConfiguration(url);
			setupDataSource(lKey);  
		}
		
		return dsCollection.get(lKey).getConnection();
	}
	
	private static void setupDataSource(String key) throws Exception {
		try {
			Class.forName(config.getString(IConstants.DB_DRIVER));
		
			_log.debug("Tentativo di connessione al database in corso...");
			_log.info(new StringBuilder("Chiave db: ").append(key));
			GenericObjectPool connectionPool = new GenericObjectPool();
			connectionPool.setMaxIdle(config.getInt(IConstants.DB_POOLMAXSIZE));
			connectionPool.setMaxActive(config.getInt(IConstants.DB_POOLMAXSIZE));
			connectionPool.setTestWhileIdle(true);
			connectionPool.setTestOnBorrow(true);
			connectionPool.setTestOnReturn(false);
			connectionPool.setTimeBetweenEvictionRunsMillis(1000 * 60 * 15);
			connectionPool.setMinEvictableIdleTimeMillis(1000 * 60 * 2);
			connectionPool.setNumTestsPerEvictionRun(10);
			
			String connectUri = new StringBuilder("jdbc:")
					.append(config.getString(IConstants.DB_TYPE))
					.append("://").append(config.getString(IConstants.DB_URL))
					.append(":").append(config.getString(IConstants.DB_PORT))
					.append("/").append(key).append("?user=").append(config.getString(IConstants.DB_USER))
					.append("&password=").append(""/*config.getString(IConstants.DB_PWD)*/)
					.append("?timeZone="+TimeZone.getDefault().getID()).toString();
			ConnectionFactory connectionFactory = new DriverManagerConnectionFactory(connectUri,null);
			
			PoolableConnectionFactory poolableConnectionFactory = new PoolableConnectionFactory(connectionFactory, connectionPool, null, "SELECT 1", false, true);
			
			DataSource dataSource = new PoolingDataSource(poolableConnectionFactory.getPool());
			dsCollection.put(key, dataSource);
			
			_log.debug("Connessione al database riuscita");
			
		} catch (Exception ex) {
			_log.fatal("Errore durante il setup del datasource",ex);
			throw ex;
		}
	}

}
