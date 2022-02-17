package com.syntax.class09;

public class Task03 {

	public static void main(String[] args) {

		//Create an array of names and store all names of your group. Then print your name from 
		//that array. 
		//(use 2 different ways of creating an array)
		
		
		String[] names=new String[9];
				names[0]="Aga";
				names[1]="Andrew";
				names[2]="Asel";
				names[3]="Azizullah";
				names[4]="Emre";
				names[5]="Khadija";
				names[6]="Mohammad";
				names[7]="Nermien";
				names[8]="Svetlana";
				
				System.out.println(names[0]);
				
				
		String[] name= {"Aga", "Andrew", "Asel", "Azizullah", "Emre", "Khadija", "Mohammad", "Nermien", 
				"Svetlana"};
		
		System.out.println(name[0]);
	}

}
