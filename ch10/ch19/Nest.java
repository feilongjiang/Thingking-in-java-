package ch19;

interface Interface{
    void f1();
}

class Nest2{
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
        public static class Nest3{
            public void showname()
            {
                System.out.println("Iam 3");
            }
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
public class Nest{
     public static void main(String[] args)
     {
         Nest2.Nest1 nn = new Nest2.Nest1("I am new");
         nn.f1();
         Nest2.Nest1.Nest3  nnn = new Nest2.Nest1.Nest3();
         nnn.showname();
     }
}


