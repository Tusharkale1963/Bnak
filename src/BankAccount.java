

import java.util.Scanner;
class BankAccount 
{
	static String bankName;
	static String branchName;
	static String IFSC;
	       String accHName;
		   long accNum;
		   static private double balance;
		static    double am;

	static  double diposit(double amount ){
      balance = balance + amount;
	  return balance;
	}
	static	 double withrow(double amount ){
       
		balance = balance - amount;
	  return balance;

	}
     static	void CheckBalance(){
		System.out.println("Your balance is => "+balance );
	}
	static void loop(){
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please select any opretion =>");
		num=sc.nextInt();
		
		switch(num){
		case 1:Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Amount to diposit =>");
		 am=sc1.nextDouble();
		diposit( am );
		System.out.println("Your Balance is => "+balance);
			break;
		case 2:
		 System.out.println("Enter Amount to withdrow =>");
		 am=sc.nextDouble();
		withrow( am );
		System.out.println("Your Balance is => "+balance);
			break;
		case 3:CheckBalance();
			break;
			default:{
				System.out.println("plz enter valid operation");
			}


		}


	}
}
