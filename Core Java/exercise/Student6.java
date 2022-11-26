package exercise;
import java.util.*;


class Student6{   
    int id;  
    String name;  
    
    
    Student6(int i,String n){
    	this.id=i;
    	this.name=n;
    	
    }
    void scan()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("enter name:");
    	String name=scan.next();
    	System.out.println("name is:"+name);
    	
    	
    	
    }
  void Display() {
	System.out.println(id+"    "+name);
	scan();
   }

    public static void main(String args[]){  
    	new Student6(10,"bhuvan").Display();
    	

}
    }