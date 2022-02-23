package com.syntax.reviewclass5;

public class MethodsDemo2 {
	
	void TeyfurAndHorse(String name, String animal) {
		if ("Teyfur".equalsIgnoreCase(name)&&"horse".equalsIgnoreCase(animal)) {
			
			System.out.println("camel");
		}else {
			System.out.println("horse");
		}
	}

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurAndHorse("teyfur", "Horse");
		obj.TeyfurAndHorse("tarik", "Horse");
		
	}

}
