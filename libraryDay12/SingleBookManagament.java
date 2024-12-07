package libraryDay12;
import java.util.Scanner;

public class SingleBookManagament {
	public static void main(String[] args) {
		Book b1=new Book();
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		
		Book b2;
		
		while(isTrue) {
			
			System.out.println("1 for Add/Update");
			System.out.println("2 for Constructor method");
			System.out.println("3 for Show");
			System.out.println("4 for exit" );
			System.out.print("Enter Choice: ");
			int key=sc.nextInt();
			sc.nextLine();
			
			switch(key) {
			case 1:
			{
				System.out.print("Enter the Title: ");
				String title=sc.nextLine();
				b1.setTitle(title);
				
				System.out.print("Enter the Author: ");
				String author=sc.nextLine();
				b1.setAuthor(author);
				
				System.out.print("Enter the Price: ");
				double price=sc.nextDouble();
				b1.setPrice(price);
				
				System.out.print("Enter the Number of copies: ");
				int number=sc.nextInt();
				b1.setNumber(number);
				System.out.println("Success");
				System.out.println("\n\n\n");
				break;
				
				
				
			}
			case 2:{
				System.out.print("Enter the Title ");
				String title=sc.nextLine();
				System.out.print("Enter the Author: ");
				String author=sc.nextLine();
				System.out.print("Enter the Price ");
				double price=sc.nextDouble();
				System.out.print("Enter the Number of copies ");
				int number=sc.nextInt();
				
				b2 =new Book(title,author,price,number); 
				System.out.println("\n\n\n");
				break;
				
				
				
			}
			case 3:
			{
				System.out.println("");
			
				System.out.println(b1);
				break;
				
			}
			case 4:{
				System.out.println("Program Exited");
				isTrue=false;
				break;
			}
			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}
		
		
		
		
	}

}
