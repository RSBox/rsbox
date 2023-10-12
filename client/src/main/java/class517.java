public class class517 {
	static float field4084;
	static float[][] field4082;
	static int field4085;
	static int[][] field4083;
	int[] field4079;
	int[] field4086;
	int[][][] field4080;
	int[][][] field4081;

	static {
		field4082 = new float[2][8];
		field4083 = new int[2][8];
	}

	class517() {
		this.field4086 = new int[2];
		this.field4081 = new int[2][2][4];
		this.field4080 = new int[2][2][4];
		this.field4079 = new int[2];
	}

	float method2434(int var1, int var2, float var3) {
		float var4 = (float)this.field4080[var1][0][var2] + var3 * (float)(this.field4080[var1][1][var2] - this.field4080[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	float method2431(int var1, int var2, float var3) {
		float var4 = (float)this.field4081[var1][0][var2] + var3 * (float)(this.field4081[var1][1][var2] - this.field4081[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method2435(var4);
	}

	int method2432(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field4079[0] + (float)(this.field4079[1] - this.field4079[0]) * var2;
			var3 *= 0.0030517578F;
			field4084 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field4085 = (int)(field4084 * 65536.0F);
		}

		if (this.field4086[var1] == 0) {
			return 0;
		} else {
			var3 = this.method2434(var1, 0, var2);
			field4082[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method2431(var1, 0, var2));
			field4082[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field4086[var1]; ++var4) {
				var3 = this.method2434(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method2431(var1, var4, var2));
				float var6 = var3 * var3;
				field4082[var1][var4 * 2 + 1] = field4082[var1][var4 * 2 - 1] * var6;
				field4082[var1][var4 * 2] = field4082[var1][var4 * 2 - 1] * var5 + field4082[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field4082[var1];
					var10000[var7] += field4082[var1][var7 - 1] * var5 + field4082[var1][var7 - 2] * var6;
				}

				var10000 = field4082[var1];
				var10000[1] += field4082[var1][0] * var5 + var6;
				var10000 = field4082[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field4086[0] * 2; ++var4) {
					var10000 = field4082[0];
					var10000[var4] *= field4084;
				}
			}

			for (var4 = 0; var4 < this.field4086[var1] * 2; ++var4) {
				field4083[var1][var4] = (int)(field4082[var1][var4] * 65536.0F);
			}

			return this.field4086[var1] * 2;
		}
	}

	final void method2433(Buffer var1, class223 var2) {
		int var3 = var1.readUnsignedByte();
		this.field4086[0] = var3 >> 4;
		this.field4086[1] = var3 & 15;
		if (var3 != 0) {
			this.field4079[0] = var1.readUnsignedShort();
			this.field4079[1] = var1.readUnsignedShort();
			int var4 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field4086[var5]; ++var6) {
					this.field4081[var5][0][var6] = var1.readUnsignedShort();
					this.field4080[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field4086[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field4081[var5][1][var6] = var1.readUnsignedShort();
						this.field4080[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field4081[var5][1][var6] = this.field4081[var5][0][var6];
						this.field4080[var5][1][var6] = this.field4080[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field4079[1] != this.field4079[0]) {
				var2.method1019(var1);
			}
		} else {
			int[] var7 = this.field4079;
			this.field4079[1] = 0;
			var7[0] = 0;
		}

	}

	static float method2435(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
