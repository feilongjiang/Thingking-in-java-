package ch12;

class Inner{
    int n;
    public void f1(int i)
    {
        n = i;
        System.out.println("nnn = " + n);
    }
}
public class Private {
	private int n ;
	private void f(){ System.out.println("I am method " + n);}
  public Inner inner()
  {
      return new Inner(){
      };
  }
  public void h()
  {
      new Object(){
          void g()
          {
              f();
          }
      }.g();
  }

	public static void main(String[] args)
	{
		Private p = new Private();
    p.inner().f1(3);
    p.h();
	}
}
