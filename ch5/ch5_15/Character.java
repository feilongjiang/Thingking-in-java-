//: ch5_15/Character.java
/**this is a test progam
  *I hope made good it 
  */

class Init{
    Init(String s)
    {
        System.out.printf("this is a init progam, %s\n",s);
    }
    }
public class Character{
    Init init;
    {
        init = new Init("yes");
    }
    Character(){
        System.out.print("inside Character() now\n");
    }
    public static void main(String args[])
    {
        System.out.println("Inside main()");
        new Character();
    }
    }
