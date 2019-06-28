package utilities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TypeDate {

	private String year;
	private String month;
	private String day;
	
	
	public TypeDate(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static TypeDate format(String date) {
		String tmp[] = date.split("-");
		return new TypeDate(tmp[0], tmp[1], tmp[2]);
	}
	
	
	public String getYear() {
		return year;
	}


	public String getMonth() {
		return month;
	}


	public String getDay() {
		return day;
	}
	
	public String getTimeStamp() {
		return ""+getDay()+"/"+getMonth()+"/"+getYear();
	}

	@Override
	public String toString() {
		return "TypeDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	public static int datesDifference(TypeDate lastEvent) {
			
		//Calendar currentDate= Calendar.getInstance();
		Calendar currentDate= new GregorianCalendar(2019,4-1,12);
		
		//Last activity day
		Calendar lastDate= new GregorianCalendar(Integer.parseInt(lastEvent.getYear()), Integer.parseInt(lastEvent.getMonth())-1, Integer.parseInt(lastEvent.getDay()));
		
		return ( currentDate.get(Calendar.DAY_OF_YEAR) - lastDate.get(Calendar.DAY_OF_YEAR) );
	}
	
	public static String gregorianToString(GregorianCalendar date) {
		return date.get(Calendar.DAY_OF_MONTH)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.YEAR);
	}

}
