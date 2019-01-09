//: interfaces/HorrorShow.java
// Extending an interface with inheritance.
package ch14;
interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla {
	
  public DangerousMonster dn()
  {
	  return new DangerousMonster()
			  {
		        public void menace() {}
		          public void destroy(){System.out.println("Iam dangerousMosnter");}
			  };
  }
}	

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}	

public class HorrorShow {

  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla().dn();
    barney.destroy();
    Vampire vampire = new Vampire(){
    	public void drinkBlood(){System.out.println("I am vampire");}
    	 public void menace() {}
    	  public void destroy() {}
    	  public void kill() {}
    	
    };
    vampire.drinkBlood();

  }
} ///:~
