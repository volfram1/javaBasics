package com.syntax.class12;

public class Grettings {
	
	void sayHello(String name) {
		System.out.println("hello "+name);
	}
	
	void sayHelloManyTimes(String name) {
		for (int i=0; i<5; i++) {
			System.out.println("hello "+name);
		}
	}
	
	void sayHelloManyTimes(String name, int times) {
		for (int i=0; i<times; i++) {
			System.out.println("hello "+name);
		}
	}

	public static void main(String[] args) {

		Grettings greet=new Grettings();
		greet.sayHelloManyTimes("aga");
		
	}

}
