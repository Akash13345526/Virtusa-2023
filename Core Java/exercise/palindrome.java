package exercise;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String original=sc.nextLine();
		String reverse="";
		int length=original.length();
		for(int i= length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);}
			
			if(original.equals(reverse)) 
				System.out.println(original+"is palindrome");
				
			
			else 
				System.out.println("not a palindrome");
			
			
		}
		
	}

