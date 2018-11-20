//: object/OverLoading.java
package object;
import java.util.*;
import static net.mindview.util.Print.*;

class Tree{
	int height;
	Tree()
	{
		print("Planting a seeding");
		height = 0;
	}
	Tree(int initialHeight)
	{
		height = initialHeight;
		print("Creating new tree that is" +
		height + " feet tall");
	}
	void info(){
		print("Tree is " +  height + "feei tall");
	}
	void info(String s)
	{
		print(s+ "; Tree is " + height + " feet tall");
	}
	
}

/**
 * @author feilong
 */
public class OverLoading 
{
	/**@param args put here can use */
	public static void main(String[] args)
	{
		for(int i =0 ;i<5; i++)
		{
			Tree t = new Tree(i);
			t.info();
			t.info("OverLoading method");
		}
		new Tree();
		
	}
	
}

/*
Creating new Tree that is 0  feet tall
Tree is 0 feet tall 
overloaded method: Tree is 0 feet tall
creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloading method: Tree is 1 feet tall
overloading method: Tree is 2 feet tall
Tree is 2f feet tall
overloading method: Tree is 1 feet tall
Creating new Tree that  is 3 feet tall
Tree is 4 feet tall
overloading method: Tree is 4 feet tall
planting seedling
*///~