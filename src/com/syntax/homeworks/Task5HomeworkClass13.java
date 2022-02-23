package com.syntax.homeworks;

public class Task5HomeworkClass13 {
	
	//Write a method to return whether given number is prime or not?
	
	String prime(int num) {
		
		if (num>1) {
			for (int i=2; i<num; i++) {
				if (num%i==0) {
				
					return num+" is not prime"; 
				}
			}
	
			} else {
				return num+" is not prime";
	}
		return num + " is Prime";
	}

	public static void main(String[] args) {
		
		Task5HomeworkClass13 isPrime=new Task5HomeworkClass13();
		System.out.println(isPrime.prime(40));

	}

}
