package models.dto;

public class FirstLevelFeedbackAssociationDto {
	
	private int id;
	private String eng, mot;
	private String groupId;
	
	public FirstLevelFeedbackAssociationDto() {
		
	}
	
	public FirstLevelFeedbackAssociationDto(int id, String eng, String mot, String groupId) {
		super();
		this.id= id;
		this.eng = eng;
		this.mot = mot;
		this.groupId = groupId;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "FirstLevelFeedbackAssociationDto [eng=" + eng + ", mot=" + mot + ", groupId=" + groupId + "]";
	}
	
	
	
}
