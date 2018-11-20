//: ch1.5/Dataonly.java
/**study
 * @author feilong
 */
package Object;
import java.util.*;

public class Dataonly{
	    int x;
		double d;
		boolean b;

	public static void main(String[] args){
		Dataonly data = new Dataonly();
		data.x=47;
		data.d=1.1;
		data.b=false;
		System.out.println("data.x="+data.x);
		System.out.println("data.d="+data.d);
		System.out.println("data.b="+data.b);
	}
}/* output
data.x = 47
data.d = 1.1
data.b = false
*///:~
