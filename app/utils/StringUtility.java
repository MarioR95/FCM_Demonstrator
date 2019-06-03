package utils;

public class StringUtility {
	
	public static String formatForLike(String toSearch){
		return new StringBuilder("%").append(toSearch).append("%").toString();
	}

}
