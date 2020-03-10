
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Bubble Sort
		/*int a[]={21,32,12,14};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
	}*/
	//Selection Sort
		
		
		int a[]={23,34,45,67,6};
		int temp=0;
		int min=0;
		for (int i = 0; i < a.length; i++) {
			min=i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[min])
				{
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
				
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		
		
		
	}

}
