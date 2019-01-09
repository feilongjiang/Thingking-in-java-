package ch8_16;

class Ship{
	public void use(){}
}
class Attackship extends Ship{
	public void use(){System.out.println("attack");}  //通过继承得到两个不同的类,表达了act()方法的差异
}
class AlertStatus extends Ship{
	public void use(){System.out.println("Alertstaus");}
}

public class Starship {
	Ship ship = new Attackship();
	public void change(){ship = new AlertStatus();}
	public void show(){ship.use();}
	public static void main(String[] args)
	{
		Starship ss = new Starship();
		ss.show();
		ss.change();
		ss.show();
	}
}
