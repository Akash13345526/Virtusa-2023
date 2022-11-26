package array;
import java.util.*;

class emp{
	int id;
	String name;
	emp(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class setEx2 {
	public static void main(String[] args) {
	     emp emp1=new emp(111,"bbbb");
	     
	     emp emp2=new emp(333,"aaaa");
	     emp emp3=new emp(444,"ddd");
	     TreeSet<emp> tss=new TreeSet<emp>( new empCom());
	     tss.add(emp3);
	     tss.add(emp2);
	     tss.add(emp1);
	     
	     for (emp emp11:tss) {
	    	 System.out.println(emp11.id+"-------"+emp11.name);
	    	 
	     }
	     
	     
		
	}
}

	
class empCom implements Comparator<emp>{
	public int compare(emp o1,emp o2) {
		//return (o1.name).compareTo(o2.name);
		return-(o1.name).compareTo(o2.name);
		
		
		
		
	}
		
	}


