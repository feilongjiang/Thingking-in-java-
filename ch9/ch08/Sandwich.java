//: polymorphism/Sandwich.java
// Order of constructor calls.
package ch08;
interface FastFood{
    void show();
}
class Meal {
  Meal() { System.out.println("Meal()"); }
}

class Bread {
  Bread() { System.out.println("Bread()"); }
}

class Cheese {
  Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
  Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
  Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { System.out.println("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood{
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  public void show()
  {
      System.out.println("pushing your sandwich order");
  }
  public Sandwich()
  {
      System.out.println("Sandwich()"); 
      show();
  }
  public static void main(String[] args) {
    new Sandwich();
  }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
