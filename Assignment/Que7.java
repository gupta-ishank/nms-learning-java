package Assignment;

public class Que7 {
	public static void main(String[] args) {
		String str = "java";
		code(str, "");
	}
	
	static void code(String str , String ans)
	{  

		String[] arr = str.split("");
		
		boolean[] vis = new boolean[arr.length];
		helper(arr, vis, "");
	}
	
	public static void helper(String[] arr, boolean[] vis, String path) {
		if(path.length() == arr.length) {
			System.out.print(path+ "  ");
		}
		
		for(int i=0; i<arr.length; i++) {
			if(!vis[i]) {
				vis[i] = true;
				helper(arr, vis, path + arr[i]);
				vis[i] = false;
			}
		}
	}
}
