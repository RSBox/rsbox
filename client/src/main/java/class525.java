public class class525 extends class462 {
	class116 field4117;
	int field4111;
	int field4112;
	int field4113;
	int field4114;
	int field4115;
	int field4116;
	int field4118;
	int field4119;

	class525(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class462 var9) {
		this.field4115 = var1;
		this.field4111 = var2;
		this.field4112 = var3;
		this.field4114 = var4;
		this.field4113 = var5;
		this.field4116 = var6;
		if (var7 != -1) {
			this.field4117 = class116.method539(var7);
			this.field4118 = 0;
			this.field4119 = Client.field1846 - 1;
			if (this.field4117.field747 == 0 && var9 != null && var9 instanceof class525) {
				class525 var10 = (class525)var9;
				if (this.field4117 == var10.field4117) {
					this.field4118 = var10.field4118;
					this.field4119 = var10.field4119;
					return;
				}
			}

			if (var8 && this.field4117.field737 != -1) {
				if (!this.field4117.method533()) {
					this.field4118 = (int)(Math.random() * (double)this.field4117.field733.length);
					this.field4119 -= (int)(Math.random() * (double)this.field4117.field722[this.field4118]);
				} else {
					this.field4118 = (int)(Math.random() * (double)this.field4117.method535());
				}
			}
		}

	}

	@Override
	protected final class490 method2152() {
		int var3;
		if (null != this.field4117) {
			int var2 = Client.field1846 - this.field4119;
			if (var2 > 100 && this.field4117.field737 > 0) {
				var2 = 100;
			}

			if (this.field4117.method533()) {
				var3 = this.field4117.method535();
				this.field4118 += var2;
				var2 = 0;
				if (this.field4118 >= var3) {
					this.field4118 = var3 - this.field4117.field737;
					if (this.field4118 < 0 || this.field4118 > var3) {
						this.field4117 = null;
					}
				}
			} else {
				label68: {
					do {
						do {
							if (var2 <= this.field4117.field722[this.field4118]) {
								break label68;
							}

							var2 -= this.field4117.field722[this.field4118];
							++this.field4118;
						} while(this.field4118 < this.field4117.field733.length);

						this.field4118 -= this.field4117.field737;
					} while(this.field4118 >= 0 && this.field4118 < this.field4117.field733.length);

					this.field4117 = null;
				}
			}

			this.field4119 = Client.field1846 - var2;
		}

		class397 var13 = class109.method504(this.field4115);
		if (null != var13.field2727) {
			var13 = var13.method1845();
		}

		if (null == var13) {
			return null;
		} else {
			int var4;
			if (this.field4112 != 1 && this.field4112 != 3) {
				var3 = var13.field2701;
				var4 = var13.field2702;
			} else {
				var3 = var13.field2702;
				var4 = var13.field2701;
			}

			int var5 = this.field4113 + (var3 >> 1);
			int var6 = (var3 + 1 >> 1) + this.field4113;
			int var7 = (var4 >> 1) + this.field4116;
			int var8 = (var4 + 1 >> 1) + this.field4116;
			int[][] var9 = class129.field844[this.field4114];
			int var10 = var9[var6][var8] + var9[var6][var7] + var9[var5][var7] + var9[var5][var8] >> 2;
			int var11 = (this.field4113 << 7) + (var3 << 6);
			int var12 = (var4 << 6) + (this.field4116 << 7);
			return var13.method1843(this.field4111, this.field4112, var9, var11, var10, var12, this.field4117, this.field4118);
		}
	}
}
