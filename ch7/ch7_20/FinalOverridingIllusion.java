//: reusing/FinalOverridingIllusion.java
// it only loos like you cna override
// a private or private final method
package ch7_20;

class WithFinals{
    //Identical to "private" alone
    public void f(){
        System.out.println("WithFinals.f()");
    }
     public void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridePrivate extends WithFinals{
    @Override public void f()
    {
      System.out.println("Overridingprivate.f()");
    }
    @Override public void g()
    {
        System.out.println("Overridingprivate.g()");
    }
}

class OverridePrivate2 extends OverridePrivate{
    @Override public final void f()
    {
      System.out.println("Overridingprivate2.f()");
    }
   @Override public void g()
    {
        System.out.println("Overridingprivate2.g()");
    }
}
public class FinalOverridingIllusion{
    public static void main(String[] args)
    {
        OverridePrivate2 op2 = new OverridePrivate2();
        op2.f();
        op2.g();
 
    }
}




















