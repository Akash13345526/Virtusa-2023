package exercise;
import java.lang.*;

class Parent4{
	float over() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDDEN METHOD");
		return 10.5f;
	}
}

public class overridingEx4 extends Parent4{
	float over() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDING METHOD");
		return 50.05f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   overridingEx4 Ex4=new overridingEx4();
		   System.out.println(Ex4.over());
		 
		
	}

}

 