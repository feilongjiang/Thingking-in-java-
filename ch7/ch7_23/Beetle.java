//: reusing/Beetle.java
// the full process of initialization
package ch7_23;


class Insect{
	private int i =9;
	protected int j ;
	Insect()
	{
		System.out.print("i = " + i + ",j = " + j);
		j =39;
	}
	private static int x1=
			printInit("Static Insect.x1 initialized");
	static int printInit(String s)
	{
		System.out.print(s);
		return 47;
	}
}
public class Beetle extends Insect
{
	//private int k = printInit("beetle.k initialized");
	int k =8;
	public Beetle()
	{
		System.out.print("k =" + k);
		System.out.print("j = " +j);
	}
	private static int x2 =
			printInit("static Beetle.x2 initialized");
	public static void main(String[] args)
	{
		System.out.print("beetle constructor");
		//Insect.printInit("test");
		//Beetle b = new Beetle();
		//new Insect();
		
	}
}/* output:
Static Insect.x1 initialized
beetle constructor
*/
