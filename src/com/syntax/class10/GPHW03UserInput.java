package com.syntax.class10;

import java.util.Scanner;

public class GPHW03UserInput {

	public static void main(String[] args) {

		//Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only
		
		Scanner input = new Scanner(System.in);
		
		int num=0;
		

		System.out.println("Please enter the number of rows");
		int row = input.nextInt(); // captures number of rows

		System.out.println("Please enter the number of columns");
		int col = input.nextInt(); // captures number of columns

		int numbers[][] = new int[row][col]; // declaration of new array

		for (int i = 0; i < row; i++) { //  captures the elements of the row

			System.out.println("Please enter the element of " + (i + 1) + "row");

			for (int j = 0; j < col; j++) { // captures the elements of column
														
				numbers[i][j] = input.nextInt();
				
				if (numbers[i][j]%2==0) {
					 num = numbers[i][j];
					
					
				}
				
				
				
			}System.out.print(num);
			
		}
		
		
		
		

	}

}
