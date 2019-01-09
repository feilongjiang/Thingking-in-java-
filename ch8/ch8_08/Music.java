package ch8_08;

class Wind extends Instrument{
	void play(Note n){System.out.println("Wind.play()" + n);};
	String what(){ return "Wind";}
	void adjust() {System.out.print("ADjusting Wind");}
}
class Percussion extends Instrument{
	void play(Note n){System.out.println("Percussion.play()" + n);};
	String what(){ return "Percussion";}
	void adjust() {System.out.print("ADjusting Percussion");}
}
class Stringed extends Instrument{
	void play(Note n){System.out.println("Stringed.play()" + n);};
	String what(){ return "Stringed";}
	void adjust() {System.out.print("ADjusting Stringed");}
}
class Brass extends Wind{
	void play(Note n){System.out.println(" Brass.play()" + n);};
	void adjust() {System.out.print("ADjusting  Brass");}
}
class Woodwind extends Wind{
	void play(Note n){System.out.println(" Woodwind.play()" + n);};
	void adjust() {System.out.print("ADjusting Woodwind");}
}
	public class Music {
		//Does't care abou type,so new types
			//added to the system still work right
      java.util.Random gen = new java.util.Random(47);
			public Instrument tune()
			{
          switch(gen.nextInt(6))
          {
              default:
              case 0: return new Wind();
              case 1: return new Percussion();
              case 2: return new Stringed();
          }
			}
			public static void main(String[] args)
			{
          Music m = new Music();
				//upcasting during additin to the array
          for(int i = 0; i< 10; i++)
          {
              System.out.println(m.tune());
          }
			}
}/* output:
Wind.play()MIDDLE_C
I am object.Wind@1963006a
Percussion.play()MIDDLE_C
I am object.Percussion@7fbe847c
Stringed.play()MIDDLE_C
I am object.Stringed@41975e01
 Brass.play()MIDDLE_C
I am object.Brass@c2e1f26
 Woodwind.play()MIDDLE_C
I am object.Woodwind@dcf3e99

*///:~























