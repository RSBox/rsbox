public class class71 {
	static String field456;
	class230[] field455;
	int field449;
	int field454;
	int field458;
	int field460;
	int field462;
	int field463;
	int[] field447;
	int[] field448;
	int[] field450;
	int[] field451;
	int[] field452;
	int[] field453;
	int[] field457;
	int[] field459;
	int[] field461;

	class71(class230[] var1) {
		this.field448 = new int[256];
		this.field449 = 0;
		this.field454 = 0;
		this.field463 = 0;
		this.field460 = 0;
		this.field458 = 0;
		this.field462 = 0;
		this.field455 = var1;
		this.method343();
	}

	void method343() {
		this.field451 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field451[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field451[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field451[var2 + 128] = var2 * 4 + 16776960;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field451[var2 + 192] = 16777215;
		}

		this.field452 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field452[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field452[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field452[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field452[var2 + 192] = 16777215;
		}

		this.field447 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field447[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field447[var2 + 64] = 255 + var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field447[var2 + 128] = 16711935 + var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field447[var2 + 192] = 16777215;
		}

		this.field457 = new int[256];
		this.field460 = 0;
		this.field450 = new int[32768];
		this.field461 = new int[32768];
		this.method341((class230)null);
		this.field453 = new int[32768];
		this.field459 = new int[32768];
	}

	void method336() {
		this.field451 = null;
		this.field452 = null;
		this.field447 = null;
		this.field457 = null;
		this.field450 = null;
		this.field461 = null;
		this.field453 = null;
		this.field459 = null;
		this.field460 = 0;
		this.field458 = 0;
	}

	void method344(int var1, int var2) {
		if (null == this.field453) {
			this.method343();
		}

		if (this.field462 == 0) {
			this.field462 = var2;
		}

		int var4 = var2 - this.field462;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field462 = var2;
		if (var4 > 0) {
			this.method337(var4);
		}

		this.method339(var1);
	}

	final void method337(int var1) {
		this.field460 += var1 * 128;
		int var3;
		if (this.field460 > this.field450.length) {
			this.field460 -= this.field450.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method341(this.field455[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = 128 * (256 - var1);

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.field453[var3 + var4] - var1 * this.field450[var3 + this.field460 & this.field450.length - 1] / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field453[var3++] = var7;
		}

		boolean var16 = true;
		boolean var17 = true;

		int var8;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				int var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > 10 && var10 < 118) {
					this.field453[var9 + var10] = 255;
				} else {
					this.field453[var9 + var10] = 0;
				}
			}
		}

		if (this.field454 > 0) {
			this.field454 -= var1 * 4;
		}

		if (this.field463 > 0) {
			this.field463 -= var1 * 4;
		}

		if (this.field454 == 0 && this.field463 == 0) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field454 = 1024;
			}

			if (var8 == 1) {
				this.field463 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field448[var8] = this.field448[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field448[var8] = (int)(Math.sin((double)this.field449 / 14.0D) * 16.0D + Math.sin((double)this.field449 / 15.0D) * 14.0D + Math.sin((double)this.field449 / 16.0D) * 12.0D);
			++this.field449;
		}

		this.field458 += var1;
		var8 = (var1 + (Client.field1846 & 1)) / 2;
		if (var8 > 0) {
			boolean var18 = true;
			boolean var19 = true;
			boolean var20 = true;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field458 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)124) + 2;
				var14 = (int)(Math.random() * (double)128) + 128;
				this.field453[var13 + (var14 << 7)] = 192;
			}

			this.field458 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var15 + var8 < 128) {
						var13 += this.field453[var14 + var15 + var8];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field453[var14 + var15 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field459[var14 + var15] = var13 / (1 + var8 * 2);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field459[var12 + var15 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field459[var12 + var15 - 128 * (var8 + 1)];
					}

					if (var14 >= 0) {
						this.field453[var15 + var12] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	final int method338(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return ((var2 & 65280) * var3 + (var1 & 65280) * var5 & 16711680) + ((var1 & 16711935) * var5 + (var2 & 16711935) * var3 & -16711936) >> 8;
	}

	final void method339(int var1) {
		int var3 = this.field457.length;
		if (this.field454 > 0) {
			this.method342(this.field454, this.field452);
		} else if (this.field463 > 0) {
			this.method342(this.field463, this.field447);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field457[var4] = this.field451[var4];
			}
		}

		this.method340(var1);
	}

	final void method342(int var1, int[] var2) {
		int var4 = this.field457.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field457[var5] = this.method338(this.field451[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field457[var5] = var2[var5];
			} else {
				this.field457[var5] = this.method338(var2[var5], this.field451[var5], 256 - var1);
			}
		}

	}

	final void method340(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = this.field448[var4] * (256 - var4) / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= class246.field1638.field4306) {
				var8 = class246.field1638.field4306 - var6;
			}

			int var9 = var6 + (var4 + 8) * class246.field1638.field4306;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field453[var3++];
				int var12 = var9 % class433.field2894;
				if (var11 != 0 && var12 >= class433.field2900 && var12 < class433.field2901) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field457[var11];
					int var15 = class246.field1638.field4308[var9];
					class246.field1638.field4308[var9++] = -16777216 | ((var15 & 16711935) * var14 + (var11 & 16711935) * var13 & -16711936) + ((var15 & 65280) * var14 + var13 * (var11 & 65280) & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	final void method341(class230 var1) {
		int var3;
		for (var3 = 0; var3 < this.field450.length; ++var3) {
			this.field450[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field450[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field461[var6] = (this.field450[var6 + 1] + this.field450[var6 - 1] + this.field450[var6 - 128] + this.field450[var6 + 128]) / 4;
				}
			}

			int[] var9 = this.field450;
			this.field450 = this.field461;
			this.field461 = var9;
		}

		if (null != var1) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field1501; ++var4) {
				for (var5 = 0; var5 < var1.field1503; ++var5) {
					if (var1.field1502[var3++] != 0) {
						var6 = var1.field1500 + var5 + 16;
						int var7 = var1.field1498 + var4 + 16;
						int var8 = (var7 << 7) + var6;
						this.field450[var8] = 0;
					}
				}
			}
		}

	}
}
