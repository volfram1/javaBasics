package com.syntax.class04;

import java.util.Scanner;

public class HomeworkDmv {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
			System.out.println("How old are you?");
			int age=input.nextInt();
			
			
			if (age>=18) {
				System.out.println("You can get a drivers license");
			} else {
				System.out.println("You can get a learners permit");
			}
			
			
	}

}
