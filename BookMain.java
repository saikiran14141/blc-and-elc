package com.blc.clc.task;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookDetails("Java Basics", "John Doe" , 450.0);
		String res = b1.getBookDetails();
		System.out.println(res);

	}

}
