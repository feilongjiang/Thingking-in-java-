package ch15;

abstract class Abstract{
    void f8(){System.out.println("fsdf");}
    }
interface Interface1{
    void f11();
    void f12();
}
interface Interface2{
    void f21();
    void f22();
}
interface Interface3{
    void f31();
    void f32();
}
interface Interface extends Interface1, Interface2, Interface3{
    void f();
}
class Base extends Abstract{
    void s(){System.out.println("I am base");}
}
public class Monster extends Base implements Interface{
    public void f11(){System.out.println("I am f11\"");}
    public void f12(){System.out.println("I am f12\"");}
    public void f21(){System.out.println("I am f21\"");}
    public void f22(){System.out.println("I am f22\"");}
    public void f31(){System.out.println("I am f31\"");}
    public void f32(){System.out.println("I am f32\"");}
    public void f(){System.out.println("I am interface\"");}
    public void method1(Interface1 i){i.f11();}
    public void method2(Interface2 i){i.f21();}
    public void method3(Interface3 i){i.f31();}
    public void method4(Interface i){i.f();}
    public void method5(Abstract i){i.f8();}
    public static void main(String[] args)
    {
        Monster m = new Monster();
        Monster ms = new Monster();
        ms.method1(m);
        ms.method2(m);
        ms.method3(m);
        ms.method4(m);
        ms.method5(m);
    }
}

















