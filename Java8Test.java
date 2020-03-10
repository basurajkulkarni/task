import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> list=new ArrayList<Integer>();
   list.add(2);
   list.add(8);
   list.add(10);
   Stream<Integer> s=list.stream();
   s.filter(a->a>3);
   s.forEach(a->System.out.println(a));
	}

}
