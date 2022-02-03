public class ConcreteStrategyBubble implements Strategy {
	
	public void execute(int[] a) {
		System.out.println("started method 'Bubble'");
		int ln = a.length;
		if (ln > 1) {
			int at;
			int f;
			int lx;
			int lxt = ln - 1;
			for (int j = 0; j < ln; j++) {
				f = 0;
				lx = lxt;
				for (int i = 0; i < lx; i++) {
					if (a[i] > a[i + 1]) {
						at = a[i + 1];
						a[i + 1] = a[i];
						a[i] = at;
						lxt = i + 1;
						f = 1;
					}
				}
				if (f == 0) break;
			}
		}
	}
}