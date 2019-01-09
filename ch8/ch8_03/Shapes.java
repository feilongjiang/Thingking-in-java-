//: reusing/CADSystem.java
// Ensuring proper cleanup 确保合适的清理
package ch8_03;
import java.util.Random;


class Shape{ //形状
	public void draw(){}  //基类只提供公共接口
	public void erase(){ }
  public void display(){
      System.out.println("I will show anthing");
  }
}
class Circle extends Shape{
	@Override public void draw(){System.out.println("Circle draw");}
	@Override public void erase(){ System.out.println("Circle erase");}
  @Override public void display(){
      System.out.println("my name is derived");
  }
}
class Triangle extends Shape{
	@Override public void draw(){System.out.println("Triangle draw");}
	@Override public void erase(){ System.out.println("Triangle erase");}
}
class Square extends Shape{
	@Override public void draw(){System.out.println("Square draw");}
	@Override public void erase(){ System.out.println("Square erase");}
}
class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next()
	{
		switch(rand.nextInt(3))
		{
		default:
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();
		}
	}
}
public class Shapes{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args)
	{
		Shape[] s = new Shape[9];
		//fill up the array with shapes
		for(int i = 0; i< s.length; i++)
		{
			s[i] = gen.next();//由对象决定调用哪个方法
		}
		//make polymorphic method calls
		for(Shape shp : s)
			{
          shp.draw();
          shp.display();
      }
	}
}/* output:
Triangle draw
Triangle draw
Square draw
Triangle draw
Square draw
Triangle draw
Square draw
Triangle draw
Circle draw
*///:~
