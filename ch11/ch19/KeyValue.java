package ch19;

import java.util.*;
import net.mindview.util.*;
public class KeyValue {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(
				"fs","eddsaf","er","afdsaf"));
		 System.out.println(set);
		 String[] s1 = set.toArray(new String[0]);
		 for(String s: s1)
			 System.out.print(s + " ");
		 System.out.println();
		 Arrays.sort(s1);
		 for(String s: s1)
			 System.out.print(s + " ");
		 System.out.println();
		 Set<String> set2 = new LinkedHashSet<String>();
		 for(String s: s1)
		 {
			 set2.add(s);
		 }
		 System.out.println(set2);
	}
}
