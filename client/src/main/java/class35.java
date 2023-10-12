public class class35 extends class292 {
	public static class78 field176;
	static class352 field174;
	static class5 field177;
	public int field175;

	static {
		field174 = new class352(64);
	}

	class35() {
		this.field175 = 0;
	}

	void method103(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method102(var1, var3);
		}
	}

	void method102(Buffer var1, int var2) {
		if (var2 == 2) {
			this.field175 = var1.readUnsignedShort();
		}

	}

	public static class35 method105(int var0) {
		class35 var2 = (class35)field174.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field177.method39(5, var0);
			var2 = new class35();
			if (null != var3) {
				var2.method103(new Buffer(var3));
			}

			field174.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method106() {
		field174.method1679();
	}

	public static class230[] method104(class5 var0, String var1, String var2) {
		if (!var0.method33(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method28(var1);
			int var5 = var0.method17(var4, var2);
			class230[] var6;
			if (!class168.method887(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = class168.method891();
			}

			return var6;
		}
	}
}
