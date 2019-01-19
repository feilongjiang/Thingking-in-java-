package ch07;

import java.util.ArrayList;
import java.util.*;

class Kind{
	public static  int i=0;
	public final int id = i++;
	public int getId() { return id;}
	public String toString() { return id +" id";}
}
public class Animal {
	public static void main(String[] args)
	{
		Kind[] kind = new Kind[]{
				new Kind(),
			    new Kind(),
			    new Kind(),
			    new Kind(),
		};
		List<Kind> animal =  new ArrayList<Kind>(Arrays.asList(kind));
		System.out.println(animal);
		List<Kind> sub = animal.subList(2, 3);
		System.out.println(sub);
		animal.removeAll(sub);
		System.out.println(animal);
	}
}
