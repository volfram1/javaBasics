package com.syntax.class04;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many years did you work?");
		
		double years=input.nextDouble();
		
		
		if (years>5) {
			System.out.println("You are eligible for a bonus.");
			System.out.println("What was your salary.");
			 
			 double salary=input.nextDouble();
			 
			 if (salary>50000) {
				 System.out.println("Your bonus is $5000.");
			 }else {
				 System.out.println("Your bonus is $3000.");
			 }
		} else {
			System.out.println("You are not eligible for a bonus.");
		}
	}

}
