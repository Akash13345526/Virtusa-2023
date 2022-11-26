package exercise;

public class ConstructorEx3 {
	{
		System.out.println("instance block");
		
	}
	static {
		System.out.println("static block");
	}
	String construct(String name) {
	   
	   return name;
	  
	}

	ConstructorEx3(){
		this(10,20);
		int i=10;
		System.out.println(i);
		
		
	}
	ConstructorEx3(int x, int y){
		x=10;
		y=29;
		System.out.println(x+y);
		
	}
	public static void main(String[] args) {
		new ConstructorEx3();
		ConstructorEx3 obj=new ConstructorEx3();
		
		System.out.println(obj.construct("bhuvbe"));
		
	}
}
