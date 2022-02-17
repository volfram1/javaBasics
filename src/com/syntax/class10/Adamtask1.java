package com.syntax.class10;

import java.util.Scanner;

public class Adamtask1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter Array's length: ");
		int k = sc.nextInt();
		int i = 0;
		int sum = 0;
		int[] nums = new int [k+1];
	
		for (i = 0; i < k; i++) {
			
	System.out.println("Input number: ");
		nums[i] = sc.nextInt();
		sum = sum + nums[i];
		}
		
		System.out.print("The sum of array is: " + sum);
	}

}
