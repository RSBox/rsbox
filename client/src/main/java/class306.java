public class class306 {
	int[] field2227;
	short[] field2226;

	public class306(class73 var1) {
		this.field2227 = new int[8];
		this.field2226 = new short[8];
		int var2 = 0;
		if (var1.method358()) {
			var2 = var1.method359().length;
			System.arraycopy(var1.method359(), 0, this.field2227, 0, var2);
			System.arraycopy(var1.method362(), 0, this.field2226, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field2227[var3] = -1;
			this.field2226[var3] = -1;
		}

	}

	public int[] method1559() {
		return this.field2227;
	}

	public short[] method1560() {
		return this.field2226;
	}

	public void method1561(int var1, int var2, short var3) {
		this.field2227[var1] = var2;
		this.field2226[var1] = var3;
	}

	public void method1562(int[] var1, short[] var2) {
		this.field2227 = var1;
		this.field2226 = var2;
	}

	static final int method1563(int var0, int var1) {
		int var3 = class502.method2368(var0 + 45365, var1 + 91923, 4) - 128 + (class502.method2368(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (class502.method2368(var0, var1, 1) - 128 >> 2);
		var3 = 35 + (int)(0.3D * (double)var3);
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}

		return var3;
	}
}
