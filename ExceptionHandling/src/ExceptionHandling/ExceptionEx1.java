package ExceptionHandling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String Str="null";
		try {
			System.out.println(Str.length());
			
		}
		catch(NullPointerException a){
			System.out.println(a);
			
			
		}
		finally{
			System.out.println("print finally");
		}
		System.out.println("rest of the code");
		
		
		
		

	}

}
