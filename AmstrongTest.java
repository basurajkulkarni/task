import java.util.Scanner;

public class AmstrongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		int rem=0;
		int sum=0;
		int num=0;
		for (int i = 1; i <=1000; i++) {
			num=i;
			

			while(num>0)
			{
				//copy++;
				rem=num % 10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			//	System.out.println(sum);
				//System.out.println(co);
				
			
			}
			
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
		
			
			
			
		
	
	
		
		
		
		
	}

}
