package day15;

import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		Calculator c1=new Calculator();
		Scanner sc = new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("1 for ADDITION");
			System.out.println("2 for Subtraction");
			System.out.println("3 for mulitiplication");
			System.out.println("4 for Division");
			System.out.println("0 to Exit");
			System.out.print("Enter your Choice: ");
			int key=sc.nextInt();
			System.out.println("-------------------------------------------------------");
			
			
			if(key==1) {
				System.out.print("Enter the first number: ");
				int fnumb=sc.nextInt();
				System.out.print("Enter the second number: ");
				int snumb=sc.nextInt();
				System.out.println(c1.Add(fnumb,snumb));
				System.out.println("-------------------------------------------------------");
				
			}
			else if(key==2) {
				System.out.print("Enter the first number: ");
				int fnumb=sc.nextInt();
				System.out.print("Enter the second number: ");
				int snumb=sc.nextInt();
				System.out.println(c1.Sub(fnumb,snumb));
				System.out.println("-------------------------------------------------------");
				
				
			}
			else if(key==3) {
				System.out.print("Enter the first number: ");
				int fnumb=sc.nextInt();
				System.out.print("Enter the second number: ");
				int snumb=sc.nextInt();
				System.out.println(c1.mul(fnumb,snumb));
				System.out.println("-------------------------------------------------------");
				
			}
			else if(key==4) {
				System.out.print("Enter the first number: ");
				int fnumb=sc.nextInt();
				System.out.print("Enter the second number: ");
				int snumb=sc.nextInt();
				System.out.println(c1.div(fnumb,snumb));
				System.out.println("-------------------------------------------------------");
				
			}else if(key==0) {
				isTrue=false;
				System.out.println("Exited Successfully");
			}
			else {
				System.out.println("Enter the correct Choice");
				System.out.println("-------------------------------------------------------");
			}
		}
		
	}

}

