package com.bankapp.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.bankapp.common.Bank;
import com.bankapp.core.InvalidDepositAmount;

public class Hdfc  {
	public static int hdfc_acctnum=1000;
	Scanner in =new Scanner(System.in);
	
	
		
	/*************************************************************************
	 *   Method Name :newAccountOpening
	 *   Method For  :Opening a New Account 
	 *   Created By  :
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/

	public void newAccountOpening() throws InvalidDepositAmount
	{
	//	try
	//	{
		hdfc_acctnum++;
		Integer acctNumber;
		acctNumber=hdfc_acctnum;
		List<String> name_Type_Damount = new ArrayList<String>();

		System.out.println("Enter Your Name");
		String custName=in.nextLine();

		name_Type_Damount.add(custName);

		System.out.println("Enter the Type of Account you want to open: Savings or Current");
		String acctType=in.nextLine();

		name_Type_Damount.add(acctType);

		System.out.println("Enter the amount you want to Deposit");
		String depositAmount=in.nextLine();
		
		
		double validateAmount = Double.parseDouble(depositAmount);
		
		if(validateAmount <10000.00)
			throw new InvalidDepositAmount("Invalid Deposit Amount");
		else
		name_Type_Damount.add(depositAmount);


		HashMap <Integer,List<String>>map = new HashMap<Integer,List<String>>();
		map.put(acctNumber, name_Type_Damount);

		System.out.println();
		System.out.println(" Your Account is setup with the below details:");
		System.out.print("\t" + map);
	//	}
		
		/*catch(Exception e)
		{
			e.printStackTrace();
		}*/

	}
	
	/*************************************************************************
	 *   Method Name :interestRate_loanEnquiry
	 *   Method For  :Enquiry for Loan Interest Rates
	 *   Created By  :
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/

	public void interestRate_loanEnquiry()
	{
		try
		{
		System.out.println("Please Enter which loan you require\n");
		System.out.println("\n 1.Car Loan \n 2.TwoWheeler Loan \n 3. Home Loan \n 4. Personal Loan \n");

	
		String s=in.nextLine();
		switch (s)
		{
		case "1": System.out.println("HDFC Car Loan interestRate is 9.65% ");
		break;

		case "2":System.out.println("HDFC Two wheeler Loan interestRate is 11.37%");
		break;

		case "3":System.out.println("HDFC Home Loan interestRate is 9.45%");
		break;

		case "4":System.out.println("HDFC Personal Loan interestRate is 15.75%");
		break;
		
		default: System.out.println("\n Invalid Entry");
		break;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	   
	}
	
	/*************************************************************************
	 *   Method Name :ifscCodeEnquiry
	 *   Method For  :Enquiry for IFSC code for a Specific Branch
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/
	
	public void ifscCodeEnquiry()
	{
	try
	{
	System.out.println("Enter your Branch \n");
	String s3=in.nextLine();
	System.out.println("\n The IFSC Code for"+" "+s3+ "Branch is HDFC0000001");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	
	}
	
	

}
