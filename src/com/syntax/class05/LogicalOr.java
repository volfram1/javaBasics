package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Saturday";

		/*
		 * with OR || at least condition must be TRUE
		 * 
		 * TRUE||TRUE --> TRUE TRUE||FALSE --> TRUE FALSE||TRUE --> TRUE FALSE||FALSE
		 * --> FALSE
		 */

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		} else {

			System.out.println("Code outside of if statement");
		}

		/*
		 * ASK USE WHAT DAY I S TODAY based on the day lets define which class we have
		 * if (monday || friday) --> no class else if (tuesday ||wednesday) --> manual
		 * else if (thursday) --> rewiev else if (saturday and sunday) --> java class
		 * else (invalid day
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please provide a day");

		String weekDay = input.next();

		if (weekDay.equalsIgnoreCase("Saturday") || weekDay.equalsIgnoreCase("Sunday")) {
			System.out.println("java class");
		} else if (weekDay.equalsIgnoreCase("Monday") || weekDay.equalsIgnoreCase("Friday")) {
			System.out.println("no class");
		} else if (weekDay.equalsIgnoreCase("thursday")) {
			System.out.println("review class");
		} else if (weekDay.equalsIgnoreCase("wednesday") || weekDay.equalsIgnoreCase("Tuesday")) {
			System.out.println("manual");
		} else {
			System.out.println("invalid day");
		}

	}

}
