package object;

class Cleanser{
	private String s = "Cleanser";//为了继承一般的潜规则时将所有的数据成员都指定为private,所有的方法都指定为public
	public void append(String a){s += a;}  // "+=" 将几个String对象连接成s
	public void dilute(){ append(" dilute() ");}
	public void apply() { append(" apply() ");}
	public void scrub() {append(" scrub()");}
	public String toString(){return s;}
	public static void main(String[] args) //可以在每个类中都创建一个main()方法,这种在
	                                       //每个类中都设置一个main()方法的技术可使每个类的单元测试变得简单易行
	                                       //而且在测试结束后也无需删除main(),可以将其留待下次测试
	{
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser{  //extends 继承关键字
	//change a method
	public void scrub() //可以从新定义基类的scrub()方法
	{
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version 在scrub里调用scrub会产生递归,
		               //加super关键词表示超类的意思,当前类是从超类继承来的
	}
    // Add methods to the interface;
    public void foam() {append(" foam()");}
    //Test the new class
    public static void main(String args[])  //只有命令行调用的类的main()才会被使用,比如 java Cleanser test;
    {
    	Detergent x = new Detergent();
    	x.dilute();
    	x.apply();
    	x.scrub();
    	x.foam();
    	System.out.println(x);
    	System.out.println("testing base class");
    	Cleanser.main(args);
    	
    }
}
/* output:
Cleanser dilute()  apply()  Detergent.scrub() scrub() foam()
testing base class
Cleanser dilute()  apply()  scrub()
*///~











