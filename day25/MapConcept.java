package day25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapConcept {
	 public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		TreeMap<Integer, String> tm=new TreeMap<>();
	
		
		hm.put(1001,"S");
		hm.put(1002,"T");
		hm.put(1003,"E");
		hm.put(1004,"P");
		hm.put(1005,"H");
		hm.put(1006,"E");
		hm.put(1007,"N");
		hm.put(1008,"M");
		
//		hm.remove(1008);
		System.out.println(hm);
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		

		tm.put(1001,"H");
		tm.put(1002,"A");
		tm.put(1003,"R");
		tm.put(1004,"I");
		tm.put(1005,"T");
		tm.put(1006,"H");
		tm.put(1007,"A");
		tm.put(1008,"L");
		
//		hm.remove(1008);
		System.out.println(tm);
		
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.entrySet());
		

		lhm.put(1008,"H");
		lhm.put(1007,"A");
		lhm.put(1006,"R");
		lhm.put(1005,"I");
		lhm.put(1004,"T");
		lhm.put(1003,"H");
		lhm.put(1002,"A");
		lhm.put(1001,"L");
		
//		hm.remove(1008);
		System.out.println(lhm);
		
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());
		
	}
}
