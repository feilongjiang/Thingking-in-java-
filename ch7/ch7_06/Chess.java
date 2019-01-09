package object;


class Game{
	Game(int i)
	{
		System.out.print("Game constructor");
	}
}
class BoardGame extends Game{
	BoardGame(int i)
  {
		super(i);
		System.out.print("BoardGame constructor");
	}
}
public class Chess extends BoardGame{
	Chess()
	{
	  //super(1); //Implicit super constructor Game() is undefined. Must explicitly invoke another constructor
		System.out.print("Chess constructor");
	}
	public static void main(String[] args)
	{
		Chess x = new Chess();
	}
}






