package com.syntax.class09;

public class HW01 {

	public static void main(String[] args) {

		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		
		String[] cars= {"BMW", "Toyota", "Ferrari", "Jeep", "Honda", "Audi"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		
		//2way
		
		System.out.println("-------------------------------------");
		
		for (String car:cars) {
			System.out.print(car+" ");
		}
		
		
		
	}

}
