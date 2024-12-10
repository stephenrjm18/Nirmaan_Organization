package day13;

class Animal {
	public void makeSound() {
		System.out.println("This animal makes a sound");
	}

}

class Dog extends Animal{
@Override
public void makeSound() {
	System.out.println("The dog barks");
	
}
}


class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The cat barks");
		
	}
	
	
}
	
	
	


public class Inheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		
		Cat c=new Cat();
		c.makeSound();
	}
	

}
