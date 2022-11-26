package exercise;

public class staticblock {
	int x=10;
	static int y=20;
	static {
		int c=y+y;
		System.out.println("static block");
		staticblock obj=new staticblock();
		System.out.println("instance variable"+obj.x);
		System.out.println("static  variable"+y);
		System.out.println("local variable"+c);
		obj.instance();
		Staticmethod();
		int result=obj.Staticmethod();
		System.out.println("return  "  +result);
		
		
		
	}
	{
		System.out.println("instance block");
		
	}
	staticblock(){
		int a=1;
		int b=10;
		int c=a+b;
		System.out.println( c);
		
	}
	void instance() {
		System.out.println("instance method");
	}
	static int Staticmethod() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
		
		
	}
	public static void main(String [] args) {
		//staticblock ex=new staticblock();
		
		
		
		
		
		
	}

}
