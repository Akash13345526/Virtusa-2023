package ExceptionHandling;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			int i=10/0;
			System.out.println(i);
			System.exit(0);
	
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			
		}
		finally {
			System.out.println("vvvv");
		}
	}
	

}
