public class class536 extends class292 {
	public static class352 field4196;
	public boolean field4197;
	public int field4194;
	public int field4195;
	public int field4198;
	public int field4199;
	public int field4200;
	public int field4201;
	public int field4202;
	public int field4203;
	public int field4204;

	static {
		field4196 = new class352(64);
	}

	class536() {
		this.field4194 = 0;
		this.field4198 = -1;
		this.field4197 = true;
		this.field4202 = -1;
	}

	void method2594() {
		if (this.field4202 != -1) {
			this.method2596(this.field4202);
			this.field4201 = this.field4199;
			this.field4195 = this.field4204;
			this.field4203 = this.field4200;
		}

		this.method2596(this.field4194);
	}

	void method2597(Buffer var1, int var2) {
		while (true) {
			int var4 = var1.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			this.method2595(var1, var4, var2);
		}
	}

	void method2595(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.field4194 = var1.readUnsignedMedium();
		} else if (var2 == 2) {
			this.field4198 = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.field4197 = false;
		} else if (var2 == 7) {
			this.field4202 = var1.readUnsignedMedium();
		} else if (var2 == 8) {
		}

	}

	void method2596(int var1) {
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
		double var17 = (var9 + var11) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field4199 = (int)(var13 * 256.0D);
		this.field4204 = (int)(var15 * 256.0D);
		this.field4200 = (int)(var17 * 256.0D);
		if (this.field4204 < 0) {
			this.field4204 = 0;
		} else if (this.field4204 > 255) {
			this.field4204 = 255;
		}

		if (this.field4200 < 0) {
			this.field4200 = 0;
		} else if (this.field4200 > 255) {
			this.field4200 = 255;
		}

	}

	public static void method2598(class5 var0) {
		class412.field2847 = var0;
	}
}
