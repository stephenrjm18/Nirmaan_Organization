package day24;

import java.util.HashSet;

public class BookInterface {
	public static void main(String args[]) {
		BookHash b1=new BookHash(1,"stephen",100);
		BookHash b2=new BookHash(2,"stephen",100);
		HashSet<BookHash> hs =new HashSet<>();
		hs.add(b1);
		hs.add(b2);
		
		System.out.println(hs);
		
		
	}

}
