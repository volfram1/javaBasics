package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {

		//create a secret number
		// we want a user to guess the secret number
		//the moment used guesses the number -->program will stop
		//otherwise will continue asking for the number
		
		int secretNumber=12;
		int guessNumber;
		
		Scanner input=new Scanner(System.in);
		
		do {
		
		System.out.println("please enter the number");
		guessNumber=input.nextInt();
		}while (guessNumber!=secretNumber);
		
		System.out.println("congratulations");
		
	}

}
