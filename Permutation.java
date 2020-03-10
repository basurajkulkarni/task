import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Enter the String");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
	Permutation p=new Permutation();
	p.permute(s, 0, s.length()-1);
		
	
		
	}

	private static void permute(String s, int begin, int end) {
		// TODO Auto-generated method stub
		
		for (int i = begin; i <=end; i++) {
			if(begin ==end)
					{
				System.out.println(s);
					}
			
			
			
			s=swap(s,begin,i);
			
			permute(s,begin+1,end);
			
			s=swap(s,begin,i);
			//System.out.println(s);
			
		}
		
	}

	private static String swap(String s, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char c[]=s.toCharArray();
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return s.valueOf(c);
	}

}
