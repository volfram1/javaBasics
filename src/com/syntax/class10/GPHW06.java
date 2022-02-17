package com.syntax.class10;

import java.util.Scanner;

public class GPHW06 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		boolean prime=true;
		
		System.out.println("Please enter the number");
		
		int num=input.nextInt();
		
		
		
		for (int i=2; i<num; i++) {
			
			if (num%i==0) {
				prime=false;
				break;
			}
			
		} if (prime) {
			System.out.println(num+" is a prime number");
		} else {
			System.out.println(num+" is not a prime number");
		}
	}

}
