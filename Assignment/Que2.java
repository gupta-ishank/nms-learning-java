package Assignment;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		
		int k = scn.nextInt();
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] == k) {
					helper(matrix, i, j, k);
				}
			}
		}
	}
	
	public static void helper(int[][] matrix, int i, int j, int k) {
		if(i-1 >= 0) System.out.println(matrix[i-1][j]);
		if(j-1 >= 0) System.out.println(matrix[i][j-1]);
		if(i+1 < matrix.length) System.out.println(matrix[i+1][j]);
		if(j+1 < matrix[0].length) System.out.println(matrix[i][j+1]);
	}
}
