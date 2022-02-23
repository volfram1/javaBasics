package com.syntax.class13;

public class MethodsDemo3 {
	
	int squareNumber(int number) {     // int we speify the datatype that method will return
		return number*number;		   // squareNumber name of the method
									   //
	}
	
	
	int returnTheSameNumber(int number) {
		return number;
	}
	
	
	String nameAnimal(String name, String animal) {
		if ("teyfur".equalsIgnoreCase(name)&&"horse".equalsIgnoreCase(animal)) {
			return "camel";
		}else {
			return "unknown";
		}
		
		
	}

	public static void main(String[] args) {

		MethodsDemo3 obj=new MethodsDemo3(); // object creation
		int result =obj.squareNumber(5);
		String output=obj.nameAnimal("teyfur", "horse");
		System.out.println(result);
		System.out.println(output);
		
		
		
	}

}
