package ch8_10;
class Base{
     public void f1()
    {
        f2();
    }
    public void f2()
    {
        System.out.println("I am base");
    }
}
class Derive extends Base{
    @Override public void f2()
    {
        System.out.println("I am Derive");
    }
    
}
public class Polymorphism{
    public static void main(String[] args)
    {
         Base d = new Derive();
        d.f1();
    }

}
