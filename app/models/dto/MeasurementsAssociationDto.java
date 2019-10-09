package models.dto;

public class MeasurementsAssociationDto {

	private String mot;
	private String eng;
	private int feedbackType;
	private String statusType;
	
	public MeasurementsAssociationDto() {
		
	}
	
	public MeasurementsAssociationDto(String mot, String eng, int feedbackType, String statusType) {
		super();
		this.mot = mot;
		this.eng = eng;
		this.feedbackType = feedbackType;
		this.statusType = statusType;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public int getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(int feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	
	
}
