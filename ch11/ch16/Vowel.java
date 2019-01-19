package ch16;

import java.io.*;
import java.util.*;

import object.TextFile;


class FileRread extends ArrayList<String>{
	public FileRread(String file,String pattern) 
	{
		super(Arrays.asList(read(file).split(pattern)));
		if(get(0).equals("")) remove(0);
	}
	public FileRread(String file)
	{
		this(file,"\n");
	}
	public static String read(String file)
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			try{
				while((s = br.readLine())!=null)
				{
				   sb.append(s);
				   sb.append("\n");
				}
			}
			finally{
				br.close();
			}
		}catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
}
class CountVowel<T>{
	private Set<T> set;
	private long sum = 0;
	private long vowelcount[];
	public CountVowel(Set<T> set)
	{
		this.set = set;
	
	}
	public void count(Set<T> s)
	{
		vowelcount = new long[s.size()];
		Iterator<T> it = s.iterator();
		
		for(T s1 : set)
		{
			for(int i = 0; i< s.size(); i++)
			{
				System.out.print(s.toArray());
			}
		}
	}
	public void display()
	{
		if(sum>0)
		{
			System.out.println(vowelcount[0]);
			System.out.println(vowelcount[1]);
			System.out.println(vowelcount[2]);
			System.out.println(vowelcount[3]);
			System.out.println(vowelcount[4]);
			System.out.println(sum);
	
		}
	}
}
public class Vowel {
	private static final Set<Character> vowels = new HashSet<Character>(Arrays.asList(
			'a','e','i','o','u','A','E','I','O','U'));
	public static void main(String[] args)
	{
		//Set<String> words = new TreeSet<String>(
			      //new TextFile("src/object/SetOperations.java", "\\W+"));
		HashSet<String> vowel = new HashSet<String>();
		HashSet<String> processedWords = new HashSet<String>(); 
	    int fileVowels =0;
	    int wordVowels = 0 ;
	    for(String word: new FileRread("src/object/UniqueWords.java","\\W+"))
	    {
	    	
	    	for(char letter: word.toCharArray())
	    	{
	    		if(vowels.contains(letter)) fileVowels++;
	    		if(!vowel.contains(letter))
	    		{
	    			vowel.add(word);
	    			System.out.print("word = " + word + "letter = " + letter);
	    		}
	    		System.out.println();
	    		wordVowels++;
	    	}
	    	
	    	
	    }
	    System.out.println("wordVowels = " + wordVowels);
	}
}
