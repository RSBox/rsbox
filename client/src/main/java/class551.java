public abstract class class551 extends class359 {
	static int field4305;

	class551() {
	}

	abstract void method2632(Buffer var1);

	abstract void method2633(class398 var1);

	public static void method2634(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (null == var7 || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2634(var0, var1, var2, var6 - 1);
			method2634(var0, var1, var6 + 1, var3);
		}

	}
}
