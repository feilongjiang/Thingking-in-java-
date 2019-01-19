package ch11;
import java.util.*;

import net.util.Print;

import static net.util.Print.*;
public class DisplayCollection {
	public static void display(Iterator<?> it)
	{
		while(it.hasNext())
			System.out.print(it.next().toString() + " ");
		System.out.println();
	}
	public static void fill(Collection<String> c)
	{
		List<String> a = new ArrayList<String>(
				Arrays.asList("I","am","jiang","fei","long"));
		c.addAll(a);
	}
	public static void main(String[] args)
	{
		List<Collection<String>> ca = 
				Arrays.<Collection<String>>asList(
						new ArrayList<String>(),
						new LinkedList<String>(),
						new HashSet<String>(),
						new TreeSet<String>());
		for(Collection<String> c :ca)
			fill(c);
		for(Collection<String> c : ca)
			display(c.iterator());
		
	}
}
