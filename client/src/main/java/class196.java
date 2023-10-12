public class class196 extends class292 {
	static class352 field1327;
	static class5 field1330;
	int[][] field1331;
	Object[][] field1328;
	public int field1329;

	static {
		field1327 = new class352(64);
	}

	class196() {
		this.field1329 = -1;
	}

	void method948(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method947(var1, var3);
		}
	}

	public Object[] method949(int var1) {
		return null == this.field1328 ? null : this.field1328[var1];
	}

	void method947(Buffer var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.readUnsignedByte();
			if (null == this.field1328) {
				this.field1328 = new Object[var4][];
				this.field1331 = new int[var4][];
			}

			for (int var5 = var1.readUnsignedByte(); var5 != 255; var5 = var1.readUnsignedByte()) {
				int var6 = var1.readUnsignedByte();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method2522();
				}

				this.field1328[var5] = class451.method2113(var1, var7);
				this.field1331[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field1329 = var1.method2483((byte)-120);
		}

	}

	void method950() {
	}

	public static void method952(class5 var0) {
		field1330 = var0;
	}

	public static class196 method953(int var0) {
		class196 var2 = (class196)field1327.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1330.method39(38, var0);
			var2 = new class196();
			if (var3 != null) {
				var2.method948(new Buffer(var3));
			}

			var2.method950();
			field1327.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method951() {
		field1327.method1679();
	}
}
