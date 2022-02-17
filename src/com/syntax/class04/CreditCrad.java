package com.syntax.class04;

import java.util.Scanner;

public class CreditCrad {

	public static void main(String[] args) {
				
		Scanner input=new Scanner(System.in);
		
			System.out.println("do you have a credit card?");
			
			String card=input.next();
			
			if (card.equalsIgnoreCase("yes")) {
				
				System.out.println("what is yor balance");
				
				double balance=input.nextDouble();
				
				if (balance>1000) {
					System.out.println("Pay it off immediately!");
				}else {
					System.out.println("You can spend more");
				}
			}else {
				System.out.println("would you like to apply?");
			}
	}

}
