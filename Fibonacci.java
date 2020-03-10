import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0;
     int b=1;
     int sum=0;
     System.out.println("enter the number");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     for (int i = 2; i <=n; i++) {
    	 
    	 sum=a+b;
    	 System.out.print(sum+" ");
    	 a=b;
    	 b=sum;
		
	}
     
	}

}
