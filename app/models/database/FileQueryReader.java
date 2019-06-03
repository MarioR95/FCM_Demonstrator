package models.database;

import constants.IConstants;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationUtils;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileQueryReader {

	static HashMap<String,String> queryMap;

	private static Log _log = LogFactory.getLog(FileQueryReader.class);

	static {
		try {
			XMLConfiguration config = new XMLConfiguration();
			//config.setFile(ConfigurationUtils.getFile("\"" + fileQueryDirectory + "\"", IConstants.QUERY_FILE));
			config.setFile(FileUtils.toFile(ConfigurationUtils.getURL(IConstants.CONFIG_DIR, IConstants.QUERY_FILE)));
			config.setDelimiterParsingDisabled(true);
			config.load();
			List<?> key = config.getList("query[@name]");
			List<?> value = config.getList("query.content");
			queryMap = new HashMap<String, String>();
			for(int i = 0; i < key.size(); i++) {
				queryMap.put((String) key.get(i), (String) value.get(i));
			}
			
		} catch (ConfigurationException e) {
			_log.fatal("Errore nella lettura del file query",e);
		} catch (Exception e) {
			_log.fatal("Errore nella lettura del file query",e);
		}
	}

	private FileQueryReader() {}

	public static String getQuery(String name) {
		return queryMap.get(name);
	}

	public static void main(String[] args) {
		new FileQueryReader();
	}
}

