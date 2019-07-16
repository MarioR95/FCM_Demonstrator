package models.dto;

public class SurveyDto {

	private double normalized_value;
	
	public SurveyDto() {
		
	}

	public double getNormalized_value() {
		return normalized_value;
	}

	public void setNormalized_value(double normalized_value) {
		this.normalized_value = normalized_value;
	}

	@Override
	public String toString() {
		return "SurveyDto [normalized_value=" + normalized_value + "]";
	}
	
	
	
}
