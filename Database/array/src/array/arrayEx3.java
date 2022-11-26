package array;
import java.util.*;
public class arrayEx3 {
	public static void main(String[] args) {
		ArrayList al3=new ArrayList();
		al3.add(100);
		al3.add(10.1);
		al3.add("bhuvab");
		al3.add(0,100);
		al3.add(1,"bhuva");
	  System.out.println(al3);
	  System.out.println(al3.size());
	  al3.remove(0);
	  System.out.println(al3);
	 // al3.clear();
	  System.out.println(al3.isEmpty());
	  Integer i=new Integer(100);
	  al3.add(i);
	  System.out.println(al3);

	  String s=new String("bhuvanesh");
	  al3.add(s);
	  System.out.println(al3)
	  ;

	  

	  
	  
	  

	  

	  
	  
		
	}

}
