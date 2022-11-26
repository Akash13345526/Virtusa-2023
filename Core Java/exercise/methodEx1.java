package exercise;

public class methodEx1 {

	void add1() {
		System.out.println("Without Parameter Without Return Type");
	}
	
	String add2() {
		System.out.println("Without Parameter With Return Type"); 
		return "welcome";
	}
	
	void add3(int a) {
		System.out.println("With Parameter Without Return Type = "+a);   
	}
	
	int add4(int a, int b) {
		int c =a+b;
		System.out.println("With Parameter With Return Type"); 
		return c;
	}
	

	public static void main(String[] args) {  // JVM
		// TODO Auto-generated method stub
		//System.out.println("WELCOME");
		
		methodEx1 Ex1=new methodEx1();
		//Ex1.add1();
		
		System.out.println(Ex1.add2());
		
	    //int b= Ex1.add4(100,20);
	    System.out.println(Ex1.add4(100,20));
	    
	    Ex1.add3(10);
		
		
}
}
