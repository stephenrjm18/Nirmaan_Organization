package day5;
import java.util.Scanner;

public class StringConcept {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name= sc.nextLine();
		System.out.println("your first name: "+name.substring(0,7));
		int lenOfName=name.length();
		System.out.println("last letter of your name: "+name.charAt(lenOfName-1));
		
	}

}
