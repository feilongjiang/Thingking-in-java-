//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package ch03;

import java.util.ArrayList;
import java.util.List;

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
	List<Sequence> sequence = new ArrayList<Sequence>();
	for( int i = 0 ; i < 20 ; i++)
	{
		sequence.add(new Sequence(i));
		{
			for( int j = 0; j < sequence.get(i).items.length; j ++)
				sequence.get(i).add(j);
		}
	}
   //Sequence sequence = new Sequence(10);
	for( int i = 0 ; i < 20 ; i++)
	{
	    Sequence s  = sequence.get(i);
	    if(s.items.length > 0)
	    {
	    	for(Object i1 : s.items)
	    		System.out.print(i1 + " ");
	    	System.out.println();
	    }
	    
	}
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
