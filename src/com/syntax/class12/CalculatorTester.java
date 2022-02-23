package com.syntax.class12;

public class CalculatorTester {

	public static void main(String[] args) {

		Calculator simpleMathCalculator=new Calculator();
		simpleMathCalculator.add();
		simpleMathCalculator.addNumbers(10, 25);
		simpleMathCalculator.addNumbers(30, 30);
		int num1=50;
		int num2=50;
		simpleMathCalculator.addNumbers(num1, num2);
	}

}
