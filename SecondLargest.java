
public class SecondLargest {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
 int largest=0;
 int secondlargest=0;
 int num[]={12,23,24,45};
 
 for (int i = 0; i < num.length; i++) {
	 
	 if(num[i]>largest)
	 {
		 secondlargest=largest;
		 largest=num[i];
		 
		 
	 }
	 
	 else if(num[i]>secondlargest && num[i]!=largest)
	 {
		 secondlargest=num[i];
	 }
	
}
 
 System.out.println(secondlargest);*/
		
		int largest=0;
		int secondlargest=0;
		int a[]={12,34,23,89};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		
			
		}
		
		System.out.println(a[a.length-2]);
	}

}
