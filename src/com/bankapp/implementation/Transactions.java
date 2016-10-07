package com.bankapp.implementation;

import java.util.Scanner;

import com.bankapp.common.Bank;

public class Transactions implements Bank{

	String s1;
	String amt;
	double amount;

	/*************************************************************************
	 *   Method Name :amountWithdraw
	 *   Method For  :Amount to WithDraw 
	 *   Created By  :
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/
	public  void amountWithdraw(String bankName) {

		String[][] hdfcacctInfo ={  {"321000011","105000.00"},{"321000012","27000.00"},{"321000013","32000.00"},{"321000014","47000.00"},{"321000015","100000.00"}};
		String[][] iciciacctInfo ={  {"721000011","105000.00"},{"721000012","27000.00"},{"721000013","32000.00"},{"721000014","47000.00"},{"721000015","100000.00"}};
		String[][] yesacctInfo ={  {"921000011","105000.00"},{"921000012","27000.00"},{"921000013","32000.00"},{"921000014","47000.00"},{"921000015","100000.00"}};
		String[][] sbiacctInfo ={  {"821000011","105000.00"},{"821000012","27000.00"},{"821000013","32000.00"},{"821000014","47000.00"},{"821000015","100000.00"}};
		String[][] cityacctInfo ={  {"121000011","105000.00"},{"121000012","27000.00"},{"121000013","32000.00"},{"121000014","47000.00"},{"121000015","100000.00"}};

		Scanner in =new Scanner(System.in);
		int aw=0;
		switch (bankName){

		case "HDFC":  	
					System.out.println("\nPlease enter your HDFC Account number");
					s1=in.nextLine();
					System.out.println("\nPlease enter the amount to Withdraw");
					amt=in.nextLine();
					double amount = Double.parseDouble(amt);

			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)	

				{
					if(s1.equals(hdfcacctInfo[i][j])){
						aw=1;
						double accountBalance = Double.parseDouble(hdfcacctInfo[0][1]);
						if(amount<accountBalance){
							double newbalance=accountBalance-amount;
							System.out.println("\nPlease collect an amount of Rs."+amount);	
							System.out.println("Your Current Account Balance is:"+newbalance);
							break;
						}
						else {
							System.out.println("\nNo Sufficient funds in your account");
							break;
						}	


					}

				}
			}
			if(aw==0)
				System.out.println("Please Specify Correct Account Number");
			break;

		case "ICICI":  	
					System.out.println("\nPlease enter your ICICI Account number");
					s1=in.nextLine();
					System.out.println("\nPlease enter the amount to Withdraw");
					amt=in.nextLine();
					amount = Double.parseDouble(amt);

			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)	

				{
					if(s1.equals(hdfcacctInfo[i][j])){
						aw=1;
						double accountBalance = Double.parseDouble(hdfcacctInfo[0][1]);
						if(amount<accountBalance){
							double newbalance=accountBalance-amount;
							System.out.println("\nPlease collect an amount of Rs."+amount);	
							System.out.println("Your Current Account Balance is:"+newbalance);
							break;
						}
						else {
							System.out.println("\nNo Sufficient funds in your account");
							break;
						}	


					}

				}
			}
			if(aw==0)
				System.out.println("Please Specify Correct Account Number");
			break;


		}

	}
	/*************************************************************************
	 *   Method Name :amountdeposit
	 *   Method For  :Depositing the amount
	 *   Created By  :
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/

	public void amountdeposit(String bankName) {

		String[][] acctInfo ={  {"321000011","105000.00"},{"321000012","27000.00"},{"321000013","32000.00"},{"321000014","47000.00"},{"321000015","100000.00"}};
		Scanner in =new Scanner(System.in);
		int ad=0;
		switch (bankName){

		case "HDFC":  	
			System.out.println("\nPlease enter your HDFC Account number");
			String s1=in.nextLine();
			System.out.println("\nPlease enter the amount to Deposit");
			String amt=in.nextLine();
			double amount = Double.parseDouble(amt);

			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)	

				{
					if(s1.equals(acctInfo[i][j])){
						ad=1;
						double accountBalance = Double.parseDouble(acctInfo[0][1]);
						double newbalance=accountBalance+amount;
						System.out.println("\n Your amount is Deposited in the account");	
						System.out.println("\n Your Current Account Balance is:"+newbalance);
						break;
					}

				}

			}
		}
		if(ad==0)
			System.out.println("Please Specify Correct Account Number");


	}
	/*************************************************************************
	 *   Method Name :checkBalance
	 *   Method For  :Check the current Balance
	 *   Created By  :
	 *   Created On  : 
	 *   Parameter   :
	 *   Reviewed By :
	 * ************************************************************************/


	public void checkBalance(String bankName) {
		String[][] acctInfo ={  {"321000011","105000.00"},{"321000012","27000.00"},{"321000013","32000.00"},{"321000014","47000.00"},{"321000015","100000.00"}};
		Scanner in =new Scanner(System.in);
		int cb=0;
		switch (bankName){

		case "HDFC":  	
			System.out.println("\nPlease enter your HDFC Account number");
			String s1=in.nextLine();

			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)	

				{
					if(s1.equals(acctInfo[i][j])){
						cb=1;
						System.out.println("The Current Balance in  your account is:"+acctInfo[i][1]);	

					}

				}

			}


		}

		if(cb==0)
			System.out.println("Please Specify Correct Account Number");


	}



}

















