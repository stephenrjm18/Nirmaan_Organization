package employeeDay14;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
		Employee E1=new Employee();
		Employee E2=null;
		
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		
		while(isTrue) {
			System.out.println("press 1 to use Default CONSTRUCTOR");
			System.out.println("press 2 to use PARAMETERIESED CONSTRUCTOR");
			System.out.println("press 3 to DISPLAY");
			System.out.println("press 0 to EXIT");
			System.out.println("");
			System.out.print("Enter your Choise: ");
			int key =sc.nextInt();
			sc.nextLine();
			System.out.println("------------------------------------------------------------------------------------------------------------");

			
			switch (key) {
			case 0: {
              			
				isTrue=false;
				System.out.println("Program exited");
				break;
			}
			case 1:{
				System.out.print("Enter Employee name: ");
				String name=sc.nextLine();
				E1.setName(name);
				
				System.out.print("Enter Employee Department: ");
				String dept=sc.nextLine();
				E1.setDept(dept);
				
				System.out.print("Enter Employee Phone number: ");
				double phone=sc.nextDouble();
				E1.setPhone(phone);
				
				System.out.print("Enter Employee ID: ");
				int id=sc.nextInt();
				E1.setID(id);
				
				
				System.out.println("Success");
				System.out.println("------------------------------------------------------------------------------------------------------------");
				break;
				
				
			}
			
			case 2:{
				System.out.print("Enter Employee name: ");
				String name=sc.nextLine();

				System.out.print("Enter Employee Department: ");
				String dept=sc.nextLine();
				
				System.out.print("Enter Employee Phone number: ");
				double phone=sc.nextDouble();
				System.out.print("Enter Employee ID: ");
				int id=sc.nextInt();
				E2=new Employee(name,dept,phone,id);
				
				System.out.println("Success");
				System.out.println("------------------------------------------------------------------------------------------------------------");

				break;
			}
			case 3:{
				System.out.println("CONSTRUCTOR DISPLAY: "+ E1);
				System.out.println("DEFAULT DISPLAY: "+E2);
				System.out.println("Done");
				System.out.println("------------------------------------------------------------------------------------------------------------");

				break;
			}
			default:
				System.out.println("Enter correct choise!!");
			}
		}
	}

}
