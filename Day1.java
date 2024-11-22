package day1;
import java.util.Scanner;
public class Day1 {
   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.print("Enter the first number: ");
	   int fnumber= sc.nextInt();
	   System.out.print("Enter the second number: "); 
	   int snumber= sc.nextInt();
	   int Aval=10;
	   int Uval=12;
	 
	   System.out.println("Arithmetic Operations: ");
	   System.out.println("Addition: "+(fnumber+snumber));
	   System.out.println("Subtraction: "+(fnumber-snumber));
	   System.out.println("Multiplication: "+(fnumber*snumber));
	   System.out.println("Division: "+(fnumber/snumber));
	   System.out.println("Modulus: "+(fnumber%snumber));
	   System.out.println(" ");
	   System.out.println("Relational Operations: ");
	   System.out.println(fnumber+" > "+snumber+" :"+(fnumber>snumber));
	   System.out.println(fnumber+" < "+snumber+" :"+(fnumber<snumber));
	   System.out.println(fnumber+" >= "+snumber+" :"+(fnumber>=snumber));
	   System.out.println(fnumber+" <= "+snumber+" :"+(fnumber<=snumber));
	   System.out.println(fnumber+" != "+snumber+" :"+(fnumber!=snumber));
	   System.out.println(" ");
	   System.out.println("Logical Operations");
	   System.out.println("("+fnumber+" > "+ 10 +" AND "+snumber+" < "+50+") : " +(fnumber >  10  && snumber < 50));
	   System.out.println("("+fnumber+" < "+ 5 +" OR "+snumber+" > "+100+") : " +(fnumber >  10  || snumber < 50));
	   System.out.println(" ");
	   System.out.println("Assignment Opertions: ");
	   System.out.println("Initial value: 10");
	   System.out.println("After += : "+(fnumber+=Aval));
	   System.out.println("After -= : "+(fnumber-=Aval));
	   System.out.println("After *= : "+(fnumber*=Aval));
	   System.out.println("After /= : "+(fnumber/=Aval));
	   System.out.println("After %= : "+(fnumber%=Aval));
	   System.out.println(" ");
	   System.out.println("Unary Opertion: ");
	   System.out.println("Initial value: 12");
	   System.out.println("After increment: "+ (++Uval));
	   System.out.println("After decrement: "+ (--Uval));
	   System.out.println(" ");
	   System.out.println("Conditional Opertion");
	   int fnum=fnumber;
	   int evecheck=fnum%=2;
	   
	   if(evecheck==0) {
		   System.out.println(fnumber+" is Even");
		   
	   }else {
		   System.out.println(fnumber+" is Odd");
	   }
	  
	   
	 
	    
	   
	   
   }
}
