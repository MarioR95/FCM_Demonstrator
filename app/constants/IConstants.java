package constants;

public interface IConstants {
	
	static final String RESOURCES_FILE = "MessageResources";
	static final String RESOURCES_FILE_EXTENSION = ".properties";

	
	//nome della cartella contenente i file di configurazione
	static final String CONFIG_DIR = "conf/";
	//nome del file di configurazione
	//static final String CONFIG_FILE = "config.xml";
	//nome del file contenente i parametri per la connessione al db
	static final String DB_FILE = "db.xml";
	//nome del file contenente i parametri per la configurazione di log4j
	static final String LOG4J_FILE = "log4j.xml";
	//nome del file query
	static final String QUERY_FILE = "query.xml";
	//nome della FCM
	static final String FCM_FILE = "XMLMap.xml";
	
	static final String DB_KEY = "dataset";

	
	static final String DOCUMENT_DIR = "document";

	
	static final String REPORT_DIR = "report";

	
	//nomi delle costanti all'interno del file DB_FILE
	//parametri relativi alla connessione al db
	static final String DB_DRIVER = "dbDriverName";
	static final String DB_NAME = "dbName";
	static final String DB_POOLMINSIZE = "dbPoolMinSize";
	static final String DB_POOLMAXSIZE = "dbPoolMaxSize";
	static final String DB_PORT = "dbPort";
	static final String DB_PWD = "dbPwd";
	static final String DB_TYPE = "dbType";
	static final String DB_URL = "dbUrl";
	static final String DB_USER = "dbUser";

	
	//nomi "logici" dei gruppi utente
	static final String TEACHER = "Teacher";
	static final String STUDENT = "Student";

	
	static final String LIKE_OPERATOR = "%";

	
	static final String DATE_FORMAT_IT = "dd/MM/yyyy";

	
	static final String VERSION = "0.1";


	
}