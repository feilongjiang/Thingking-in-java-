package ch03;

abstract class Base{
    Base()
    {
        print();
    }
    abstract void print();
}

public class Abstract extends Base{
    int i = 3;
    void print()
    {
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        Abstract ab = new Abstract();
        ab.print();
    }
}
