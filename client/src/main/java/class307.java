public class class307 extends class359 {
	static class363 field2233;
	class97 field2231;
	int field2229;
	int field2232;
	int[] field2230;
	int[][] field2228;

	public class307(int var1, byte[] var2) {
		this.field2229 = var1;
		Buffer var3 = new Buffer(var2);
		this.field2232 = var3.readUnsignedByte();
		this.field2230 = new int[this.field2232];
		this.field2228 = new int[this.field2232][];

		int var4;
		for (var4 = 0; var4 < this.field2232; ++var4) {
			this.field2230[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.field2232; ++var4) {
			this.field2228[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.field2232; ++var4) {
			for (int var5 = 0; var5 < this.field2228[var4].length; ++var5) {
				this.field2228[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.data.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2231 = new class97(var3, var4);
			}
		}

	}

	public int method1564() {
		return this.field2232;
	}

	public class97 method1565() {
		return this.field2231;
	}
}
