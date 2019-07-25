package fr.formation.funding;

import java.time.LocalDate;

public class Funding {

	
	private Long amount;
	
	private String typeOfLoan;
	
	private LocalDate dateOfRefunds;
	
	private int duration;
	
	private double interestRates;
	
	private double insuranceRates;

	public Funding(Long amount, String typeOfLoan, LocalDate dateOfRefunds, int duration, double interestRates,
			double insuranceRates) {
		super();
		this.amount = amount;
		this.typeOfLoan = typeOfLoan;
		this.dateOfRefunds = dateOfRefunds;
		this.duration = duration;
		this.interestRates = interestRates;
		this.insuranceRates = insuranceRates;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getTypeOfLoan() {
		return typeOfLoan;
	}

	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}

	public LocalDate getDateOfRefunds() {
		return dateOfRefunds;
	}

	public void setDateOfRefunds(LocalDate dateOfRefunds) {
		this.dateOfRefunds = dateOfRefunds;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getInterestRates() {
		return interestRates;
	}

	public void setInterestRates(double interestRates) {
		this.interestRates = interestRates;
	}

	public double getInsuranceRates() {
		return insuranceRates;
	}

	public void setInsuranceRates(double insuranceRates) {
		this.insuranceRates = insuranceRates;
	}

	@Override
	public String toString() {
		return "Funding [amount=" + amount + ", typeOfLoan=" + typeOfLoan + ", dateOfRefunds=" + dateOfRefunds
				+ ", duration=" + duration + ", interestRates=" + interestRates + ", insuranceRates=" + insuranceRates
				+ "]";
	}
	
	
}
