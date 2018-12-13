//: ch5_05/Dog.java
/**@-version 1.0
  *this is not good version
  *I will back turn write
  */

public class Dog{
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
        if(args[0]!=null)
        {
            dog.bark(args[0]);
        }
    }
}
