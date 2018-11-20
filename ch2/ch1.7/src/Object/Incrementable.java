//: ch1.7/Incrementable.java
/**@author feilong
*  @version 1.7
*/
package Object;
import java.util.*;

class StaticTest{
	static int i = 47;
}


public class Incrementable{
	
	
	static void increment()
	{
		StaticTest.i++;
	}
	public static void main(String[] args){
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println(StaticTest.i);
	}
}/* Output:
StaticTest.i
*///:~