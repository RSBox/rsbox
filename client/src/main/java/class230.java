public final class class230 extends class433 {
	public byte[] field1502;
	public int field1498;
	public int field1500;
	public int field1501;
	public int field1503;
	public int field1504;
	public int field1505;
	public int[] field1499;

	public void method1066() {
		if (this.field1503 != this.field1504 || this.field1501 != this.field1505) {
			byte[] var1 = new byte[this.field1504 * this.field1505];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field1501; ++var3) {
				for (int var4 = 0; var4 < this.field1503; ++var4) {
					var1[var4 + this.field1500 + (var3 + this.field1498) * this.field1504] = this.field1502[var2++];
				}
			}

			this.field1502 = var1;
			this.field1503 = this.field1504;
			this.field1501 = this.field1505;
			this.field1500 = 0;
			this.field1498 = 0;
		}
	}

	public void method1067(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1499.length; ++var4) {
			int var5 = this.field1499[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field1499[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field1499[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field1499[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method1065(int var1, int var2) {
		var1 += this.field1500;
		var2 += this.field1498;
		int var3 = var1 + var2 * class433.field2894;
		int var4 = 0;
		int var5 = this.field1501;
		int var6 = this.field1503;
		int var7 = class433.field2894 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class433.field2899) {
			var9 = class433.field2899 - var2;
			var5 -= var9;
			var2 = class433.field2899;
			var4 = 0 + var9 * var6;
			var3 += var9 * class433.field2894;
		}

		if (var2 + var5 > class433.field2895) {
			var5 -= var2 + var5 - class433.field2895;
		}

		if (var1 < class433.field2900) {
			var9 = class433.field2900 - var1;
			var6 -= var9;
			var1 = class433.field2900;
			var4 += var9;
			var3 += var9;
			var8 = 0 + var9;
			var7 += var9;
		}

		if (var1 + var6 > class433.field2901) {
			var9 = var1 + var6 - class433.field2901;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method1068(class433.field2898, this.field1502, this.field1499, var4, var3, var6, var5, var7, var8);
		}
	}

	public void method1070(int var1, int var2, int var3, int var4) {
		int var5 = this.field1503;
		int var6 = this.field1501;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field1504;
		int var10 = this.field1505;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field1500 > 0) {
			var13 = ((this.field1500 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 = 0 + (var13 * var11 - (this.field1500 << 16));
		}

		if (this.field1498 > 0) {
			var13 = ((this.field1498 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 = 0 + (var13 * var12 - (this.field1498 << 16));
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + var2 * class433.field2894;
		int var14 = class433.field2894 - var3;
		if (var2 + var4 > class433.field2895) {
			var4 -= var2 + var4 - class433.field2895;
		}

		int var15;
		if (var2 < class433.field2899) {
			var15 = class433.field2899 - var2;
			var4 -= var15;
			var13 += var15 * class433.field2894;
			var8 += var12 * var15;
		}

		if (var1 + var3 > class433.field2901) {
			var15 = var1 + var3 - class433.field2901;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < class433.field2900) {
			var15 = class433.field2900 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}

		method1069(class433.field2898, this.field1502, this.field1499, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	static void method1068(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method1069(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
