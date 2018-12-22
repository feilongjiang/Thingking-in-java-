package Thingking_in_java.ch6.ch6_03.debug;

import static net.feilong.util.Print.*;

public class Debug{
    public  Debug()
    {
        print("you is success\n");
    }
    protected Debug(int n)
    {
        System.out.println("this is protected Debug n");
    }
    public Debug(String s)
    {
        System.out.println("this is a public Debug s");
    }
    protected void f()
    {
        print("this is a protected void f()\n");
    }
    protected static void fstatic()
    {
        print("this is protected static void fstatic ()\n");
    }
    public static void main(String[] args)
    {
        
    }
}
