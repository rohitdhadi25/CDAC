package org.example;

import java.util.Scanner;

class TollBoothRevenueManager{
	private  double carRate;
	private  double truckRate;
	private  double motorcycleRate;
	private  int numOfCar;
	private  int numOfTruck;
	private  int numOfMotorcycle;
	private double totalNoOfVehicle;
	private double totalRev;
	

	public void setTollRates(Scanner sc)
	{
		System.out.print("ENTER CAR_RATE:   ");
		this.carRate = sc.nextDouble();
		System.out.print("ENTER TRUCK_RATE:   ");
		this.truckRate = sc.nextDouble();
		System.out.print("ENTER MOTORCYCLE_RATE:");
		this.motorcycleRate = sc.nextDouble();
	}
	

	public void acceptRecord(Scanner sc) {
		System.out.print("ENTER NO. OF CARS:");
		this.numOfCar=sc.nextInt();
		System.out.print("ENTER NO. OF TRUCK:");
		this.numOfTruck=sc.nextInt();
		System.out.print("ENTER NO. OF MOTORCYCLE:");
		this.numOfMotorcycle=sc.nextInt();
		

	}


	public void calculateRevenue() {
		double carRev=this.carRate*this.numOfCar;
		double truckRev=this.truckRate*this.numOfTruck;
		double motorCycleRev=this.motorcycleRate*this.numOfMotorcycle;
		this.totalNoOfVehicle=this.numOfCar+this.numOfTruck+this.numOfMotorcycle;
		
		this.totalRev=carRev+truckRev+motorCycleRev;
	}

	void printRecord() {
		System.out.println("TOTAL NO. OF VEHICLES:"+totalNoOfVehicle);
		System.out.printf("Car:   ₹%.3f\n",totalRev);
	
	}
}
public class QuestionFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager t=new TollBoothRevenueManager();
		Scanner sc=new Scanner(System.in);
		t.acceptRecord(sc);
		t.setTollRates(sc);
		t.calculateRevenue();
		t.printRecord();

	}

}
