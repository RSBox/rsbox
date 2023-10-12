public class class191 extends class359 {
	static boolean field1318;
	static boolean[] field1303;
	static class113[] field1299;
	static class269[] field1300;
	static class275 field1308;
	static class373[] field1302;
	static class515[] field1301;
	static float[] field1295;
	static float[] field1304;
	static float[] field1312;
	static float[] field1314;
	static float[] field1315;
	static float[] field1316;
	static int field1297;
	static int field1309;
	static int[] field1296;
	static int[] field1298;
	static int[] field1317;
	boolean field1311;
	boolean field1321;
	byte[] field1319;
	byte[][] field1313;
	float[] field1306;
	float[] field1310;
	int field1290;
	int field1291;
	int field1292;
	int field1293;
	int field1294;
	int field1305;
	int field1307;
	int field1320;

	static {
		field1308 = new class275();
		field1318 = false;
	}

	class191(byte[] var1) {
		this.method939(var1);
	}

	void method939(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.field1291 = var2.readInt();
		this.field1292 = var2.readInt();
		this.field1305 = var2.readInt();
		this.field1294 = var2.readInt();
		if (this.field1294 < 0) {
			this.field1294 = ~this.field1294;
			this.field1321 = true;
		}

		int var3 = var2.readInt();
		this.field1313 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field1313[var4] = var7;
		}

	}

	float[] method940(int var1) {
		class275 var2 = new class275();
		var2.method1270(this.field1313[var1], 0);
		this.field1310 = new float[field1309];
		var2.method1269();
		int var3 = var2.method1268(class254.method1212(field1298.length - 1));
		boolean var4 = field1303[var3];
		int var5 = var4 ? field1309 : field1297;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1269() != 0;
			var7 = var2.method1269() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1297 >> 2);
			var10 = (var5 >> 2) + (field1297 >> 2);
			var11 = field1297 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1297 >> 2);
			var13 = var5 - (var5 >> 2) + (field1297 >> 2);
			var14 = field1297 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		class373 var15 = field1302[field1298[var3]];
		int var16 = var15.field2575;
		int var17 = var15.field2577[var16];
		class28 var18 = field1300[var17].method1258(var2);
		boolean var19 = !var18.method93();

		int var20;
		for (var20 = 0; var20 < var15.field2576; ++var20) {
			class515 var21 = field1301[var15.field2574[var20]];
			float[] var22 = this.field1310;
			var21.method2429(var22, var5 >> 1, var19, var2);
		}

		if (var18.method93()) {
			var16 = var15.field2575;
			int var10000 = var15.field2577[var16];
			var18.method92(this.field1310, var5 >> 1);
		}

		int var43;
		int var46;
		if (!var18.method93()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1310[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field1310;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var48 = var4 ? field1314 : field1304;
			float[] var25 = var4 ? field1315 : field1312;
			float[] var26 = var4 ? field1316 : field1295;
			int[] var27 = var4 ? field1317 : field1296;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var43; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var48[var28 * 2];
				var32 = var48[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var46; ++var28) {
				var29 = var23[var20 + 3 + var28 * 4];
				var30 = var23[var20 + 1 + var28 * 4];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + 3 + var28 * 4] = var29 + var31;
				var23[var20 + 1 + var28 * 4] = var30 + var32;
				var33 = var48[var20 - 4 - var28 * 4];
				var34 = var48[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = class254.method1212(var5 - 1);

			int var49;
			int var50;
			int var51;
			int var52;
			for (var49 = 0; var49 < var28 - 3; ++var49) {
				var50 = var5 >> var49 + 2;
				var51 = 8 << var49;

				for (var52 = 0; var52 < 2 << var49; ++var52) {
					int var53 = var5 - var50 * 2 * var52;
					int var54 = var5 - var50 * (var52 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var53 - 1 - var36];
						float var38 = var23[var53 - 3 - var36];
						float var39 = var23[var54 - 1 - var36];
						float var40 = var23[var54 - 3 - var36];
						var23[var53 - 1 - var36] = var37 + var39;
						var23[var53 - 3 - var36] = var38 + var40;
						float var41 = var48[var35 * var51];
						float var42 = var48[var35 * var51 + 1];
						var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var49 = 1; var49 < var46 - 1; ++var49) {
				var50 = var27[var49];
				if (var49 < var50) {
					var51 = var49 * 8;
					var52 = var50 * 8;
					var33 = var23[var51 + 1];
					var23[var51 + 1] = var23[var52 + 1];
					var23[var52 + 1] = var33;
					var33 = var23[var51 + 3];
					var23[var51 + 3] = var23[var52 + 3];
					var23[var52 + 3] = var33;
					var33 = var23[var51 + 5];
					var23[var51 + 5] = var23[var52 + 5];
					var23[var52 + 5] = var33;
					var33 = var23[var51 + 7];
					var23[var51 + 7] = var23[var52 + 7];
					var23[var52 + 7] = var33;
				}
			}

			for (var49 = 0; var49 < var20; ++var49) {
				var23[var49] = var23[var49 * 2 + 1];
			}

			for (var49 = 0; var49 < var46; ++var49) {
				var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
				var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
				var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
				var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
			}

			for (var49 = 0; var49 < var46; ++var49) {
				var30 = var26[var49 * 2];
				var31 = var26[var49 * 2 + 1];
				var32 = var23[var20 + var49 * 2];
				var33 = var23[var20 + var49 * 2 + 1];
				var34 = var23[var5 - 2 - var49 * 2];
				float var55 = var23[var5 - 1 - var49 * 2];
				float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
				var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
				var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
				var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
				var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
				var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
				var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var5 - var43 + var49] = -var23[var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var43 + var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var43 + var49] = -var23[var43 - var49 - 1];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var20 + var49] = var23[var5 - var49 - 1];
			}

			float[] var57;
			for (var49 = var9; var49 < var10; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field1310;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1310;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1307 > 0) {
			var43 = this.field1307 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field1311) {
				for (var46 = 0; var46 < this.field1293; ++var46) {
					var47 = (this.field1307 >> 1) + var46;
					var44[var46] += this.field1306[var47];
				}
			}

			if (var18.method93()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field1310[var46];
				}
			}
		}

		float[] var45 = this.field1306;
		this.field1306 = this.field1310;
		this.field1310 = var45;
		this.field1307 = var5;
		this.field1293 = var13 - (var5 >> 1);
		this.field1311 = !var18.method93();
		return var44;
	}

	class7 method943(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field1319 == null) {
				this.field1307 = 0;
				this.field1306 = new float[field1309];
				this.field1319 = new byte[this.field1292];
				this.field1320 = 0;
				this.field1290 = 0;
			}

			for (; this.field1290 < this.field1313.length; ++this.field1290) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method940(this.field1290);
				if (var2 != null) {
					int var3 = this.field1320;
					int var4 = var2.length;
					if (var4 > this.field1292 - var3) {
						var4 = this.field1292 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field1319[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1320;
					}

					this.field1320 = var3;
				}
			}

			this.field1306 = null;
			byte[] var7 = this.field1319;
			this.field1319 = null;
			return new class7(this.field1291, var7, this.field1305, this.field1294, this.field1321);
		}
	}

	static float method944(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	static void method942(byte[] var0) {
		class275 var1 = field1308;
		var1.method1270(var0, 0);
		field1297 = 1 << var1.method1268(4);
		field1309 = 1 << var1.method1268(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1309 : field1297;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var7[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var7[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var20 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var21 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var22 = new int[var6];
			int var11 = class254.method1212(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				int var16 = var12;
				int var17 = var11;

				int var18;
				for (var18 = 0; var17 > 0; --var17) {
					var18 = var18 << 1 | var16 & 1;
					var16 >>>= 1;
				}

				var22[var12] = var18;
			}

			if (var2 != 0) {
				field1314 = var7;
				field1315 = var20;
				field1316 = var21;
				field1317 = var22;
			} else {
				field1304 = var7;
				field1312 = var20;
				field1295 = var21;
				field1296 = var22;
			}
		}

		var2 = var1.method1268(8) + 1;
		field1299 = new class113[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field1299[var3] = new class113();
		}

		var3 = var1.method1268(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1268(16);
		}

		var3 = var1.method1268(6) + 1;
		field1300 = new class269[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field1300[var4] = new class269();
		}

		var4 = var1.method1268(6) + 1;
		field1301 = new class515[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field1301[var5] = new class515();
		}

		var5 = var1.method1268(6) + 1;
		field1302 = new class373[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field1302[var6] = new class373();
		}

		var6 = var1.method1268(6) + 1;
		field1303 = new boolean[var6];
		field1298 = new int[var6];

		for (int var19 = 0; var19 < var6; ++var19) {
			field1303[var19] = var1.method1269() != 0;
			var1.method1268(16);
			var1.method1268(16);
			field1298[var19] = var1.method1268(8);
		}

	}

	static boolean method938(class5 var0) {
		if (!field1318) {
			byte[] var1 = var0.method39(0, 0);
			if (var1 == null) {
				return false;
			}

			method942(var1);
			field1318 = true;
		}

		return true;
	}

	static class191 method941(class5 var0, int var1, int var2) {
		if (!method938(var0)) {
			var0.method16(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method39(var1, var2);
			return var3 == null ? null : new class191(var3);
		}
	}
}
