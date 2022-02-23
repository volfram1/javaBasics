package com.syntax.homeworks;

public class Task1HomeworkClass13 {
	
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	int LargestNumber(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}

	public static void main(String[] args) {
		
		Task1HomeworkClass13 obj=new Task1HomeworkClass13();
		System.out.println(obj.LargestNumber(30,20));
		

		
	}

}
