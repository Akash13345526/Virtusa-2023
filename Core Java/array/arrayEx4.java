package array;
import java.util.*;

public class arrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		
		
		ListIterator<String> lstr = al.listIterator();
		
		while(lstr.hasNext()) {
			//String str = lstr.next();
			System.out.println(lstr); 
		}
		
		while(lstr.hasPrevious()) {
			//String str1 = lstr.previous();
			System.out.println(lstr); 
		}

	}

}