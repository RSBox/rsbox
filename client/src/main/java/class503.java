public class class503 {
	public static int field3699;
	public static long[] field3700;
	static boolean field3695;
	static boolean field3701;
	static int field3692;
	static int field3693;
	static int field3694;
	static int field3696;
	static int field3697;
	static int field3698;

	static {
		field3701 = false;
		field3693 = 0;
		field3694 = 0;
		field3695 = false;
		field3699 = 0;
		field3700 = new long[1000];
	}

	static boolean method2380(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	public static boolean method2385(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}

	public static int method2375(int var0) {
		long var3 = field3700[var0];
		int var2 = (int)(var3 >>> 0 & 127L);
		return var2;
	}

	public static int method2379(int var0) {
		long var3 = field3700[var0];
		int var2 = (int)(var3 >>> 7 & 127L);
		return var2;
	}

	public static int method2374(int var0) {
		return method2376(field3700[var0]);
	}

	public static int method2376(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	public static long method2386(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	public static final void method2372(int var0, int var1) {
		field3693 = var0;
		field3694 = var1;
		field3701 = true;
		field3699 = 0;
		field3695 = false;
	}

	public static final void method2381() {
		field3701 = false;
		field3699 = 0;
	}

	static final void method2378(long var0) {
		field3700[++field3699 - 1] = var0;
	}

	static final boolean method2384() {
		return field3701;
	}

	static final int method2373() {
		return field3693;
	}

	static final int method2383() {
		return field3694;
	}

	static final void method2382() {
		if (!field3695) {
			int var1 = class142.field986;
			int var2 = class142.field981;
			int var3 = class142.field964;
			int var4 = class142.field948;
			boolean var5 = true;
			boolean var6 = true;
			int var7 = (field3693 - class105.method495()) * 50 / class105.method482();
			int var8 = (field3694 - class105.method494()) * 50 / class105.method482();
			int var9 = (field3693 - class105.method495()) * 3500 / class105.method482();
			int var10 = (field3694 - class105.method494()) * 3500 / class105.method482();
			int var11 = class79.method389(var8, 50, var2, var1);
			int var14 = class79.method393(var8, 50, var2, var1);
			var8 = var11;
			var11 = class79.method389(var10, 3500, var2, var1);
			int var15 = class79.method393(var10, 3500, var2, var1);
			var10 = var11;
			var11 = class79.method391(var7, var14, var4, var3);
			int var12 = var7 * var3 + var14 * var4 >> 16;
			var7 = var11;
			var11 = class79.method391(var9, var15, var4, var3);
			int var13 = var4 * var15 + var9 * var3 >> 16;
			field3697 = (var7 + var11) / 2;
			field3696 = (var10 + var8) / 2;
			class337.field2385 = (var13 + var12) / 2;
			class176.field1223 = (var11 - var7) / 2;
			field3692 = (var10 - var8) / 2;
			field3698 = (var13 - var12) / 2;
			class179.field1230 = Math.abs(class176.field1223);
			class473.field3315 = Math.abs(field3692);
			class15.field82 = Math.abs(field3698);
		}
	}

	static final boolean method2371(class490 var0, int var1, int var2, int var3, int var4) {
		if (!method2384()) {
			return false;
		} else {
			method2382();
			class365 var6 = (class365)var0.field3460.get(var1);
			int var7 = var6.field2529 + var2;
			int var8 = var6.field2534 + var3;
			int var9 = var4 + var6.field2528;
			int var10 = var6.field2530;
			int var11 = var6.field2531;
			int var12 = var6.field2532;
			int var13 = field3697 - var7;
			int var14 = field3696 - var8;
			int var15 = class337.field2385 - var9;
			if (Math.abs(var13) > class179.field1230 + var10) {
				return false;
			} else if (Math.abs(var14) > class473.field3315 + var11) {
				return false;
			} else if (Math.abs(var15) > var12 + class15.field82) {
				return false;
			} else if (Math.abs(field3692 * var15 - field3698 * var14) > class473.field3315 * var12 + var11 * class15.field82) {
				return false;
			} else if (Math.abs(var13 * field3698 - var15 * class176.field1223) > class179.field1230 * var12 + class15.field82 * var10) {
				return false;
			} else {
				return Math.abs(var14 * class176.field1223 - field3692 * var13) <= class473.field3315 * var10 + var11 * class179.field1230;
			}
		}
	}

	static final boolean method2377(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = field3694 + var6;
		if (var8 < var0 && var8 < var1 && var8 < var2) {
			return false;
		} else {
			var8 = field3694 - var6;
			if (var8 > var0 && var8 > var1 && var8 > var2) {
				return false;
			} else {
				var8 = field3693 + var6;
				if (var8 < var3 && var8 < var4 && var8 < var5) {
					return false;
				} else {
					var8 = field3693 - var6;
					return var8 <= var3 || var8 <= var4 || var8 <= var5;
				}
			}
		}
	}
}
