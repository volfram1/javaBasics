package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task01HomeWork {

	public static void main(String[] args) {

		/*
		 * Create an array on int values using a scanner and calculate
		 * the sum of all stored elements in that array
		 */
		
		// PSEUDO programming - writing a step by step approach
		
		// Take the size of the array using scanner class from the user
		//create an int array of above size
		//fill the array with elements from the user using scann
		// sum all the elements of the array
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		int size=input.nextInt();
		System.out.println("Size of the array "+size);
		
		int[] array=new int[size];
		System.out.println("Please enter"+size+"elements");
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the element for index "+i);
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
		}
		System.out.println("Sum of array "+sum);
		
	}

}
