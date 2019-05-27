package models.database;

import java.sql.Connection;
import java.util.HashMap;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;





public class ConnectionPool {
		
		//private static DataSource dataSource;
		
		private static HashMap<String, DataSource> dsCollection = new HashMap<String, DataSource>();;
		
		//private static XmlConfiguration config;
		
		private static Log _log = LogFactory.getLog(ConnectionPool.class);
		
		private ConnectionPool() {
		
		}
		
		public static void close(Connection conn) {
			
		}
		
		public static Connection getSingleton(String key){
			return null;
		}
		
		@SuppressWarnings("unused")
		private static void setupDataSource(String key){
			
		}

}
