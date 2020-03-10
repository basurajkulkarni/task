
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,3,4,6,7};
		int missing=0;
		int diff=arr[1]-arr[0];
		for (int i = 2; i < arr.length; i++) {
			
			if(arr[i]+diff!=arr[i+1])
			{
				System.out.println(arr[i]+diff);
				break;
			}
		}
	}

}
