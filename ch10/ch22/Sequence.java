package ch22;
//: innerclasses/Sequence.java
// Holds a sequence of Objects.

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
  public class Reverse implements Selector{
	  private int i = items.length -1;
	  public boolean end() {return i == -1;}
	  public Object current() { return items[i];}	  
	  public void next()
	  {
		  if(i>=0) i--;
		  
	  }
  }
  public Selector reverse()
  {
	  return new Reverse();
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
        System.out.print(selector.current() + " ");
        selector.next();
      }
    Selector reverse = sequence.reverse();
    System.out.println();
    while(!reverse.end())
    {
    	System.out.print(reverse.current() + " ");
    	reverse.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
