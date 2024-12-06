package day4;

public class NestedFor {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("Iteration "+i+" Starts");
			System.out.println(" "
					+ "");
			for(int j=1;j<=5;j++) {
				System.out.println(j);
			}
			
			System.out.println(" ");
		}
	}

}
