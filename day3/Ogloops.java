package day3;

import java.util.Scanner;

public class Ogloops {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the table: ");
		int table =sc.nextInt();
		for(int i=1; i<=10;i++) {
			
			System.out.println(table+" x "+i+" = "+table*i);
			
		}
	}

}
