package com.bankapp.core;
import com.bankapp.common.Bank;
import com.bankapp.implementation.Hdfc;
//import com.bankapp.implementation.Hdfc.InvalidDepositAmount;
import com.bankapp.implementation.Icici;
import com.bankapp.implementation.City;
import com.bankapp.implementation.Sbi;
import com.bankapp.implementation.Yes;


import java.util.Scanner;

import com.bankapp.implementation.Transactions;


public class ExecutionClass {

	
	public static void main(String args[]) throws InvalidDepositAmount 
	{
		
		System.out.println("Please Enter which Bank you want to transact with ......\n");
		System.out.println(" 1.HDFC \n 2.ICICI \n 3.SBI  \n 4.CITY \n 5.YES\n");
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		Transactions transct=new Transactions();

		switch (s) 
		{
		case "1":  
			System.out.println("\n1.Want to Open a New HDFC Account \n2.Loan Enquiry \n3.IFSC Code \n4.WithDraw \n5.Deposit \n6.CheckBalance");
			String s1=in.nextLine();
			Hdfc hdfc=new Hdfc();
	//		Transactions transct=new Transactions();
			
			try
			{
				switch (s1)
				{
				case "1": hdfc.newAccountOpening();
						  break;						  
				case "2": hdfc.interestRate_loanEnquiry();
						  break;
				case "3": hdfc.ifscCodeEnquiry();
						  break;
				case "4": transct.amountWithdraw("HDFC");
						  break;						  
				case "5": transct.amountdeposit("HDFC");
						  break;
				case "6": transct.checkBalance("HDFC");
						  break;

				
				default: System.out.println("\n Invalid Entry");
				break;
			
				}
				break;
			}
			catch(Exception ex){
		         System.out.println("Exception occured: "+ex);
			}
				
				
				
		case "2":  
			System.out.println("\n1.Want to Open a New ICICI Account \n2.Loan Enquiry \n3.IFSC Code \n4.WithDraw \n5.Deposit \n6.CheckBalance");
			String s2=in.nextLine();
			Icici icici=new Icici();
		//	Transactions transct=new Transactions();
			
				
				switch (s2)
				{
				case "1": icici.newAccountOpening();
						  break;						  
				case "2": icici.interestRate_loanEnquiry();
						  break;
				case "3": icici.ifscCodeEnquiry();
						  break;
				case "4": transct.amountWithdraw("ICICI");
						  break;						  
				case "5": transct.amountdeposit("ICICI");
						  break;
				case "6": transct.checkBalance("ICICI");
						  break;

				
				default: System.out.println("\n Invalid Entry");
				break;
			
				}
			
			break;
			
			
			
		}
	}
}


