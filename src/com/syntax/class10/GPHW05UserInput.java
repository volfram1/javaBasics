package com.syntax.class10;

import java.util.Scanner;

public class GPHW05UserInput {

	public static void main(String[] args) {

		
		// Write a program to swap 2 numbers without a temporary variable?

				Scanner input = new Scanner(System.in);

				System.out.println("Enter the first number: ");
				int x = input.nextInt();
				System.out.println("Enter the second number: ");
				int y = input.nextInt();

				System.out.println("First number before swap: " + x);
				System.out.println("Second number 1before swap: " + y);

				x = x + y;
				y = x - y;
				x = x - y;

				System.out.println("First number after swap: " + x);
				System.out.println("Second number after swap: " + y);

	}

}
