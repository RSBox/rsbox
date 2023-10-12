public final class class473 extends class462 {
	protected static String field3313;
	static int field3315;
	boolean field3324;
	class116 field3322;
	int field3314;
	int field3316;
	int field3317;
	int field3318;
	int field3319;
	int field3320;
	int field3321;
	int field3323;

	class473(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field3320 = 0;
		this.field3321 = 0;
		this.field3324 = false;
		this.field3317 = var1;
		this.field3323 = var2;
		this.field3316 = var3;
		this.field3319 = var4;
		this.field3318 = var5;
		this.field3314 = var7 + var6;
		int var8 = class137.method707(this.field3317).field896;
		if (var8 != -1) {
			this.field3324 = false;
			this.field3322 = class116.method539(var8);
		} else {
			this.field3324 = true;
		}

	}

	final void method2189(int var1) {
		if (!this.field3324) {
			this.field3321 += var1;
			if (!this.field3322.method533()) {
				while (this.field3321 > this.field3322.field722[this.field3320]) {
					this.field3321 -= this.field3322.field722[this.field3320];
					++this.field3320;
					if (this.field3320 >= this.field3322.field733.length) {
						this.field3324 = true;
						break;
					}
				}
			} else {
				this.field3320 += var1;
				if (this.field3320 >= this.field3322.method535()) {
					this.field3324 = true;
				}
			}

		}
	}

	@Override
	protected final class490 method2152() {
		class137 var2 = class137.method707(this.field3317);
		class490 var3;
		if (!this.field3324) {
			var3 = var2.method703(this.field3320);
		} else {
			var3 = var2.method703(-1);
		}

		return null == var3 ? null : var3;
	}
}
