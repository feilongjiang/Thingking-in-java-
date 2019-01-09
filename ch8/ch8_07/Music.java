package ch8_07;

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
	public class Music{
		//Does't care abou type,so new types
			//added to the system still work right
			public static void tune(Instrument i)
			{
				//..
				i.play(Note.MIDDLE_C);
				System.out.println(i);
			}
			public static void tuneAll(Instrument[] e)
			{
				for(Instrument i : e)
					tune(i);
			}
			public static void main(String[] args)
			{
				//upcasting during additin to the array
				Instrument[] orchestra =
					{
							new Wind(),
							new Percussion(),
							new Stringed(),
							new Brass(),
							new Woodwind(),
					};
				tuneAll(orchestra);
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























