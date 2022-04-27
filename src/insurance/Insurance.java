package insurance;

import java.util.Date;

public abstract class Insurance {

	private String insuranceName;
	private double costInsurance;
	private Date startInsurance;
	private Date endInsurance;

	public Insurance(String insuranceName, double costInsurance, Date startInsurance, Date endInsurance) {
		super();
		this.insuranceName = insuranceName;
		this.costInsurance = costInsurance;
		this.startInsurance = startInsurance;
		this.endInsurance = endInsurance;
	}

	public abstract void calculate();

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getCostInsurance() {
		return costInsurance;
	}

	public void setCostInsurance(double costInsurance) {
		this.costInsurance = costInsurance;
	}

	public Date getStartInsurance() {
		return startInsurance;
	}

	public void setStartInsurance(Date startInsurance) {
		this.startInsurance = startInsurance;
	}

	public Date getEndInsurance() {
		return endInsurance;
	}

	public void setEndInsurance(Date endInsurance) {
		this.endInsurance = endInsurance;
	}

}
