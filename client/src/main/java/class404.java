public final class class404 extends class462 {
	boolean field2785;
	class116 field2773;
	double field2764;
	double field2768;
	double field2776;
	double field2777;
	double field2778;
	double field2779;
	double field2781;
	double field2782;
	int field2759;
	int field2760;
	int field2761;
	int field2762;
	int field2763;
	int field2765;
	int field2766;
	int field2767;
	int field2769;
	int field2770;
	int field2771;
	int field2772;
	int field2774;
	int field2775;
	int field2780;
	int field2783;
	int field2784;
	int field2786;
	int field2787;

	class404(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field2785 = false;
		this.field2786 = 0;
		this.field2787 = 0;
		this.field2774 = var1;
		this.field2760 = var2;
		this.field2761 = var3;
		this.field2762 = var4;
		this.field2772 = var5;
		this.field2763 = var6;
		this.field2769 = var7;
		this.field2770 = var8;
		this.field2771 = var9;
		this.field2759 = var10;
		this.field2783 = var11;
		this.field2785 = false;
		int var12 = class137.method707(this.field2774).field896;
		if (var12 != -1) {
			this.field2773 = class116.method539(var12);
		} else {
			this.field2773 = null;
		}

	}

	class404(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field2767 = var10;
	}

	final void method1864(int var1, int var2, int var3, int var4) {
		this.field2765 = var1;
		this.field2766 = var2;
		this.field2780 = var3;
		double var6;
		if (!this.field2785) {
			var6 = (double)(this.field2765 - this.field2761);
			double var8 = (double)(this.field2766 - this.field2762);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field2768 = var6 * (double)this.field2771 / var10 + (double)this.field2761;
			this.field2776 = (double)this.field2762 + var8 * (double)this.field2771 / var10;
			this.field2777 = (double)this.field2772;
		}

		var6 = (double)(this.field2769 + 1 - var4);
		this.field2778 = ((double)this.field2765 - this.field2768) / var6;
		this.field2779 = ((double)this.field2766 - this.field2776) / var6;
		this.field2764 = Math.sqrt(this.field2779 * this.field2779 + this.field2778 * this.field2778);
		if (!this.field2785) {
			this.field2781 = -this.field2764 * Math.tan((double)this.field2770 * 0.02454369D);
		}

		this.field2782 = ((double)this.field2780 - this.field2777 - var6 * this.field2781) * 2.0D / (var6 * var6);
	}

	final void method1863(int var1) {
		this.field2785 = true;
		this.field2768 += (double)var1 * this.field2778;
		this.field2776 += (double)var1 * this.field2779;
		this.field2777 += (double)var1 * this.field2782 * 0.5D * (double)var1 + (double)var1 * this.field2781;
		this.field2781 += (double)var1 * this.field2782;
		this.field2775 = (int)(Math.atan2(this.field2778, this.field2779) * 325.949D) + 1024 & 2047;
		this.field2784 = (int)(Math.atan2(this.field2781, this.field2764) * 325.949D) & 2047;
		if (this.field2773 != null) {
			if (!this.field2773.method533()) {
				this.field2787 += var1;

				while (true) {
					do {
						do {
							if (this.field2787 <= this.field2773.field722[this.field2786]) {
								return;
							}

							this.field2787 -= this.field2773.field722[this.field2786];
							++this.field2786;
						} while(this.field2786 < this.field2773.field733.length);

						this.field2786 -= this.field2773.field737;
					} while(this.field2786 >= 0 && this.field2786 < this.field2773.field733.length);

					this.field2786 = 0;
				}
			} else {
				this.field2786 += var1;
				int var3 = this.field2773.method535();
				if (this.field2786 >= var3) {
					this.field2786 = var3 - this.field2773.field737;
				}
			}
		}

	}

	@Override
	protected final class490 method2152() {
		class137 var2 = class137.method707(this.field2774);
		class490 var3 = var2.method703(this.field2786);
		if (var3 == null) {
			return null;
		} else {
			var3.method2260(this.field2784);
			return var3;
		}
	}
}
