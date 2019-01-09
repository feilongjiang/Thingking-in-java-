package object;
class Content{
	public class Inner{
		public String toString() { return "I am Inner";}
	}
}
public class Outer {
	public static void main(String[] args)
	{
		Content ct = new Content();
		Content.Inner ci = ct.new Inner();
		System.out.println(ci);
	}
}
