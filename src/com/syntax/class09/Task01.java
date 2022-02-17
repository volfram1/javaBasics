package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {

		// create an array to store 4 values 
		// find an average of those
		
		double[] price=new double[4];
		
		price[0]=2.00;
		price[1]=2.99;
		price[2]=4.59;
		price[3]=3.79;
		
		double avg=(price[0]+price[1]+price[2]+price[3])/4;
		
		System.out.println(avg);
	}

}
