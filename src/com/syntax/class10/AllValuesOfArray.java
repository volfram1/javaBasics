package com.syntax.class10;

public class AllValuesOfArray {

	public static void main(String[] args) {

		int[][] numbers = { { 10, 20, 30 }, // index 0
				{ 100, 200, 300, 400 }, // index 1
				{ 1000, 2000 } // index 2
		};
		
		/*int size=numbers.length;  //=3 -->number of rows (how many 1D arrays are in 2D array)
		System.out.println(size); 
		
		int sizeOf1Array=numbers[0].length; 
		System.out.println(sizeOf1Array);  //=4 --> number of elements in first 1D array
		
		int sizeOf2Array=numbers[1].length; 
		System.out.println(sizeOf2Array);  //=4 --> size of 2 array 
		*/
		
		
		//retrieving all numbers from 2D array
		
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
	}

}
