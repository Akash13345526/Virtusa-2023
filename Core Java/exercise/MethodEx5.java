package exercise;

public class MethodEx5 {
	int a=10;
	void add() {
		int a=12;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	public static void main(String [] args) {
		new MethodEx5().add();
		new MethodEx5().add();
		new MethodEx5().add();
		new MethodEx5().add();
		new MethodEx5().add();
		new MethodEx5().add();
	}

}
