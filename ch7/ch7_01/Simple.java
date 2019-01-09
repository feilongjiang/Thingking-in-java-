//: this is simple program
package ch7_01;
class Reuse{
    private String s;
    public String toString()
    {
        if(s == null)
        {
            s = "constructed";
        }
        return s;
    }
    public static void main(String args[])
    {
        if(args[0]!=null)
            System.out.println(args[0]);
    }
}

public class Simple{
    public static void main(String args[])
    {
        Reuse reuse = new Reuse();
        System.out.println(reuse);
    }
}
