package ch20;

interface Interface{
    public class Inner{
      public static void f()
        {
            System.out.println("dsff");
        }
    }
}

public class Test implements Interface{
    public static void main(String[] args)
    {
        Inner.f();
    }
}
