//: ch7_19/final.java
// blank final
package ch7_19;

class Blank{
    final int i;
    public Blank(int i)
    {
        this.i = i;
    }
    public String toString()
    {
        return "this.i = " + i;
    }
}

public class Final{
	final Blank blank;
	final public int j;
    public Final(int i)
    {
    	j = i;
       blank = new Blank(i);
    }
    public String toString()
    {
    	return "blank = " + this.blank;
    }
    public static void main(String[] args)
    {
        Final fi = new Final(5);
        System.out.println(fi.toString());
        Final fin = new Final(3);
        System.out.println(fin.toString());
       // fin.j = 7;  //can't initialize
    }
}
