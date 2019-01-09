package ch05;
import ch05.object.*;
class Implements implements I
{
    public void play()
    {
        System.out.println("play");
    }
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

