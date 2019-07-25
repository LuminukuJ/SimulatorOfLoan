package fr.formation.simulator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import fr.formation.funding.Funding;

public class SimulatorApplication {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter amount :");
		Long amount = sc.nextLong();
		
		System.out.println("Please enter type of loan :");
		sc.nextLine();
		String typeOfLoan = sc.nextLine();
		
		System.out.println("Please enter start date (dd/MM/yyyy) :");
		String date = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateOfRefunds = LocalDate.parse(date, formatter);
		
		System.out.println("Please enter duration(in year) :");
		int  duration = sc.nextInt();
		
		System.out.println("Please enter interestRates:");
		double interestRates = sc.nextDouble();
		
		System.out.println("Please enter insuranceRates:");
		double insuranceRates = sc.nextDouble();
	
		
		Funding funding = new Funding(amount, typeOfLoan, dateOfRefunds, duration, interestRates, insuranceRates);
	
		
		
	}
	
	
	
}
