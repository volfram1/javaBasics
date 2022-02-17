package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
			
		boolean vaccine=true;
		int dose=1;
		
		//IF nested in IF
		
		if (vaccine) {
			System.out.println("How many doses you had?");
			
			if (dose==1) {
				System.out.println("you need another shot");
			} else {
				System.out.println("you are fully vaccinated");
			}
			
		} else {
			System.out.println("I do not have any further questions");
		}
		
		System.out.println("--------------------------------");
		
	// IF nested in IF ELSE
		
		/*declare a variable for allergy
		 * if you have allergy --> 
		 * 							if you have pollen
		 * 							if you have peanut
		 * 							if you have wheat
		 * 												--> nothing above -->
		 * if no allergy -->  you are lucky
		 */
		
		boolean allergy=true;
		
		 if (allergy) {
			 System.out.println("Let's check what allergies you have");
			 
			 String allergyType="wheat"; 
					 if (allergyType.equals("pollen")) {
			 		System.out.println("Please atay at home when tres are blooming.Take medication A"); 
					 } else if (allergyType.equals("peanut")) {
			 		System.out.println("Please do not eat food that contains nuts. Take med B");
			 		
					 } else if (allergyType.equals("gluten")) {
						 System.out.println("please followgluten free diet. Take med C");
					 } else {
						 System.out.println("I don't know which suggestion to give you");
					 }
			 		
					 
		 } else {
			 System.out.println("You are lucky");
		 }
		
		
	}

}
