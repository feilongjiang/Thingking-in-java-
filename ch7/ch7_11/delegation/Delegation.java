package ch7_11.delegation;

import ch7_11.*;
public class Delegation{
    private Base base = new Base();
    public void f1()
    {
        base.connector();
    }
    public void f2()
    {
        base.port();
    }
    public void f3()
    {
        base.hicky();
    }
    public static void main(String[] args)
    {
        Delegation de = new Delegation();
        de.f1();
        de.f2();
        de.f3();
    }
}
