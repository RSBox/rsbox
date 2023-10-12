public class class105 {
	public static class255 field668;
	public static int[] field670;
	public static int[] field671;
	public static int[] field672;
	static class53 field674;
	static int[] field669;
	static int[] field673;
	static final class53 field667;
	static final class53 field675;

	static {
		field672 = new int[65536];
		field669 = new int[512];
		field673 = new int[2048];
		field670 = new int[2048];
		field671 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field669[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field673[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field670[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field671[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field668 = new class255();
		field667 = new class270(field668);
		field675 = new class466(field668);
		field674 = field667;
	}

	public static void method473(boolean var0) {
		if (var0 && class433.field2897 != null) {
			field674 = field675;
		} else {
			field674 = field667;
		}

	}

	public static void method474(class543 var0) {
		field668.field1730 = var0;
	}

	public static void method472(double var0) {
		method475(var0, 0, 512);
	}

	static void method475(double var0, int var2, int var3) {
		int var4 = 0;

		for (int var5 = 0; var5 < 512; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (var8 + 1.0D);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = var11 * 2.0D - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (var6 * 6.0D < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (var6 * 2.0D < 1.0D) {
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (var27 * 6.0D < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (var27 * 2.0D < 1.0D) {
						var17 = var19;
					} else if (var27 * 3.0D < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var30 = (int)(var17 * 256.0D);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = method476(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field672[var4++] = var22;
			}
		}

	}

	static int method476(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	static int method495() {
		return field668.field1738;
	}

	static int method494() {
		return field668.field1733;
	}

	static int method478() {
		return field668.field1736;
	}

	static int method479() {
		return field668.field1740;
	}

	static int method480() {
		return field668.field1739;
	}

	static int method481() {
		return field668.field1734;
	}

	public static int method482() {
		return field668.field1727;
	}

	static int method496() {
		return field668.field1732;
	}

	public static void method483(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field674 == field675) {
			field674 = field667;
		}

		field674.method216(var0, var1, var2, var3);
	}

	public static void method488() {
		method485(class433.field2900, class433.field2899, class433.field2901, class433.field2895);
	}

	static void method485(int var0, int var1, int var2, int var3) {
		field668.field1732 = var2 - var0;
		field668.field1735 = var3 - var1;
		method486();
		if (field668.field1737.length < field668.field1735) {
			field668.field1737 = new int[class254.method1215(field668.field1735)];
		}

		int var4 = var1 * class433.field2894 + var0;

		for (int var5 = 0; var5 < field668.field1735; ++var5) {
			field668.field1737[var5] = var4;
			var4 += class433.field2894;
		}

	}

	public static void method486() {
		field668.method1220();
	}

	public static void method487(int var0, int var1) {
		int var2 = field668.field1737[0];
		int var3 = var2 / class433.field2894;
		int var4 = var2 - var3 * class433.field2894;
		field668.method1219(var0, var4, var1, var3);
	}

	public static void method492(int var0, int var1, int var2) {
		field668.method1221(var0, var1, var2);
	}

	static void method489(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field674.method214(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	public static void method493(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field674.method217(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	static void method490(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field674.method218(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method484(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field674.method219(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method491(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field674.method220(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	static void method477(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field674.method215(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
