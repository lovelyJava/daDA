package com.ying;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		//defining some verbs.
		boolean ifRentCars;
		boolean rentMore;
		
		String cars[] = new String[3];
		cars[0] = "[1]:truck, cargeLoad is 100t. for each car,100$ for per day.";
		cars[1] = "[2]:passengerCar, capacity is 20 for each car, 50$ for per day.";
		cars[2] = "[3]:van, cargeLoad is 1t. for each car, capacity is 5, 50$ for per day.";
		
		int rentedCars[][] = new int[3][2];
		
		System.out.println("************************welcome to DADACARS************************");
		System.out.println("Do you want to rent some cars? Enter true or false,pls:");
		
		Scanner input = new Scanner(System.in);
		ifRentCars = input.nextBoolean();
		
		if (ifRentCars) {
			
			System.out.println("************************What do you want to rent************************?");
			for (String i : cars) {
				System.out.println(i);
			}
			
			for (int i = 0, j = 0; i < 3; i++) {
				System.out.println("************************Entering 1, 2 or 3 to chooise the car what you want to rent;************************");
				rentedCars[i][j] = input.nextInt();
				
				System.out.println("************************How many cars do you want to rent?Enter the number pls************************");
				rentedCars[i][j+1] = input.nextInt();
				
				System.out.println("************************Enter true to keep going and false to exit.************************");
				rentMore = input.nextBoolean();		
				
				if(!rentMore && i >= 3) break;
			}
			
//			switch(rentedCars[])
		}
	}
}
