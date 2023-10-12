public class class119 {
	public static int[] field785;
	public static int[] field786;
	static class183 field787;
	static int[] field784;

	static {
		field784 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field784[var1] = var0 - 1;
			var0 += var0;
		}

		field785 = new int[5000];
		field786 = new int[5000];
	}

	public static int method580(int var0) {
		class320 var2 = class320.method1582(var0);
		int var3 = var2.field2331;
		int var4 = var2.field2328;
		int var5 = var2.field2329;
		int var6 = field784[var5 - var4];
		return field786[var3] >> var4 & var6;
	}

	public static void method581(int var0, int var1) {
		class320 var3 = class320.method1582(var0);
		int var4 = var3.field2331;
		int var5 = var3.field2328;
		int var6 = var3.field2329;
		int var7 = field784[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		field786[var4] = field786[var4] & ~var7 | var1 << var5 & var7;
	}
}
