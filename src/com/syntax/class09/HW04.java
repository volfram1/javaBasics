package com.syntax.class09;

public class HW04 {

	public static void main(String[] args) {

		//From an array of integer elements find the largest number
		
		int[] numbers= {10,20,30,40,50,60,120,14,56,};
		
		int max=numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>max) {
				
				max=numbers[i];
			}
		}System.out.println(max);
	
	}

}
