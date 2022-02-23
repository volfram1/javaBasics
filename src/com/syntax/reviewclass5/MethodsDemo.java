package com.syntax.reviewclass5;

public class MethodsDemo {
	
	void checkEvenOdd (int number) {
		if (number%2==0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	
		
	}
	void weather (boolean  isRaining) {
		if (isRaining) {
			System.out.println("I am staying home");
		}else {
			System.out.println("lets go for a walk");
		}
	}
	void name (String studentName) {
		if (studentName.equalsIgnoreCase("Teyfur")) {
			System.out.println("send memes");
		}else if (studentName.equals("Maha")){
			System.out.println("I am a doctor");
		}else {
			System.out.println("I don't know you");
		}
	}
	


	public static void main(String[] args) {
		
		MethodsDemo object=new MethodsDemo();
		object.checkEvenOdd(120);
		object.checkEvenOdd(3);
		object.checkEvenOdd(7);
		object.weather(false);
		object.name("Teyfur" );

	}

}
