package ch8_12;

class Rodent{
	  Rodent()
	  {
		  System.out.println("I am Rodent");
	  }
      public void name(){

      }
}
class Mouse extends Rodent{
	 Mouse()
	  {
		  System.out.println("I am Mouse");
	  }
    public void name(){
        System.out.println("I am a mouse");
    }
}
class Gerbil extends Rodent{
	Gerbil()
	  {
		  System.out.println("I am Gerbil");
	  }
    public void name(){
        System.out.println("I am a gerbil");
    }
}
class Hamster extends Rodent{
	Gerbil g = new Gerbil();
	Hamster()
	  {
		  System.out.println("I am Hamster");
	  }
    public void name(){
        System.out.println("I am a hamster");
    }
}
public class Animal{
	Animal()
	  {
		  System.out.println("I am Animal");
	  }
    public static void main(String[] args)
    {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse(); 
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
      
    }
}/* output
I am Rodent
I am Mouse
I am Rodent
I am Gerbil
I am Rodent
I am Rodent
I am Gerbil
I am Hamster
*///:~
