package models.dto;

public class CourseWeekDto {

	private String courseID;
	private int week_number;
	private int nChapters, nVideos, nTasks;
	
	public CourseWeekDto() {
		
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public int getWeek_number() {
		return week_number;
	}

	public void setWeek_number(int week_number) {
		this.week_number = week_number;
	}

	public int getnChapters() {
		return nChapters;
	}

	public void setnChapters(int nChapters) {
		this.nChapters = nChapters;
	}

	public int getnVideos() {
		return nVideos;
	}

	public void setnVideos(int nVideos) {
		this.nVideos = nVideos;
	}

	public int getnTasks() {
		return nTasks;
	}

	public void setnTasks(int nTasks) {
		this.nTasks = nTasks;
	}

	@Override
	public String toString() {
		return "CourseWeekBean [courseID=" + courseID + ", week_number=" + week_number + ", nChapters=" + nChapters
				+ ", nVideos=" + nVideos + ", nTasks=" + nTasks + "]";
	}
	
	
}
