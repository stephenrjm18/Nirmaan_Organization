package day25;
//@FunctionalInterface
interface cal{
	void add();
}

public class LambdaFunc {
	public static  void main(String[] args) {
		cal cl =()->{
			System.out.println("HEllo");
		};
		
//		cal cl= () -> System.out.println(10+20);
//		
//	
	cl.add();
	}

}
