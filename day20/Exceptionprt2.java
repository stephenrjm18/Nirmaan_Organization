package day20;

import java.util.Scanner;

public class Exceptionprt2 {
	public static void main(String[] args ) {
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			if(age>0) {
				System.out.println(age);
			}else {
				throw new ArithmeticException();		}
			
			
		}catch(ArithmeticException e) {
			System.out.println("Enter the correct number! ");
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("program done ");
		}
	}

}
