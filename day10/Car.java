package day10;

public class Car {
	
	String make;
	int year;
	
	Car(){
		this.make ="Unknown";
		this.year =2000;
	}
	Car(String make){
		this.make=make;
		this.year=2000;
	}
	Car(String make,int year){
		this.make= make;
		this.year=year;
	}
	
	void DisplayCarDetails() {
		System.out.println("Car Maker Name: "+make);
		System.out.println("Year of Make: "+year);
	}
}
