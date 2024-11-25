package day2;
import java.util.Scanner;
public class Simple_calc {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for division");
		
		
		System.out.print("Enter the Key: ");
		int key = sc.nextInt();
		System.out.print("Enter the First number: ");
		int fnum =sc.nextInt();
		System.out.print("Enter the Second number: ");
		int snum =sc.nextInt();
		
		
		
		switch(key) {
		case 1:{
			int total=fnum+snum;
           	System.out.println("Total : "+total);
           	break;
		}
		case 2:{
			int total=fnum-snum;
			System.out.println("Total : "+total);	
			break;
		}
		case 3:{
			int total=fnum*snum;
			System.out.println("Total : "+total);
			break;

		}
		case 4:{
			int total=fnum/snum;
    		System.out.println("Total : "+total);
    		break;
			
		}
		default:{
			System.out.println("Invalid Choosing!!");
			break;
		}
		
		
		}
		
		
		
//		
//		if(key==1) {
//			int total=fnum+snum;
//			System.out.println("Total : "+total);
//			
//			
//		}
//		else if(key==2) {
//			int total=fnum-snum;
//			System.out.println("Total : "+total);
//			
//			
//		}
//		else if(key==3) {
//			int total=fnum*snum;
//			System.out.println("Total : "+total);
//			
//			
//		}
//		else if(key==4) {
//			int total=fnum/snum;
//			System.out.println("Total : "+total);
//			
//			
//		}else {
//			System.out.println("Invalid");
//		}
		
	}
	
	
}
