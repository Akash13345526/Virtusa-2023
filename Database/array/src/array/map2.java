package array;
import java.util.*;

class Emp8{
	int e7Id;
   String e7Name;
	Emp8(int e7Id, String e7Name){
		this.e7Id = e7Id;
	this.e7Name = e7Name;
	}
}
//
class Student1{
	int s1Id;
	String s1Name;	
	Student1(int s1Id,String s1Name){
		this.s1Id = s1Id;
		this.s1Name = s1Name;
	}	
}

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Emp8, Student1> mEx4 = new LinkedHashMap<Emp8, Student1>();
		mEx4.put(new Emp8(33, "cc"), new Student1(333, "ccc"));  
		mEx4.put(new Emp8(11, "aa"), new Student1(111, "aaa"));
		mEx4.put(new Emp8(44, "dd"), new Student1(444, "ddd"));
		mEx4.put(new Emp8(55, "ee"), new Student1(555, "eee"));
		mEx4.put(new Emp8(22, "bb"), new Student1(222, "bbb")); 
		
		Set s8 = mEx4.entrySet();
		Iterator itr8 = s8.iterator();
		while(itr8.hasNext()) {
			Map.Entry m8 = (Map.Entry)itr8.next();
			Emp8 e8 = (Emp8)m8.getKey();
			System.out.println("Employee--->"+e8.e7Id+"-----"+e8.e7Name);
		
			Student1 ss1 = (Student1) m8.getValue(); 
			System.out.println("Student--->"+ss1.s1Id+"-----"+ss1.s1Name); 
//			
//			
//			
		}
//
	}

}

