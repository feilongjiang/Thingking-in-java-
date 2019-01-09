package ch8_11;
//: polymorphsim/Sandwich.java
// Order of constructor call
import static net.mindview.util.Print.*;

class Meal{
	Meal(){print("meal");}
}
class Bread{
	Bread(){print("bread");}
}
class Cheese{
	Cheese(){print("CZheese");}
}
class Lettuce extends Meal{
	Lettuce(){print("Lettuce");}
}
class Lunch extends Meal{
	Lunch(){print("Lunch");}
}
class Pickle extends Meal{
	Pickle(){print("Pickle");}
}
class PortableLunch extends Lunch{
	PortableLunch(){print("PortableLunch");}
}
public class Sandwich extends PortableLunch{
	private Bread b   = new Bread();
	private Cheese c  = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p  = new Pickle();
	public Sandwich(){print("sandwich");}
	public static void main(String[] args)
	{
		new Sandwich();
	}
}/* output:
meal
Lunch
PortableLunch
bread
CZheese
meal
Lettuce
sandwich
*///:~