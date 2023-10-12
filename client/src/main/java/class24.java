public class class24 {
	static int field125;
	float field123;
	float field124;
	float field126;

	static {
		new class24(0.0F, 0.0F, 0.0F);
		new class24(1.0F, 1.0F, 1.0F);
		new class24(1.0F, 0.0F, 0.0F);
		new class24(0.0F, 1.0F, 0.0F);
		new class24(0.0F, 0.0F, 1.0F);
		method86(100);
	}

	class24(float var1, float var2, float var3) {
		this.field126 = var1;
		this.field124 = var2;
		this.field123 = var3;
	}

	final float method85() {
		return (float)Math.sqrt((double)(this.field126 * this.field126 + this.field124 * this.field124 + this.field123 * this.field123));
	}

	@Override
	public String toString() {
		return this.field126 + ", " + this.field124 + ", " + this.field123;
	}

	static void method86(int var0) {
	}
}
