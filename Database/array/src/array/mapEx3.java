package array;
import java.util.Map;
import java.util.TreeMap;


public class mapEx3 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(444, "bbbb")
;
		tm.put(222,"aaa");
		tm.put(333, "ccc");
		System.out.println(tm);
		
		
		
		System.out.println(tm.headMap(444));
		
		
		
	}
}

