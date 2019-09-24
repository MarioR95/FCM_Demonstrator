package models.dto;

public class SecondLevelFeedbackAssociationDto {
	private int actionGroupId;
	private String actionDescription, action, description;
	
	public SecondLevelFeedbackAssociationDto() {
		
	}

	public SecondLevelFeedbackAssociationDto(int actionGroupId, String actionDescription, String action, String description) {
		super();
		this.actionGroupId = actionGroupId;
		this.actionDescription = actionDescription;
		this.action = action;
		this.description = description;
	}

	public int getActionGroupId() {
		return actionGroupId;
	}

	public void setActionGroupId(int actionGroupId) {
		this.actionGroupId = actionGroupId;
	}

	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

		
}
