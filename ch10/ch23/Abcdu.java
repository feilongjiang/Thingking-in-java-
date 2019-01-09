package ch23;
interface U{
	void uf1();
	void uf2();
	void uf3();
}
class A{
	public U getU()
	{
		return new U(){
			public void uf1(){System.out.println("fdsaf");}
			public void uf2(){System.out.println("fds][[]af");}
			public void uf3(){System.out.println("234");}
		};
	}
}
class B{
	protected int n;
	U[] u;
	public B(int i){ n = i; u = new U[i];}
	public boolean add(U x)
	{
		for(int i = 0; i < u.length; i++)
		{
			if(u[i] == null)
				{
				u[i] = x;
			return true;
				}
		}
		return false;
	}
	public boolean setnull(int i)
	{
		if(i >= 0 && i < u.length)
			{
			u[i] = null;
			return true;
			}
		return false;
	}
	public void callu()
	{
		for(int i = 0; i < u.length; i++)
		{
			if(u[i] != null)
			{
				u[i].uf1();
			u[i].uf2();
			u[i].uf3();
			}
		}
	}
}
public class Abcdu {
	public static void main(String[] args)
	{
		A[] a = { new A(),
				new A(),
				new A(),
		};
		B b = new B(a.length);
		for(int i = 0; i < a.length; i++)
			b.add(a[i].getU());
		b.callu();
		b.setnull(0);
		b.callu();
	
	}
}
