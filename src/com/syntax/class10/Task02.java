package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {

		
		// create a array of countries .
		//while retrieving all values from an array print capital for each country.
		
		
		String[] countries= {"USA", "Canada", "Germany", "France"};
		
		for(int i=0; i<countries.length; i++) {
			
			if (countries[i].equals("USA")) {
				System.out.println("The capital of "+countries[0]+" is "+"Washington DC");
			}else if (countries[i].equals("Canada")) {
				System.out.println("The capital of "+countries[1]+" is "+"Ottawa");
			}else if (countries[i].equals("Germany")){
				System.out.println("The capital of "+countries[2]+" is "+"Berlin");
			}else if (countries[i].equals("France")){
				System.out.println("The capital of "+countries[3]+" is "+"Paris");
			}
			 
			
		}
		
		System.out.println("----------------------------");
		//using switch
		
		for(int i=0; i<countries.length; i++) {
			
		 String capital=null;
				
		switch (countries[i]) {
		
		case "USA":
			capital="Washington DC";
			break;
			
		case "Canada":
			capital="Ottawa";
			break;
		case "Germany":
			capital="Berlin";
			break;
		case "France":
			capital="Paris";
			break;
			
		}
		System.out.println("The capital of "+countries[i]+" is "+capital);
		
		}
		
		for(String country:countries) {
			
			
			
		}
		
		
	}

}
