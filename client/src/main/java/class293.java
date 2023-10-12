public class class293 extends class292 {
	static class352 field2182;
	static class5 field2181;
	public int[][] field2180;
	public Object[][] field2179;

	static {
		field2182 = new class352(64);
	}

	class293() {
	}

	void method1520(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method1518(var1, var3);
		}
	}

	void method1518(Buffer var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.readUnsignedByte();
			if (this.field2180 == null) {
				this.field2180 = new int[var4][];
			}

			for (int var5 = var1.readUnsignedByte(); var5 != 255; var5 = var1.readUnsignedByte()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.readUnsignedByte()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method2522();
				}

				this.field2180[var6] = var8;
				if (var7) {
					if (null == this.field2179) {
						this.field2179 = new Object[this.field2180.length][];
					}

					this.field2179[var6] = class451.method2113(var1, var8);
				}
			}
		}

	}

	void method1519() {
	}

	public static void method1521(class5 var0) {
		field2181 = var0;
	}

	public static class293 method1522(int var0) {
		class293 var2 = (class293)field2182.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2181.method39(39, var0);
			var2 = new class293();
			if (var3 != null) {
				var2.method1520(new Buffer(var3));
			}

			var2.method1519();
			field2182.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method1523() {
		field2182.method1679();
	}
}
