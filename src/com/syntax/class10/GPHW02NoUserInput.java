package com.syntax.class10;

public class GPHW02NoUserInput {

	public static void main(String[] args) {

		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers = { { 10, 20, 30, 40, 50 }, { 11, 21, 31, 41, 51 } };

		int sum=0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				sum+=numbers[i][j];
			}
		
		}
		System.out.println("The sum of all elements is: "+sum);
	}

}
