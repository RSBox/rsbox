public abstract class class65 extends class462 {
	static int field405;
	static String field406;
	boolean field349;
	boolean field350;
	boolean field364;
	boolean field382;
	boolean field388;
	byte field343;
	byte field391;
	byte field392;
	byte field393;
	byte field394;
	class301 field378;
	MovementType[] field342;
	class444 field362;
	int field328;
	int field329;
	int field330;
	int field331;
	int field332;
	int field333;
	int field334;
	int field335;
	int field336;
	int field338;
	int field339;
	int field340;
	int field341;
	int field344;
	int field345;
	int field346;
	int field347;
	int field348;
	int field351;
	int field352;
	int field353;
	int field354;
	int field355;
	int field358;
	int field359;
	int field360;
	int field361;
	int field363;
	int field365;
	int field366;
	int field367;
	int field368;
	int field369;
	int field370;
	int field371;
	int field372;
	int field373;
	int field375;
	int field376;
	int field377;
	int field379;
	int field380;
	int field381;
	int field383;
	int field384;
	int field385;
	int field387;
	int field389;
	int field390;
	int field395;
	int field396;
	int field397;
	int field401;
	int field403;
	int field404;
	int[] field337;
	int[] field357;
	int[] field374;
	int[] field386;
	int[] field398;
	int[] field399;
	int[] field400;
	int[] field402;
	String field356;

	class65() {
		this.field349 = false;
		this.field332 = 1;
		this.field383 = -1;
		this.field335 = -1;
		this.field336 = -1;
		this.field331 = -1;
		this.field338 = -1;
		this.field341 = -1;
		this.field340 = -1;
		this.field401 = -1;
		this.field359 = -1;
		this.field345 = -1;
		this.field344 = -1;
		this.field339 = -1;
		this.field346 = -1;
		this.field361 = -1;
		this.field348 = -1;
		this.field356 = null;
		this.field388 = false;
		this.field352 = 100;
		this.field397 = 0;
		this.field354 = 0;
		this.field337 = null;
		this.field343 = 0;
		this.field357 = new int[4];
		this.field386 = new int[4];
		this.field398 = new int[4];
		this.field402 = new int[4];
		this.field374 = new int[4];
		this.field362 = new class444();
		this.field363 = -1;
		this.field364 = false;
		this.field365 = -1;
		this.field366 = -1;
		this.field367 = -1;
		this.field369 = -1;
		this.field370 = 0;
		this.field371 = 0;
		this.field372 = 0;
		this.field373 = -1;
		this.field334 = 0;
		this.field395 = 0;
		this.field376 = 0;
		this.field377 = 0;
		this.field378 = new class301(4);
		this.field379 = 0;
		this.field387 = 0;
		this.field353 = 200;
		this.field389 = -1;
		this.field390 = -1;
		this.field355 = 0;
		this.field358 = 32;
		this.field360 = 0;
		this.field399 = new int[10];
		this.field400 = new int[10];
		this.field342 = new MovementType[10];
		this.field375 = 0;
		this.field403 = 0;
		this.field404 = -1;
	}

	final void method288() {
		this.field360 = 0;
		this.field403 = 0;
	}

	boolean method289() {
		return false;
	}

	final void method297(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;

		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field398[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}

		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			class156 var13 = class156.method830(var1);
			var11 = var13.field1069;
			var12 = var13.field1067;
		}

		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}

			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field398[0];
			} else if (var11 == 1) {
				var15 = this.field386[0];
			}

			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field398[var14] < var15) {
						var10 = var14;
						var15 = this.field398[var14];
					}
				} else if (var11 == 1 && this.field386[var14] < var15) {
					var10 = var14;
					var15 = this.field386[var14];
				}
			}

			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field343 = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field343;
				this.field343 = (byte)((this.field343 + 1) % 4);
				if (this.field398[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}

		if (var10 >= 0) {
			this.field357[var10] = var1;
			this.field386[var10] = var2;
			this.field402[var10] = var3;
			this.field374[var10] = var4;
			this.field398[var10] = var6 + var5 + var12;
		}
	}

	final void method290(int var1, int var2, int var3, int var4, int var5, int var6) {
		class161 var8 = class432.method1955(var1, (byte)-1);
		class15 var9 = null;
		class15 var10 = null;
		int var11 = var8.field1156;
		int var12 = 0;

		class15 var13;
		for (var13 = (class15)this.field362.method2088(); null != var13; var13 = (class15)this.field362.method2097()) {
			++var12;
			if (var8.field1154 == var13.field80.field1154) {
				var13.method65(var4 + var2, var5, var6, var3);
				return;
			}

			if (var13.field80.field1160 <= var8.field1160) {
				var9 = var13;
			}

			if (var13.field80.field1156 > var11) {
				var10 = var13;
				var11 = var13.field80.field1156;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new class15(var8);
			if (null == var9) {
				this.field362.method2094(var13);
			} else {
				class444.method2087(var13, var9);
			}

			var13.method65(var4 + var2, var5, var6, var3);
			if (var12 >= 4) {
				var10.method1719();
			}

		}
	}

	final void method293(int var1) {
		class161 var3 = class432.method1955(var1, (byte)-1);

		for (class15 var4 = (class15)this.field362.method2088(); null != var4; var4 = (class15)this.field362.method2097()) {
			if (var3 == var4.field80) {
				var4.method1719();
				return;
			}
		}

	}

	void method292(int var1, int var2, int var3, int var4) {
		int var6 = Client.field1846 + var4;
		class546 var7 = (class546)this.field378.method1533((long)var1);
		if (null != var7) {
			var7.method1719();
			--this.field379;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var8 = 0;
			if (var4 > 0) {
				var8 = -1;
			}

			this.field378.method1534(new class546(var2, var3, var6, var8), (long)var1);
			++this.field379;
		}
	}

	class301 method291() {
		return this.field378;
	}

	void method295() {
		class287 var2 = new class287(this.field378);

		for (class546 var3 = (class546)var2.method1513(); var3 != null; var3 = (class546)var2.next()) {
			var3.method1719();
		}

		this.field379 = 0;
	}

	class490 method296(class490 var1) {
		if (this.field379 == 0) {
			return var1;
		} else {
			class287 var3 = new class287(this.field378);
			int var4 = var1.field3491;
			int var5 = var1.field3448;
			int var6 = var1.field3446;
			byte var7 = var1.field3445;

			for (class546 var8 = (class546)var3.method1513(); null != var8; var8 = (class546)var3.next()) {
				if (var8.field4254 != -1) {
					class490 var9 = class137.method707(var8.field4255).method704();
					if (null != var9) {
						var4 += var9.field3491;
						var5 += var9.field3448;
						var6 += var9.field3446;
					}
				}
			}

			class490 var11 = new class490(var4, var5, var6, var7);
			var11.method2256(var1);

			for (class546 var12 = (class546)var3.method1513(); null != var12; var12 = (class546)var3.next()) {
				if (var12.field4254 != -1) {
					class490 var10 = class137.method707(var12.field4255).method703(var12.field4254);
					if (var10 != null) {
						var10.method2272(0, -var12.field4257, 0);
						var11.method2256(var10);
					}
				}
			}

			return var11;
		}
	}

	void method294() {
		this.field382 = false;
		this.field365 = -1;
		this.field366 = -1;
		this.field367 = -1;
	}

	public static byte method298(char var0) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var2 = -128;
			} else if (var0 == 8218) {
				var2 = -126;
			} else if (var0 == 402) {
				var2 = -125;
			} else if (var0 == 8222) {
				var2 = -124;
			} else if (var0 == 8230) {
				var2 = -123;
			} else if (var0 == 8224) {
				var2 = -122;
			} else if (var0 == 8225) {
				var2 = -121;
			} else if (var0 == 710) {
				var2 = -120;
			} else if (var0 == 8240) {
				var2 = -119;
			} else if (var0 == 352) {
				var2 = -118;
			} else if (var0 == 8249) {
				var2 = -117;
			} else if (var0 == 338) {
				var2 = -116;
			} else if (var0 == 381) {
				var2 = -114;
			} else if (var0 == 8216) {
				var2 = -111;
			} else if (var0 == 8217) {
				var2 = -110;
			} else if (var0 == 8220) {
				var2 = -109;
			} else if (var0 == 8221) {
				var2 = -108;
			} else if (var0 == 8226) {
				var2 = -107;
			} else if (var0 == 8211) {
				var2 = -106;
			} else if (var0 == 8212) {
				var2 = -105;
			} else if (var0 == 732) {
				var2 = -104;
			} else if (var0 == 8482) {
				var2 = -103;
			} else if (var0 == 353) {
				var2 = -102;
			} else if (var0 == 8250) {
				var2 = -101;
			} else if (var0 == 339) {
				var2 = -100;
			} else if (var0 == 382) {
				var2 = -98;
			} else if (var0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
		} else {
			var2 = (byte)var0;
		}

		return var2;
	}
}
