//: ch5_05/Dog.java
/**@-version 2.0
  *this is not good version
  *I will back turn write
  */

public class Dogsecond{
    void bark()
    {
        System.out.println("no have anyting dog");
    }
    void bark(String s)
    {
        if(s.equals("mini"))
            System.out.println("barking");
        else if(s.equals("bigest"))
            System.out.println("howling");
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        if(args.length>0)
        {
            dog.bark(args[0]);
        }
        else
            dog.bark();
    }
}
