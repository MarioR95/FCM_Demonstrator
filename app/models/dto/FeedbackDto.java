package models.dto;

public class FeedbackDto {

	private int id,status,type,efficacy;
	private String measureDate,feedbackDate,courseId,userId,content;
	private int actionId;
	
	public FeedbackDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getEfficacy() {
		return efficacy;
	}

	public void setEfficacy(int efficacy) {
		this.efficacy = efficacy;
	}

	public String getMeasureDate() {
		return measureDate;
	}

	public void setMeasureDate(String measureDate) {
		this.measureDate = measureDate;
	}

	public String getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	

	@Override
	public String toString() {
		return "FeedbackDto [id=" + id + ", status=" + status + ", type=" + type + ", efficacy=" + efficacy
				+ ", measureDate=" + measureDate + ", feedbackDate=" + feedbackDate + ", courseId=" + courseId
				+ ", userId=" + userId + ", content=" + content + ", actionId=" + actionId + "]";
	}
	
	
	
}
