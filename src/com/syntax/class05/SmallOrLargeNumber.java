package com.syntax.class05;

import java.util.Scanner;

public class SmallOrLargeNumber {

	public static void main(String[] args) {

		/*	Ask user to enter a number and then define if number is small, medium or large
			Small number is value between 1 and 10
			Medium number is value between 11 and 100
			Large number is value between 101 and 1000
		* 
		*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter the number between 1-10002");
		
		int number=input.nextInt();
		
		if (number>=1 && number<=10) {
			System.out.println("The number is small");
			
		} else if (number>=11 && number<=100) {
			System.out.println("This is a medium number");
			
		}else if (number>=101 && number<=1000){
			System.out.println("The number is large");
			
		}
				
		
		
	}

}
