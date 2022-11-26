package exercise;

public class instanceblock {
	int x;
	//int y=10;
	{
	  x=10;	
		System.out.println(x);
	}
	static {
		int x=100;
		
		System.out.println("welcome"+x);
	}
	int  display(int y) {
		System.out.println(x);
		return y;
		
		
	}
	public static void main(String[] args) {
		
		instanceblock obj=new instanceblock();
		int result =obj.display(100);
		int x=obj.display(10000);
		System.out.println(result);
		
		
		
		
		
	}
	

}
