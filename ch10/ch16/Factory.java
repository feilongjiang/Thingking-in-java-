package ch16;

interface Cycle{
    void name();
}
interface CycleFactory {
    public Cycle getCycle();
}
class Unicycle implements Cycle{
    public void name()
    {
        System.out.println("Unicycle");
    }
    public static CycleFactory cf = new CycleFactory(){
        public Cycle getCycle() 
        {
            return new Unicycle();
        }
    };
}
class Bicycle implements Cycle{
    public void name()
    {
        System.out.println("Bicycle");
    }
    public static CycleFactory cf = new CycleFactory(){
        public Cycle getCycle()
        {
            return new Bicycle();
        }
    };
}

public class Factory{
   private static Cycle cy;
    public static void play(CycleFactory c)
    {
        cy = c.getCycle();
        cy.name();
    }
    public static void main(String[] args)
    {
        play(Bicycle.cf) ;
    }
}






























