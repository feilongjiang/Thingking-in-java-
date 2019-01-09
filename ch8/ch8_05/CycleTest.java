package ch8_05;
import java.lang.*;
import java.util.*;
class Cycle{
    public int ride(Cycle i) 
    {
        return i.wheel();
    }
    public int wheel()
    {
        return 0;
    }
}

class Uncicycle extends Cycle{
    public int wheel()
    {
        return 1;
    }
}
class Bicycle extends Cycle{
    public int wheel()
    {
        return 2;
    }
}
class  Tricycle extends Cycle
{
    public int wheel()
    {
        return 3;
    }
}

public class CycleTest extends Cycle{
    public  int ride(Cycle c)
    {
        return c.wheel();
    }
    public static void main(String[] args)
    {
        Cycle cy = new CycleTest();
        System.out.println(cy.ride(new Uncicycle()));
        System.out.println(cy.ride(new Bicycle()));
        System.out.println(cy.ride(new Tricycle()));
    }
}
