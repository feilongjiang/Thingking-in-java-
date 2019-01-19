package ch29;
import java.util.PriorityQueue;
public class Object1 extends Object{
	public static void main(String[] args)
	{
		PriorityQueue<Object1> p = new PriorityQueue<Object1>();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(p.offer(new Object1()));
		}
	}
}
/* output:
true
Exception in thread "main" java.lang.ClassCastException: ch29.Object1 cannot be cast to java.lang.Comparable
	at java.util.PriorityQueue.siftUpComparable(Unknown Source)
	at java.util.PriorityQueue.siftUp(Unknown Source)
	at java.util.PriorityQueue.offer(Unknown Source)
	at ch29.Object1.main(Object1.java:9)
*///:~