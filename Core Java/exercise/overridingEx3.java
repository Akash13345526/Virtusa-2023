package exercise;

class parent2{
	
	float m2() {
		System.out.println("Parent");
		return 100;
	}
	
}

public class overridingEx3 extends parent2{
	
	float m2() {
		super.m2();
		System.out.println("Child");  
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overridingEx3 obj1=new overridingEx3();
		System.out.println(obj1.m2());

	}

}
