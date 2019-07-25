package fr.formation.amortization;

import fr.formation.funding.Funding;

public class AnnualAmortization {


	private Funding funding;
	
	private int year;
	private double capital;
	private double interests;
	private double capitalOutstanding;
	private double annuities;
	private double insurance;
	private double totalCost;
	
	
	public AnnualAmortization(int year, double capital, double interests, double capitalOutstanding, double annuities,
			double insurance, double totalCost) {
		super();
		this.year = year;
		this.capital = capital;
		this.interests = interests;
		this.capitalOutstanding = capitalOutstanding;
		this.annuities = annuities;
		this.insurance = insurance;
		this.totalCost = totalCost;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getCapital() {
		return capital;
	}


	public void setCapital(double capital) {
		this.capital = capital;
	}


	public double getInterests() {
		return interests;
	}


	public void setInterests(double interests) {
		this.interests = interests;
	}


	public double getCapitalOutstanding() {
		return capitalOutstanding;
	}


	public void setCapitalOutstanding(double capitalOutstanding) {
		this.capitalOutstanding = capitalOutstanding;
	}


	public double getAnnuities() {
		return annuities;
	}


	public void setAnnuities(double annuities) {
		this.annuities = annuities;
	}


	public double getInsurance() {
		return insurance;
	}


	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}


	public double getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}


	@Override
	public String toString() {
		return "AnnualAmortization [year=" + year + ", capital=" + capital + ", interests=" + interests
				+ ", capitalOutstanding=" + capitalOutstanding + ", annuities=" + annuities + ", insurance=" + insurance
				+ ", totalCost=" + totalCost + "]";
	}
	
	
	
	
}
