package ch8_14;

class Rodent{
	  private int refcount = 0; //record rodent reference number
	  private static int counter = 0;//record Rodent number
	  private final long id = counter++; //
	  public void addrefcount()
	  {
		  refcount+=2;
	  }
	  public void dispose()
	  {
		  if(--refcount==0)
			  System.out.println("dispose Rodent");
	  }
	  public  int getref()
	  {
		  return refcount;
	  }
	  public  long getco()
	  {
		  return id;
	  }
	  Rodent()
	  {
		  counter++;
		  System.out.println("I am Rodent" + " " + id);
	  }
      public void name(){

      }
}
class Hamster extends Rodent{
	 public Rodent rodent = new Rodent();
	Hamster(Rodent rodent)
	  {
		  this.rodent = rodent;
		  this.rodent.addrefcount();
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
    	Rodent r = new Rodent();
    	Hamster rodent = new Hamster(r);
        System.out.println("rodent " + rodent.rodent.getref()+ " i am r = " +
        r.getref() + " Id = " + rodent.getco());
      
    }
}/* output
I am Rodent 0
I am Rodent 2
I am Rodent 4
I am Hamster
rodent 2 i am r = 2 Id = 2
*///:~
