package com.syntax.class08;

import java.util.Scanner;

public class HWclass7 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
		
		for (int personalData=1; personalData<=5; personalData++) {
			System.out.println("Please enter your  first name");
			String firstName=input.next();
			
			System.out.println("Please enter your last name");
			String lastName=input.next();
			
			System.out.println("Please enter your age");
			int age=input.nextInt();
			
			System.out.println("Your name is "+firstName+" "+lastName+" and you are "+age+" years old");
		}
		System.out.println("End of code");
	}

}
