package day19;

public class Exceptionandling {
	public static void main() {
		int arr[]=new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
		
		
		
	}

}
