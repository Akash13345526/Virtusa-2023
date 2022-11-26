package exercise;

import java.util.Scanner;

public class program { 
	int i;
	static int k;

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("welcome");
		System.out.println(a+b);
		
		program pgrm1=new program();
		System.out.println(pgrm1.i);
		System.out.println("static variable" +k);
		
		System.out.println("static variable" +pgrm1.k);
		System.out.println("static variable" +program.k);
		//System.out.println(pgrm1.i);
		//Scanner pgrm1 =new Scanner(system.in);
		//int i =pgrm1.nextInt();
		

	}

}
