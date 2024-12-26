package day22;

import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
	public static void main(String args[]) {
		Book book =new Book();
		Scanner sc= new Scanner(System.in);
		ArrayList<Book> bl=new ArrayList<>();
		

		while(true) {
			
			System.out.println("1 for Add book");
			System.out.println("2 for Update");
			System.out.println("3 for Show");
			System.out.println("4 for Remove" );
			System.out.print("Enter Choice: ");
			int key=sc.nextInt();
			sc.nextLine();
			
			switch(key) {
			case 1:
			{
				System.out.println("Enter book name: ");
				String name=sc.nextLine();
				System.out.println("Enter the price: ");
				double price=sc.nextDouble();
				bl.add(book=new Book(name,price));
				break;
				
				
			}
			case 2:{
				System.out.println("name of the book to update:");
				String select=sc.nextLine();
				boolean isthere= false;
				for(Book book1: bl) {
					if(select.equalsIgnoreCase(book1.getName())) {
						isthere=true;
						System.out.print("Rename: ");
						String name=sc.nextLine();
						System.out.println("price: ");
						double price=sc.nextDouble();
						book1.setName(name);
						book1.setPrice(price);
						break;
						
						
						
						
						
					}
					
				}
			if(!isthere) {
				System.out.println("not there");
			}
				
				
						
			}
			case 3:
			{
				System.out.println(bl);
				break;
				
				
			}
			case 4:{
				System.out.println("enter the book name:");
				String select=sc.nextLine();
				for(Book book1: bl) {
					 -if(select.equalsIgnoreCase(book1.getName())) {
					bl.remove(book1);
					}
				}
				
				
				
				
			}
			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}
		
		
		
		
		
		
	}

	private static Book book(String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
