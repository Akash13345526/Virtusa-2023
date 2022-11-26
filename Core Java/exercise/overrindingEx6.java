package exercise;
import java.lang.*;

class parent0{
	final void m1() {
		System.out.println("final value");
		
	}
	
}

public class overrindingEx6 extends parent0{
	void m2() {
		System.out.println("overriden");
	}
	public static void main(String[] args) {
		new overrindingEx6().m1();
		
	}

}
