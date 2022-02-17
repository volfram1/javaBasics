package com.syntax.class04;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
			System.out.println("Please enter your city");
			String cityName=input.nextLine();
			
			System.out.println("What is the temperature there in Farenheit?");
			double 	tempF=input.nextDouble();
			
			double tempC=((tempF-32)*5)/9;
			
			System.out.println("The temperature in the city of "+cityName+" is "+tempC+" Celsius");
			
	}

}
