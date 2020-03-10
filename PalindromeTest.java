import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
		int palindrome=num;
		while(palindrome!=0)
		{
		
			rem=palindrome%10;
			rev=rev*10+rem;
			palindrome=palindrome/10;
			
			
		}
		
		if(num==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		

	}

}
