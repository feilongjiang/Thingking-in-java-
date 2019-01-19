package ch25;
import java.util.*;
import java.io.*;
public class MapString {
	public static void main(String[] args)
	{
		Map<String,ArrayList<Integer>> map  = new HashMap<String,ArrayList<Integer>>();
		
		int wordcount = 0;
		for(String s: new FileRead("src/ch25/O02201.nc","\\W+"))
		{
			ArrayList<Integer> ai = map.get(s);
			if(ai == null)
			{
				ai = new ArrayList<Integer>();
				map.put(s, ai);
			}
			ai.add(++wordcount);	
		}
		System.out.println(map);
		Map<Integer,String> word = new TreeMap<Integer,String>();
	    for(Map.Entry<String, ArrayList<Integer>> entry: map.entrySet())
	    {
	    	for(Integer pos: entry.getValue())
	    	{
	    		word.put(pos,entry.getKey());
	    	}
	    }
	    word.forEach((k,v)-> System.out.println(k+ " " + v));;
	}
}

class FileRead extends ArrayList<String>{
	public FileRead(String file,String split) {
		super(Arrays.asList(read(file).split(split))); 
		if(get(0).equals("")) remove(get(0));
		}
	public static String read(String file)
	{		
		StringBuilder sb = new StringBuilder();
		try{
			BufferedReader br = new BufferedReader(
					new FileReader( new File(file).getAbsoluteFile()));
			try{
				String s;
				while((s = br.readLine()) != null)
				{
					sb.append(s);
				}
			}finally{
				br.close();
			}
		}catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		
		
		return sb.toString();
	}
}