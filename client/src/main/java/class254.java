public class class254 {
	static class198 field1725;
	static class5 field1724;
	static int field1723;
	static int[] field1726;

	static {
		new Object();
		field1726 = new int[33];
		field1726[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field1726[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public static int method1214(int var0, int var1) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var3 * var0;
		} else {
			return var3;
		}
	}

	public static int method1218(int var0, int var1) {
		if (var1 > 22050) {
			boolean var3 = true;
			var0 = var1;
			var1 = 22050;
		}

		while (var1 != 0) {
			int var4 = var0 % var1;
			var0 = var1;
			var1 = var4;
		}

		return var0;
	}

	public static int method1210(int var0) {
		return field1726[var0];
	}

	public static int method1216(int var0) {
		var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static int method1211(int var0, int var1, int var2) {
		int var4 = method1210(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static int method1217(int var0, int var1, int var2) {
		int var4 = method1210(1 + (var2 - var1));
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	public static int method1215(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	public static int method1212(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var0 + var2;
	}

	public static int method1213(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}
}
