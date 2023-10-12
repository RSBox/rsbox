public class class479 extends class292 {
	public static class352 field3365;
	public static class5 field3366;
	int field3367;
	public int field3368;
	public int field3369;
	public int field3370;
	public int field3371;

	static {
		field3365 = new class352(64);
	}

	class479() {
		this.field3367 = 0;
	}

	void method2202() {
		this.method2201(this.field3367);
	}

	void method2199(Buffer var1, int var2) {
		while (true) {
			int var4 = var1.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			this.method2200(var1, var4, var2);
		}
	}

	void method2200(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.field3367 = var1.readUnsignedMedium();
		}

	}

	void method2201(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var11 + var9) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}

		var13 /= 6.0D;
		this.field3369 = (int)(var15 * 256.0D);
		this.field3370 = (int)(var17 * 256.0D);
		if (this.field3369 < 0) {
			this.field3369 = 0;
		} else if (this.field3369 > 255) {
			this.field3369 = 255;
		}

		if (this.field3370 < 0) {
			this.field3370 = 0;
		} else if (this.field3370 > 255) {
			this.field3370 = 255;
		}

		if (var17 > 0.5D) {
			this.field3368 = (int)((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field3368 = (int)(var17 * var15 * 512.0D);
		}

		if (this.field3368 < 1) {
			this.field3368 = 1;
		}

		this.field3371 = (int)(var13 * (double)this.field3368);
	}

	public static class479 method2203(int var0) {
		class479 var2 = (class479)field3365.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field3366.method39(1, var0);
			var2 = new class479();
			if (var3 != null) {
				var2.method2199(new Buffer(var3), var0);
			}

			var2.method2202();
			field3365.method1680(var2, (long)var0);
			return var2;
		}
	}
}
