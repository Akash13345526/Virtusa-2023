package exercise;

public class constructorEx6 {
	int construct(int a,int b) {
		int c=a+b;
		return c;
		
	}
	static void  construct() {
		System.out.println("Static method");
		
	}
	constructorEx6(){
		//new.constructorEx6.construct(10,20);
		//this (10,20);
		construct();
		System.out.println(construct(10,20));
	
		
		
	}
	public static void main(String [] args) {
		constructorEx6 Ex6=new constructorEx6();
		int result =Ex6.construct(10,20);
		System.out.print(result);
	}

}
