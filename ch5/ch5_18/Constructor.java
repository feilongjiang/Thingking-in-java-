//: ch5_17/Constructor.java

class Show{
    Show(String s){
            System.out.println(s);
    }
}
public class Constructor
{
    Show[] show = new Show[5];
    public static void main(String [] args)
    {
        Show [] show1 = new Show[5];
        for ( int i = 0; i< show1.length; i++)
            show1[i] = new Show(Integer.toString(i));
    }
    }
