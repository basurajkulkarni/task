import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//int num=153;
		int rem=0;
		int temp=0;
		int res=0;
		for(int i=1;i<=n;i++)	
		{
			temp=i;
			//int temp[i]=num[i];
		while(temp>0)
		{
			rem=temp%10;
			res=res+rem*rem*rem;
			temp=temp/10;
			//System.out.print(res+" ");
		}
		
		if(res==i)
		{
			System.out.println("Armstrong no"+" "+i);
		}
		
		res=0;
		}

	}

}
