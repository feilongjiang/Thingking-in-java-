package ch18;

interface Cycle{
    void name();
}
interface CycleFactory {
    public Cycle getname();
}
class Unicycle implements Cycle{
    public void name()
    {
        System.out.println("Unicycle");
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getname()
    {
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    public void name()
    {
        System.out.println("Bicycle");
    }
}
class BicycleFactory implements CycleFactory{
    public Cycle getname()
    {
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    public void name()
    {
        System.out.println("Tricycle");
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle getname()
    {
        return new Tricycle();
    }
}
public class Factory{
   private static Cycle cy;
    public static void play(CycleFactory c)
    {
        cy = c.getname();
        cy.name();
    }
    public static void main(String[] args)
    {
        play(new BicycleFactory());
        play(new UnicycleFactory());
        play(new TricycleFactory());
    }
}






























