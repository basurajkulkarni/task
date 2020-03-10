
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Linear Search
	/*	
		int item=20;
		int num[]={10,20,30,40,50};
		for (int i = 0; i < num.length; i++) {
			if(num[i]==item)
			{
				System.out.println("Item found at index position"+" "+i);
			}
			
		}*/
		
		
		//binary search
		
		int item=20;
		int num[]={10,20,30,40,50};
		int li=0;
		int hi=num.length-1;
		int mid=(li+hi)/2;
		
		while(li<=hi)
		{
			
		if(num[mid]==item)
		{
			System.out.println("item  found at "+mid);
			break;
		}
		else if(num[mid]<item)
		{
			li=mid+1;
		}
		
		else if(num[mid]>item)
		{
			hi=mid-1;
		}
		mid=hi+li/2;
		}
		
		
		
	}

}
