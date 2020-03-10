import java.util.Scanner;

public class PrimeNumber {

	public int primeNumberCheck(int num)
	{
		//int num=7;
		   int temp=0; 
		  for(int i=2;i<num-1;i++)
		  {
			  
			  if(num%i==0)
			  {
				 temp=temp+1;
				  
			  }
		  }
		  
		  if(temp>0)
		  {
			  System.out.println("Not Prime Numbre"+num);
			 // return false;
		  }
		  
		  else{
			  System.out.println("prime num"+num);
			  
			 // return true;
		  }
		  
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the value of n");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  //  int fl=0;
		PrimeNumber p=new PrimeNumber();
		for (int i = 1; i < n; i++) {
			
		
			p.primeNumberCheck(i);
			//System.out.println(p.primeNumberCheck(i));
			
		}

    	
    	
    }
    
    
	}


