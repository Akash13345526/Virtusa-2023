package exercise;

public class overloadingEx1 {
	//public class overloadingEx1 {
		
		void m1() {
			System.out.println("0 arg");
		}
		
	    void m1(int x) {
	    	System.out.println("1 arg");
		}

	    void m1(int x, int y) { 
	    	System.out.println("2 arg");
	    }

	    void m1(int x, String y,String a) { 
	    	System.out.println("2 arg ************");
	    }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("WELCOME"); 
			
			overloadingEx1 Ex1 = new overloadingEx1();
			Ex1.m1();
			Ex1.m1(10);
			Ex1.m1(100, 200);
			Ex1.m1(1000, "aaa", "bb");  
		}

	}


