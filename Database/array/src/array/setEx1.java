package array;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;





public class setEx1 {
	 static int i=1;
	
	public static void main(String[] args) {
		Set Ex1=new HashSet();
		Ex1.add(null);
		Ex1.add("bhuvav");
		Ex1.add("bhuvav");

		Ex1.add("adi");
		Ex1.add("bhhhh");
		Ex1.add("adii");
		Ex1.add(1);
		Ex1.add(2);
		
		System.out.println(Ex1);
		Iterator Ex2= Ex1.iterator();
		while(Ex2.hasNext()) {
			System.out.println(i+++"."+Ex2.next());
			
		}
		
		
		
		HashSet hs1=new HashSet();
		hs1.add("bhu");
		hs1.add(1);
		hs1.add(2);
		hs1.add('a');
		hs1.add(null);
		System.out.println(hs1);
		
		HashSet hs2=new HashSet();
		hs2.add(100)
;
		hs2.add("bhuvna");
		hs1.add("bhu");
		hs2.addAll(hs1);
		
		System.out.println(hs2);
		
		
	
	
	    LinkedHashSet lhs1=new LinkedHashSet();
	     lhs1.add('s');
	     lhs1.add("bhuvanesh babu");
	     lhs1.add(1000);
	     lhs1.add("bhuvbb");
	     lhs1.add(1000);
	     
	     System.out.println(lhs1);
	     
	     TreeSet ts=new TreeSet();
	     ts.add("bhuvanesh");
	     ts.add("akash");
	     ts.add("adii");
	     ts.add("akash");
	     ts.add("adi");
	     System.out.println(ts);
	     Iterator<String> it=ts.iterator();
	     while(it.hasNext()) {
	    	 System.out.print(it.next());
	    	 
	     }
	     System.out.println(ts.tailSet("akash"));
	     
	     
	     
	
	
	
	}
	

}
