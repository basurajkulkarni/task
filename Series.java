import java.util.Scanner;

public class Series {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=3;
		System.out.println("Enter the num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int diff=b-a;
		int num=0;
		int sum=0;
		for (int i = 0; i <=n; i=i+2) {
			//diff=diff+2;
		sum=sum+i;
			System.out.println(sum);
		}
		
		
	}

}
