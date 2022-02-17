package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
			
		int age=30;
		double weight=100;
		
		if (age>=18) {
			System.out.println("you can give blood");
			
			
			if (weight>110) {
				System.out.println("your weight is ok, give the blood");
			} else {
				System.out.println("you are too skinny");
			}
		}else {
			System.out.println("you cannot give blood");
			
			
		}
		
		
	}

}
