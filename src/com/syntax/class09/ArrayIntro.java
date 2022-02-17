package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		

		int[] numbers=new int[4]; // creating an array with 4 elements
		
		numbers[0]=90;  // storing values/elements inside an array
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);
		
		//I want to create an array of countries
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afganistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		//countries[5]="Turkey";   ArrayIndexOutOfBoundsException
		
		System.out.println(countries[3]+countries[4]);
		
		
		String[] names=new String[5];
		
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		
		System.out.println(names[1]);
		System.out.println("Value of index 0 is ="+names[0]); /* compiler will add a default value 
																	to unassigned index
																	*/
		
		names[1]="Daniyar";  // reassigning the value of names[1]
		System.out.println(names[1]);
		
		
	}

}
