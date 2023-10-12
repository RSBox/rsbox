public class class482 extends class359 {
	static class375 field3381;
	int[] field3382;
	int[] field3383;

	static {
		field3381 = new class375(32);
	}

	class482() {
		this.field3383 = new int[]{-1};
		this.field3382 = new int[]{0};
	}

	static int method2214(int var0, int var1) {
		class482 var3 = (class482)field3381.get((long)var0);
		if (null == var3) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field3383.length ? var3.field3383[var1] : -1;
		}
	}

	static int method2209(int var0, int var1) {
		class482 var3 = (class482)field3381.get((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field3382.length ? var3.field3382[var1] : 0;
		}
	}

	static int method2212(int var0, int var1) {
		class482 var3 = (class482)field3381.get((long)var0);
		if (null == var3) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field3382.length; ++var5) {
				if (var3.field3383[var5] == var1) {
					var4 += var3.field3382[var5];
				}
			}

			return var4;
		}
	}

	static void method2210(int var0, int var1, int var2, int var3) {
		class482 var5 = (class482)field3381.get((long)var0);
		if (null == var5) {
			var5 = new class482();
			field3381.put(var5, (long)var0);
		}

		if (var5.field3383.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field3383.length; ++var8) {
				var6[var8] = var5.field3383[var8];
				var7[var8] = var5.field3382[var8];
			}

			for (var8 = var5.field3383.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field3383 = var6;
			var5.field3382 = var7;
		}

		var5.field3383[var1] = var2;
		var5.field3382[var1] = var3;
	}

	static void method2211(int var0) {
		class482 var2 = (class482)field3381.get((long)var0);
		if (null != var2) {
			for (int var3 = 0; var3 < var2.field3383.length; ++var3) {
				var2.field3383[var3] = -1;
				var2.field3382[var3] = 0;
			}

		}
	}

	static void method2215(int var0) {
		class482 var2 = (class482)field3381.get((long)var0);
		if (null != var2) {
			var2.method1719();
		}
	}

	static void method2213() {
		field3381 = new class375(32);
	}
}
