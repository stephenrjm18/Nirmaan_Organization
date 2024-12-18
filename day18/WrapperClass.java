package day18;

import java.util.Scanner;

public class WrapperClass implements IEx1,IEx2{
	public static void main(String ars[]) {
		//----------------------primitive to Wrapper Class ---------------------
//		byte num1=10;
//		Byte numb1=num1; 
//		
//		boolean num2=true;
//		Boolean numb2=num2;
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		try {
			System.out.println("Enter the First number: ");
			
			a=sc.nextInt();
			System.out.println("Enter the Second Number: ");
		   b=sc.nextInt();
		   WrapperClass wc=new WrapperClass();
			
			System.out.println(wc.Add(a, b));
			System.out.println(wc.Sub(a, b));
			try {
				System.out.println(wc.Div(a,b));
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println(wc.mul(a,b));
			
		}catch(Exception st) {
			System.out.println("Enter only numbers "+st);
		}
		
		
		
		
		
	
		
		
		
		
		
	}

	@Override
	public int Div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
