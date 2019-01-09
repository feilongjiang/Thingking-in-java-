//: this is static and final test

package ch7_18;

class Origin{
    private static int count;
    private int id = count++;
    @Override public String toString()
    {
        return "Origin " + id;
    }
}
class WithFinalFields{
    final Origin or = new Origin();
    static final Origin ori = new Origin();
    public String toString()
    {
        return "or =" + or + "\n ori " + ori;
    }
}

 public class Final{
    public static void main(String[] args)
    {
        System.out.println("this is first object");
        System.out.println(new WithFinalFields());
        System.out.println("second object");
        System.out.println(new WithFinalFields());
    }
}
