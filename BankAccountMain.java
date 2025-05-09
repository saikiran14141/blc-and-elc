package com.blc.clc.task;
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.setBankDetails("Kiran", 897767867, 9000.5);
		String res = ba1.getBankDetails();
		System.out.println(res);

	} 

}
