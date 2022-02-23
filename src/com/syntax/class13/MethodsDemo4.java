package com.syntax.class13;

public class MethodsDemo4 {
	
	//create a method that takes a boolean is SaleOn and a double discount 
	
	double checkDiscount(boolean isSaleOn, double price, double discount) {
		if(isSaleOn) {
			return price-price*discount;
		}else {
			return price;
		}
	}

	public static void main(String[] args) {

		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));
	}

}
