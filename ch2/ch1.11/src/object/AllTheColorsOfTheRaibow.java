//: object/AllTheColorsOfTheRaibow.java
/**@author feilong
*  @version 1.0
*/
package object;
import java.util.*;

public class AllTheColorsOfTheRaibow{
	
	int anIntegerRepreSentingColors;
	
	void changeTheHueOfTheColor(int newHue)
	{
		anIntegerRepreSentingColors = newHue;
	}
	
	public static void main(String[] args)
	{
		AllTheColorsOfTheRaibow all = new
				AllTheColorsOfTheRaibow();
		all.changeTheHueOfTheColor(8);
		System.out.println(all.anIntegerRepreSentingColors);
	}
}/* output:
这个程序 抄了作者的
*///:~