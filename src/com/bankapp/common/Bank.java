package com.bankapp.common;

public interface Bank {

/*	public abstract void existingAccount();
	
	public abstract void interestRate_loanEnquiry();
	public abstract void ifscCodeEnquiry();
	public abstract void deposit();
	public abstract void checkBalance();
	public abstract void transfer();*/ 
	
	public abstract void amountWithdraw(String bankName);
	public abstract void amountdeposit(String bankName);
	public abstract void checkBalance(String bankName);
	

}
