package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Que5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float[] valueA =
	        { 
	          10.2f , 14.3f , 16.5f , 
	          18.4f , 22.3f , 36.8f , 
	          45.5f , 60.8f , 85.5f , 94.1f
	        } ;
		
		float n = scn.nextFloat();
		
		Arrays.sort(valueA);
		
		float floor = 0f;
		float ceil = 0f;
		
//		for(int i=0; i<valueA.length; i++) {
//			if(n > valueA[i]) floor = valueA[i];
//		}
//		
//		for(int i=valueA.length-1; i>=0; i--) {
//			if(n < valueA[i]) ceil = valueA[i];
//		}
		
		
		int left = 0;
		int right = valueA.length-1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(n == valueA[mid]) {
				floor = ceil = valueA[mid];
				break;
			}
			else if(n > valueA[mid]) {
				floor = valueA[mid];
				left = mid+1;
			}else {
				ceil = valueA[mid];
				right = mid-1;
			}
		}
		
		System.out.println("Previous no. : " + floor);
		System.out.println("Nearest no. : " + (n - floor < ceil - n ? floor : ceil) );
	}
}
