package object.source;

import object.*;

public class Source extends Detergent {

	public void scrub()
	{
		append(" newdetergent.source.srucb.");
		
	}
	public static void main(String args[])
	{
		
		Source source = new Source();
		source.scrub();
		System.out.println(source);
	}
}
