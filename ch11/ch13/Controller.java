//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package ch13;
import java.util.*;

import object.LinkedList;

public class Controller {
  // A class from java.util to hold Event objects:
  private List<Event> eventList = new LinkedList<Event>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
	
    while(eventList.size() > 0)
    	{	
    	    Iterator<Event> it = 
    	        new LinkedList<Event>(eventList).iterator();
    	    while(it.hasNext())
    	    {
    	    	Event e = it.next();
    	    	System.out.println(e);
    	    	e.action();
    	        it.remove();
    	    }
      // Make a copy so you're not modifying the list
      // while you're selecting the elements in it:
 
    	}
  }
} ///:~
