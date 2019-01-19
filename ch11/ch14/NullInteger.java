package ch14;

import java.util.*;
public class NullInteger {
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();
		for(int i = 1; i <= 10; i ++)
		{
			it.add(i);
			if(i%2 == 0)
			   it.previous();
			System.out.println(list);
		}
		
		
	}
}
