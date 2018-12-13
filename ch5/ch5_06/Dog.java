//: ch5_06/Dog.java
/**@-version 1.0
  *this is not good version
  *I will back turn write
  */
import java.util.*;
public class Dog{
    void bark()
    {
        System.out.println("no have anyting dog");
    }
    void bark(String s,int i)
    {
        if(s.equals("mini"))
            System.out.println("barking");
        else if(s.equals("bigest"))
            System.out.println("howling");
    }
    void bark(int i,String s)
    {
        if(s.equals("mini"))
            System.out.println("this is a test");
        else if(s.equals("bigest"))
            System.out.println("this is a test");
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        int n=args.length;
        if(n>0)
        {
            while(n-->0)
            {
                dog.bark(n,args[n]);
                dog.bark(args[n],n);
            }
        }
        else
            dog.bark();
    }
}
