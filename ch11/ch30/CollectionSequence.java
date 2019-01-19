package ch30;
//: holding/CollectionSequence.java
import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence implements Collection<Pet>{
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }
 
  public Iterator<Pet> iterator() {
	  return new Iterator<Pet>() {
	      private int index = 0;
	      public boolean hasNext() {
	        return index < pets.length;
	      }
	      public Pet next() { return pets[index++]; }
	      public void remove() { // Not implemented
	        throw new UnsupportedOperationException();
	      }
	    };
	  }	
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }

@Override
public boolean add(Pet e) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean addAll(Collection<? extends Pet> c) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public void clear() {
	// TODO 自动生成的方法存根
	
}

@Override
public boolean contains(Object o) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean containsAll(Collection<?> c) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean isEmpty() {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean remove(Object o) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean removeAll(Collection<?> c) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public boolean retainAll(Collection<?> c) {
	// TODO 自动生成的方法存根
	return false;
}

@Override
public Object[] toArray() {
	// TODO 自动生成的方法存根
	return null;
}

@Override
public <T> T[] toArray(T[] a) {
	// TODO 自动生成的方法存根
	return null;
}
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
