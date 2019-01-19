package ch24;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class Comparable1 implements Comparator<String> {
	@Override
	public int compare(String s1,String s2)
	{
		if(s1==null||s2==null)
			return 0;
		return s1.charAt(0)>s2.charAt(0)?-1:1;
	}


	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>() {
			{
				put("fsa", 90);
				put("sadf", 2);
				put("zeilong", 30);
				put("aife", 31);
				put("father", 60);
			};
		};
		map.forEach((k,v)->System.out.println("key = " + k + ", value " + v));
		map.l
		String[] s = map.keySet().toArray(new String[0]);
		System.out.println(map);
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		for(String s1: s)
		{
			map2.put(s1, map.get(s1));
		}
		System.out.println(map2);
		map.putAll(map2);	
		System.out.println(map);
		LinkedHashMap<String, Integer> map4 = new LinkedHashMap<String, Integer>(map);
		map4.put(s[0],map.get(s[0])+10);
		System.out.println(map4);
		map.putAll(map4);
		System.out.println(map);
		
		Vector<Integer> i = new Vector<Integer>();
		i.addAll(Arrays.asList(1,3,4,5));
		System.out.println(i);
		
	}

}
