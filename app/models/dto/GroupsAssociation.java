package models.dto;

public class GroupsAssociation {
	private int groupId;
	private String actionId;
	
	public GroupsAssociation() {

	}
	
	public GroupsAssociation(int groupId, String actionId) {
		super();
		this.groupId = groupId;
		this.actionId = actionId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	
	
}
