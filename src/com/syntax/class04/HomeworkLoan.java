package com.syntax.class04;

import java.util.Scanner;

public class HomeworkLoan {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the loan amount");
		
			int loan=input.nextInt();
			if (loan<=200000) {
				System.out.println("You are eligible for a loan");
				
			} else {
				System.out.println("You are not eligible for a loan");
			}
	}

}
