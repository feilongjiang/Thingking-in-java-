package ch7_10;

class Component1{
    public Component1()
    {
        System.out.println("I am component1");
    }

    public Component1(int i)
    {
        System.out.println("I am component1" + i);
    }
}

class Component2{
    public Component2()
    {
        System.out.println("I am component2");
    }

    public Component2(int i)
    {
        System.out.println("I am component1" + i);
    }
}

class Component3{
    public Component3()
    {
        System.out.println("I am component3");
    }

    public Component3(int i)
    {
        System.out.println("I am component1" + i);
    }
}
class Root{
    public Root(){

    }
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);
    public Root(int i)
    {
        System.out.println("I am Root " + i);
    }
}
public class Stem extends Root{
    public static void main(String[] args)
    {
        Root root =new Root(4);
    }
}
