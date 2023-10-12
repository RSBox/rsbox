public final class class534 {
	int field4154;
	int field4156;
	int field4157;
	int field4158;
	int[] field4153;
	int[] field4155;

	public class534(int[] var1) {
		this.field4155 = new int[256];
		this.field4153 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field4153[var2] = var1[var2];
		}

		this.method2554();
	}

	public final int method2552() {
		if (this.field4157 == 0) {
			this.method2553();
			this.field4157 = 256;
		}

		return this.field4153[--this.field4157];
	}

	public final int method2555() {
		if (this.field4157 == 0) {
			this.method2553();
			this.field4157 = 256;
		}

		return this.field4153[this.field4157 - 1];
	}

	final void method2553() {
		this.field4158 += ++this.field4154;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field4155[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					this.field4156 ^= this.field4156 << 13;
				} else {
					this.field4156 ^= this.field4156 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field4156 ^= this.field4156 << 2;
			} else {
				this.field4156 ^= this.field4156 >>> 16;
			}

			this.field4156 += this.field4155[var2 + 128 & 255];
			int var4;
			this.field4155[var2] = var4 = this.field4155[(var3 & 1020) >> 2] + this.field4156 + this.field4158;
			this.field4153[var2] = this.field4158 = this.field4155[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	final void method2554() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		int var2;
		for (var2 = 0; var2 < 4; ++var2) {
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field4153[var2];
			var4 += this.field4153[var2 + 1];
			var5 += this.field4153[var2 + 2];
			var6 += this.field4153[var2 + 3];
			var7 += this.field4153[var2 + 4];
			var8 += this.field4153[var2 + 5];
			var9 += this.field4153[var2 + 6];
			var10 += this.field4153[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field4155[var2] = var3;
			this.field4155[var2 + 1] = var4;
			this.field4155[var2 + 2] = var5;
			this.field4155[var2 + 3] = var6;
			this.field4155[var2 + 4] = var7;
			this.field4155[var2 + 5] = var8;
			this.field4155[var2 + 6] = var9;
			this.field4155[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field4155[var2];
			var4 += this.field4155[var2 + 1];
			var5 += this.field4155[var2 + 2];
			var6 += this.field4155[var2 + 3];
			var7 += this.field4155[var2 + 4];
			var8 += this.field4155[var2 + 5];
			var9 += this.field4155[var2 + 6];
			var10 += this.field4155[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field4155[var2] = var3;
			this.field4155[var2 + 1] = var4;
			this.field4155[var2 + 2] = var5;
			this.field4155[var2 + 3] = var6;
			this.field4155[var2 + 4] = var7;
			this.field4155[var2 + 5] = var8;
			this.field4155[var2 + 6] = var9;
			this.field4155[var2 + 7] = var10;
		}

		this.method2553();
		this.field4157 = 256;
	}
}
