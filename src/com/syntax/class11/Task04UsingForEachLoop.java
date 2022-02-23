package com.syntax.class11;

public class Task04UsingForEachLoop {

	public static void main(String[] args) {

		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for that array.
				
				
					int[][] array2D= {{2,3,4}, {5,6}, {12,6,8}};
					
					int sumEven=0;
					int sumOdd=0;

					for (int[] row : array2D) {
						for (int element : row) {
							
								if (element%2==0) {
									sumEven+=element;
								}else {
									sumOdd+=element;
						}
					}
				}
					System.out.println("Sum of even number "+sumEven);
					System.out.println("Sum of odd numbers "+sumOdd);
				
	}

}
