package models.dto;

public class CourseWeekDto {

	private String courseId;
	private int week_number;
	private int NChapters_week, NVideos_week, NTasks_week;
	
	public CourseWeekDto() {
		
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getWeek_number() {
		return week_number;
	}

	public void setWeek_number(int week_number) {
		this.week_number = week_number;
	}

	public int getNChapters_week() {
		return NChapters_week;
	}

	public void setNChapters_week(int nChapters_week) {
		NChapters_week = nChapters_week;
	}

	public int getNVideos_week() {
		return NVideos_week;
	}

	public void setNVideos_week(int nVideos_week) {
		NVideos_week = nVideos_week;
	}

	public int getNTasks_week() {
		return NTasks_week;
	}

	public void setNTasks_week(int nTasks_week) {
		NTasks_week = nTasks_week;
	}

	@Override
	public String toString() {
		return "CourseWeekDto [courseId=" + courseId + ", week_number=" + week_number + ", NChapters_week="
				+ NChapters_week + ", NVideos_week=" + NVideos_week + ", NTasks_week=" + NTasks_week + "]";
	}

	
}
