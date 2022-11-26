package exercise;

class parentconst1{  // object
	parentconst1(int a){
		 super();
		System.out.println("parent class O-arg constructor----------"+a);
	}
}

class parentcons extends parentconst1{
	parentcons(){
		super(100);
		System.out.println("parent class O-arg constructor");
	}
}

public class inheritanceEx2 extends parentcons{
	
	inheritanceEx2(){
		this(10,20); 
		System.out.println("child class O-arg constructor");
		
	}
	inheritanceEx2(int i, int j){
        int c = i+j;
		System.out.println("child class 2-arg constructor"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	new inheritanceEx2();
	//new inheritanceEx7(10,20);
		
	}

}