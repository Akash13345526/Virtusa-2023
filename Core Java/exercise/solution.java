package exercise;

import java.io.*;
import java.util.*;

public class solution {

    //public static void main(String[] args) {
        
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter a no:");
            int n=sc.nextInt(); 
           
           // String ans="";
            
            if(n%2==1||n%2==0 && n>5 && n<21){
             System.out.println( "Weird");
            }
            else{

               if(n%2==0&& n>1 && n<6||n>20){
              System.out.println( "Not Weird");
            }

            }
           // System.out.println(ans);

        }
    }
    
