package com.syntax.class10;

public class GPHW08 {

	public static void main(String[] args) {

		//Maximum and minimum number in the array?
		
int[] numbers= {10,23,64,32,87,98,102,258,86};
		
		int max=numbers[0];
		int min=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
				
				
			}else if (numbers[i]<min) {
				min=numbers[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
