package ch10;

import java.util.*;

class Rodent{
      public void name(){

      }
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
    	//ArrayList<Rodent> rodent = new ArrayList<Rodent>();
    	ArrayList<Rodent> rodent = new ArrayList<Rodent>(
    			Arrays.asList(new Mouse(),new Gerbil(),new Hamster()));
   
        Iterator<Rodent> it = rodent.iterator();
        while(it.hasNext())
        	it.next().name();
    }
}
