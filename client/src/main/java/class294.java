public class class294 {
	final int field2184;
	final int field2185;
	final String field2183;

	class294(int var1, int var2, String var3) {
		this.field2184 = var1;
		this.field2185 = var2;
		this.field2183 = var3;
	}

	class294(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringOrNull());
	}

	String method1524() {
		return Integer.toHexString(this.field2184) + Integer.toHexString(this.field2185) + this.field2183;
	}

	int method1525() {
		return this.field2185;
	}
}
