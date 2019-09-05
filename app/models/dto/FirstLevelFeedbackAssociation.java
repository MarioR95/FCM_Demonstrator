package models.dto;

public class FirstLevelFeedbackAssociation {
	
	private double eng, mot;
	private String groupId;
	
	public FirstLevelFeedbackAssociation() {
		
	}
	
	public FirstLevelFeedbackAssociation(double eng, double mot, String groupId) {
		super();
		this.eng = eng;
		this.mot = mot;
		this.groupId = groupId;
	}
	
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMot() {
		return mot;
	}
	public void setMot(double mot) {
		this.mot = mot;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	
}
