package com.syntax.class10;

public class GPHW04NoUserInput {

	public static void main(String[] args) {

		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.

		int[][] numbers = { { 10, 20, 31, 40, 50 }, { 11, 22, 31, 41, 52 }, };

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 == 0) {
					sum = numbers[i][j] + sum;
				} else if (numbers[i][j] % 2 == 1) {
					sum1 = numbers[i][j] + sum1;

				}
			}
		}
		System.out.println("The sum of all  even elemets is " + sum);
		System.out.println("The sum of all  odd elemets is " + sum1);

	}

}
