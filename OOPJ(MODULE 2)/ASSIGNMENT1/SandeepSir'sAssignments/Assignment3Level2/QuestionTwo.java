package org.example;

//
/**
 Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
	Future Value Calculation:
		futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
		Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.

 */

//import java.io.UnsupportedEncodingException;

//import java.util.Scanner;
import java.util.Scanner;

class CompoundInterestCalculator {
	private double investment_amount;
	private double annual_interest_rate;
	private double interest_compounded_per_year;
	private double investment_duration;
	private double futureValue;
	private double totalInterest;
	private double principal;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment_amount:    ");
		this.investment_amount = sc.nextDouble();
		System.out.print("Enter annual_interest_rate:    ");
		this.annual_interest_rate = sc.nextDouble();
		System.out.print("Enter Interest_compounded_per_year:    ");
		this.interest_compounded_per_year = sc.nextDouble();
		System.out.print("Enter investment_duration:    ");
		this.investment_duration = sc.nextDouble();
//		System.out.println("PRINCIPAL:");
//		this.principal=sc.nextDouble();
	}

	public void calculateFutureValue() {

		this.futureValue = this.investment_amount * Math.pow((1 + annual_interest_rate / interest_compounded_per_year),
				(interest_compounded_per_year * investment_duration));

		this.totalInterest = this.futureValue - this.investment_amount;
	}

	public void printRecord() {

		System.out.printf("₹%.3f\n",this.futureValue);
		System.out.printf("₹%.3f\n",this.totalInterest);

	}

}

public class QuestionTwo {

	public static void main(String[] args) /* throws UnsupportedEncodingException */ {
		// TODO Auto-generated method stub

		CompoundInterestCalculator l = new CompoundInterestCalculator();
		l.acceptRecord();
		l.calculateFutureValue();
		l.printRecord();

	}

}
