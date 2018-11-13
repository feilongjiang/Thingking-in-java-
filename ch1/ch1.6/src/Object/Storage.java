//: ch1.6/Storage.java
/**@version 1.6
* @author feilong
*/
package Object;
import java.util.*;

public class Storage{
	public int storage(String s){
		return s.length()*2;
	}
	public static void main(String[] args){
		Storage st = new Storage();
		String s  = "helloword";
		int l=st.storage(s);
		System.out.println(l);
	}
}
/* output:
 * storage(s);
 *///:~
