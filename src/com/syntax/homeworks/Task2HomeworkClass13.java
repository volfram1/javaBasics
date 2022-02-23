package com.syntax.homeworks;

public class Task2HomeworkClass13 {
	
	//Create a method that will take a number and prints whether the number is even or odd.
	
	String OddOrEven(int num) {
		if (num%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	

	public static void main(String[] args) {
		
		Task2HomeworkClass13 obj=new Task2HomeworkClass13();
		System.out.println(obj.OddOrEven(0));

	}

}
