package object;

abstract class Rodent{
      public abstract void name();
}
class Mouse extends Rodent{
    public void name(){
        System.out.println("I am a mouse");
    }
}
class Gerbil extends Rodent{
    public void name(){
        System.out.println("I am a gerbil");
    }
}
class Hamster extends Rodent{
    public void name(){
        System.out.println("I am a hamster");
    }
}
public class Animal{
    public static void main(String[] args)
    {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse(); 
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for(Rodent r : rodent)
            r.name();
    }
}
