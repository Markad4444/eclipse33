package pkg1;

final public class Immutable {
	private int i;
	Immutable(int i)
	{
		this.i=i;
	}
	public Immutable modify(int i)
	{ if (this.i==i)
	  { return this;
	                  }
	else
	{ return new Immutable(i);
	}
}
	public static void main(String[] args) {
		Immutable t1 = new Immutable(10);
		Immutable t2 = t1.modify(100);
		Immutable t3 = t1.modify(10);
System.out.println(t1==t2);
System.out.println(t1==t3);
		
	}
		
	}
