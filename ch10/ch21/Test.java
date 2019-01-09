package ch21;

interface Interface{
    public void getname();
    public class Inner{
        public static void f(Interface I)
        {
            System.out.println("Interface");
            I.getname();
        }
    }
}

public class Test{
    public static void main(String[] args)
    {
        Interface in = new Interface(){
            public void getname(){}
        };
        Interface.Inner.f(in);
    }
}
