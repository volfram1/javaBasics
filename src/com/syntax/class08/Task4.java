package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		//Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from 
		//a user program should stop asking.
		
		Scanner input=new Scanner(System.in);
		String yesNo;
		
				
				do {
					System.out.println("Do you want to apply for a credit card");
					 yesNo=input.next();
					
					
				}while (!yesNo.equalsIgnoreCase("yes"));
				
				System.out.println("congrats! Here is your card");
	}
}


