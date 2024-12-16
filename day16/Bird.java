package day16;

public class Bird implements IAnimal {
	public void move() {
		System.out.println("The bird flies in the sky");
		
		
	}
	public void  speak() {
		System.out.println("The bird says: Chirp Chirp!");
		
	}
	
	public static void main(String args[]) {
		Bird b1=new Bird();
		b1.move();
		b1.speak();
		
		System.out.println(IAnimal.isMammal("Bird"));
		System.out.println(IAnimal.CATEGORY);
	}
	

}
