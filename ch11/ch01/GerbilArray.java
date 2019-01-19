package ch01;
import java.util.*;
class Gerbill{
    private int gerbillNumber =0;
    public Gerbill(int i)
    {
        gerbillNumber = i;
    }
    public void hop()
    {
        System.out.print(gerbillNumber + " ");
        if(gerbillNumber%2 == 0)
            System.out.println("act");
        else
            System.out.println("silence");
    }
}

public class GerbilArray{
    public static void main(String[] args)
    {
        ArrayList<Gerbill> gerbill = new ArrayList<Gerbill>();
        for(int i = 0; i < 10; i++)
            gerbill.add(new Gerbill(i));
        for( int i =0; i < 10; i++)
    {
        gerbill.get(i).hop();
    }
    }
}
