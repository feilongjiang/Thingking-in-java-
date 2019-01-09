package ch19;

interface Game{ void play();}
interface FactoryGame{ Game getGame();}

class Coin implements Game{
    public void play()
    {
        System.out.println("haha this is true face");
    }
}
class CoinFactory implements FactoryGame{
    public Game getGame(){ return new Coin();}
}
class Dice implements Game{
    public void play()
    {
        System.out.println("now is six");
    }
}
class DiceFactory implements FactoryGame{
    public Game getGame() { return new Dice();}
}

public class Games{
    public static void play(FactoryGame g)
    {
        Game ga = g.getGame();
        ga.play();
    }
    public static void main(String[] args)
    {
        play(new CoinFactory());
        play(new DiceFactory());
    }
}

