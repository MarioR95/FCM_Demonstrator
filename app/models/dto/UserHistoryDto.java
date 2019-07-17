package models.dto;

public class UserHistoryDto {

	private String courseId, userId;
	private boolean registered, viewed, explored, certified;
	private String final_cc_cname_DI, LoE, YoB, gender;
	private String startTime, lastEvent, lastForumView, lastLesson;
	private int nEvents, nDaysAct, nPosts, nPlayVideo, nChapters, tasksDone;
	private double percVideoViewed, avgSession;
	private int curiosity, enjoyment, generalInterest, certificate, credential, academic, job, connection, friendship; 
	private int incomplete_flag;
	
	
	public UserHistoryDto() {
		
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




	public boolean isRegistered() {
		return registered;
	}




	public void setRegistered(boolean registered) {
		this.registered = registered;
	}




	public boolean isViewed() {
		return viewed;
	}




	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}




	public boolean isExplored() {
		return explored;
	}




	public void setExplored(boolean explored) {
		this.explored = explored;
	}




	public boolean isCertified() {
		return certified;
	}




	public void setCertified(boolean certified) {
		this.certified = certified;
	}




	public String getFinal_cc_cname_DI() {
		return final_cc_cname_DI;
	}




	public void setFinal_cc_cname_DI(String final_cc_cname_DI) {
		this.final_cc_cname_DI = final_cc_cname_DI;
	}




	public String getLoE() {
		return LoE;
	}




	public void setLoE(String loE) {
		LoE = loE;
	}




	public String getYoB() {
		return YoB;
	}




	public void setYoB(String yoB) {
		YoB = yoB;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getStartTime() {
		return startTime;
	}




	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}




	public String getLastEvent() {
		return lastEvent;
	}




	public void setLastEvent(String lastEvent) {
		this.lastEvent = lastEvent;
	}




	public String getLastForumView() {
		return lastForumView;
	}




	public void setLastForumView(String lastForumView) {
		this.lastForumView = lastForumView;
	}




	public String getLastLesson() {
		return lastLesson;
	}




	public void setLastLesson(String lastLesson) {
		this.lastLesson = lastLesson;
	}




	public int getnEvents() {
		return nEvents;
	}




	public void setnEvents(int nEvents) {
		this.nEvents = nEvents;
	}




	public int getnDaysAct() {
		return nDaysAct;
	}




	public void setnDaysAct(int nDaysAct) {
		this.nDaysAct = nDaysAct;
	}




	public int getnPosts() {
		return nPosts;
	}




	public void setnPosts(int nPosts) {
		this.nPosts = nPosts;
	}




	public int getnPlayVideo() {
		return nPlayVideo;
	}




	public void setnPlayVideo(int nPlayVideo) {
		this.nPlayVideo = nPlayVideo;
	}




	public int getnChapters() {
		return nChapters;
	}




	public void setnChapters(int nChapters) {
		this.nChapters = nChapters;
	}




	public int getTasksDone() {
		return tasksDone;
	}




	public void setTasksDone(int tasksDone) {
		this.tasksDone = tasksDone;
	}




	public double getPercVideoViewed() {
		return percVideoViewed;
	}




	public void setPercVideoViewed(double percVideoViewed) {
		this.percVideoViewed = percVideoViewed;
	}




	public double getAvgSession() {
		return avgSession;
	}




	public void setAvgSession(double avgSession) {
		this.avgSession = avgSession;
	}




	public int getCuriosity() {
		return curiosity;
	}




	public void setCuriosity(int curiosity) {
		this.curiosity = curiosity;
	}




	public int getEnjoyment() {
		return enjoyment;
	}




	public void setEnjoyment(int enjoyment) {
		this.enjoyment = enjoyment;
	}




	public int getGeneralInterest() {
		return generalInterest;
	}




	public void setGeneralInterest(int generalInterest) {
		this.generalInterest = generalInterest;
	}




	public int getCertificate() {
		return certificate;
	}




	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}




	public int getCredential() {
		return credential;
	}




	public void setCredential(int credential) {
		this.credential = credential;
	}




	public int getAcademic() {
		return academic;
	}




	public void setAcademic(int academic) {
		this.academic = academic;
	}




	public int getJob() {
		return job;
	}




	public void setJob(int job) {
		this.job = job;
	}




	public int getConnection() {
		return connection;
	}




	public void setConnection(int connection) {
		this.connection = connection;
	}




	public int getFriendship() {
		return friendship;
	}




	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}




	public int getIncomplete_flag() {
		return incomplete_flag;
	}




	public void setIncomplete_flag(int incomplete_flag) {
		this.incomplete_flag = incomplete_flag;
	}




	@Override
	public String toString() {
		return "UserHistoryDto [courseId=" + courseId + ", userId=" + userId + ", registered=" + registered
				+ ", viewed=" + viewed + ", explored=" + explored + ", certified=" + certified + ", final_cc_cname_DI="
				+ final_cc_cname_DI + ", LoE=" + LoE + ", YoB=" + YoB + ", gender=" + gender + ", startTime="
				+ startTime + ", lastEvent=" + lastEvent + ", lastForumView=" + lastForumView + ", lastLesson="
				+ lastLesson + ", nEvents=" + nEvents + ", nDaysAct=" + nDaysAct + ", nPosts=" + nPosts
				+ ", nPlayVideo=" + nPlayVideo + ", nChapters=" + nChapters + ", tasksDone=" + tasksDone
				+ ", percVideoViewed=" + percVideoViewed + ", avgSession=" + avgSession + ", curiosity=" + curiosity
				+ ", enjoyment=" + enjoyment + ", generalInterest=" + generalInterest + ", certificate=" + certificate
				+ ", credential=" + credential + ", academic=" + academic + ", job=" + job + ", connection="
				+ connection + ", friendship=" + friendship + ", incomplete_flag=" + incomplete_flag + "]";
	}
	
}
