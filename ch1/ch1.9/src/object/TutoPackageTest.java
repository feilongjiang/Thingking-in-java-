//: object/TutoPackageTest.java
/**@author  feilong
 * @version 1.0
 */
package object;

public class TutoPackageTest {
	public static void main(String[] args){
		byte by = 1;
		Byte bw = by;
		//.getClass().getName(); return ���� class variable type
		System.out.println(bw.getClass().getName());
		Short sh = 3;
		short su = sh;
		//.getClass return object's class name
		System.out.println(getType(su));
		Character ch = 'a';
		char cy = ch;
	}
	// ���������� turn Object
	public static String getType(Object ob){
		return ob.getClass().getName();//.getName ���� return one String type
	}
}
/* Output:
����type
*///~		