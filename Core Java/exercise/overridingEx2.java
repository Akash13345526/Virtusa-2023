package exercise;


class parent1{
	void m1() {
		System.out.println("Parent");
	}
	
}

public class overridingEx2 extends parent1{
	
	void m1() {
		super.m1();
		System.out.println("Child");  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new overridingEx2().m1();

	}

}
