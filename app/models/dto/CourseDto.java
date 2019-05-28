package models.dto;

public class CourseDto {

	private String courseId;
	private int nVideos;
	private int nChapters;
	private int nTasks;
	private int courseLife;
	
	public CourseDto() {}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getnVideos() {
		return nVideos;
	}

	public void setnVideos(int nVideos) {
		this.nVideos = nVideos;
	}

	public int getnChapters() {
		return nChapters;
	}

	public void setnChapters(int nChapters) {
		this.nChapters = nChapters;
	}

	public int getnTasks() {
		return nTasks;
	}

	public void setnTasks(int nTasks) {
		this.nTasks = nTasks;
	}

	public int getCourseLife() {
		return courseLife;
	}

	public void setCourseLife(int courseLife) {
		this.courseLife = courseLife;
	}
	
	
}
