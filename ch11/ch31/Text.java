//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package ch31;
import java.util.*;

class Text1 implements Iterable<Shape>{
	private int max ;
	public Text1(int max){ this.max = max;}
	@Override
	public Iterator<Shape> iterator()
	{
		return new Iterator<Shape>()
				{      
			           private int count =0;
			           public boolean hasNext(){return count<max;}
			           public Shape next() { count++; return nextShpae();}
				};
	}
  private Random rand = new Random(47);
  public Shape nextShpae() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
} 
public class Text {
	public static void main(String[] args)
	{
		Text1  t = new Text1(2);
		for(Shape  s:t)
		{
			s.draw();
		}
	}
}
