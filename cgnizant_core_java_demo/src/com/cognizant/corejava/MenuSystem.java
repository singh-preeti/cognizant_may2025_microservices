package com.cognizant.corejava;

import java.util.Scanner;

public class MenuSystem {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("\n---menu-----");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Exit");
			System.out.println("Choose an option");
			
			option = scan.nextInt();
			
			switch(option) {
			 
			case 1: 
				System.out.println("your balance is 3000");
				break;
			case 2: 
				System.out.println("Deposit successful!");
				break;
			case 3: 
				System.out.println("Exiting...");
				break;
			default: 
				System.out.println("Invalid choice, try again");
			}
		}
		while(option != 3);
		//scan.close();
	}
    
	
//	for(int id=101;id<= 110; id++) {
//		System.out.println("Employee Id" +id);
//	}
}
