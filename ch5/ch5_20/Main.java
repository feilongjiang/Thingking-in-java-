//: ch5_20/Main.java

 class Other
{
   public static void main(String... args)
{
      for(String s : args)
      {
          System.out.print(s + " ");
      }
      System.out.println(  );
}
}
public class Main{

    public static void main(String... args)
    {
      Other.main(args);
    }
 }
