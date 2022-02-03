import java.util.Random;
import java.util.Date;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		final int asize = 13;
		Random random = new Random();
		int[] a = new int[asize];
		for (int i = 0; i < asize; i++) {
			a[i] = random.nextInt(asize);
		}
		
		Context context = new Context();
		//context.setStrategy(new ConcreteStrategyBubble());
		context.setStrategy(new ConcreteStrategyQuick());
		
		System.out.println("before sort " + Arrays.toString(a));
		long stm = new Date().getTime();
		context.executeStrategy(a);
		long etm = new Date().getTime();
		System.out.println("after sort " + Arrays.toString(a));
		System.out.println("time spent: " + (etm - stm) + " milliseconds");
	}
  
}