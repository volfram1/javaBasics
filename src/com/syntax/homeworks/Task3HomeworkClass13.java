package com.syntax.homeworks;

public class Task3HomeworkClass13 {
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	String HelloInDifferentLanguage(String hello) {
		
		switch (hello.toLowerCase()) {
		
		case "spanish":
			return "Hola";
		case "deutsh":
			return "Hallo";
		case "polish":
			return "Czesc";
		case "french":
			return "Bonjur";
		case "japanese":
			return "Konnichiwa";
		default:
			return "unknown";
		
		}
		
	}

	public static void main(String[] args) {
		
		Task3HomeworkClass13 obj=new Task3HomeworkClass13();
		System.out.println(obj.HelloInDifferentLanguage("Japanese"));

	}

}
