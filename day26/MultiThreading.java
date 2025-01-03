package day26;
class animal {
	
}
class Ex1 extends animal implements Runnable{
	public void run() {
	for(int i=1;i<=50;i++) {
		System.out.println("Example1: "+i);
	}
	try {
	Thread.sleep(1000);
	}catch(Exception e){
		
	}
}
}
class Ex2 extends Thread{
	public void run() {
	for(int i=1;i<=50;i++) {
		System.out.println("Example2: "+i);
	}
	try {
		Thread.sleep(800);
	} catch (Exception e) {
		
	}
}
}



public class MultiThreading {
	
	
	public static void main(String[] args) {
		Ex1 e1=new Ex1();
		Ex2 e2 = new Ex2();
		
		Thread tr=new Thread(e1);
		tr.start();
		e2.start();
		
	}

}
