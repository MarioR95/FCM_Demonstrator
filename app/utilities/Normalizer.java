package utilities;

import java.util.List;

public class Normalizer {

	public static double normalize(List<Integer> list) {
		
		double sum = 0;
		double norm = 0;
		
		for(int n: list)
			sum+=Math.pow(n, 2);
		
		norm = Math.sqrt(sum);
		
		return norm;
	}
	
	
}
