package exercise;

import java.util.Scanner;

public class overriding {
	
	
	public static void main(String [] args) {
	int n1=0,n2=1,i,n3;
	
	Scanner value=new Scanner(System.in);
	System.out.println("find fibnocci series to: ");
	int no=value.nextInt();
	System.out.print(n1+"  "+n2+"  ");
	
	for(i=1;i<no;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3+"  ");
		
		
		
		
	}
	
	
	
	}

}
