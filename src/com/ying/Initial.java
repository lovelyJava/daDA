package com.ying;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		//defining some verbs.
		boolean ifThemRentCars;
		
		System.out.println("************welcome to DADACARS************");
		System.out.println("Do you want to rent some cars?");
		System.out.println("Enter true or false,pls:"); 
		Scanner input = new Scanner(System.in);
		ifThemRentCars = input.nextBoolean();
		if (ifThemRentCars) {
			System.out.println("here we go");
		}
	}
}
