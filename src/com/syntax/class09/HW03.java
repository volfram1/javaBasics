package com.syntax.class09;

public class HW03 {

	public static void main(String[] args) {

		int[] num= {10,20,30,40,50,60,70,};
		
		int sum=0;
		
		
		for (int i=0; i<num.length; i++) {
			sum=sum+num[i];
			
			
		}
		System.out.println(sum);
		
		
		//2way
		
		int summ=0;
		
		for (int summary:num) {
			summ+=summary;
			
		}
		System.out.println(summ);
			
			
	}

}
