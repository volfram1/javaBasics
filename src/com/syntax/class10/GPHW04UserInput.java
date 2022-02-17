package com.syntax.class10;

import java.util.Scanner;

public class GPHW04UserInput {

	public static void main(String[] args) {
		
		

		//Create a 2D array of integers. 
		//Develop a program which will calculate the sum of even and odd numbers for that array.
		
		Scanner input = new Scanner(System.in);
		int sum=0;
		int sum1=0;

		System.out.println("Please enter the number of rows");
		int row = input.nextInt(); // captures number of rows

		System.out.println("Please enter the number of columns");
		int col = input.nextInt(); // captures number of columns

		int array[][] = new int[row][col]; // declaration of new array

		for (int i = 0; i < row; i++) { //   captures the elements of the row

			System.out.println("Please enter the element of " + (i + 1) + "row");

			for (int j = 0; j < col; j++) { //  captures the elements of column
														
				array[i][j] = input.nextInt();
				
				if (array[i][j]%2==0) {
				sum = array[i][j]+sum;
				}else if(array[i][j]%2==1){
					sum1 = array[i][j]+sum1;
					
				}
				
				
			}
			
		}
		System.out.println("The sum of all  even elemets is "+sum);
		System.out.println("The sum of all  odd elemets is "+sum1);
		

	}

}
