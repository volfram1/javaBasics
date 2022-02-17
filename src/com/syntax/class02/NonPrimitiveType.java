package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		
		String name="Aga"; 
		String lastName="Tomczak";
		
		long phoneNumber=47474838388l;
		String mobilePhone="786-717-4210";
		String num="123";
		int num1=123;
		
		String greetings="Hello Friends!";
		
		System.out.println(greetings);
		System.out.println(name);
		System.out.println(lastName);
		
		//printing 2 variables in one line
		
		System.out.println(name+lastName);
		System.out.println(name+" "+lastName);
		
		/* using + we can concatenate
		 * String + any other type of variable
		 */
		
		int age=25;
		
		//I want to say Aga is 25 yesrs old
		
		System.out.println(name+" is "+age+" years old");
		
		String address="123 Test Street";
		
		//I live on 123 Test Street
		
		System.out.println("I live on "+address);
		
		String feeling="like";
				String food="kebab";
				
				System.out.println("I "+feeling+" "+food);
				
		feeling="love";
		food="shrimp";
		
		System.out.println("I "+feeling+" "+food);
		
		
		
		
				
			
		
		
		
		}

}
