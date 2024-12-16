package day16;

public interface IAnimal {
	String CATEGORY="Living Being";
	public static boolean isMammal(String animalName) {
		return (animalName.equalsIgnoreCase("Dog")||animalName.equalsIgnoreCase("Cat") ||animalName.equalsIgnoreCase("Human"));
		
	}
	default void speak() {
		System.out.println("Animal making sound");
	}
	public void move();
	

}
