package com.syntax.class10;

public class GPHW09 {

	public static void main(String[] args) {
		
		
		//Write a java program to find the second largest number in the array?


				int[] numbers = { 10, 23, 64, 32, 87, 98, 102, 258, 86,220 };

				int max = 0;
				int secondMax = 0;

				for (int i = 0; i < numbers.length; i++) {
					if (max < numbers[i]) {
						secondMax = max;
						max = numbers[i];

					} else if (secondMax < numbers[i]) {
						secondMax = numbers[i];

					}

				}
				System.out.println(secondMax);

	}

}
