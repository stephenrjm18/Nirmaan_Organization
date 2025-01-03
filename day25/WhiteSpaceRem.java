package day25;

public class WhiteSpaceRem {
	public static void main(String[] args) {
		String name= "malayalam";
		String removed="";
		
		for(char letter:name.toCharArray()) {
			if(letter==' ') {	
			}else{
				removed+=letter;	
			}
		}
//		
		System.out.println(removed);
		for(int i=removed.length()-1;i>=0;i--) {
			
			
			System.out.print(removed.charAt(i));
		}
		
	}

}
