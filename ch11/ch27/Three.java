package ch27;
import java.util.*;
class Command {
	private final String str;
	public Command(String str){this.str = str;}
	public void operation(){System.out.println(str);}	
}
class Second{
	public void use(Queue<Command> q,Command com)
	{
		q.offer(com);
	}
}
public class Three{
	public static void display(Queue<Command> q)
	{
		while(q.peek()!=null)
			q.remove().operation();
	}
	public static void main(String[] args)
	{
		Queue<Command> queue = new LinkedList<Command>();
		Second se = new Second();
		for(int i = 0; i < 10; i++)
			se.use(queue,new Command("constitution " + i));
		display(queue);
		System.out.println(queue);
	}
}
