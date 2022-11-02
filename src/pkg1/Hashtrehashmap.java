package pkg1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashtrehashmap {
	public static void main(String[] args) {
		HashSet Hs = new HashSet();
		Hs.add("Mumbai");
		Hs.add("Pune");
		Hs.add(100);//print only single 100
		Hs.add("beed");
		Hs.add(100);
		Hs.add(100);
		System.out.println(Hs);
		
		TreeSet ts = new TreeSet();
		ts.add("Mumbai");
		ts.add("Beed");// print only single beed
		ts.add("Abad");
		ts.add("Beed");
		ts.add("Georai");
		ts.add("Beed");
		
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet();
		ts1.add("Mumbai");
		ts1.add("Pune");
		ts1.add("Abad");
		ts1.add("Beed");
		ts1.add("Georai");
		System.out.println(ts1);
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("Mumbai");
		ls.add("Pune");// print only single pune	
		ls.add("Pune");
		ls.add("Beed");
		ls.add("Pune");
		System.out.println(ls);
		
		
		
		
		
	}

}
