package com.syntax.class09;

public class Task04 {

	public static void main(String[] args) {

		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence 
		//using elements of array:
		//“Saturday is Java coding Day”
		
		
		String[] sentence=new String[5];
		
		sentence[0]="Java ";
		sentence[1]="Saturday ";
		sentence[2]="day ";
		sentence[3]="coding ";
		sentence[4]="is ";
		
		System.out.println(sentence[1]+sentence[4]+sentence[0]+sentence[3]+sentence[2]);
		
		
		String[] sent= {"Java ", "Saturday ", "day ", "coding ", "is "};
		
		System.out.println(sent[1]+sent[4]+sent[0]+sent[3]+sent[2]);
		
	}

}
