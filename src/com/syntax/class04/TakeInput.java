package com.syntax.class04;

import java.util.Scanner;  //to import in mac shortcut cmd+shift+o

public class TakeInput {

	public static void main(String[] args) {
		
		// 1. create a scanner and assign to a variable
		
		Scanner scan=new Scanner(System.in);
				
		// 2. specify instructions
				
		System.out.println("Please enter country where are you from");
		
		// 3. we need to capture String value  --> use next();
		
		String country=scan.next();
		System.out.println("You are from "+country);
		
		// if you are from usa --> you speak english
		// if you are from Freance --> you speak french
		
		if (country.equals("USA")) {					//equalsIgnoreCase --> nie wazne czy mala czy duza litera
			System.out.println("You speak english");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("you speak french");
		} else if (country.equals("Turkey")) {
			System.out.println("you speak turkish");
		} else {
			System.out.println("I dont know which language you speak");
		
		
		
		
			
		}
		
		

	}

}
