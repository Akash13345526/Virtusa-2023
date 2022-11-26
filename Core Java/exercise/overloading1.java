package exercise;

public class overloading1 {
	int add(int a,int b) {
		int c= a+b;
		return c;
	}
	double add(double a,double b){
		return a+b;
		
	}
	
		
	
	public static void main(String[]args) {
		overloading1 ans=new overloading1();
		//ans.add(10,20);
		int result=ans.add(10,20);
		System.out.println("as ic"+result);
		System.out.println(ans.add(12.8, 19.0));
		
		
		
	}

}
