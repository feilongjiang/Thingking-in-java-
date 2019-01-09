package ch7_17;

class Amphbian{
    void f(){
        System.out.println("I am is animal");
    }
    void f1(Amphbian i)
    {
        i.f();
    }
}

public class Forg extends Amphbian{
    @Override void f()
    {
        System.out.println("move on land");
    }
    public static void main(String[] args)
    {
        Amphbian fog = new Forg();
        fog.f();
        fog.f1(fog);
    }
}
