package com.blc.clc.task;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductDetails("Iphone", 13 , 62000.0);
		String res = p1.getProductDetails();
		System.out.println(res);

	}

}
