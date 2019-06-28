package utilities;


import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.dbutils.ProxyFactory;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.wrappers.StringTrimmedResultSet;

public class TrimmedBeanListHandler<T> extends BeanListHandler<T> {

	public TrimmedBeanListHandler(Class<T> type) {
		super(type);
	}

	public List<T> handle(ResultSet rs) throws java.sql.SQLException {
		StringTrimmedResultSet wrapper = new StringTrimmedResultSet(rs);
		return super.handle(ProxyFactory.instance().createResultSet(wrapper));
	}

}
