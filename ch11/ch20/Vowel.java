package ch20;

import java.io.*;
import java.util.*;

//import object.TextFile;

public class Vowel {
	private static final Map<Character,Integer> vowels = new HashMap<Character,Integer>(){
		{
			put('a',0);put('e',0);put('i',0);put('o',0);put('u',0);put('A',0);
			
		}
	};

	public static void main(String[] args) {
		// Set<String> words = new TreeSet<String>(
		// new TextFile("src/object/SetOperations.java", "\\W+"));
		HashSet<String> vowel = new HashSet<String>();
		HashSet<String> processedWords = new HashSet<String>();
		int fileVowels = 0;
		int wordVowels = 0;
		char[] ch=new char[vowels.size()];
		for (String word : new FileRread("src/object/UniqueWords.java", "\\W+")) {
			for (Character letter : word.toCharArray()) {
				if (vowels.containsKey(letter)) {
					fileVowels++;
					   Integer freg = vowels.get(letter);
					   vowels.put(letter, freg==null?freg:freg+1);
					}
				
				if (!vowel.contains(letter)) {
					vowel.add(word);
					System.out.print("word = " + word + "letter = " + letter);
				}
				System.out.println();
				wordVowels++;
			}//a=27, e=36, u=14, i=38, o=24
			
		}
		System.out.println(vowels);
		System.out.println("wordVowels = " + wordVowels);
	}
}



class CountVowel<T> {
	private Set<T> set;
	private long sum = 0;
	private long vowelcount[];

	public CountVowel(Set<T> set) {
		this.set = set;

	}

	public void count(Set<T> s) {
		vowelcount = new long[s.size()];
		Iterator<T> it = s.iterator();

		for (T s1 : set) {
			for (int i = 0; i < s.size(); i++) {
				System.out.print(s.toArray());
			}
		}
	}

	public void display() {
		if (sum > 0) {
			System.out.println(vowelcount[0]);
			System.out.println(vowelcount[1]);
			System.out.println(vowelcount[2]);
			System.out.println(vowelcount[3]);
			System.out.println(vowelcount[4]);
			System.out.println(sum);

		}
	}
}