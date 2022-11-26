package exercise;

public class Methodex2 {
	
	int a=11;
	static String name="bhuvan";
	
	void add() {
		int a=10;
		int b=20;
		int c=this.a+b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(this.a);
	}
	static void name() {
		//Methodex2 ex12=new Methodex2();
		System.out.println(Methodex2.name);
	}
	
	public static void main(String[] args) {
		System.out.println("welcome");
		new Methodex2().add();
	}

}
