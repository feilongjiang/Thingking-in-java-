package ch06;

//: holding/E05_StringListFeatures.java /****************** Exercise 5 ******************  * Use Strings instead of Pets to modify   * ListFeatures.java  (remember autoboxing).  * Explain any difference in results.  ***********************************************/  package holding; import java.util.*; import static net.mindview.util.Print.*; 
import java.util.*;
import static net.util.Print.*;

public class E05_StringListFeatures {
	static Random rand = new Random(47);

	public static void main(String[] args) {
		List<String> ints = new ArrayList<String>(
				Arrays.asList("dog", "pig", "duck", "fly", "event", "boast", "convince"));
		print("1: " + ints);
		ints.add("yes");
		print("2: " + ints);
		print("3: " + ints.contains("pig"));
		ints.remove(String.valueOf("pig"));
		String i = ints.get(2);
		print("4: " + i + " " + ints.indexOf(i));
		String j = String.valueOf("event");
		print("5: " + ints.indexOf(j));
 		print("6: " + ints.remove(j));
		print("7: " + ints.remove(i));
		print("8: " + ints);
		ints.add(3, "no");
		print("9: " + ints);
		List<String> sub = ints.subList(1, 4);
		print("subList: " + sub);
		print("10: " + ints.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: " + ints.containsAll(sub));
		List<String> copy = new ArrayList<String>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<String>(ints);
		// Thinking in Java, 4th Edition Annotated Solution Guide 184
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(1, "connect");
		print("16: " + copy);
		copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + ints.isEmpty());
		ints.clear();
		print("19: " + ints);
		print("20: " + ints.isEmpty());
		ints.addAll(Arrays.asList("register", "vistor", "fork", "danger"));
		print("21: " + ints);
		Object[] o = ints.toArray();
		print("22: " + o[3]);
		String[] ia = ints.toArray(new String[0]);
		print("22: " + ia[3]);
	}
} /*
	 * Output: 1: [1, 2, 3, 4, 5, 6, 7] 2: [1, 2, 3, 4, 5, 6, 7, 8] 3: true 4: 3
	 * 2 5: 0 6: true 7: true 8: [2, 4, 5, 6, 7] 9: [2, 4, 5, 0, 6, 7] subList:
	 * [4, 5, 0] 10: true sorted subList: [0, 4, 5] 11: true shuffled subList:
	 * [4, 0, 5] 12: true sub: [4, 6] 13: [4, 6] 14: [2, 4, 5, 6, 7] 15: [2, 5,
	 * 7] 16: [2, 9, 7] 17: [2, 9, 4, 6, 7] 18: false 19: [] 20: true 21: [1, 2,
	 * 3, 4] 22: 4 22: 4 Holding Your Objects 185
	 */// :~
