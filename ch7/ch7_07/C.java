package ch7_07;

class A{
    public A(String s){
        System.out.println("I am A, equals " + s);
    }
}
class B{
    public B(String s){
        System.out.println("I am B, equals " + s);
    }
}
public class C extends A{
    public C(String s)
    {
        super("I am C base");
    B b = new B(s);
    }
    public static void main(String[] args)
    {
        new C("come frmo c");
    }
}





