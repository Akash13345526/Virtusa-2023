package strings;

public class StringEx2 {
	
	public static void main(String[] args) {
		
		String S1="bhuvan";
		System.out.println(S1.toString());
		System.out.println(S1);
		
		StringBuffer S2=new StringBuffer("bhuvanes");
		System.out.println(S2);
		System.out.println(S2.toString());
		
		objecct obj=new objecct();
		System.out.println(obj);
		
		
		
		
		
		
	}
	

}
class objecct{
	public String toString() {
		return "class-name@hashcode";
		
	}
}
