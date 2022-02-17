package com.syntax.class05;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your quiz grade");
		int quiz=input.nextInt();
		
		System.out.println("Please enter your midterm grade");
		int midterm=input.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore=input.nextInt();
		
		if ((quiz+midterm+finalScore)/3>=90) {
			System.out.println("Your grade is A");
		}else if ((quiz+midterm+finalScore)/3>=70 && (quiz+midterm+finalScore)/3>90) {
			System.out.println("Your grade is B");
		}else if ((quiz+midterm+finalScore)/3>=50 && (quiz+midterm+finalScore)/3<70) {
			System.out.println("Your grade is C");
		}else if ((quiz+midterm+finalScore)/3<50) {
			System.out.println("Your grade is F");
		}
	}

}
