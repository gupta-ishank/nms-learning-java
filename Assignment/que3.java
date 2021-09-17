package Assignment;

import java.util.HashMap;

public class que3 {
	public static void main(String[] args) {
		String s = "Java is a program language , it is a platform independent language";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] arr = s.split(" ");
		
		for(String str : arr) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		
		int count=0;
		for(String str : map.keySet()) {
			System.out.println(str + " = " + map.get(str));
			count++;
		}
		
		System.out.println("total count : " + count);
	}
}
