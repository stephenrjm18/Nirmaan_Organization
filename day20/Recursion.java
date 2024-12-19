package day20;

public class Recursion {
	int num=0;
    void rec() {
		num+=1;
		System.out.println(num);
		rec();
	}
	public static void main(String[] args ) {
		Recursion r=new Recursion();
		r.rec();
		
	}

}
