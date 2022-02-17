package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {

		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		
		
		
		char[] grades=new char[6];
		
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int size=grade.length; //how many elements inside array
		
		System.out.println("Numbers of elements in array "+size);
		
		System.out.println(grade[1]);
		
		for(int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		
		System.out.println("----------------------------------------------");
		
		String[] cities= {"Washington DC", "Miami", "Los Angeles", "New York"};
		
		//if the value is Miami --> I want to live in Miami
		
		for (int a=0; a<cities.length; a++) {
			System.out.print(cities[a]+", ");
			
			if (cities[a].equals("Miami")) {
			
			System.out.println("I want to live in Miami");
			}
		}
		
		
		
		
		
	}

}
