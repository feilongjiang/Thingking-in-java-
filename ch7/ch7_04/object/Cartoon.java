package object;

class Base1{
    public Base1(){
        System.out.println("I am base1");
    }
}
class Derived extends Base1{
    public Derived(){
        System.out.println("I am Derived");
    }
}
class Derived1 extends Derived{
    public Derived1(){
        System.out.println("I am Derived1");
    }
}

public class Cartoon{
    public static void main(String[] args)
    {
        new Derived1();
    }
}


