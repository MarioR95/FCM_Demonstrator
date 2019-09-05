package utilities;


public class ActionAssociation {

	public static String getConceptQualifier(double concept) {
		if(concept >= 0.00 && concept <= 0.14)
			return "low";
		else if(concept >= 0.15 && concept <= 0.30)
			return "enough";
		else if(concept >= 0.31 && concept <= 0.74)
			return "medium";
		else if(concept >= 0.75 && concept <= 1.00)
			return "high";
		else
			return "undefined";
	}
}
