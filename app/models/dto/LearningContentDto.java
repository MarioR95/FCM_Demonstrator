package models.dto;

public class LearningContentDto {

	private String courseId, userId, contentType,topic;
	private int elapsedTime;
	private boolean completed;
	
	public LearningContentDto() {}

	public LearningContentDto(String courseId, String userId, String contentType, String topic, int elapsedTime, boolean completed) {
		super();
		this.courseId = courseId;
		this.userId = userId;
		this.contentType = contentType;
		this.topic = topic;
		this.elapsedTime = elapsedTime;
		this.completed = completed;
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

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
}
