import java.util.Arrays;

public class HashcodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="basuraj";
				System.out.println((int)s.charAt(0));
				System.out.println(s.hashCode());
		/*String s="basuraj";
		String s1="jarusab";
		int temp=0;
		
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		
		if(arranagram(c,c1))
		{
			System.out.println("Two are anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
	}

	private static boolean arranagram(char[] c, char[] c1) {
		// TODO Auto-generated method stub
		
		   // Get lenghts of both strings 
        int n1 = c.length; 
        int n2 = c1.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false;
		Arrays.sort(c);
		Arrays.sort(c1);
		
		for (int i = 0; i < c1.length; i++) {
			if(c[i]==c1[i])
			{
return true;
}
			return false;
		}
		return false;*/

	}

}
