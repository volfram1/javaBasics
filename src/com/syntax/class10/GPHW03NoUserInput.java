package com.syntax.class10;

public class GPHW03NoUserInput {

	public static void main(String[] args) {

		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only

		int[][] numbers = { { 10, 20, 31, 40, 50 }, { 11, 22, 31, 41, 52 }, };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j] + " ");
				}
			}
		}

	}

}
