public class class320 extends class292 {
	public static class5 field2332;
	static class352 field2327;
	static final int[] field2330;
	public int field2328;
	public int field2329;
	public int field2331;

	static {
		field2327 = new class352(64);
		field2330 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2330[var1] = var0 - 1;
			var0 += var0;
		}

	}

	class320() {
	}

	void method1580(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method1581(var1, var3);
		}
	}

	void method1581(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field2331 = var1.readUnsignedShort();
			this.field2328 = var1.readUnsignedByte();
			this.field2329 = var1.readUnsignedByte();
		}

	}

	public static class320 method1582(int var0) {
		class320 var2 = (class320)field2327.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2332.method39(14, var0);
			var2 = new class320();
			if (null != var3) {
				var2.method1580(new Buffer(var3));
			}

			field2327.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method1583() {
		field2327.method1679();
	}
}
