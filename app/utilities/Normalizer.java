package utilities;

import java.util.List;

public class Normalizer {

	public static double normalize(List<Double> list) {
		
		double sum = 0;
		double norm = 0;
		
		for(double n: list)
			sum+=Math.pow(n, 2);
		
		norm = Math.sqrt(sum);
		
		return norm;
	}
	
	
}
