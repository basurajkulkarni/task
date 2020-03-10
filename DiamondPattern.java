import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();*/
		int n=5;
		
		for (int i = 0; i <n; i++) {
			
			for (int j = n; j >i; j--) {
				
				System.out.print(" ");
				
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		for (int i = n; i >0; i--) {
			
		     for (int j = n; j >i; j--) {
				
				System.out.print(" ");
				
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}

	}

}
