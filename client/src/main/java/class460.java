public class class460 extends class359 {
	static int[] field3156;
	boolean field3147;
	boolean field3155;
	int field3146;
	int field3152;
	int field3153;
	int[] field3148;
	int[] field3149;
	int[] field3150;
	int[] field3151;
	int[] field3154;

	class460(Buffer var1) {
		this.field3155 = false;
		this.field3146 = var1.readUnsignedShort();
		this.field3147 = var1.readUnsignedByte() == 1;
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 > 4) {
		}

		this.field3148 = new int[var2];

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			this.field3148[var3] = var1.readUnsignedShort();
		}

		if (var2 > 1) {
			this.field3150 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field3150[var3] = var1.readUnsignedByte();
			}
		}

		if (var2 > 1) {
			this.field3149 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field3149[var3] = var1.readUnsignedByte();
			}
		}

		this.field3151 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3151[var3] = var1.readInt();
		}

		this.field3152 = var1.readUnsignedByte();
		this.field3153 = var1.readUnsignedByte();
		this.field3154 = null;
	}

	boolean method2149(double var1, int var3, class5 var4) {
		int var5;
		for (var5 = 0; var5 < this.field3148.length; ++var5) {
			if (var4.method20(this.field3148[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field3154 = new int[var5];

		for (int var6 = 0; var6 < this.field3148.length; ++var6) {
			int var8 = this.field3148[var6];
			class230 var7;
			if (!class168.method890(var4, var8)) {
				var7 = null;
			} else {
				class230 var10 = new class230();
				var10.field1504 = class190.field1289;
				var10.field1505 = class203.field1364;
				var10.field1500 = class498.field3673[0];
				var10.field1498 = class442.field2971[0];
				var10.field1503 = class28.field136[0];
				var10.field1501 = class168.field1184[0];
				var10.field1499 = class205.field1376;
				var10.field1502 = class299.field2203[0];
				class345.method1664();
				var7 = var10;
			}

			var7.method1066();
			byte[] var17 = var7.field1502;
			int[] var11 = var7.field1499;
			int var12 = this.field3151[var6];
			if ((var12 & -16777216) == 16777216) {
			}

			if ((var12 & -16777216) == 33554432) {
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) {
				var13 = var12 & 16711935;
				var14 = var12 >> 8 & 255;

				for (var15 = 0; var15 < var11.length; ++var15) {
					var16 = var11[var15];
					if ((var16 & 65535) == var16 >> 8) {
						var16 &= 255;
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280;
					}
				}
			}

			for (var13 = 0; var13 < var11.length; ++var13) {
				var11[var13] = class105.method476(var11[var13], var1);
			}

			if (var6 == 0) {
				var13 = 0;
			} else {
				var13 = this.field3150[var6 - 1];
			}

			if (var13 == 0) {
				if (var7.field1503 == var3) {
					for (var14 = 0; var14 < var5; ++var14) {
						this.field3154[var14] = var11[var17[var14] & 255];
					}
				} else if (var7.field1503 == 64 && var3 == 128) {
					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field3154[var14++] = var11[var17[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field1503 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field3154[var14++] = var11[var17[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) {
			}

			if (var13 == 2) {
			}

			if (var13 == 3) {
			}
		}

		return true;
	}

	void method2147() {
		this.field3154 = null;
	}

	void method2148(int var1) {
		if (this.field3154 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field3152 == 1 || this.field3152 == 3) {
				if (field3156 == null || field3156.length < this.field3154.length) {
					field3156 = new int[this.field3154.length];
				}

				if (this.field3154.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field3154.length;
				var4 = var2 * var1 * this.field3153;
				var5 = var3 - 1;
				if (this.field3152 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field3156[var6] = this.field3154[var7];
				}

				var10 = this.field3154;
				this.field3154 = field3156;
				field3156 = var10;
			}

			if (this.field3152 == 2 || this.field3152 == 4) {
				if (field3156 == null || field3156.length < this.field3154.length) {
					field3156 = new int[this.field3154.length];
				}

				if (this.field3154.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field3154.length;
				var4 = var1 * this.field3153;
				var5 = var2 - 1;
				if (this.field3152 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field3156[var8] = this.field3154[var9];
					}
				}

				var10 = this.field3154;
				this.field3154 = field3156;
				field3156 = var10;
			}

		}
	}
}
