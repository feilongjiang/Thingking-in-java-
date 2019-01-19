package ch17;

import java.util.*;
import java.util.Map.Entry;

class Gerbill {
	private int gerbillNumber = 0;

	public Gerbill(int i) {
		gerbillNumber = i;
	}

	public void hop() {
		System.out.print(gerbillNumber + " ");
		if (gerbillNumber % 2 == 0)
			System.out.println("act");
		else
			System.out.println("silence");
	}

	public String toString() {
		return "I am is " + gerbillNumber;
	}
}

public class GerbilArray {
	public static void main(String[] args) {
		HashMap<String, Gerbill> gerbill = new HashMap<String, Gerbill>();
		gerbill.put("fuzzy", new Gerbill(1));
		gerbill.put("sport", new Gerbill(2));
		String[] str = { "fuzzy", "sport" };
		gerbill.remove("fuzzy");
		Iterator<Entry<String,Gerbill>> it = gerbill.entrySet().iterator() ;
		
		while(it.hasNext())
		{
			
			Entry<String,Gerbill> entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		gerbill.put("fdsfd",new Gerbill(3));
	}
}
