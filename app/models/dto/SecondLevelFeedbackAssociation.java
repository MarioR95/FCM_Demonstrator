package models.dto;

public class SecondLevelFeedbackAssociation {
	private int actionGroup;
	private String action, type, description;
	
	public SecondLevelFeedbackAssociation() {
		
	}

	public SecondLevelFeedbackAssociation(int actionGroup, String action, String type, String description) {
		super();
		this.actionGroup = actionGroup;
		this.action = action;
		this.type = type;
		this.description = description;
	}

	public int getActionGroup() {
		return actionGroup;
	}

	public void setActionGroup(int actionGroup) {
		this.actionGroup = actionGroup;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
