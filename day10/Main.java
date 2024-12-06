package day10;

public class Main {
	public static void main(String args[]) {
		Car defaultcar=new Car();
		Car oneParamcar=new Car("Mclaren");
		Car twoParamCar=new Car("Masrati",1957);
		
		defaultcar.DisplayCarDetails();
		oneParamcar.DisplayCarDetails();
		twoParamCar.DisplayCarDetails();

	}
}
