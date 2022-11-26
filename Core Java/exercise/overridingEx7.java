package exercise;
import java.lang.*;

class Parent5{
	void m1() {
		System.out.println("Parent M1 Method...");
	}
	void m3() {
		System.out.println("Parent M3 Method...");
	}
}

public class overridingEx7 extends Parent5{
	void m1() {
		System.out.println("Child M1 Method...");
	}
	void m2() {
		System.out.println("Child M2 Method...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent5 P5 = new Parent5();
		P5.m1();
		P5.m3();
		
		overridingEx7 C5 = new overridingEx7();
	    C5.m1();
	    C5.m2();
	    C5.m3();
		
	    overridingEx7 c51 = (overridingEx7) new Parent5() ;  
		c51.m1();
		c51.m2();
		c51.m3();
			
		Parent5 Pa = new overridingEx7();  // child class object is created
		
		Pa.m1();
//		((overridingEx7) Pa).m2(); 
	    ((overridingEx7) Pa). m2();       	                         
		Pa.m3(); 
		 
		

	}

}

