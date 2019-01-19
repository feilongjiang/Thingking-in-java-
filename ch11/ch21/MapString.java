package ch21;
import java.util.*;
import java.io.*;
public class MapString {
	public static void main(String[] args)
	{
		
	}
}

class FileRead extends ArrayList<String>{
	public FileRead(String file,String split) {
		super(Arrays.asList(read(file).split(split))); }
	public static String read(String file)
	{		
		StringBuilder sb = new StringBuilder();
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
		}finally{
			
		}
		
		return sb.toString();
	}
}