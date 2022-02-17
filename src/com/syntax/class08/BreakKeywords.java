package com.syntax.class08;

public class BreakKeywords {

	public static void main(String[] args) {

		for(int i=1; i<4; i++) {
			System.out.println("Iam coding inside of the loop");
			
			break;
		}
		
		System.out.println("End of code");
		
		boolean winter=true;
		int temp=0;
		
		while(winter) {
			System.out.println("it is cold");
			
			if (temp==20) {
			break;
			
		}
			temp+=5;
		}
		
	}

}
