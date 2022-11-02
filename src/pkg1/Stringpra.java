package pkg1;

public class Stringpra {
public static void main(String[] args) {
	String a = new String("Durga");
	//a.concat("Software");
	a=a +"Software";// or a.concat("software")
	System.out.println(a);/// String is immutable cant change o/p durga
	String c="Durga";
	String d="Durga";
	System.out.println("========");
	System.out.println(a.concat(" Software"));
	System.out.println("===========");
	String b = "Durga";
	b.concat("classes");
	System.out.println(b);/// String is immutable cant change o/p Durga
	System.out.println("============");
	System.out.println(b.concat(" Classes"));
	System.out.println("============");
	System.out.println(a==b);
	System.out.println(a.equals(b));
	System.out.println("=======");
	System.out.println(a==c);
	System.out.println(a.equals(c));
	System.out.println(c==d);
System.out.println("=====================");
	StringBuffer sb = new StringBuffer("durga");
	sb.append(" Classes");
	System.out.println(sb);
	StringBuffer sc = new StringBuffer("durga");
	System.out.println("**********");
	System.out.println(sb==sc);/// very imp false
	System.out.println(sb.equals(sc));/// very  o/p False
	System.out.println("***********");
}
}
