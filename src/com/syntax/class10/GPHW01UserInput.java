package com.syntax.class10;

import java.util.Scanner;

public class GPHW01UserInput {

	public static void main(String[] args) {

		// Create an array on int values using a scanner
				// and calculate the sum of all stored elements in that array
				
				Scanner input = new Scanner(System.in);
				
				int sum = 0;
				
				System.out.println("Please enter the size of array");

				int arrSize = input.nextInt(); // declaration of how many elements are in array

				int array[] = new int[arrSize]; // declaration of the array itself

				System.out.println("Please enter the elements of the array");

				for (int i = 0; i < arrSize; i++) {

					array[i] = input.nextInt();
					
					sum+=array[i];
					

				}
				System.out.println("The sum of all elements is: "+sum);
				


	}

}
