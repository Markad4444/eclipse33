package pkg1;

public class Stringpro1 {
	public static void main(String[] args) {
		char [] ch = {'J','A','V','A'};
		String s = new String(ch);
		System.out.println(s);
		byte b [] = {97,98,99,100};/// convert into respected charactor i e abcd
		String s1 = new String(b);
		System.out.println(s1);
		String c ="Vitthal";
		System.out.println(c.equals("Vitthal"));
		System.out.println("=====");
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(6));
		try {
		System.out.println(c.charAt(10));
		}
		catch (Exception e)//java.lang.StringIndexOutOfBoundsException:
		{ System.out.println(e);
			System.out.println(" plz salect array within length");
		}
		}
	}


