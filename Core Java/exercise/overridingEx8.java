package exercise;


class parent8{
	 void m1() {
		System.out.println("m1");
	}
	 
}
public class overridingEx8 extends parent8 {
	
	void m1() {
		System.out.println("child m1");
		
	}
	public static void main(String [] args) {
		new parent8().m1();
		
		new overridingEx8().m1();
		parent8 p81=new overridingEx8();
		p81.m1();
		
	}
	

}
