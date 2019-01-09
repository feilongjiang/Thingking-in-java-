package ch7_09;

class Component1{
    public Component1()
    {
        System.out.println("I am component1");
    }
}

class Component2{
    public Component2()
    {
        System.out.println("I am component2");
    }
}

class Component3{
    public Component3()
    {
        System.out.println("I am component3");
    }
}
class Root{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}
public class Stem extends Root{
    public static void main(String[] args)
    {
        new Root();
    }
}
