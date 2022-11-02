package pkg1;

public class Stringpro2 {
	public static void main(String[] args) {
		String s = "ababab";
		System.out.println(s.replace('a','b'));/// bbbbbb
		String s1 ="abcdefg";
		System.out.println(s1.substring(3));/// defg
		System.out.println(s1.substring(3,6));//// def.... last index-1
		String s2= "vitthal";
		System.out.println(s2.indexOf('h'));
		System.out.println(s2.indexOf('t'));/// index of first occurance
		System.out.println(s2.indexOf('z')); // if specified char not avai we get-1 ans;
		System.out.println(s2.lastIndexOf('t'));// repeted last index get printed
		System.out.println(s2.toUpperCase());//// VITTHAL
	}

}