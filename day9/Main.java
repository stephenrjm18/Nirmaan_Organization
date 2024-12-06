package day9;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Calculator Cal= new Calculator();
		Scanner sc=new Scanner(System.in);
        boolean isTrue=true;
		
		while(isTrue) {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 To Exit");
			System.out.print("Enter the Key: ");
			int key = sc.nextInt();
			
		
			
			
			switch(key) {
			case 1:{
				
				
				System.out.print("Enter the First number: ");
				int fnum =sc.nextInt();
				System.out.print("Enter the Second number: ");
				int snum =sc.nextInt();
				
			
	           	System.out.println("Total : "+	Cal.Addition(fnum,snum ));
	           	break;
			}
			case 2:{
				
			
				System.out.print("Enter the First number: ");
				int fnum =sc.nextInt();
				System.out.print("Enter the Second number: ");
				int snum =sc.nextInt();
				
				
				System.out.println("Total : "+Cal.Subtraction(fnum,snum ));	
				break;
			}
			case 3:{
				
				
				System.out.print("Enter the First number: ");
				int fnum =sc.nextInt();
				System.out.print("Enter the Second number: ");
				int snum =sc.nextInt();
				
				
				System.out.println("Total : "+Cal.Multiplication(fnum,snum ));
				break;

			}
			case 4:{
				
				
				System.out.print("Enter the First number: ");
				int fnum =sc.nextInt();
				System.out.print("Enter the Second number: ");
				int snum =sc.nextInt();
				
				
	    		System.out.println("Total : "+Cal.Division(fnum,snum ));
	    		break;
				
			}
			case 5:{
				isTrue=false;
				System.out.println("Velliya poo da naaiya");
				break;
			}
			default:{
				System.out.println("Invalid Choosing!!");
				break;
			}
			}
		
		}
	}}

