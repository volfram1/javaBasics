package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {

		for (int i=1; i<=5; i++) {
			System.out.println("hello");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("I need to print numbers from 1 to 20");
		
		for(int num=1; num<=20; num++) {
			System.out.print(num+" ");
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("I need to print numbers from 1 to 20");
		
		for (int num2=10; num2<=25; num2++) {
			System.out.print(num2+" ");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("I need to print numbers from 50 to 1");
		
		for (int num3=50; num3>=1; num3--) {
			System.out.print(num3+" ");
		}
		
		
	}

}
