package array;
import java.util.*;
class emp5{

	int e5id;
	String e5Name;
	
	emp5(int e5id, String e5Name){
		this.e5id = e5id;
		this.e5Name = e5Name;
	}
}


public class setEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp5 e51 = new emp5(111, "aaa");
		emp5 e52 = new emp5(333, "ccc");
		emp5 e53 = new emp5(444, "ddd");
		emp5 e54 = new emp5(222, "bbb");
		
		TreeSet<emp5> sE7 = new TreeSet<emp5>(new eNameComp()); 
		sE7.add(e51);
		sE7.add(e52);
		sE7.add(e53);
		sE7.add(e54);
		
		for(emp5 e511 : sE7){
			System.out.println(e511.e5id+ "-------"+e511.e5Name); 
		}

	}

}


class eNameComp implements Comparator<emp5>{

	@Override
	public int compare(emp5 o1, emp5 o2) {
		// TODO Auto-generated method stub
     	return (o1.e5Name).compareTo(o2.e5Name); 
		//return -(o1.e5Name).compareTo(o2.e5Name); 
	}
	
	
}

