public class class303 {
	static final byte[] field2219;
	Buffer field2213;
	int field2218;
	int field2220;
	int[] field2214;
	int[] field2215;
	int[] field2216;
	int[] field2217;
	long field2221;

	static {
		field2219 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	class303() {
		this.field2213 = new Buffer((byte[])null);
	}

	void method1539(byte[] var1) {
		this.field2213.data = var1;
		this.field2213.offset = 10;
		int var2 = this.field2213.readUnsignedShort();
		this.field2220 = this.field2213.readUnsignedShort();
		this.field2218 = 500000;
		this.field2215 = new int[var2];

		Buffer var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.offset += var5) {
			int var4 = this.field2213.readInt();
			var5 = this.field2213.readInt();
			if (var4 == 1297379947) {
				this.field2215[var3] = this.field2213.offset;
				++var3;
			}

			var10000 = this.field2213;
		}

		this.field2221 = 0L;
		this.field2216 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field2216[var3] = this.field2215[var3];
		}

		this.field2217 = new int[var2];
		this.field2214 = new int[var2];
	}

	void method1540() {
		this.field2213.data = null;
		this.field2215 = null;
		this.field2216 = null;
		this.field2217 = null;
		this.field2214 = null;
	}

	boolean method1553() {
		return this.field2213.data != null;
	}

	int method1550() {
		return this.field2216.length;
	}

	void method1541(int var1) {
		this.field2213.offset = this.field2216[var1];
	}

	void method1542(int var1) {
		this.field2216[var1] = this.field2213.offset;
	}

	void method1552() {
		this.field2213.offset = -1;
	}

	void method1544(int var1) {
		int var2 = this.field2213.method2521();
		int[] var10000 = this.field2217;
		var10000[var1] += var2;
	}

	int method1545(int var1) {
		int var2 = this.method1546(var1);
		return var2;
	}

	int method1546(int var1) {
		byte var2 = this.field2213.data[this.field2213.offset];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field2214[var1] = var5;
			++this.field2213.offset;
		} else {
			var5 = this.field2214[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method1547(var1, var5);
		} else {
			int var3 = this.field2213.method2521();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field2213.data[this.field2213.offset] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field2213.offset;
					this.field2214[var1] = var4;
					return this.method1547(var1, var4);
				}
			}

			Buffer var10000 = this.field2213;
			var10000.offset += var3;
			return 0;
		}
	}

	int method1547(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field2213.readUnsignedByte();
			var4 = this.field2213.method2521();
			Buffer var10000;
			if (var7 == 47) {
				var10000 = this.field2213;
				var10000.offset += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field2213.readUnsignedMedium();
				var4 -= 3;
				int var6 = this.field2217[var1];
				this.field2221 += (long)var6 * (long)(this.field2218 - var5);
				this.field2218 = var5;
				var10000 = this.field2213;
				var10000.offset += var4;
				return 2;
			} else {
				var10000 = this.field2213;
				var10000.offset += var4;
				return 3;
			}
		} else {
			byte var3 = field2219[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field2213.readUnsignedByte() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field2213.readUnsignedByte() << 16;
			}

			return var4;
		}
	}

	long method1551(int var1) {
		return this.field2221 + (long)var1 * (long)this.field2218;
	}

	int method1543() {
		int var1 = this.field2216.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field2216[var4] >= 0 && this.field2217[var4] < var3) {
				var2 = var4;
				var3 = this.field2217[var4];
			}
		}

		return var2;
	}

	boolean method1548() {
		int var1 = this.field2216.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field2216[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method1549(long var1) {
		this.field2221 = var1;
		int var3 = this.field2216.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field2217[var4] = 0;
			this.field2214[var4] = 0;
			this.field2213.offset = this.field2215[var4];
			this.method1544(var4);
			this.field2216[var4] = this.field2213.offset;
		}

	}
}
