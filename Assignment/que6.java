package Assignment;

import java.util.Arrays;
import java.util.Random;

public class que6 {
	public static void main(String[] args) {
		
		
		int[] A = new int[25];
		
		Random rnd = new Random();
		
		int i=0;
		while(i < A.length) {
			int n = rnd.nextInt(26);
			if(n == 0) continue;
			boolean flag = true;
			for(int j=0; j<i; j++) {
				if(A[j] == n) {
					flag = false;
					break;
				}
			}
			if(flag) {
				A[i++] = n; 
			}
		}
		
		for(int x : A) {
			System.out.print(x + " ");
		}
		
	}
}
