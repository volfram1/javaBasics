package com.syntax.class09;

public class HW02 {

	public static void main(String[] args) {
		
		//Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array
		
		
		String[] animals= { "zebra", "lion", "elephant", "tiger", "puma", };
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		//2 way
		
		System.out.println();
		
		for (String animal:animals) {
		System.out.print(animal+" ");
		
		}
	}

}
