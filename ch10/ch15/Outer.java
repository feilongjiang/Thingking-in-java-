package ch15;

class Vampire{
     int n;
      public Vampire(int i)
      {
          n = i;
      }
      public void f()
      {
          System.out.println("vampire " + n);
      }
}
class Danger{
    public Vampire getvampire(int i)
    {
        return new Vampire(i){};
    }
    public Vampire get1(int i)
    {
        return new Vampire(i){
            public void f()
            { System.out.println("Fds" + n);}
        };
    }
}

public class Outer{
    public static void main(String[] args)
    {
        Vampire vp = new Danger().getvampire(5);
        vp.f();
        Vampire vp2 = new Danger().get1(9);
        vp2.f();
    }
}
