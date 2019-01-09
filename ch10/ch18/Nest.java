package ch18;

interface Interface{
    void f1();
}

public class Nest{
    public static class Nest1 implements Interface{
        String s ;
        public Nest1(String s)
        {
            this.s = s;
        }
        public void f1()
        {
            System.out.println(s);
        }
    }
    public static Interface ne = new Nest1("fdss");
    public static Interface getNest1(String s)
    {
        return new Nest1(s);
    }
    public static void main(String[] args)
    {
        ne.f1();
        getNest1("fsfefds").f1();
    }
}

