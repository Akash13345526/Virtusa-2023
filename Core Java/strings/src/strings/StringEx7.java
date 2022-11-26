package strings;

public class StringEx7 {
	public static void main(String[] args) {
		String s1="  bhuvanesh";
		System.out.println(s1);
         System.out.println(s1.length());
         
         StringBuffer sb1=new StringBuffer(s1);
         System.out.println(sb1);
         
         System.out.println(sb1.length());
         char ch[]={'a','b'};
         System.out.println(ch);
         
         String s2=ch.toString();
         System.out.println(s2);
         
         System.out.println(s1.toUpperCase());
         System.out.println(s1.toLowerCase());
         
         for(char ch1:ch) {
        	 System.out.println("ch------>"+ch1);
        	 //++ch1;
         }
         String S3="AA";
         String S4="CC";
         System.out.println(S3.compareTo(S4));
         
         String s5="sachin";
         String s6="  tendulkar";
         String s7=s5+s6;
         System.out.println(s7);
         System.out.println(s7.trim());
         String s8=s7.replace("tendulkar","bhuva");
       //  System.out.println(s7.replace("tendulkar", "bhuva");
         System.out.println(s8);
         StringBuffer sb2=new StringBuffer(s8);
         sb2.reverse();
         System.out.println(sb2);
         System.out.println(sb2.delete(1,3));
         
         
         
         
         
         
	}

}
