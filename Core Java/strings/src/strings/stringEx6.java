package strings;

public class stringEx6 {
	public static void main(String [] args) {
		String Ex6=new String("Aka");
		String Ex61=new String("Akash");
		String name="AKASH";
		String name2="    Akash R     ";
		System.out.println(Ex6==name);
		System.out.println(Ex6.equals(name));
		System.out.println(Ex6.equalsIgnoreCase(name));
		String s1="A";
		String s2="B";
		System.out.println(s1.compareTo(s2));
		
		String s3="sachin";
		System.out.println(s3.substring(0,4
				));   //sach
		
		
		System.out.println(name2.trim());
		System.out.println(name2.replace("R", "kumar"));
		//name2.delete(1,3);
		StringBuffer sb=new StringBuffer("Akash");
		//System.out.println(sb.delete(1, 3));
		//System.out.print(sb.length());
		
		System.out.println(sb.length());
		

		





		
	}

}
