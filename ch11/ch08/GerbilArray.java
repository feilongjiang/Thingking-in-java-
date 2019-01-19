package ch08;
import java.util.*;
class Gerbill{
    protected int gerbillNumber =0;
    public Gerbill(int i)
    {
        gerbillNumber = i;
    }
}

public class GerbilArray{
    public void hop(Iterator<Gerbill> it)
    {
        while(it.hasNext())
        {
            Gerbill g = it.next();
            System.out.print(g.gerbillNumber + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ArrayList<Gerbill> gerbill = new ArrayList<Gerbill>();
        for(int i = 0; i < 10; i++)
            gerbill.add(new Gerbill(i));
         GerbilArray ga = new GerbilArray();
         ga.hop(gerbill.iterator());
    }
}
