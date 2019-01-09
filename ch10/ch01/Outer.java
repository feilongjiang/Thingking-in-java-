package ch01;

public class Outer{
    class Inner{
    {System.out.println("fdsf");}
    }
   public Inner inner()
   {
       return new Inner();
   }
   public static void main(String[] args)
   {
       Outer outer = new Outer();
       Outer.Inner oi = outer.inner();
   }
}

