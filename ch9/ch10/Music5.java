//: interfaces/music5/Music5.java
// Interfaces.
package object;
import static net.mindview.util.Print.*;
enum Note{
	MIDDLE_C,MIDDLE_D,MIDDLE_F
}
abstract class Instrument {
  // Compile-time constant:
  //int VALUE = 5; // static & final 可以声明域,但这些域都隐式地是static和final的
  // Cannot have method definitions:
	public void adjust() { print(this + ".adjust()"); }
    public abstract String toString();
}
interface Playble{
	public void play(Note n);
}
class Wind extends Instrument implements Playble{
	public void play(Note n) {
	    print(this + ".play() " + n);
	  } // Automatically public //自动的是public
  public String toString() { return "Wind"; }

}

class Percussion extends Instrument implements Playble{
	public void play(Note n) {
	    print(this + ".play() " + n);
	  } // Automatically public //自动的是public
  public String toString() { return "Percussion"; }
}

class Stringed extends Instrument implements Playble{
	public void play(Note n) {
	    print(this + ".play() " + n);
	  } // Automatically public //自动的是public
 
  public String toString() { return "Stringed"; }
}

class Brass extends Wind {
  public String toString() { return "Brass"; }
}	

class Woodwind extends Wind {
  public String toString() { return "Woodwind"; }
}

public class Music5 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  static void tune(Playble i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  static void tuneAll(Playble[] e) {
     for(Playble i : e)
	  tune(i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
     Playble[] w ={
     new Wind(),
      new Percussion(),
     new Stringed(),
      new Brass(),
    new Woodwind()
     };
   
    tuneAll(w);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
