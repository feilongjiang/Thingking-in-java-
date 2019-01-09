package ch06;
import ch06.object.*;
class Implements implements I
{
    // void play()  error
   public  void play()
    {
        System.out.println("play");
    }
    // void play() error
    public void show()
    {
        System.out.println("show");
    }
    public static void main(String[] args)
    {
        Implements im = new Implements();
        im.play();
        im.show();
    }
}

