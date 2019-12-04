package models.dto;

public class ContentsResultsDto {
	private String courseId, userId, contentType, topic;
	private int elapsedTime, achievedScore, maxScore;
	
	public ContentsResultsDto() {
		
	}

	public ContentsResultsDto(String courseId, String userId, String contentType, String topic, int elapsedTime,
			int achievedScore, int maxScore) {
		super();
		this.courseId = courseId;
		this.userId = userId;
		this.contentType = contentType;
		this.topic = topic;
		this.elapsedTime = elapsedTime;
		this.achievedScore = achievedScore;
		this.maxScore = maxScore;
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

	public int getAchievedScore() {
		return achievedScore;
	}

	public void setAchievedScore(int achievedScore) {
		this.achievedScore = achievedScore;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}
}
