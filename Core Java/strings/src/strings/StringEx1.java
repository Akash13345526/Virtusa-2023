package strings;

public class StringEx1 {
	public static void main(String[] args) {
		String s1=new String("aaaa");
		System.out.println(s1);
		String name="Akash";
		System.out .println(name);
		StringBuffer sb=new StringBuffer("Aka");
		System.out.println(sb);
		StringBuilder sbl=new StringBuilder("Akas");
		System.out.println(sbl);
		
		
		System.out.println("\n"+"\n");
		System.out.println("***********");
		
		//immutable
		String s2="bbbbb";
		s2.concat("cccc");
		System.out.println(s2);
		//mutable
		StringBuffer SB2=new StringBuffer("aaaaa");
		SB2.append("bbbbb");
		System.out.println(SB2);
		
		StringEx1 Ex1=new StringEx1();
		System.out.println(Ex1);
		System.out.println(Ex1.toString());
		
		System.out.println("\\n");
		
		
		
		
		
		
	}

}
