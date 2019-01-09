//: 一个简单的StringBuilder应用
package interfaces.interfaceprocessor;
import interfaces.filters.*;
public class Turn implements Processor{
	Filter filter ;
	public Turn(Filter ob)
	{
		this.filter = ob;
	}
	public  String name(){return Turn.class.getSimpleName();}
	public String process(Object ob)
	{
		return turn((String)ob);
	}
	public String turn(String s)
	{
		StringBuilder sb = new StringBuilder(s); //构造一个初始化为指定字符串内容的字符串构建器,
		                                         //该容器修改字符串时,不创建新字符串,在原字符串上删除和增加
		for(int i = 0; i < sb.length()-1; i += 2)
		{
			char c1 = sb.charAt(i);  //返回sb字符串的第i个下标的字符,返回类型为char
			char c2 = sb.charAt(i+1);
			sb.setCharAt(i, c2);     //将sb字符串的第i个下标的字符设置为c2的值
			sb.setCharAt(i+1, c1);
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		
		Apply.process(new Turn(new Filter()), "asdf dasf");
		
	}
}/* output:
owdaefd asafs
*///:~
