//: ch5_19/Variable.java
package ch5_19;
class Test
{
    void f(String... args)
    {
        for ( String s : args)
        {
            System.out.print(s + " ");
        }
    }
}
public class Variable
{
    public static void main(String args[])
    {
       Test test = new Test();
       test.f("I");
       test.f("am","jiang");
       test.f("fei","feilong","\n");
    }
    }
