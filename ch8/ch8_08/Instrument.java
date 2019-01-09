package ch8_08;
class Instrument{
	void play(Note n){System.out.println("Instrument.play()" + n);};
	public String toString()
	{
		return "I am " + super.toString();
	}
	void adjust() {System.out.print("ADjusting instrument");}
}

