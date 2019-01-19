package ch18;

import java.util.*;

public class KeyValue {
	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<Character, String>() {
			{
				for (Character c = 'z'; c >= 'a'; c--) {
					put(c, "abstract");
					put(c, "curel");
					put(c, "fedral");
					put(c, "defendent");
				}
			}
		};
		System.out.println(map);
		for (Character ch : map.keySet())
			System.out.print(ch.hashCode() + " ");
		System.out.println();
		LinkedHashMap<Character, String> link = new LinkedHashMap<Character, String>(map);
		for (Character ch : link.keySet())
			System.out.print(ch.hashCode() + " ");
		System.out.println();
		Hashtable<Character, String> table = new Hashtable<Character, String>(map);
		for (Character ch : table.keySet())
			System.out.print(ch.hashCode() + " ");
	}
}
