package day3;
import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks: ");
		int marks= sc.nextInt();
        if(marks<=100) {
    		if(marks >=35) {
    			if(marks>=90) {
    				System.out.println("Grade A");
    			}else if(marks<=50) {
    				System.out.println("Grade B");
    			}
    			else {
    				System.out.println("Grade C");
    				
    			}
    			
    		}else {
    			System.out.println("Fail");
    		}
        	
        }
        else {
        	System.out.println("Please enter with");
        }
	}

}
