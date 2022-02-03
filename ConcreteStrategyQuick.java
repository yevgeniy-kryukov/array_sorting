public class ConcreteStrategyQuick implements Strategy {
	
	public void execute(int[] a) {
		System.out.println("started method 'Quick'");
		int ln = a.length;
		if (ln > 1) qSort(a, 0, ln - 1);
	}
	
	private void qSort(int[] a, int p_min_ix, int p_max_ix) {
		int min_ix = p_min_ix;
		int max_ix = p_max_ix;
		int med = a[(p_min_ix + p_max_ix) / 2];
		int tmp;
		
		do {
			while (a[min_ix] < med) min_ix++;
			while (a[max_ix] > med) max_ix--;
			
			if (min_ix <= max_ix) {
				tmp = a[min_ix];
				a[min_ix] = a[max_ix];
				a[max_ix] = tmp;
				min_ix++;
				max_ix--;
			}
			
		} while (min_ix <= max_ix);
		
		if (p_min_ix < max_ix) qSort(a, p_min_ix, max_ix);
		if (min_ix < p_max_ix) qSort(a, min_ix, p_max_ix);
		
	}
}