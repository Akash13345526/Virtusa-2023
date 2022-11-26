package array;
import java.util.*;

public class hastset {
	public static void main(String [] args) {
		Set<String> hs1=new HashSet();
		hs1.add("bhuvan");
		//hs1.add(12);
		hs1.add("bhuvan");
		hs1.add("aadiii");
		hs1.add("bhu");
		hs1.add("akas");
		System.out.println(hs1);
		Iterator itr1=hs1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
				
		
	}
		Set st1=new LinkedHashSet();
		st1.add("santhosh");
		st1.add("bhuvan");
		st1.addAll(hs1);
		System.out.println(st1);
		//System.out.println(st1);
		
		System.out.println(hs1);
		st1.removeAll(hs1);
		System.out.println(st1);
		//hs1.clear();
		//System.out.println(hs1);
         hs1.removeIf(str->str.contains("bhuvan"));
 		System.out.println(hs1);

		
		
		
		TreeSet ts1=new TreeSet();
		ts1.add("bhuvanesh");
		ts1.add("akaks");
		ts1.add("ooo");
		System.out.println("treeset="+ts1);
		
       TreeSet sEx91 = new TreeSet();
		
		sEx91.add(10);
		sEx91.add(3);
		sEx91.add(40);
		sEx91.add(2);
		
		TreeSet sEx92 = new TreeSet(sEx91); 
		
		sEx92.add(4);
		sEx92.add(1);
		sEx92.add(20);
		sEx92.add(30);
		
		System.out.println(sEx92);
		
		
		TreeSet ts2=new TreeSet();
		ts2.add("bhuva");
		ts2.add("akash");
		ts2.add("gokul");
		ts2.add("santhosh");
		System.out.println(ts2.headSet("gokul"));
		
		System.out.println(ts2.tailSet("gokul"));
		SortedSet ss1=ts2.tailSet("gokul");
		TreeSet ts3=new TreeSet(ss1);
		System.out.println(ts3);
		Iterator it=ts3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		




		

		
		

	}
}
		
