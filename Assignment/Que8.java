package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Que8 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String shuffle[] = new String[]	// add some additional values further
        {
            "fferbu" , "loaft" , "ritsng", "rayar", "glno", "mretsa", "ateroirt"
        } ;
		
        String answer[] = new String[]
        {
            "buffer" , "float" , "string", "array", "long", "stream", "iterator"
        } ;
        
        
        List<String[]> list = new ArrayList<>();
        int i=0;
        int t=shuffle.length;
        while(t-- != 0) {
        	list.add(new String[] {shuffle[i], answer[i]});
        	i++;
        }
        
        long n = list.stream().filter((x) -> {
        		System.out.println(x[0]);
        		System.out.println("Enetr your answer");
        		String s = scn.nextLine();
	        	return s.equals(x[1]); 
        	}).count();
        
        System.out.println("Total points: " + n);
        
	}
}
