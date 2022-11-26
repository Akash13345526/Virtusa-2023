package exercise;

public class methosEx3 {
	static String name;
	int no;
	static void getMax() {
		int a=10;
		int b=20;
		if(a>b) {
			System.out.println(a+   " is greater   .");
			
		}else {
			System.out.println(b+"is greater");
		}
		
	}
	public static void main(String[] args) {
		System.out.println(name);
		
		System.out.println("welcome");
		new methosEx3().getMax();
		new methosEx3();
		methosEx3 Ex3=new methosEx3();
		System.out.println("instance variable is"+Ex3.no);
		//System.out.println(name);
		
	}

}
