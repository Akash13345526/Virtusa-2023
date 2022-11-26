package thread;

class threadDemo extends Thread{  // User Defined Thread

public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("User Defined Thread");  
	}
	}
}


public class threadEx1{  // Main Thread
	
	public static void main(String[] args) { // main thread
		// TODO Auto-generated method stub	
		
		threadDemo td = new threadDemo();
		//td.start(); // Thread class start method will be executed
        td.run();
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			}catch(interruptedexception e) {
				
			}
			
				
			
			
		
		
	




