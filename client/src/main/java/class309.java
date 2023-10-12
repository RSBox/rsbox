public class class309 extends class185 {
	int field2236;
	int field2237;
	int field2238;
	int field2239;
	int field2240;
	int field2241;

	public class309(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field2236 = 0;
		this.field2237 = 0;
		this.field2238 = 0;
		this.field2239 = 0;
		this.field2240 = 0;
		this.field2241 = 0;
		this.field2236 = var1;
		this.field2237 = var2;
		this.field2238 = var3;
		this.field2239 = var4;
		this.field2240 = var5;
		this.field2241 = var6;
	}

	@Override
	public int method932() {
		double var2 = this.method1474();
		return (int)Math.round(var2 * (double)(this.field2239 - this.field2236) + (double)this.field2236);
	}

	@Override
	public int method934() {
		double var2 = this.method1474();
		return (int)Math.round((double)this.field2237 + var2 * (double)(this.field2240 - this.field2237));
	}

	@Override
	public int method933() {
		double var2 = this.method1474();
		return (int)Math.round((double)this.field2238 + (double)(this.field2241 - this.field2238) * var2);
	}
}
