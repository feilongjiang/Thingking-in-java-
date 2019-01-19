package ch32;
//: holding/NonCollectionSequence.java
import typeinfo.pets.*;
import java.util.*;

import object.InterfaceVsIterator;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
	// 这里是做一个验证
	public Iterable<Pet> reversed()
	{
		return new Iterable<Pet>(){
			         public Iterator<Pet> iterator()
			         {
			        	 return new Iterator<Pet>()
			        			 {
			        		         int count = pets.length-1;
			        		         public boolean hasNext(){return count>-1;}
			        		         public Pet next(){ return pets[count--];} 
			        			 };
			         }
				};
	}
	public Iterable<Pet> randomized()
	{
		 return new Iterable<Pet>()
				 {
			           @Override
			           public Iterator<Pet> iterator(){
			        	   List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
			        	   Collections.shuffle(shuffled,new Random(47));
			        	   
			        	   return shuffled.iterator();
			           }
				 };
	}
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
    NonCollectionSequence nc = new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
    for(Pet pet :nc.reversed())
    	System.out.print(pet + " ");
    System.out.println();
    for(Pet pet :nc.randomized())
    	System.out.print(pet + " ");
    System.out.println();
    InterfaceVsIterator.display(nc.iterator());
    
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
