package ch07;

interface Rodent{
      public void name();
}
class Mouse implements Rodent{
    public void name(){
        System.out.println("I am a mouse");
    }
}
class Gerbil implements Rodent{
    public void name(){
        System.out.println("I am a gerbil");
    }
}
class Hamster implements Rodent{
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
