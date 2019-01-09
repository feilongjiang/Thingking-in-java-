package ch11;

interface Interface{}

public class Test{
    private class Test2 implements Interface{
        public void f1(){}
    }
    public Interface gettest2()
    {
        return new Test2();
    }
    public Test2 gettest22()
    {
        return new Test2();
    }
    public static void main(String[] args)
    {
        Interface i = new Test().gettest2();
        i = new Test().gettest22();
        //! Test2 = new Test().gettest22();
    }
}

