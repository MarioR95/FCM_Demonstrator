package models.dto;

public class AnswersFeedbackDto {

	private int questionId;
	private String a,b,c,d;
	
	public AnswersFeedbackDto() {}
	
	public AnswersFeedbackDto(int questionId, String a, String b, String c, String d) {
		super();
		this.questionId = questionId;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}
	
	
}
