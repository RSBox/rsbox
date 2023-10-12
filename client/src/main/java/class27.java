import java.util.ArrayList;
import java.util.BitSet;

public class class27 extends class359 {
	byte[] field127;
	byte[] field130;
	byte[] field133;
	class214[] field128;
	class33[] field132;
	int field131;
	int[] field135;
	ArrayList field134;
	short[] field129;

	class27(byte[] var1) {
		this.field134 = new ArrayList(8);
		this.field128 = new class214[128];
		this.field129 = new short[128];
		this.field130 = new byte[128];
		this.field133 = new byte[128];
		this.field132 = new class33[128];
		this.field127 = new byte[128];
		this.field135 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.data[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.data[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.data[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.readUnsignedByte();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		class33[] var37 = new class33[var12];

		class33 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new class33();
			int var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var38.field167 = new byte[var16 * 2];
			}

			var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var38.field165 = new byte[var16 * 2 + 2];
				var38.field165[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.data[var2.offset + var17] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field129[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field129;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.method2521();
			}

			var48 = this.field129;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field135[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field135[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.data[var5++] - 1;
				}

				this.field127[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field135[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.data[var8++] + 16 << 2;
				}

				this.field133[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		class33 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field135[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field132[var26] = var42;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field135[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field130[var27] = (byte)var26;
			--var20;
		}

		this.field131 = var2.readUnsignedByte() + 1;

		class33 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field167) {
				for (var29 = 1; var29 < var28.field167.length; var29 += 2) {
					var28.field167[var29] = var2.readByte();
				}
			}

			if (var28.field165 != null) {
				for (var29 = 3; var29 < var28.field165.length - 2; var29 += 2) {
					var28.field165[var29] = var2.readByte();
				}
			}
		}

		if (var39 != null) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.readByte();
			}
		}

		if (null != var40) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field165) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field165.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var28.field165[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field167) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field167.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var28.field167[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var39 != null) {
			var19 = var2.readUnsignedByte();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var39[var27] = (byte)var19;
			}

			var47 = var39[0];
			byte var43 = var39[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field130[var29] = (byte)(var43 * this.field130[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = var43 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class254.method1213(var32, var30 - var47);
					this.field130[var33] = (byte)(var34 * this.field130[var33] + 32 >> 6);
					var32 += var31 - var43;
				}

				var47 = var30;
				var43 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field130[var45] = (byte)(32 + this.field130[var45] * var43 >> 6);
			}

			var38 = null;
		}

		if (null != var40) {
			var19 = var2.readUnsignedByte();
			var40[0] = (byte)var19;

			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var40[var27] = (byte)var19;
			}

			var47 = var40[0];
			int var44 = var40[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = (this.field133[var29] & 255) + var44;
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field133[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) / 2 + (var30 - var47) * var44;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class254.method1213(var32, var30 - var47);
					int var35 = (this.field133[var33] & 255) + var34;
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field133[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field133[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field133[var45] = (byte)var46;
			}

			Object var41 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field166 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field167 != null) {
				var28.field171 = var2.readUnsignedByte();
			}

			if (null != var28.field165) {
				var28.field164 = var2.readUnsignedByte();
			}

			if (var28.field166 > 0) {
				var28.field168 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field170 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field170 > 0) {
				var28.field169 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field169 > 0) {
				var28.field172 = var2.readUnsignedByte();
			}
		}

	}

	boolean method89(class209 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		class214 var6 = new class214();

		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);

			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field135[var9];
					if (var10 != 0) {
						if (var5 != var10) {
							var5 = var10--;
							if ((var10 & 1) == 0) {
								var6 = new class214(var1.method982(var10 >> 2));
							} else {
								var6 = var1.method981(var10 >> 2);
							}

							if (var6.method994()) {
								var4 = false;
							} else {
								this.field134.add(this.field134.size(), var6);
							}
						}

						if (!var6.method994()) {
							this.field128[var9] = var6;
							this.field135[var9] = 0;
						}
					}
				}
			}
		}

		return var4;
	}

	void method88() {
		this.field135 = null;
	}

	static class27 method91(class5 var0, int var1) {
		byte[] var3 = var0.method19(var1);
		return null == var3 ? null : new class27(var3);
	}

	static void method90(int var0) {
		if (var0 == -1 && !Client.field2083) {
			class483.method2223(0, 0);
		} else if (var0 != -1) {
			boolean var2;
			if (class483.field3396.isEmpty()) {
				var2 = false;
			} else {
				class407 var3 = (class407)class483.field3396.get(0);
				var2 = null != var3 && var0 == var3.field2790;
			}

			if (!var2 && class109.field693.method446() != 0) {
				ArrayList var4 = new ArrayList();
				var4.add(new class407(class151.field1049, var0, 0, class109.field693.method446(), false));
				if (Client.field2083) {
					class483.method2225(var4, 0, 100, 100, 0);
				} else {
					class14.method61(var4, 0, 100, 100, 0, false);
				}
			}
		}

	}
}
