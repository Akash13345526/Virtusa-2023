package exercise;

public class MethodsEx1 {
	int add(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
       public static void main(String[] args) {
    	   /*MethodsEx1 Ex1=new MethodsEx1();
    	   int sum =Ex1.add(10,20);
    	   System.out.println(sum);*/
    	   
    	   
    	  int sum=new MethodsEx1().add(10,20);
    	   
    	   System.out.println(sum);
    	   
    	   
	
	
}
}
