package com.syntax.class08;

public class task1 {

	public static void main(String[] args) {

		int sumEven=0;
		int sumOdd=0;
		
		
		for (int i=1; i<=50; i++) {
			
			if (i%2==0) {
				sumEven+=i;
				
			}else  {
				sumOdd+=i;
				
			}
		}
		System.out.println("even "+sumEven+" odd "+sumOdd);
	}

}
