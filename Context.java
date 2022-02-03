public class Context {
	private Strategy strategy;
	
	Context() {}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategy(int[] a) {
		strategy.execute(a);
	}
}