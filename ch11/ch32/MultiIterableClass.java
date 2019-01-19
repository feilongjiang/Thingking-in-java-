package ch32;
//: holding/MultiIterableClass.java
// Adding several Adapter Methods.
import java.util.*;

import object.IterableClass;

public class MultiIterableClass extends IterableClass {
  public Iterable<String> reversed() {
    return new Iterable<String>() {
      public Iterator<String> iterator() {
        return new Iterator<String>() {
          int current = words.length - 1;
          public boolean hasNext() { return current > -1; }
          public String next() { return words[current--]; }
          public void remove() { // Not implemented
            throw new UnsupportedOperationException();
          }
        };
      }
    };
  }	
  public Iterable<String> randomized() {
    return new Iterable<String>() {
      public Iterator<String> iterator() {
    	  List<String> shuffled =
          new ArrayList<String>(Arrays.asList(words));
        Collections.shuffle(shuffled, new Random(47));//Collections方法并没有打乱原来的数组
                     //而是打乱了shuffled中的引用,之所以这样,只是因为,randmize()方法用一个ArrayList将Arrays.asList()结果包装了起来
        return shuffled.iterator();
      }
    };
  }	
  public static void main(String[] args) {
    MultiIterableClass mic = new MultiIterableClass();
    for(String s : mic.reversed())
     System.out.print(s + " ");
    System.out.println();
    for(String s : mic.randomized())
      System.out.print(s + " ");
    System.out.println();
    for(String s : mic)
      System.out.print(s + " ");
  }
} /* Output:
banana-shaped. be to Earth the know we how is that And
is banana-shaped. Earth that how the be And we know to
And that is how we know the Earth to be banana-shaped.
*///:~
