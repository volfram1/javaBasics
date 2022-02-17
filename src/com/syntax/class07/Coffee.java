package com.syntax.class07;

import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		double price=2.99;
		double clientPays;
		
		do {
			System.out.println("Please pay for coffee");
			clientPays=input.nextDouble();
				if (clientPays!=price && clientPays>3.00) {
					System.out.println("Please give less");
				}else if (clientPays!=price && clientPays<3.00) {
					System.out.println("Please give more");
				}
			
			
		}while (clientPays!=price);
		System.out.println("Enjoy your coffee");
		
	}	

}
