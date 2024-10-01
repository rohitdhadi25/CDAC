package org.example;

import java.util.Scanner;

/**
 * 4. Discount Calculation for Retail Sales Design a system to calculate the
 * final price of an item after applying a discount. The system should: 1.
 * Accept the original price of an item and the discount percentage from the
 * user. 2. Calculate the discount amount and the final price using the
 * following formulas: o Discount Amount Calculation: discountAmount =
 * originalPrice * (discountRate / 100) o Final Price Calculation: finalPrice =
 * originalPrice - discountAmount 3. Display the discount amount and the final
 * price of the item, in Indian Rupees (₹). Define class DiscountCalculator with
 * methods acceptRecord, calculateDiscount & printRecord and test the
 * functionality in main method.
 * 
 */

class DiscountCalculator {

	private float originalPrice;
	private float discountRate;
	private float finalPrice;
	private float discountAmount;

	

	public void acceptRecord(Scanner sc) {
		
		System.out.print("ENTER ORIGINAL_PRICE:   ");
		this.originalPrice = sc.nextFloat();
		System.out.print("ENTER DISCOUNT_RATE:   ");
		this.discountRate = sc.nextFloat();

	}

	public void calculateDiscount() {
		this.discountAmount=(originalPrice)*(discountRate/0.01f);
		this.finalPrice=originalPrice-discountAmount;
	}

	void printRecord() {
		System.out.println();
		System.out.printf("DISCOUNT_AMOUNT:   ₹%.3f\n",this.discountAmount);
		System.out.printf("FINAL_PRICE:   ₹%.3f\n",this.finalPrice);
	}
}

public class Program {

	public static void main(String[] args) {
		DiscountCalculator d = new DiscountCalculator();
		Scanner sc = new Scanner(System.in);
		d.acceptRecord(sc);
		d.calculateDiscount();
		d.printRecord();
		sc.close();

	}

}
