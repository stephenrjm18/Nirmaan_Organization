package day6;

public class Nirmaan {
	String name="";
	int id=0;
	String department="";
	int salary=0;
	long age=0;
	void addtion(int a,int b){
		System.out.println(a+b);
		
		
	}

	public static void main(String[] args) {
		Nirmaan emp1= new Nirmaan();
		emp1.id=1;
		emp1.name="ANGEL MANOO  ";
		emp1.department="Soft Skil";
		emp1.age=1000;
		emp1.salary=1000000;
		emp1.addtion(21,43);
		emp1.addtion(31,43);

	}

}

