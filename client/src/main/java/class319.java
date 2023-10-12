public class class319 extends class292 {
	public static class5 field2326;
	public static int field2324;
	static class352 field2323;
	public int field2325;

	static {
		field2323 = new class352(64);
	}

	class319() {
		this.field2325 = 0;
	}

	void method1577(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method1576(var1, var3);
		}
	}

	void method1576(Buffer var1, int var2) {
		if (var2 == 5) {
			this.field2325 = var1.readUnsignedShort();
		}

	}

	public static class319 method1579(int var0) {
		class319 var2 = (class319)field2323.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2326.method39(16, var0);
			var2 = new class319();
			if (var3 != null) {
				var2.method1577(new Buffer(var3));
			}

			field2323.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method1578() {
		field2323.method1679();
	}
}
