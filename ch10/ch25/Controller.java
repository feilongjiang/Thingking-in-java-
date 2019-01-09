//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package ch25;
import java.util.*;

public class Controller {
  // A class from java.util to hold Event objects:
	//List是一个容器,list<Event>(读作Event的列表> 
	//add()添加Object到LIst的尾端, size()得到List中的元素个数
	//foreach语法用来连续获取List中的Event
	//remove()方法用来从list列表移除指定的Event
  private List<Event> eventList = new ArrayList<Event>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
    while(eventList.size() > 0)
      // Make a copy so you're not modifying the list
      // while you're selecting the elements in it:
      for(Event e : new ArrayList<Event>(eventList))
        if(e.ready()) {
          System.out.println(e);
          e.action();
          eventList.remove(e);
        }
  }
} ///:~
