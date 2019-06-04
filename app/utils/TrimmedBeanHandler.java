package utils;

import java.sql.ResultSet;

import org.apache.commons.dbutils.ProxyFactory;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.wrappers.StringTrimmedResultSet;

public class TrimmedBeanHandler<T> extends BeanHandler<T> {

    public TrimmedBeanHandler(Class<T> type) {
        super(type);
    }

    public T handle(ResultSet rs) throws java.sql.SQLException {
        StringTrimmedResultSet wrapper = new StringTrimmedResultSet(rs);
        return super.handle(ProxyFactory.instance().createResultSet(wrapper));
    }

}
