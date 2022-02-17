package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {

		int num=1;
		
		//while loop
		
		while(num<=5) {
			System.out.println("hello");
			num++;
			
		}
		
		//do while loop
		
		int num1=1;
		
		do {
			System.out.println("hello");
			num1++;
		}while(num1<=5);
		
		System.out.println("-----------------------------");
		//print numbers from 1 to 30 using do while loop
		
		int num2=1;
		
		do {
			System.out.print(num2+" ");
			num2++;
		}while (num2<=30);
		
	}

}
