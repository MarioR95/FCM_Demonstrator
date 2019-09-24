package models.dto;

public class GroupsAssociationDto {
	private String groupId;
	private String actionId;
	private String type;
	
	public GroupsAssociationDto() {

	}
	
	public GroupsAssociationDto(String groupId, String actionId, String type) {
		super();
		this.groupId = groupId;
		this.actionId = actionId;
		this.type = type;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "GroupsAssociationDto [groupId=" + groupId + ", actionId=" + actionId + ", type=" + type + "]";
	}
	
	
	
}
