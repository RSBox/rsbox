public class class84 extends class280 {
	static class104 field567;
	int field566;
	int field568;

	public class84(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field568 = 0;
		this.field566 = 0;
		this.field568 = var1;
		this.field566 = var2;
	}

	public int method402() {
		double var2 = this.method1474();
		return (int)Math.round((double)this.field568 + var2 * (double)(this.field566 - this.field568));
	}
}
