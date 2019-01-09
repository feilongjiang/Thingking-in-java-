package ch26;

class Outer{
    public class Inner{
        String s ;
        public Inner(String s)
        {
            this.s = s;
        }
        public String toString()
        {
            return "this is Inner" + s;
        }
    }
}

public class Inherit extends Outer.Inner{
    public Inherit(Outer ou)
    {
        ou.super("dsf");
    }
    public static void main(String[] args)
    {
        Outer.Inner in = new Inherit(new Outer());
        System.out.println(in);
    }
}
