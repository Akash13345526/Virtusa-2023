package exercise;

public class ConstructorEx {
    String name;
	ConstructorEx(String names){
		   name=names;
          System.out.println(names+"is a human");
          
	}
	{
		System.out.println(name);
	}
public static void main(String[] args) {
	 ConstructorEx Ex= new ConstructorEx("bhuvane");
}
}
