package Assignment;

class GrowbleIntArray{
	private int[] A;
	private int size = 0;
	private int idx = -1;
	
	GrowbleIntArray(){
		assignSize(10);
	}
	
	GrowbleIntArray(int n){
		assignSize(n);
	}
	
	private void assignSize(int n) {
		this.A = new int[n]; 
	}
	
	private int capacity() {
		return this.A.length;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<this.size; i++){
            sb.append(this.A[i]);
            if(i != this.size - 1)
                sb.append(",");
        }

        return sb.toString();   
    }
	
	public void add(int val) {
		if(this.size == this.capacity()) {
			growAndAdd(val);
		}
		A[++idx] = val;
		size++;
	}
	
	private void growAndAdd(int val) {
		int[] temp = new int[this.size];
		int j=0;
		while(j < this.size) {
			temp[j] = A[j];
			j++;
		}
		
		this.assignSize(temp.length * 2);
		j=0;
		for(int x : temp) {
			A[j++] = x;
		}
	}
}

public class Que1 {
	public static void main(String[] args) {
		GrowbleIntArray arr = new GrowbleIntArray(10);
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.add(16);
		arr.add(17);
		arr.add(18);
		arr.add(19);
		
		
//		for(int n : arr) {
//			System.out.println(n);
//		}
		
		System.out.println(arr);
		System.out.println(arr.size());
	}
}
