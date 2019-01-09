package ch06.bag3;
import ch06.*;
import ch06.bag2.Protected;
public class Realize extends Protected{
	Protected p = new Protected();
    public Protected1 getp() { return (p.new Protected1();}
    public static void main(String[] args)
    {
        Realize pl = new Realize();
        Protected.Protected1 pp  = pl.new Protected1();
        pp.f1();
    }
}
