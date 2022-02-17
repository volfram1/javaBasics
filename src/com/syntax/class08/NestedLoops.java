package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			System.out.println("I am a loop "+i);
			
			for(int j=1; j<=2; j++) {
				System.out.println("I am nested J loop "+j);
			}
		}
		
		System.out.println("------------------------------------------");
		
		for (int i=1; i<=4; i++) {
			System.out.println(i);
			
			for(int j=1; j<=3; j++) {
				System.out.println(j);
			}
		}
		System.out.println("------------------------------------");
		
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}

}
