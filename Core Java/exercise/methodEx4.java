package exercise;

public class methodEx4 {
     static int multiply(int number) {
    	
    	 return number * number;
    	 
     }
     void divide(int a,int b) {
    	 int c=a%b;
    	 System.out.println(c);
    		 
     }
     public static void main(String[] args) {
    	 int result=new methodEx4().multiply(10);
    	 System.out.println(result);
    	 
    	 new methodEx4().divide(10, 20);
    	 
     }

}
