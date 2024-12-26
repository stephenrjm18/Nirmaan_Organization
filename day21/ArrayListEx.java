package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(50);
		
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(60);
		al2.add(70);
		
		
		System.out.println(al.addAll(al2));
		System.out.println(al);
		
		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("After sort"+al);
		Collections.sort(al,Comparator.reverseOrder());
		System.out.println("Descedingorder"+  al);
		
		
	}

}
