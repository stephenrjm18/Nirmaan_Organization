package day11;

public class Main {
	public static void main(String[] args) {
		Employee E1 =new Employee();
		
//		     Setter
		
		E1.setName("Stephen");
		E1.setAge(22);
		E1.setEmpID(4037);  
		E1.setDepartment("CSE");
		
//		Getter
		
		System.out.println("----------------------GETTER and SETTER METHOD----------------------------");
		System.out.println(E1.getName());
		System.out.println(E1.getAge());
		System.out.println(E1.getEmpID());
		System.out.println(E1.getDepartment());
		System.out.println("");
		
//		Constructor
		
		Employee E2 = new Employee("KISHOREyyy",22,1224,"CSE");
		
		System.out.println("--------------------------CONSTRUCTOR METHOD-------------------------------");
		System.out.println(E2.getName());
		System.out.println(E2.getAge());
		System.out.println(E2.getEmpID());
		System.out.println(E2.getDepartment());
		System.out.println("");
		
//		TOSTRING
		
		System.out.println("---------------------------ToString() METHOD-------------------------------");
		System.out.println(E1);
		System.out.println("");
		//System.out.println(E2.ToString());
		
	}

}
