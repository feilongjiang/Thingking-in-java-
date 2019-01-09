//: reusing/CADSystem.java
// Ensuring proper cleanup 确保合适的清理
package object;
import static net.mindview.util.Print.*;
class Shape{ //形状
	Shape(int i){print("shape constructor");}
	void dispose(){ print("Shape dispose");}
}
class Circle extends Shape{
	Circle(int i)
	{
		super(i);
		print("Drawing circle");
	}
	void dispose(){  //dispose 处理
		print("Rrasing circle"); // erasing 擦除
		super.dispose();
	}
}
class Triangle extends Shape{
	Triangle(int i)
	{
		super(i);
		print("Drawing Triangle(三角形)");
	}
	void dispose()
	{
		print("Erasing Triangle");
		super.dispose();
	}
}
class Line extends Shape{
	private int start, end;
	Line(int start,int end)
	{
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing ling: "+ start + "," + end	);
	}
	void dispose()
	{
		print("Erasing line:" + start + "," + end);
	}
}
public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public CADSystem(int i)
	{
		super(i + 1);
		for( int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j*j);
		c = new Circle(1);
		t = new Triangle(1);
		print("Comblined constructor");
	}
	public void dispose()
	{
		print("CADSystem.dispose()");
		// The order cleanup is the reverse
		// of the order of initialization
		t.dispose();
		c.dispose();
		for(int i = lines.length-1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}
	public static void main(String[] args)
	{
		CADSystem x = new CADSystem(47);
		try{
			// code and excepton handling...
		}finally{
			x.dispose();
		}
	}
}


























