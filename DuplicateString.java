import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="elephant";
		char c[]=s.toCharArray();
	Map<Character,Integer> hashmap=new HashMap<Character,Integer>();
	for (Character c1 : c) {
		
		if(hashmap.containsKey(c1))
		{
			hashmap.put(c1, hashmap.get(c1)+1);
		}
		else
		{
			hashmap.put(c1, 1);
		}
		
	}
	
	for (Map.Entry<Character,Integer> map : hashmap.entrySet()) {
		
		if(map.getValue()>1)
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	
		
	}
	
	
	}

}
