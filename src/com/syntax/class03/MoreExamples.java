package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
			
		/* we need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry --> i am going to eat
		 * Otherwise --> I am going to drink tea
		 */
		
		boolean hungry=true;   // statement
		if (hungry==true) {  //if the statement is already a boolean it can be 
			// if (hungry)
			System.out.println("I am goin to eat");
			
		} else {
			System.out.println("I am going to drink tea");
		}
		
		boolean traffic=false;
		if (traffic) {
			System.out.println("I am coming home late");
		} else {
			System.out.println("No traffic, I am on time");
		}
		
		/* define a wariable to store a browser
		 * if browser is Chrome  --> we are executing tests on Chrome
		 * Otherwise --> browser is not supported for our test
		 */
		
		String browser="Chrome";
		if (browser.equals("Chrome")) { // always use "equals" to compare 2 strings
										// == will work but not prefferable
			System.out.println("we are executing tests on Chrome");
		} else {
			System.out.println("we are not executing any test case");
		}
		
		/* if (browser) //type mismatch: cannot convert from string to boolean
		 * 
		 */
	}

}
