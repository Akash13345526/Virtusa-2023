package array;
import java.util.*;

class em{
	int id1;
	String name1;
	em(int id1,String name1){
		this.id1=id1;
		this.name1=name1;
		
	}
	
}
class student{
	int id;
	String name;
	student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
}

public class arrayEx2 {
	public static void main(String []args) {
		em emp1=new em(11,"bhuva");
		student stud1=new student(12,"akash");
		
		ArrayList al=new ArrayList();
		al.add(emp1);
		al.add(stud1);
		al.add(10);
		al.add("bhuvan");
		System.out.println(al);
		System.out.println(al.toString());
		
		for(Object ob: al) { 
			if(ob instanceof em) {
				em ee=(em) ob;
				System.out.println(ee.id1+""+ee.name1);
			}
			if(ob instanceof student ) {
				student stud=(student)ob;
				System.out.println(stud.id+""+stud.name);
			}
			if (ob instanceof Integer) {
				System.out.println(ob);
				
				
			}
			if (ob instanceof String) {
				System.out.println(ob)
;			}
				
				
				
			}
		}
		
		
		
	}

