//: ch5_10/Test.java
/**@version 1.0
  *@author feilong
  */
public class Test{
   protected void finalize()
   {
       System.out.println("This is a fianlize()");
    }
   public static void main(String[] args)
   {
       new Test();
       //System.gc();
    }
}
