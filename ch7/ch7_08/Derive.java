package ch7_08;

class Base{
    private Base() {

    }
    public Base(int i)
    {
        System.out.println("I am " + i + " I from base");
    }
}

public class Derive extends Base{
    public Derive(){
        super(1);
    }
    public Derive(int i){
        super(i);
        System.out.println("I am normal" + i);
    }
    public static void main(String[] args)
    {
        new Derive();
        new Derive(3);
    }

}
