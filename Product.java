package com.blc.clc.task;

public class Product {
	 private String productName;
	 private int productId;
	 private double price;
	 
	 public void setProductDetails(String pn , int pi , double pri)
	 {
		 productName = pn ;
		 productId = pi ;
		 price = pri ;
	 }
	 public String getProductDetails()
	 {
		 return "Product Name : " +productName+ "\nProduct Id : " +productId+ "\nProduct Price : "+price;
	 }

}
