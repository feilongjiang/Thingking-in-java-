package ch28;
import java.util.Random;
import java.util.PriorityQueue;
public class PriorityQueue1 {
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		PriorityQueue<Double> dou = new PriorityQueue<Double>();
		for(double i =0.; i < 10.; i++)
			dou.offer(rand.nextDouble()*100000);
		while(dou.peek()!=null)
			System.out.print(dou.poll() + " ");
		display(dou);
		System.out.println();
		System.out.println(dou);
	}

}
