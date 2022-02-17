package com.syntax.class07;

public class HomeWork101 {

	public static void main(String[] args) {

		// Task1 --> Print numbers from 1 to 100 in 1 line with space
		
		for (int num=1; num<=100; num++) {
			System.out.print(num+(" "));
		}
		
		//Task 2 --> Print numbers from 100 to 1

		for (int num=100; num>=1; num--) {
			System.out.print(num+" ");
		}
		
		//Task 3a --> Print even numbers from 20 to 1 (2 ways)

		for(int num=20; num>=1; num--) {
			if (num%2==0) {
				System.out.print(num+(" "));
			}
		}
				
		//Task 3b --> Print even numbers from 20 to 1 (2 ways)	
				
		for (int num1=20; num1>=1; num1-=2) {
					System.out.print(num1+" ");
		}

		//Task 4a --> Print odd numbers between 20 and 50 (2 ways)
		
		for(int num2=20; num2<=50; num2++) {
			if (num2%2==1) {
				System.out.print(num2+" ");
			}
		}
		
		//Task 4b --> Print odd numbers between 20 and 50 (2 ways)
		for (int num=21; num<=50; num+=2) {
			System.out.print(num+" ");
		}
	}
	
}
			
			
		



