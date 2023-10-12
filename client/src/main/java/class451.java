public class class451 {
	static final int field2986;
	static final int field2987;

	static {
		field2987 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field2986 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	public static int method2112(int var0) {
		return var0 >>> 4 & field2986;
	}

	public static int method2111(int var0) {
		return (var0 & field2987) - 1;
	}

	static Object[] method2113(Buffer var0, int[] var1) {
		int var3 = var0.method2522();
		Object[] var4 = new Object[var1.length * var3];

		for (int var5 = 0; var5 < var3; ++var5) {
			for (int var6 = 0; var6 < var1.length; ++var6) {
				int var7 = var6 + var1.length * var5;
				class499 var8 = class419.method1920(var1[var6]);
				var4[var7] = var8.method2360(var0);
			}
		}

		return var4;
	}
}
