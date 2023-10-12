public class class527 {
	float field4124;
	float field4125;
	float field4126;
	float field4127;
	float field4128;
	float field4129;
	float field4130;
	float field4131;
	float field4132;
	float field4133;
	float field4134;
	float field4135;

	static {
		new class527();
	}

	class527() {
		this.method2540();
	}

	void method2540() {
		this.field4126 = 0.0F;
		this.field4134 = 0.0F;
		this.field4129 = 0.0F;
		this.field4131 = 0.0F;
		this.field4130 = 0.0F;
		this.field4124 = 0.0F;
		this.field4127 = 0.0F;
		this.field4133 = 0.0F;
		this.field4125 = 0.0F;
		this.field4135 = 1.0F;
		this.field4128 = 1.0F;
		this.field4132 = 1.0F;
	}

	void method2539(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4125;
		float var6 = this.field4128;
		float var7 = this.field4131;
		float var8 = this.field4134;
		this.field4125 = var3 * var5 - var4 * this.field4133;
		this.field4133 = var4 * var5 + var3 * this.field4133;
		this.field4128 = var3 * var6 - this.field4124 * var4;
		this.field4124 = var6 * var4 + var3 * this.field4124;
		this.field4131 = var3 * var7 - this.field4135 * var4;
		this.field4135 = var7 * var4 + this.field4135 * var3;
		this.field4134 = var8 * var3 - this.field4126 * var4;
		this.field4126 = var4 * var8 + this.field4126 * var3;
	}

	void method2536(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4132;
		float var6 = this.field4127;
		float var7 = this.field4130;
		float var8 = this.field4129;
		this.field4132 = var4 * this.field4133 + var3 * var5;
		this.field4133 = var3 * this.field4133 - var5 * var4;
		this.field4127 = var6 * var3 + var4 * this.field4124;
		this.field4124 = var3 * this.field4124 - var6 * var4;
		this.field4130 = var7 * var3 + var4 * this.field4135;
		this.field4135 = var3 * this.field4135 - var7 * var4;
		this.field4129 = this.field4126 * var4 + var8 * var3;
		this.field4126 = this.field4126 * var3 - var4 * var8;
	}

	void method2537(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4132;
		float var6 = this.field4127;
		float var7 = this.field4130;
		float var8 = this.field4129;
		this.field4132 = var3 * var5 - var4 * this.field4125;
		this.field4125 = var4 * var5 + this.field4125 * var3;
		this.field4127 = var6 * var3 - this.field4128 * var4;
		this.field4128 = var6 * var4 + var3 * this.field4128;
		this.field4130 = var7 * var3 - this.field4131 * var4;
		this.field4131 = var7 * var4 + this.field4131 * var3;
		this.field4129 = var8 * var3 - var4 * this.field4134;
		this.field4134 = var4 * var8 + var3 * this.field4134;
	}

	void method2538(float var1, float var2, float var3) {
		this.field4129 += var1;
		this.field4134 += var2;
		this.field4126 += var3;
	}

	@Override
	public String toString() {
		return this.field4132 + "," + this.field4127 + "," + this.field4130 + "," + this.field4129 + "\n" + this.field4125 + "," + this.field4128 + "," + this.field4131 + "," + this.field4134 + "\n" + this.field4133 + "," + this.field4124 + "," + this.field4135 + "," + this.field4126;
	}
}
