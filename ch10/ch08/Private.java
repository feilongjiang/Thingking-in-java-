package ch08;

public class Private {	
	
	//private void f(){ System.out.println("I am method " + n);}//n cannot be resolved to a variable
	public class Inner{
		private int n ;
	    public Inner(int i){ n = i;}
	}
	public void m(){Inner nr = new Inner(6); nr.n = 7;}
	public static void main(String[] args)
	{
		Private p = new Private();
		Private.Inner pi = p.new Inner(5);
		pi.n = 4;
		//! p.n = 7;
	}
}
