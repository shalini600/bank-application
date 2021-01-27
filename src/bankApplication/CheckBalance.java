package bankApplication;

import java.util.*;

public class CheckBalance {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("XYZ", "123");
		acc.showMenu();
	}
}
	
 class BankAccount {
	 String customerName;
	 String customerId;
	 int balance;
	 int previousTransaction;
	 
	 BankAccount(String cname, String cid) {
		 customerName = cname;
		 customerId = cid;
	 }
		 
 
	  void deposit(int amount) {
		  if( amount !=0) {
			  balance = balance + amount;
			  previousTransaction = amount;
		  }
	  }
  
	  void withdrawn(int amount) {
		  if( amount!=0) {
			  balance= balance-amount;
			  previousTransaction= - amount;
		  }
	  }
	  
	  void getPreviousTransaction() {
		  if(previousTransaction>0) {
			  System.out.println("Deposited:" + previousTransaction);
		  }
		  else if(previousTransaction<0) {
			  System.out.println("Withdrawn:"+Math.abs(previousTransaction));
		  }
		  else
		  {
			  System.out.println("No Transaction Occured");
		  }
	  }

	  void showMenu() {
		  char option;
		  Scanner scanner = new Scanner(System.in);
  
		  System.out.println(" Welcome " + customerName);
		  System.out.println("Your customer id is :" + customerId);
		  System.out.println();
		  System.out.println("A. Check Balance" );
		  System.out.println("B. Deposit");
		  System.out.println("C. Withdraw");
		  System.out.println("D. Previous Transaction");
		  System.out.println("E. Exit");
		 
		  do {
			 System.out.println("############################");
			 System.out.println("Enter an option");
			 System.out.println("############################");
			 option= scanner.next().charAt(0);
			 System.out.println();
		 
			 switch (option) {
				 case 'A':
					 System.out.println("************");
				     System.out.println(" Balance = "+balance );
				     System.out.println("************");
				     System.out.println();
				     break;
		 
				 case 'B':
					 System.out.println("***********");
					 System.out.println("Enter the amount to deposit");
					 System.out.println("***********");
					 int amount= scanner.nextInt();
					 deposit(amount);
					 System.out.println();
					 break;
			 
				 case 'C':
					 System.out.println("***********");
					 System.out.println("Enter the amount to withdraw");
					 System.out.println("***********");
					 int amount2= scanner.nextInt();
					 withdrawn(amount2);
					 System.out.println();
					 break;
			 
				 case 'D':
					 System.out.println("***********");
					 getPreviousTransaction();
					 System.out.println("***********");
					 System.out.println();
					 break;
			 
				 default:
					 System.out.println("Invalid option! Please try again");
					 break;
			 }
		  } while(option != 'E');
		  
		  System.out.println("Thanks for using the services");
	 } 	 
}
