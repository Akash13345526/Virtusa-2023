package array;
import java.util.*;

public class map1 {
	public static void main(String[] args) {
		HashMap m1=new HashMap();
		m1.put(1,"aaa");
		m1.put(2,"ccc");
		m1.put(3, "bbb");
		System.out.println(m1);
		
		Collection c1=m1.values();
		System.out.println(c1);
		
		Set set1=m1.keySet();
		System.out.println(set1);
		
		Set Set2=m1.entrySet()
;
		Iterator itr=Set2.iterator()
;
		while(itr.hasNext()) {
			Map.Entry ME=(Map.Entry) itr.next();
			System.out.println(ME.getKey()+"-----"+ME.getValue());
			
		}
		
		LinkedHashMap LHM1=new LinkedHashMap();
		LHM1.put(1111, "eeeee");
		LHM1.put(4444, "aaaa");
		LHM1.put(2222, "bbbb");
		LHM1.put(3333, "cccc");
		LHM1.putAll(m1);
		System.out.println(LHM1);
		
		TreeMap Tm1=New TreeMap();
		



		
		
		
		}
		
	}


