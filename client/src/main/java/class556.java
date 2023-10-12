public class class556 {
	public static void method2643(String[] var0, short[] var1) {
		method2641(var0, var1, 0, var0.length - 1);
	}

	static void method2641(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					short var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2641(var0, var1, var2, var6 - 1);
			method2641(var0, var1, var6 + 1, var3);
		}

	}

	public static void method2642(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var7 + (var10 & var9)) {
					int var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					int var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2642(var0, var1, var2, var6 - 1);
			method2642(var0, var1, var6 + 1, var3);
		}

	}
}
