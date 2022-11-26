package exercise;
import java.lang.*;



class animal{
	
}
class elephant extends animal{
	//System.out.println("nvbvbbv");
}

class parents{
	animal m1() {
		//super();
		System.out.println("nnvnnv");
		return new animal();
		
	}
}
public class overridingEx5 extends parents{
	elephant m1() {
		super.m1();
		System.out.println("method overrinding");
		return new elephant();
	}
	public static void main(String[] args) {
		overridingEx5 Ex5=new overridingEx5();
		System.out.println(Ex5.m1());
		

	}

}
