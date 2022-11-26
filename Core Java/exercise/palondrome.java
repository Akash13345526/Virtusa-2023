package exercise;
import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class palondrome {
	public static void main(String [] args) {
		String original,reverse="";
		Scanner scan =new Scanner (System.in);
     	System.out.println("enter a String to reverse:");
     	original =scan.nextLine();
     	System.out.println("string befor palindrome:"+original);
     	int length=original.length();
     	for(int i=length-1;i>=0;i--)
     		reverse=reverse+original.charAt(i);
     	if (original.equals(reverse)) {
     		System.out.println("after palindrome:"+reverse);
     		
     	}
     	else {
     		System.out.println("after palindrome:"+reverse);
     	}
     		
     	

	}

}
