package array;
import java.util.*;

public class setEx3 {
	public static void main(String[]args) {
		@SuppressWarnings("rawtypes")
		TreeSet ts3=new TreeSet(new strComp1());
		ts3.add("bbb");
		ts3.add(new StringBuffer("aaaa"));
		ts3.add("ddd");
		ts3.add(new StringBuffer("ccc"));
		//System.out.println(ts3);
		//Iterator it3=ts3.iterator();
		//while (it3.hasNext()) {
			//System.out.println(it3.next());
		//}
		
		System.out.println(ts3);
	
	
	}	
class strComp1 implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		String st3=o1.toString();
		String st31=o2.toString();
		return st3.compareTo(st31);
		
	}
}
}

