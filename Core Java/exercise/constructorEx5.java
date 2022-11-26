package exercise;

public class constructorEx5 {
	
	int y = 20;
	static int z = 30;
	
	public constructorEx5() {
		int x = 10;
		System.out.println("Local Variable = "+x); 
		System.out.println("Instance Variable = "+y);
		System.out.println("Static Variable = "+z);
		add();
		multiply();
	}
	
	void add() {
		System.out.println("Instance Method");  
	}
	
	static void multiply() {
		System.out.println("Static Method");  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new constructorEx5();

	}

}
