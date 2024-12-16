package day16;

public class Dog implements IAnimal {
	@Override
	public void move() {
		System.out.println("The dog Runs on four legs");
		
	}
	public void speak() {
		System.out.println("The dog says:Woof Woof!");
		
		
	}
	
    public static void main(String[] args) {
    	Dog d1=new Dog();
    	d1.move();
    	d1.speak();
    	System.out.println(IAnimal.isMammal("Dog"));
    	System.out.println(IAnimal.CATEGORY);
    }
	


}
