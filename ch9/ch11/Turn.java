//: һ���򵥵�StringBuilderӦ��
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
		StringBuilder sb = new StringBuilder(s); //����һ����ʼ��Ϊָ���ַ������ݵ��ַ���������,
		                                         //�������޸��ַ���ʱ,���������ַ���,��ԭ�ַ�����ɾ��������
		for(int i = 0; i < sb.length()-1; i += 2)
		{
			char c1 = sb.charAt(i);  //����sb�ַ����ĵ�i���±���ַ�,��������Ϊchar
			char c2 = sb.charAt(i+1);
			sb.setCharAt(i, c2);     //��sb�ַ����ĵ�i���±���ַ�����Ϊc2��ֵ
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
