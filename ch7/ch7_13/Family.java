//: ch7_13/Family.java
// my home
package ch7_13;
class Member{
    protected void show()
    {
        System.out.println("my home have 8 people");
    }
    protected void show(String big)
    {
        if(big.equals("big"))
            System.out.println("family big human is my father");
    }
    protected void show(int i)
    {
        if(i == 1) 
            System.out.println("my family important is my mother");
    }
}
public class Family extends Member{
    public void show(int begin,int end)
    {
        System.out.println("the people number is 8" + begin);
    }
    public static void main(String[] args)
    {
        Family f = new Family();
        f.show();
        f.show("big");
        f.show(1);
        f.show(8);
    }
}
