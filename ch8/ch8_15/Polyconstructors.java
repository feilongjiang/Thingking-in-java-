//polymorphism/Polyconstructors.java
//constructors and poly morphism
//don't produce what you mght expect
//d
package ch8_15;
class Glyph{
	private void draw()
	{
		System.out.println("ZGlyph.draw()");
	}
	Glyph()
	{
		System.out.println("Glyph() before draw()");
		draw();  //在导出类RoundGlyph还未初始化之前就调用了RoudnGlyph.draw()方法
		System.out.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph{
	int radius = 1;
	RoundGlyph(int r)
	{
		radius = r;
		System.out.println("roundglyph..roundglyph(), radius = " + radius);
	}
	void draw() 
	{
		System.out.println("Roundglyph.draw(), radius = " + radius);
	}
}
class Rectangular extends Glyph{
	private int weight = 2;
	Rectangular()
	{
		System.out.println("weight = " + weight);
		System.out.println("Rectangular..Rectangular(), radius = " );
	}
     void draw()
	{
		System.out.println("Rectangular.draw(), radius = ");
	}
}
public class Polyconstructors{
	public static void main(String[] args)
	{
		new RoundGlyph(5);
		new Rectangular();
	}
}/* output:
Glyph() before draw()
ZGlyph.draw()
Glyph() after draw()
roundglyph..roundglyph(), radius = 5
Glyph() before draw()
ZGlyph.draw()
Glyph() after draw()
weight = 2
Rectangular..Rectangular(), radius = 
*///:~
