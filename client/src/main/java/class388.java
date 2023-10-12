public class class388 {
	int field2658;
	int field2659;
	int[][] field2660;

	public class388(int var1, int var2) {
		if (var1 != var2) {
			int var3 = class254.method1218(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.field2658 = var1;
			this.field2659 = var2;
			this.field2660 = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.field2660[var4];
				double var6 = 6.0D + (double)var4 / (double)var1;
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = 3.141592653589793D * ((double)var8 - var6);
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	}

	byte[] method1823(byte[] var1) {
		if (null != this.field2660) {
			int var3 = (int)((long)var1.length * (long)this.field2659 / (long)this.field2658) + 14;
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field2660[var6];

				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var5 + var10] += var8 * var9[var10];
				}

				var6 += this.field2659;
				var10 = var6 / this.field2658;
				var5 += var10;
				var6 -= this.field2658 * var10;
			}

			var1 = new byte[var3];

			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = 32768 + var4[var7] >> 16;
				if (var11 < -128) {
					var1[var7] = -128;
				} else if (var11 > 127) {
					var1[var7] = 127;
				} else {
					var1[var7] = (byte)var11;
				}
			}
		}

		return var1;
	}

	int method1824(int var1) {
		if (null != this.field2660) {
			var1 = (int)((long)this.field2659 * (long)var1 / (long)this.field2658);
		}

		return var1;
	}

	int method1826(int var1) {
		if (null != this.field2660) {
			var1 = (int)((long)this.field2659 * (long)var1 / (long)this.field2658) + 6;
		}

		return var1;
	}

	public static void method1825(class5 var0) {
		class35.field177 = var0;
	}
}
