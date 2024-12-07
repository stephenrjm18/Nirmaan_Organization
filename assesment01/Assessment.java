package assesment01;
import java.util.Scanner;

public class Assessment {
	
//	 /*Vote Casting */
//		static void Vote(int Age) {
//			if(Age<=18) {
//				System.out.println("You are Eligible to vote!!");
//				
//			}else if(Age>=17) {
//				System.out.println("You are not Eligible");
//			}
//		}
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		int age=sc.nextInt();
//		 Vote(age);
//
//		
//	}
	
	/*SECOND ASSESSMENT*/
	
//	public static void main(String agrs[]) {
//		System.out.print("Enter name: ");
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//				for(int i=1;i<=100;i++) {
//			if(i%4==0) {
//				System.out.println(name);
//			}else {
//				System.out.println(i);
//			}
//		}
//	}
	
	
	/*THIRD QUESTION*/
	
	
//	public static void main(String [] args) {
//		for(int i=1;i<=70;i++) {
//			if(i%2!=0) {
//				continue;
//			}else{
//	            System.out.println(i);
//		}
//	}
//	
	
	/* FOURTH */
	
	
	
//	static void oddCheck(int num) {
//		if(num %2==0) {
//			System.out.println(num+" is Even");
//		}
//		else {
//			System.out.println(num+" is Odd");
//		}
//	}
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num=sc.nextInt();
//		oddCheck(num);
//		
//				
//	}
	
/*FIFTH QUESTION*/	
	
	
//	static void caps(String name) {
//		String capital = name.toUpperCase();
//		String small =name.toLowerCase();
//		System.out.println("Capital: "+capital);
//		System.out.println("Small: "+small);
//	}
//	
//	public static void main(String args[]) {
//		Scanner sc =new Scanner(System.in);
//		System.out.print("Enter your name: ");
//		String Name=sc.next();
//		caps(Name);
//		
//		}
//	
	
	
	/* SIXTH QUESTION*/
	
//	static void result(int marks) {
//		if(marks<35 && marks>=0) {
//			System.out.println("You're fail");
//		}else if(marks>= 35 && marks<=75 ) {
//			System.out.println("Just pass");
//			
//		}else if(marks>=76 && marks<=100) {
//			System.out.println("First marks");
//		}
//		else {
//			System.out.println("Enter the correct marks");
//		}
//	}
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in) ;
//		System.out.print("enter your marks: ");
//		int marks=sc.nextInt();
//		result(marks);
//		
//	}
//	
	
	
	/*SEVENTH QUESTION*/
	
//	static void totAvg(int sub1,int sub2) {
//		int total=sub1+sub2;
//		int avg=total/2;
//		System.out.println("Total marks: "+total);
//		System.out.println("Average marks: "+avg);
//	}
//		
//	public static void main(String args[]) {
//		  Scanner sc= new Scanner(System.in);
//		  System.out.print("enter first subject mark: ");
//		 
//		  int sub1=sc.nextInt();
//		  System.out.print("enter second subject mark: ");
//		  int sub2= sc.nextInt();
//		  totAvg(sub1,sub2);
//		  
//		  
//
//	
//	
//	}
	
	
	
	/*EIGHT QUESTION*/
	
	
	static void yearcheck(int year) {
		if(year%4==0) {
			System.out.println("Its a Leap year!!");
		}else {
			System.out.println("Not a leap year!!");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year to check leap year: ");
		int year = sc.nextInt();
		yearcheck(year);
		
	}
	
	
}

