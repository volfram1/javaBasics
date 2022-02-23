package com.syntax.class11;

import java.util.Arrays;

public class Task02HomeWork {

	public static void main(String[] args) {

		// Create a 2D array of integer. Print the sum of all numbers
		
		int[][] array2D= {{10,10,10}, {10,10,10}, {10,10,10}};
		int sum=0;
		for (int x=0; x<array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x])); // printing the array
			for (int y=0; y<array2D[x].length; y++) {
				sum=sum+array2D[x][y];
			}
		}
		System.out.println("Sum of elements "+sum);
		
	}

}
