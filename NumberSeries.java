
public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int arr[]=new int[n];
		arr[0]=2;
		arr[1]=3;
		int diff=0;
		for (int i = 2; i < arr.length; i++) {
			
			diff=diff+2;
			arr[i]=arr[i-1]+diff;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}

	}

}
