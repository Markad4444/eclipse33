package pkg1;

public class Inheritance1 extends Inheritance {

	public Inheritance1(int a, int b) {
		super(20, 20);
		
		
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		Inheritance1 k = new Inheritance1(5,4);
	
		k.mul();
		k.addition();
		k.sub();

	}
	public void mul()
	{
		 int e = a*b;
		 System.out.println(e);
	}

}
