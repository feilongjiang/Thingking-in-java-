package ch7_15;
import ch7_15.*;

public class Root extends CallPro{
    public int getnumber()
    {
        return number();
    }
    public static void main(String[] args)
    {
        Root root = new Root();
        System.out.println(root.getnumber());
    }
}
