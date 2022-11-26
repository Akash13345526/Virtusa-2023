package exercise;

//public class thiskeyword {
public 	class thiskeyword{  
		int rollno;  
		String name;  
		float fee;  
		thiskeyword(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
	  
		  
		//class TestThis3{  
		public static void main(String args[]){  
	    thiskeyword s1=new thiskeyword(111,"ankit",5000);  
	    thiskeyword s2=new thiskeyword(112,"sumit",6000);  
		s1.display();  
		s2.display();  
		}}  


