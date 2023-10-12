public class class92 extends class185 {
	public static int field595;
	double field588;
	double field591;
	double field592;
	double field593;
	double field594;
	int field589;
	int field590;

	public class92(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field590 = 0;
		this.field589 = 0;
		this.field588 = 0.0D;
		this.field594 = 0.0D;
		this.field592 = 0.0D;
		this.field591 = 0.0D;
		this.field593 = 0.0D;
		this.field590 = var3;
		this.field589 = var6;
		if ((var4 - var7) * (var8 - var2) == (var7 - var1) * (var5 - var8)) {
			this.field588 = (double)var4;
			this.field594 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var7 + var4)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field588 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field594 = var13 + (this.field588 - var11) * var19;
			this.field592 = Math.sqrt(Math.pow(this.field588 - (double)var1, 2.0D) + Math.pow(this.field594 - (double)var2, 2.0D));
			this.field591 = Math.atan2((double)var2 - this.field594, (double)var1 - this.field588);
			double var23 = Math.atan2((double)var8 - this.field594, (double)var7 - this.field588);
			this.field593 = Math.atan2((double)var5 - this.field594, (double)var4 - this.field588);
			boolean var25 = this.field591 <= var23 && var23 <= this.field593 || this.field593 <= var23 && var23 <= this.field591;
			if (!var25) {
				this.field593 += 3.141592653589793D * (double)(this.field591 - this.field593 > 0.0D ? 2 : -2);
			}

		}
	}

	@Override
	public int method932() {
		double var2 = this.method1474();
		double var4 = this.field591 + var2 * (this.field593 - this.field591);
		return (int)Math.round(this.field588 + this.field592 * Math.cos(var4));
	}

	@Override
	public int method934() {
		double var2 = this.method1474();
		double var4 = (this.field593 - this.field591) * var2 + this.field591;
		return (int)Math.round(this.field594 + this.field592 * Math.sin(var4));
	}

	@Override
	public int method933() {
		double var2 = this.method1474();
		return (int)Math.round(var2 * (double)(this.field589 - this.field590) + (double)this.field590);
	}
}
