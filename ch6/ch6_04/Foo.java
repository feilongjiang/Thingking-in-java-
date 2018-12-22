package Thingking_in_java.ch6.ch6_04;

import Thingking_in_java.ch6.ch6_03.debug.*;

public class Foo extends Debug{
    Foo()
    {
        new Debug("allow");
        System.out.println("FOO constructor");
    }
    public void chomp()
    {
       f();
    }
    public static void main(String args[])
    {
        Foo foo = new Foo();
        new Debug(); //protect no allow use
        // new Debug(1);  //cannot do that
        new Debug("hello");
        Debug.fstatic();
        fstatic();
        foo.chomp();
    }
}
