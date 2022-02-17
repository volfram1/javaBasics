package com.syntax.class05;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("using next");
		
		String value=input.next();
		System.out.println("Using nextLine");
		
		String anotherValue=input.nextLine();
		
		System.out.println(anotherValue);
		
		System.out.println("End of the program");
		
	}

}
