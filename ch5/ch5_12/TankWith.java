//: ch5_12/TankWith.java


class Tank{
    static int counter;
    int id =counter++;
    boolean full;
    public Tank()
    {
        System.out.println("Tank "+ id + "created");
        full = true;
    }
    public void empty() 
    {
        full = false;
    }
    protected void finalize()
    {
        if(full)
            System.out.println("error: tank "+ id + "must be empty at cleanup");
        else
            System.out.println("Tank "+id + "cleaned up ok");
    }
    public String toString()
    {
        return "Tank"+id;
    }
    }
public class TankWith{
    public static void main(String args[])
    {
        new Tank().empty();
        new Tank();
        System.gc(); //force finalizatin
        System.runFinalization();
    }
    }
