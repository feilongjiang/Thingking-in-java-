//: ch1.8/ShowStatic.java
/**@author feilong
*  @version 1.8
*/
package object;
import java.util.*;
public class ShowStatic{
	static int i = 7;
	
	public static void main(String[] args){
		ShowStatic ss = new ShowStatic();
		ss.i=9;
		ShowStatic sy = new ShowStatic();
		ShowStatic sz = new ShowStatic();
		System.out.println("ss.i = "+ss.i);
		System.out.println("sy.i = "+sy.i);
		System.out.println("sz.i = "+sz.i);
	}
}/* output:
ss.i = 9
sy.i = 9
sz.i = 9
*///:~