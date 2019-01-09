package ch07;

public class Private {
	private int n ;
	private void f(){ System.out.println("I am method " + n);}
	public class Inner{
		public void f1(int i) 
		{
		    n = i;
			f();
		}
	}
	public static void main(String[] args)
	{
		Private p = new Private();
		Private.Inner pi = p.new Inner();
		pi.f1(5);
	}
}
