package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// logical not ! is used to revert the condition

		boolean value = !false;
		System.out.println(value);

		/*
		 * 
		 */

		boolean traffic = false;
		if (!traffic) {
			System.out.println("I will come on time to work");
		}else {
			System.out.println("the end");
		}
	}

}
