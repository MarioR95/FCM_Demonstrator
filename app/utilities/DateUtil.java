package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
	
 	private static SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
 	
 	public static GregorianCalendar convertFromDMY(String dd_mm_yy) throws ParseException{
        String[] splitDate = dd_mm_yy.split("-");
        int days = Integer.parseInt(splitDate[0]);
        int month = (Integer.parseInt(splitDate[1]) - 1);
        int year = Integer.parseInt(splitDate[2]);

        GregorianCalendar dateConverted = new GregorianCalendar(year, month, days);
        return dateConverted;
    }

   
    public static String format(GregorianCalendar date) throws ParseException{

       fmt.setCalendar(date);
        String dateFormatted = fmt.format(date.getTime());
        return dateFormatted;
    }
    
    public static int datesDifference(GregorianCalendar lastEvent) {
		//Calendar currentDate= Calendar.getInstance();
		GregorianCalendar currentDate= new GregorianCalendar(2019,4-1,12);
		//Last activity day
		GregorianCalendar lastDate= new GregorianCalendar(lastEvent.get(Calendar.YEAR), lastEvent.get(Calendar.MONTH), lastEvent.get(Calendar.DAY_OF_MONTH));

		return ( currentDate.get(Calendar.DAY_OF_YEAR) - lastDate.get(Calendar.DAY_OF_YEAR) );
	}
	
	
}
