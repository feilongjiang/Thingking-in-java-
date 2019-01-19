package ch22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Count {
	public static void main(String[] args)
	{
		updateStat<>
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s: new FileRread("src/ch21/SetOperations.java","\\W+")){
			Integer freq = map.get(s);
			map.put(s,freq==null?1:freq+1);
		}
		System.out.println(map);
		Set<String> set = new HashSet<String>(map.keySet());
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Object s = it.next();
			System.out.print(s+ "apeare " + map.get(s) + " ");
		}
		
	}
}
class FileRread extends ArrayList<String> {
	public FileRread(String file, String pattern) {
		super(Arrays.asList(read(file).split(pattern)));
		if (get(0).equals(""))
			remove(0);
	}

	public FileRread(String file) {
		this(file, "\n");
	}

	public static String read(String file) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			try {
				while ((s = br.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				br.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
}