public class class241 extends class292 {
	static class230 field1619;
	static class352 field1615;
	static class5 field1618;
	static int field1617;
	public boolean field1616;

	static {
		field1615 = new class352(64);
	}

	class241() {
		this.field1616 = false;
	}

	void method1117(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method1118(var1, var3);
		}
	}

	void method1118(Buffer var1, int var2) {
		if (var2 == 2) {
			this.field1616 = true;
		}

	}

	public static void method1120(class5 var0) {
		field1618 = var0;
	}

	public static class241 method1119(int var0) {
		class241 var2 = (class241)field1615.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1618.method39(19, var0);
			var2 = new class241();
			if (null != var3) {
				var2.method1117(new Buffer(var3));
			}

			field1615.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method1121() {
		field1615.method1679();
	}
}
