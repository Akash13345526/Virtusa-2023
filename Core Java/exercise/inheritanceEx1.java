package exercise;
import java.lang.*;



class parent{
	{
		System.out.println("parent class instance block");
	}
	static {
		System.out.println("parent class static block");
		
	}
	static void display() {
		System.out.println("parent static method");
		
		
	}
	int display1(int a,int b) {
		display();
		int c=a+b;
		return c;}
	
	parent(){
		System.out.println("constructor");
		
	}
			
		
		
		
	

}

public class inheritanceEx1 extends parent {
	
	public static void main(String [] args) {
		System.out.println("child class");
		inheritanceEx1 Ex1=new inheritanceEx1();
		//Ex1.display1(10,10);
			
		int result=Ex1.display1(10,10);
		System.out.println("return c"+result);
		
		
		}
		
	}
	


