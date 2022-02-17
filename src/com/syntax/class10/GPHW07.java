package com.syntax.class10;

public class GPHW07 {

	public static void main(String[] args) {

		//Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int num1=0;
		int num2=1;	
		int num3=0;
		
		System.out.print(num1+" "+num2);
		
		for (int i=3; i<=10; i++) {
			
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}
			
			
			
			
		
	}

}
