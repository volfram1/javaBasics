package com.syntax.class04;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println(" please enter your full name");
			
			// for String 2 or more words --> nextLine();
			
			String name=in.nextLine();
			System.out.println(name);
			
	}

}
