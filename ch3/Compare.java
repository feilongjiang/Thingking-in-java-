//: ch3/Compare.java

package ch3;
import java.util.*;
public class Compare
{
   static void compare(String str1,String str2)
    {
        boolean flag=false;
        System.out.println("str1 == str2 is");
        if(str1.equals(str2))
            System.out.println("true");
        else
            System.out.printf("%s\n","false");
        System.out.println("str1 !=str2 is ");
        if(str1.equals(str2))
           System.out.println("false");
        else
           System.out.printf("%s\n","true");
        System.out.printf("str1 = str2 is %s\n",str1=str2); //this result is str2 valued 
        System.out.printf("str1 == str2 is %s\n",str1==str2); //this result is true 这里可能方法引用后放到同一个内存堆了
        System.out.printf("str1 != str2 is %s\n",str1!=str2); //this result is false
        //System.out.printf("str1 <= str2 is ",str1<=str2); //this is error
        //System.out.printf("str1 >= str2 is ",str1>=str2); //this is error
        //System.out.printf("str1 > str2 is ",str1>str2); //this is error
        //System.out.printf("str1 < str2 is ",str1<str2); //this is error
    }
    public static void main(String[] args)
    {
        String a =new String("wo");
        String b =new String( "20");
        System.out.printf("main a == b is %s\n",a==b); //this result is true
        System.out.printf("main a != b is %s\n",a!=b); //this result is true
        compare(a,b);

    }

}
   
