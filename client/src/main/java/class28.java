public class class28 {
	public static int[] field136;
	static class140 field143;
	static int[] field138;
	static String field142;
	static String field144;
	boolean field137;
	boolean[] field140;
	class269 field139;
	int[] field141;
	int[] field145;

	class28(class269 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field139 = var1;
		this.field137 = var2;
		this.field145 = var3;
		this.field141 = var4;
		this.field140 = var5;
	}

	void method92(float[] var1, int var2) {
		int var4 = this.field139.field1788.length;
		class269 var10000 = this.field139;
		int var5 = class269.field1792[this.field139.field1787 - 1];
		boolean[] var6 = this.field140;
		this.field140[1] = true;
		var6[0] = true;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field139.method1257(this.field145, var7);
			var9 = this.field139.method1255(this.field145, var7);
			var10 = this.field139.method1256(this.field145[var8], this.field141[var8], this.field145[var9], this.field141[var9], this.field145[var7]);
			var11 = this.field141[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field140;
				this.field140[var9] = true;
				var15[var8] = true;
				this.field140[var7] = true;
				if (var11 >= var14) {
					this.field141[var7] = var12 > var10 ? var10 + (var11 - var10) : var10 - var11 + var12 - 1;
				} else {
					this.field141[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.field140[var7] = false;
				this.field141[var7] = var10;
			}
		}

		this.method94(0, var4 - 1);
		var7 = 0;
		var8 = this.field141[0] * this.field139.field1787;

		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field140[var9]) {
				var10 = this.field145[var9];
				var11 = this.field139.field1787 * this.field141[var9];
				this.field139.method1259(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}

				var7 = var10;
				var8 = var11;
			}
		}

		var10000 = this.field139;
		float var17 = class269.field1789[var8];

		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}

	}

	boolean method93() {
		return this.field137;
	}

	void method94(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field145[var1];
			int var6 = this.field141[var1];
			boolean var7 = this.field140[var1];

			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field145[var8];
				if (var9 < var5) {
					this.field145[var4] = var9;
					this.field141[var4] = this.field141[var8];
					this.field140[var4] = this.field140[var8];
					++var4;
					this.field145[var8] = this.field145[var4];
					this.field141[var8] = this.field141[var4];
					this.field140[var8] = this.field140[var4];
				}
			}

			this.field145[var4] = var5;
			this.field141[var4] = var6;
			this.field140[var4] = var7;
			this.method94(var1, var4 - 1);
			this.method94(var4 + 1, var2);
		}
	}
}
