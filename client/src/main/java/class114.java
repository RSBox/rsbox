public class class114 implements class543 {
	static Player field720;
	class460[] field721;
	class5 field719;
	class69 field715;
	double field717;
	int field714;
	int field716;
	int field718;

	public class114(class5 var1, class5 var2, int var3, double var4, int var6) {
		this.field715 = new class69();
		this.field716 = 0;
		this.field717 = 1.0D;
		this.field714 = 128;
		this.field719 = var2;
		this.field718 = var3;
		this.field716 = this.field718;
		this.field717 = var4;
		this.field714 = var6;
		int[] var7 = var1.method22(0);
		if (null != var7) {
			int var8 = var7.length;
			this.field721 = new class460[var1.method23(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Buffer var10 = new Buffer(var1.method39(0, var7[var9]));
				this.field721[var7[var9]] = new class460(var10);
			}
		} else {
			this.field721 = new class460[0];
		}

	}

	public int method517() {
		if (this.field721.length == 0) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			class460[] var4 = this.field721;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				class460 var6 = var4[var5];
				if (var6 != null && null != var6.field3148) {
					var2 += var6.field3148.length;
					int[] var7 = var6.field3148;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field719.method35(var9)) {
							++var3;
						}
					}
				}
			}

			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	public void method523(double var1) {
		this.field717 = var1;
		this.method522();
	}

	@Override
	public int[] method2623(int var1) {
		class460 var3 = this.field721[var1];
		if (null != var3) {
			if (null != var3.field3154) {
				this.field715.method330(var3);
				var3.field3155 = true;
				return var3.field3154;
			}

			boolean var4 = var3.method2149(this.field717, this.field714, this.field719);
			if (var4) {
				if (this.field716 == 0) {
					class460 var5 = (class460)this.field715.method328();
					var5.method2147();
				} else {
					--this.field716;
				}

				this.field715.method330(var3);
				var3.field3155 = true;
				return var3.field3154;
			}
		}

		return null;
	}

	@Override
	public int method2620(int var1) {
		return this.field721[var1] != null ? this.field721[var1].field3146 : 0;
	}

	@Override
	public boolean method2621(int var1) {
		return this.field721[var1].field3147;
	}

	@Override
	public boolean method2622(int var1) {
		return this.field714 == 64;
	}

	public void method522() {
		for (int var2 = 0; var2 < this.field721.length; ++var2) {
			if (this.field721[var2] != null) {
				this.field721[var2].method2147();
			}
		}

		this.field715 = new class69();
		this.field716 = this.field718;
	}

	public void method524(int var1) {
		for (int var3 = 0; var3 < this.field721.length; ++var3) {
			class460 var4 = this.field721[var3];
			if (var4 != null && var4.field3152 != 0 && var4.field3155) {
				var4.method2148(var1);
				var4.field3155 = false;
			}
		}

	}

	static void method525(class5 var0, int var1) {
		if ((var1 & class550.field4301.getId()) != 0) {
			class410.field2814 = class61.method260(var0, "logo_deadman_mode", "");
		} else if ((var1 & class550.field4302.getId()) != 0) {
			class410.field2814 = class61.method260(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class550.field4280.getId()) != 0) {
			class410.field2814 = class61.method260(var0, "logo_speedrunning", "");
		} else {
			class410.field2814 = class61.method260(var0, "logo", "");
		}

	}
}
