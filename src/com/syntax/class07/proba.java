package com.syntax.class07;

import java.util.Scanner;

public class proba {

	public static void main(String[] args) {

Scanner input=new Scanner(System.in);

	System.out.println("Please enter your  first name");
	String firstName=input.next();

	System.out.println("Please enter your last name");
	String lastName=input.next();

	System.out.println("Please enter your age");
	int age=input.nextInt();
	
		
		for (int personalData=1; personalData<=5; personalData++) {
			
			System.out.println("Your name is "+firstName+" "+lastName+" and you are "+age+" years old");
		}
		System.out.println("End of code");
	}

}
