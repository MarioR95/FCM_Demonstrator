package utilities;

public class Measures {

	private double motivation_value;
	private double engagement_value;
	
	public Measures() {
		motivation_value=0.0;
		engagement_value=0.0;
	}
	
	public Measures(double motivation_value, double engagement_value) {
		this.motivation_value = motivation_value;
		this.engagement_value = engagement_value;
	}
	public double getMotivation_value() {
		return motivation_value;
	}
	public void setMotivation_value(double motivation_value) {
		this.motivation_value = motivation_value;
	}
	public double getEngagement_value() {
		return engagement_value;
	}
	public void setEngagement_value(double engagement_value) {
		this.engagement_value = engagement_value;
	}
	
	@Override
	public String toString() {
		return "Measures [motivation_value=" + motivation_value
				+ ", engagement_value=" + engagement_value + "]";
	}
	
	
	
}
