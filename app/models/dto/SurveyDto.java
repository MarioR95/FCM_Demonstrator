package models.dto;

public class SurveyDto {

	private double normalizedValue;
	
	public SurveyDto() {
		
	}

	public double getNormalizedValue() {
		return normalizedValue;
	}

	public void setNormalizedValue(double normalizedValue) {
		this.normalizedValue = normalizedValue;
	}

	@Override
	public String toString() {
		return "SurveyDto [normalizedValue=" + normalizedValue + "]";
	}
	
	
}
