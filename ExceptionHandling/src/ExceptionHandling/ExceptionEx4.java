package ExceptionHandling;
import java.lang.*;

public class ExceptionEx4 {
	public static void main(String [] args) {
		try {
			int i=10/0;
			System.out.println(i);
			
		}
		catch(ArithmeticException ae){
			System.out.println(ae+"catch");
			
			
		}
		
	}

}
