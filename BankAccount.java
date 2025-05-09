package com.blc.clc.task;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;

	public void setBankDetails(String ah , int an , double bal)
	{
		accountHolder = ah;
		accountNumber = an;
		balance = bal;
	}
	public String getBankDetails()
	{
		return "Account Holder : " + accountHolder + "\nAccount Number : " + accountNumber + "\nBalance : " + balance;
	}
}
