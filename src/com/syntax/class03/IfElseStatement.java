package com.syntax.class03;

public class IfElseStatement {

	public static void main(String[] args) {

		int num1=100;
		int num2=500;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			
			} else {
				System.out.println(num2+"is larger than "+num2); 
			}
		
		int temp=45;
		
		//if temp is more thatn 45 --> im going for a walk
		//otherwise --> I am staying home
		
		if (temp>=45) {
			System.out.println("I am going for a walk");
		} else {
			System.out.println("I am staying at home.");
		}
		
		/*I need a variable that stores a gender
		 * if gender is F --> please use front of the train
		 * otherwise --> please use back of the train
		 */
		
		char gender='M';
		
		if (gender=='F') {
			System.out.println("Please use front of the train");
		} else {
			System.out.println("Please use back of the train");
			
		}
	}

}
