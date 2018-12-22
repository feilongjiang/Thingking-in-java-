package Thingking_in_java.ch6.ch6_06;

import static net.feilong.util.Print.*;

public class Access{
    private int c;
    public static void main(String[] args)
    {
        Visitor visitor = new Visitor();
        // visitor.f(); this function cannot use
        visitor.f2();
        visitor.f3();
        //visitor.b=5; this variable cannot use
        Access access = new Access();
        access.c = 3;
        println(""+access.c);
        visitor.d = 5;
        println(""+visitor.d);
    }
}
class Visitor{
    private int b;
    protected int d;
    private void f()
    {
        println("I am private.");
    }
    protected void f2()
    {
        println("I am protected.");
    }
    public void f3()
    {
        println("I am public.");
    }
}
