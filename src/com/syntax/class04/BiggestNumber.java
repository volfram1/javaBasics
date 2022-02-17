package com.syntax.class04;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
			System.out.println("Please provide first number");
			
			int a=input.nextInt();
			
			System.out.println("Please provide a second number");
			
			int b=input.nextInt();
			
			System.out.println("Please provide a third number");
			
			int c=input.nextInt();
			
				if (a>b) {
					 if (a>c) {
						 System.out.println(a);
					 }
				}else if  (b>a){
					if (b>c) {
						System.out.println(b);
					} else {
						System.out.println(c);
					}
					
				} 
					
				
				
			
			
			
			}
				
				
				
	}

	
				
			
