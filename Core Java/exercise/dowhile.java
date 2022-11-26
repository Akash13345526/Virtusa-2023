package exercise;
import java.util.*;

public class dowhile {

  public static void main(String [] args) {
	Scanner in =new Scanner(System.in);
	System.out.print("how much money contribute");
	double payment=in.nextDouble();
	
	System.out.print("interest rate");
	double interestrate = in.nextDouble();
	
	double balance=0;
	int year=0;
	
	String input;
	
	do {
		balance+=payment;
		double interest=balance*interestrate/100;
		balance+=interest;
	 
		year++;
		
		System.out.print(year+"  "+   balance);
		
		System.out.println("ready to retire(y/n)?");
		 input=in.next();
		
	}
	   while(input.equals("n"));
	        //System.out.println("end");
 
  }
  
		

}
