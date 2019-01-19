//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package ch09;
import java.util.*;
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
  private class SequenceSelector implements Iterator<Object> {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
	@Override
	public boolean hasNext() { return i < items.length;}
	@Override 
	public Object next()
	{
		if(hasNext())
			return items[i++];
		throw new NoSuchElementException();
	}
	@Override
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
  }
  public Iterator<Object> iterator() { return new SequenceSelector(); }
  public static void main(String[] args) {
	  Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(i);
    for(Iterator<Object> it = sequence.iterator();it.hasNext();)
                 {System.out.print(it.next() + " ");
                 it.remove();
                 }
 
    	
    
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
