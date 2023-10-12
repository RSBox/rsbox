public class class313 extends class292 {
	static class42 field2271;
	public final int field2270;
	public final int field2274;
	public final int[] field2272;
	public final int[] field2273;

	class313(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field2274 = var1;
		this.field2270 = var2;
		this.field2272 = var3;
		this.field2273 = var4;
	}

	public boolean method1570(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field2273.length) {
			int var4 = this.field2273[var2];
			if (var1 >= var4 && var1 <= var4 + this.field2272[var2]) {
				return true;
			}
		}

		return false;
	}
}
