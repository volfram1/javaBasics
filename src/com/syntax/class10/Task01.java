package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {

		//create an array an retrieve all elements in reverse order
		
				int[] numbers= {10,20,30,40,50};
				
				
				for (int i=numbers.length-1; i>=0; i--) {
					System.out.print(numbers[i]+" ");
				}
	}

}
