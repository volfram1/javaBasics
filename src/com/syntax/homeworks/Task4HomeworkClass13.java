package com.syntax.homeworks;

public class Task4HomeworkClass13 {
	
	//Create a method createEmail(). Based on values of users name, lastName and email type, your
	//method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	
	String firstName;
	String lastName;
	String domain;
	
	void email() {
		System.out.println(firstName+lastName+"@"+domain);
	}
	
	
	public static void main(String[] args) {
		
		Task4HomeworkClass13 newEmail=new Task4HomeworkClass13();
		newEmail.firstName="John";
		newEmail.lastName="Snow";
		newEmail.domain="gmail.com";
		
		newEmail.email();

		
	}

}
