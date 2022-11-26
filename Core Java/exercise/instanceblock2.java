package exercise;

public class instanceblock2 {
	{
		System.out.println("12334");
	}
	instanceblock2(){
		System.out.println("o arg");
		}
     instanceblock2(int a){
    	 System.out.println("one arg"+a);
    	
    	 
     }
     instanceblock2(int a,int b){
    	 System.out.println("two arg con"+a+"    "+b);
    	 
    	 
     }
     public static void main(String[] args) {
    	 new instanceblock2();
    	 new instanceblock2(10);
    	 new instanceblock2(10,10);
     }
}
