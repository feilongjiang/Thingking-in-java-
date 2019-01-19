package ch12;

import java.util.*;

public class ListInteger {
	public static ListIterator<Integer> 
	              turn(ListIterator<Integer> it, ListIterator<Integer> itk)
	{
	    while(itk.hasNext())
	    	itk.next();
		while(it.hasNext())
		{
			if(itk.hasPrevious())
			{
				itk.previous();
				itk.set(it.next());
			}
		}
		return itk;
	}
	public static void main(String[] args)
	{
	List<Integer> list = new ArrayList<Integer>(
			Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	List<Integer> link = new LinkedList<Integer>(list);
	ListIterator<Integer> its = list.listIterator(list.size());
	while(its.hasPrevious())
		System.out.print(its.previous() + "r ");
	ListIterator<Integer> it = list.listIterator();
	ListIterator<Integer> itk = link.listIterator();
	
	ListIterator<Integer> df = turn(it,itk);
	while(df.hasNext())
		System.out.print(df.next() + " ");
	System.out.println();
	System.out.println(link);
	}
	
}
