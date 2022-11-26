package placement;
import java.lang.*;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		//1*2*3*....
		//int number=10;
		Scanner num=new Scanner(System.in);
		System.out.print("factorial of :");
		int number=num.nextInt();
		
		int i=1;
		int factorial=1;
		while(i<=number) {
			factorial=factorial*i;
			i++;
			
			
		}
		System.out.println("factorial of"+number +   "   is  "+factorial);
	}

}
