public class class492 extends class292 {
	static class352 field3502;
	static class5 field3504;
	class301 field3503;

	static {
		field3502 = new class352(64);
	}

	class492() {
	}

	void method2292() {
	}

	void method2293(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method2294(var1, var3);
		}
	}

	void method2294(Buffer var1, int var2) {
		if (var2 == 249) {
			this.field3503 = class522.method2453(var1, this.field3503);
		}

	}

	public int method2295(int var1, int var2) {
		return class522.method2452(this.field3503, var1, var2);
	}

	public String method2296(int var1, String var2) {
		return class522.method2451(this.field3503, var1, var2);
	}

	public static class492 method2298(int var0) {
		class492 var2 = (class492)field3502.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field3504.method39(34, var0);
			var2 = new class492();
			if (var3 != null) {
				var2.method2293(new Buffer(var3));
			}

			var2.method2292();
			field3502.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method2297() {
		field3502.method1679();
	}
}
