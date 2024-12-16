package assessment2;

import java.util.Scanner;

public class MainBank {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		AccountDetails a1=new AccountDetails();
		int Cpin =a1.getPin();
		System.out.print("Enter the pin no:");
		int Epin=scan.nextInt();
		if(Cpin==Epin) {
			  System.out.println("Enter the Account number: ");
			  int accnum=scan.nextInt();
			  scan.nextLine();
			  a1.setAccNum(accnum);
			  System.out.println("enter the holder name:");
			  String name=scan.nextLine();
			  a1.setHolderName(name);
			while(true) {
				  System.out.println("press 1 to Deposit");
				  System.out.println("press 2 to Withdraw");
				  System.out.println("press 3 to check Balance");
				  System.out.println("press 4 to Display Details");
				  System.out.println("Enter your choice: ");
				  int key=scan.nextInt();
				  if(key==1) {
					  System.out.print("enter the Amount: ");
					  double balance=scan.nextDouble();
					  a1.setBalance(balance);
					  
				  }
				  else if(key ==2) {
					  System.out.println("enter the amount:");
					  double balance=scan.nextDouble();
					  a1.setBalance(balance);
				  }
				  else if(key==3) {
					 System.out.println( a1.getBalance());
					 
				  }
				  else if(key==4) {
					  System.out.println(a1);
				  }
				  
			}
			  
			
			
			
			
		}
		else {
			System.out.println("Wrong pin");
		}
		
	}

}
