package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class pair{
		String date;
		int consumption;
		
		pair(String date, int consumption){
			this.date = date;
			this.consumption = consumption;
		}
	}

	public class PowerConsumption
	{
		String date ;
		int machineNo ;
		int consumptionInHp ;
		
		public PowerConsumption( String date , int machineNo , int consumptionInHp )
		{
			this.date = date ;
			this.machineNo = machineNo ;
			this.consumptionInHp = consumptionInHp ;
		}
		
		public String toString()
		{
			StringBuffer str = new StringBuffer() ;
			str.append( date );
			str.append( "\t\t" );
			str.append( String.valueOf( machineNo ) );
			str.append( "\t\t" );
			str.append( String.valueOf( consumptionInHp ) );
			return str.toString() ;
		}
		
		public static void main( String ar[] )
		{
			PowerConsumption p[] = new PowerConsumption[6] ;
			p[0] = new PowerConsumption ( "10.05.08" , 10 , 100 ) ;
			p[1] = new PowerConsumption ( "10.05.08" , 11 , 120 ) ;
			p[2] = new PowerConsumption ( "10.05.08" , 12 , 125 ) ;
			p[3] = new PowerConsumption ( "11.05.08" , 10 , 145 ) ;
			p[4] = new PowerConsumption ( "11.05.08" , 11 , 155 ) ;
			p[5] = new PowerConsumption ( "12.05.08" , 12 , 165 ) ;
			System.out.println("Date\t\tMachine\t\tConsumption");
			for( int i = 0 ; i < p.length ; i++ ) {
				System.out.println(p[i]) ;
			}
			
			System.out.println("==============================================================================");
			
			HashMap<Integer, ArrayList<pair>> map = new HashMap<>();
			HashSet<String> dateMap = new HashSet<>();
			
			for(int i=0; i<p.length; i++) {
				if(!map.containsKey(p[i].machineNo)) {
					ArrayList<pair> arr = new ArrayList<>();
					map.put(p[i].machineNo, arr);
				}
				ArrayList<pair> base = map.get(p[i].machineNo);
				base.add(new pair(p[i].date, p[i].consumptionInHp));
				map.put(p[i].machineNo, base);
				
				dateMap.add(p[i].date);
			}
			
			String[][] arr = new String[map.size()+2][dateMap.size()+2];
			
			arr[0][0] = "Machine/Date";
			arr[0][arr.length-1] = arr[arr.length-1][0] = "Total";
			
			int i=1;
			for(String d : dateMap) {
				arr[0][i++] = d;
			}
			
			i=1;
			int j=0;
			int totalsum=0;
			
			for(int k : map.keySet()) {
				arr[i][0] = Integer.toString(k);
				j=1;
				ArrayList<pair> list = map.get(k);
				int a=0;
				int sum=0;
				while(a < list.size()) {
					if(list.get(a).date == arr[0][j]) {
						int val = list.get(a).consumption;
						sum += val;
						arr[i][j] = Integer.toString(val);
						a++;
					}else {
						arr[i][j] = "0";
					}
					j++;
				}
				totalsum += sum;
				arr[i][arr[0].length-1] = Integer.toString(sum);
				i++;
			}
			
			arr[arr.length-1][arr[0].length-1] = Integer.toString(totalsum);
			
			for(i=1; i<arr.length-1; i++) {
				int sum=0;
				for(j=1; j<arr[0].length; j++) {
					sum += Integer.valueOf(arr[j][i] == null ? "0" : arr[j][i]);
					if(j == arr.length-1) {
						arr[arr.length-1][i] = Integer.toString(sum);
					}
				}	
			}
			
			for(int n=0; n<arr[0].length; n++) {
				if(arr[0][n] == null) arr[0][n] = "0";
					System.out.print(arr[0][n]+"\t");
			}
			System.out.println();
			
			for(int m=1; m<arr.length; m++) {
				for(int n=0; n<arr[0].length; n++) {
					if(arr[m][n] == null) arr[m][n] = "0";
					System.out.print(arr[m][n]+"\t\t");
				}
				System.out.println();
			}
		}
	}
