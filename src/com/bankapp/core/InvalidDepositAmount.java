package com.bankapp.core;

public class InvalidDepositAmount extends Exception {
	      public InvalidDepositAmount(String s){  
		  super(s);  
		 }  
	      
	      public String toString()
	      {
	       return "Deposit Amount Should Not be less than Rs.10000/-";
	      }
	      
		}  

