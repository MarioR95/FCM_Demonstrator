package models.dto;

public class FeedbackPredictionDto {
	
	private int actionId;
	private String concept, description;
	private double improvement;
	
	
	public FeedbackPredictionDto() {
		// TODO Auto-generated constructor stub
	}


	public FeedbackPredictionDto(int actionId, String concept, String description, double improvement) {
		super();
		this.actionId = actionId;
		this.concept = concept;
		this.description = description;
		this.improvement = improvement;
	}


	public int getActionId() {
		return actionId;
	}


	public void setActionId(int actionId) {
		this.actionId = actionId;
	}


	public String getConcept() {
		return concept;
	}


	public void setConcept(String concept) {
		this.concept = concept;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getImprovement() {
		return improvement;
	}


	public void setImprovement(double improvement) {
		this.improvement = improvement;
	}
	
	
}
