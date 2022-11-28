package strings;

public class StringEx3 {
	public static void main(String[] args) {
		String S1="Akash";
		StringBuffer str=new StringBuffer(S1);
		
		System.out.println(str.reverse());
		
		
		StringBuffer st1=new StringBuffer("Akakaaash");
		String s2=st1.toString();
		System.out.println(s2+st1);
		String s3=s2+st1;
		System.out.println(s3.length());
		
		
		
		int a[]=new int[100];
		System.out.println(a.length);
		
		String s4="akaaash";
		System.out.println(s4.length());
		
		
	}

}
