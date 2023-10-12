public class class47 extends class292 {
	static class352 field228;
	static class42 field233;
	static class5 field229;
	boolean field231;
	char field230;
	public int field227;
	public String field232;

	static {
		field228 = new class352(64);
	}

	class47() {
		this.field231 = true;
	}

	void method195() {
	}

	void method194(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method193(var1, var3);
		}
	}

	void method193(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field230 = class88.method412(var1.readByte());
		} else if (var2 == 2) {
			this.field227 = var1.readInt();
		} else if (var2 == 4) {
			this.field231 = false;
		} else if (var2 == 5) {
			this.field232 = var1.readStringOrNull();
		}

	}

	public boolean method192() {
		return this.field230 == 's';
	}

	public static void method198(class5 var0) {
		field229 = var0;
	}

	public static class47 method197(int var0) {
		class47 var2 = (class47)field228.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field229.method39(11, var0);
			var2 = new class47();
			if (var3 != null) {
				var2.method194(new Buffer(var3));
			}

			var2.method195();
			field228.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method196() {
		field228.method1679();
	}
}
