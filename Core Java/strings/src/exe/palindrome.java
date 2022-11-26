package placement;

public class palindrome {
	public static void main(String [] args) {
		String original="malayalam";
		String reverse="";
		
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		if(reverse.equals(original)) {
			System.out.println("palindrome");
			
			
		}
		else
			System.out.println("not palindrome");
		
		
		
	}

}
