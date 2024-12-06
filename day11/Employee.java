package day11;

public class Employee {
	private String name;
	private int age;
	private int empID;
	private String department;
	
	public Employee() {
		
	}
	public Employee(String name,int age,int empID,String department) {
		this.name=name;
		this.age=age;
		this.empID=empID;
		this.department=department;
		
	}
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}

	public int getEmpID() {
		return empID;
		
	}
	public String getDepartment(){
		return department;
		
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setEmpID(int empID) {
		this.empID=empID;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	
	public String toString() {
		return "Employee Name: "+name+
				"\nEmployee Age: "+age+
				"\nEmployee ID: "+empID+
				"\nDepartment: "+department;
	}
	
}
