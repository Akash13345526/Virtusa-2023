package exercise;
//import java.util.*;

public class variableex1 {
	final int id=100;//instance
	//int id=10;
	static String name="bhuvan";//static
	public static void main(String[] args) {
		//final int no=10;
		
	    int no=11;
		
	   variableex1 ex1=new variableex1();
	   
	  // ex1.id=10; 
	   ex1.name="san";
	   
	   System.out.println(no);
	   System.out.println("name is:"+name);
	   System.out.println("id is:"+ex1.id);
	   
	}
}
