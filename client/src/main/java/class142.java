public class class142 {
	public static boolean field942;
	public static int field969;
	public static int field983;
	static boolean field960;
	static boolean field971;
	static boolean[][] field949;
	static boolean[][][][] field988;
	static class486[] field950;
	static class62[] field976;
	static class62[][] field980;
	static class69 field977;
	static int field941;
	static int field944;
	static int field948;
	static int field952;
	static int field953;
	static int field954;
	static int field955;
	static int field956;
	static int field958;
	static int field959;
	static int field961;
	static int field962;
	static int field963;
	static int field964;
	static int field966;
	static int field967;
	static int field968;
	static int field972;
	static int field975;
	static int field981;
	static int field986;
	static int field990;
	static int field991;
	static int field992;
	static int field993;
	static int field994;
	static int field995;
	static int[] field965;
	static final int[] field951;
	static final int[] field957;
	static final int[] field970;
	static final int[] field974;
	static final int[] field978;
	static final int[] field979;
	static final int[] field982;
	class231[][][] field989;
	class486[] field984;
	int field939;
	int field940;
	int field945;
	int field946;
	int field985;
	int[][] field973;
	int[][] field987;
	int[][][] field943;
	int[][][] field947;

	static {
		field942 = true;
		field955 = 0;
		field952 = 0;
		field950 = new class486[100];
		field960 = false;
		field966 = 0;
		field963 = 0;
		field968 = 0;
		field969 = -1;
		field983 = -1;
		field971 = false;
		field972 = 4;
		field965 = new int[field972];
		field980 = new class62[field972][500];
		field975 = 0;
		field976 = new class62[500];
		field977 = new class69();
		field978 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field979 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field970 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field957 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field982 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field974 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field951 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		field988 = new boolean[8][32][51][51];
	}

	public class142(int var1, int var2, int var3, int[][][] var4) {
		this.field945 = 0;
		this.field946 = 0;
		this.field984 = new class486[5000];
		this.field973 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field987 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field940 = var1;
		this.field939 = var2;
		this.field985 = var3;
		this.field989 = new class231[var1][var2][var3];
		this.field947 = new int[var1][var2 + 1][var3 + 1];
		this.field943 = var4;
		this.method729();
	}

	public void method729() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field940; ++var1) {
			for (var2 = 0; var2 < this.field939; ++var2) {
				for (int var3 = 0; var3 < this.field985; ++var3) {
					this.field989[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < field972; ++var1) {
			for (var2 = 0; var2 < field965[var1]; ++var2) {
				field980[var1][var2] = null;
			}

			field965[var1] = 0;
		}

		for (var1 = 0; var1 < this.field946; ++var1) {
			this.field984[var1] = null;
		}

		this.field946 = 0;

		for (var1 = 0; var1 < field950.length; ++var1) {
			field950[var1] = null;
		}

	}

	public void method730(int var1) {
		this.field945 = var1;

		for (int var2 = 0; var2 < this.field939; ++var2) {
			for (int var3 = 0; var3 < this.field985; ++var3) {
				if (this.field989[var1][var2][var3] == null) {
					this.field989[var1][var2][var3] = new class231(var1, var2, var3);
				}
			}
		}

	}

	public void method731(int var1, int var2) {
		class231 var3 = this.field989[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			class231 var5 = this.field989[var4][var1][var2] = this.field989[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field1511;

				for (int var6 = 0; var6 < var5.field1526; ++var6) {
					class486 var7 = var5.field1517[var6];
					if (class503.method2380(var7.field3418) && var7.field3412 == var1 && var7.field3414 == var2) {
						--var7.field3407;
					}
				}
			}
		}

		if (this.field989[0][var1][var2] == null) {
			this.field989[0][var1][var2] = new class231(0, var1, var2);
		}

		this.field989[0][var1][var2].field1528 = var3;
		this.field989[3][var1][var2] = null;
	}

	public void method733(int var1, int var2, int var3, int var4) {
		class231 var5 = this.field989[var1][var2][var3];
		if (var5 != null) {
			this.field989[var1][var2][var3].field1520 = var4;
		}
	}

	public void method734(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		class204 var21;
		int var22;
		if (var4 == 0) {
			var21 = new class204(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field989[var22][var2][var3] == null) {
					this.field989[var22][var2][var3] = new class231(var22, var2, var3);
				}
			}

			this.field989[var1][var2][var3].field1510 = var21;
		} else if (var4 != 1) {
			class314 var23 = new class314(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field989[var22][var2][var3] == null) {
					this.field989[var22][var2][var3] = new class231(var22, var2, var3);
				}
			}

			this.field989[var1][var2][var3].field1516 = var23;
		} else {
			var21 = new class204(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field989[var22][var2][var3] == null) {
					this.field989[var22][var2][var3] = new class231(var22, var2, var3);
				}
			}

			this.field989[var1][var2][var3].field1510 = var21;
		}
	}

	public void method735(int var1, int var2, int var3, int var4, class462 var5, long var6, int var8) {
		if (var5 != null) {
			class553 var9 = new class553();
			var9.field4312 = var5;
			var9.field4311 = var2 * 128 + 64;
			var9.field4314 = var3 * 128 + 64;
			var9.field4313 = var4;
			var9.field4310 = var6;
			var9.field4315 = var8;
			if (this.field989[var1][var2][var3] == null) {
				this.field989[var1][var2][var3] = new class231(var1, var2, var3);
			}

			this.field989[var1][var2][var3].field1506 = var9;
		}
	}

	public void method736(int var1, int var2, int var3, int var4, class462 var5, long var6, class462 var8, class462 var9) {
		class85 var10 = new class85();
		var10.field571 = var5;
		var10.field575 = var2 * 128 + 64;
		var10.field570 = var3 * 128 + 64;
		var10.field573 = var4;
		var10.field576 = var6;
		var10.field569 = var8;
		var10.field572 = var9;
		int var11 = 0;
		class231 var12 = this.field989[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field1526; ++var13) {
				if ((var12.field1517[var13].field3419 & 256) == 256 && var12.field1517[var13].field3411 instanceof class490) {
					class490 var14 = (class490)var12.field1517[var13].field3411;
					var14.method2261();
					if (var14.field3161 > var11) {
						var11 = var14.field3161;
					}
				}
			}
		}

		var10.field574 = var11;
		if (this.field989[var1][var2][var3] == null) {
			this.field989[var1][var2][var3] = new class231(var1, var2, var3);
		}

		this.field989[var1][var2][var3].field1515 = var10;
	}

	public void method737(int var1, int var2, int var3, int var4, class462 var5, class462 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			class493 var12 = new class493();
			var12.field3513 = var9;
			var12.field3512 = var11;
			var12.field3505 = var2 * 128 + 64;
			var12.field3507 = var3 * 128 + 64;
			var12.field3506 = var4;
			var12.field3510 = var5;
			var12.field3511 = var6;
			var12.field3508 = var7;
			var12.field3509 = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field989[var13][var2][var3] == null) {
					this.field989[var13][var2][var3] = new class231(var13, var2, var3);
				}
			}

			this.field989[var1][var2][var3].field1514 = var12;
		}
	}

	public void method738(int var1, int var2, int var3, int var4, class462 var5, class462 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			class76 var14 = new class76();
			var14.field536 = var11;
			var14.field534 = var13;
			var14.field528 = var2 * 128 + 64;
			var14.field529 = var3 * 128 + 64;
			var14.field538 = var4;
			var14.field539 = var5;
			var14.field527 = var6;
			var14.field530 = var7;
			var14.field531 = var8;
			var14.field532 = var9;
			var14.field533 = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field989[var15][var2][var3] == null) {
					this.field989[var15][var2][var3] = new class231(var15, var2, var3);
				}
			}

			this.field989[var1][var2][var3].field1507 = var14;
		}
	}

	public boolean method769(int var1, int var2, int var3, int var4, int var5, int var6, class462 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method741(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method780(int var1, int var2, int var3, int var4, int var5, class462 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var2 + var5;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method741(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method740(int var1, int var2, int var3, int var4, int var5, class462 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method741(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method741(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class462 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field939 || var16 >= this.field985) {
					return false;
				}

				class231 var17 = this.field989[var1][var15][var16];
				if (var17 != null && var17.field1526 >= 5) {
					return false;
				}
			}
		}

		class486 var21 = new class486();
		var21.field3418 = var12;
		var21.field3419 = var14;
		var21.field3407 = var1;
		var21.field3409 = var6;
		var21.field3420 = var7;
		var21.field3415 = var8;
		var21.field3411 = var9;
		var21.field3408 = var10;
		var21.field3412 = var2;
		var21.field3414 = var3;
		var21.field3413 = var2 + var4 - 1;
		var21.field3410 = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var22 = var3; var22 < var3 + var5; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var22 > var3) {
					var18 += 8;
				}

				if (var22 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field989[var19][var16][var22] == null) {
						this.field989[var19][var16][var22] = new class231(var19, var16, var22);
					}
				}

				class231 var23 = this.field989[var1][var16][var22];
				var23.field1517[var23.field1526] = var21;
				var23.field1518[var23.field1526] = var18;
				var23.field1519 |= var18;
				++var23.field1526;
			}
		}

		if (var11) {
			this.field984[this.field946++] = var21;
		}

		return true;
	}

	public void method770() {
		for (int var1 = 0; var1 < this.field946; ++var1) {
			class486 var2 = this.field984[var1];
			this.method742(var2);
			this.field984[var1] = null;
		}

		this.field946 = 0;
	}

	void method742(class486 var1) {
		for (int var2 = var1.field3412; var2 <= var1.field3413; ++var2) {
			for (int var3 = var1.field3414; var3 <= var1.field3410; ++var3) {
				class231 var4 = this.field989[var1.field3407][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field1526; ++var5) {
						if (var4.field1517[var5] == var1) {
							--var4.field1526;

							for (int var6 = var5; var6 < var4.field1526; ++var6) {
								var4.field1517[var6] = var4.field1517[var6 + 1];
								var4.field1518[var6] = var4.field1518[var6 + 1];
							}

							var4.field1517[var4.field1526] = null;
							break;
						}
					}

					var4.field1519 = 0;

					for (var5 = 0; var5 < var4.field1526; ++var5) {
						var4.field1519 |= var4.field1518[var5];
					}
				}
			}
		}

	}

	public void method772(int var1, int var2, int var3, int var4) {
		class231 var5 = this.field989[var1][var2][var3];
		if (var5 != null) {
			class76 var6 = var5.field1507;
			if (var6 != null) {
				var6.field532 = var6.field532 * var4 / 16;
				var6.field533 = var6.field533 * var4 / 16;
			}
		}
	}

	public void method743(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 != null) {
			var4.field1514 = null;
		}
	}

	public void method744(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 != null) {
			var4.field1507 = null;
		}
	}

	public void method745(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field1526; ++var5) {
				class486 var6 = var4.field1517[var5];
				if (class503.method2380(var6.field3418) && var6.field3412 == var2 && var6.field3414 == var3) {
					this.method742(var6);
					return;
				}
			}

		}
	}

	public void method746(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 != null) {
			var4.field1506 = null;
		}
	}

	public void method778(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 != null) {
			var4.field1515 = null;
		}
	}

	public class493 method747(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 == null ? null : var4.field1514;
	}

	public class76 method748(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 == null ? null : var4.field1507;
	}

	public class486 method782(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field1526; ++var5) {
				class486 var6 = var4.field1517[var5];
				if (class503.method2380(var6.field3418) && var6.field3412 == var2 && var6.field3414 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public class553 method783(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 != null && var4.field1506 != null ? var4.field1506 : null;
	}

	public long method758(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 != null && var4.field1514 != null ? var4.field1514.field3513 : 0L;
	}

	public long method749(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 != null && var4.field1507 != null ? var4.field1507.field536 : 0L;
	}

	public long method750(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field1526; ++var5) {
				class486 var6 = var4.field1517[var5];
				if (class503.method2380(var6.field3418) && var6.field3412 == var2 && var6.field3414 == var3) {
					return var6.field3418;
				}
			}

			return 0L;
		}
	}

	public long method773(int var1, int var2, int var3) {
		class231 var4 = this.field989[var1][var2][var3];
		return var4 != null && var4.field1506 != null ? var4.field1506.field4310 : 0L;
	}

	public int method762(int var1, int var2, int var3, long var4) {
		class231 var6 = this.field989[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field1514 != null && var6.field1514.field3513 == var4) {
			return var6.field1514.field3512 & 255;
		} else if (var6.field1507 != null && var6.field1507.field536 == var4) {
			return var6.field1507.field534 & 255;
		} else if (var6.field1506 != null && var6.field1506.field4310 == var4) {
			return var6.field1506.field4315 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field1526; ++var7) {
				if (var6.field1517[var7].field3418 == var4) {
					return var6.field1517[var7].field3419 & 255;
				}
			}

			return -1;
		}
	}

	public void method752(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field940; ++var4) {
			for (int var5 = 0; var5 < this.field939; ++var5) {
				for (int var6 = 0; var6 < this.field985; ++var6) {
					class231 var7 = this.field989[var4][var5][var6];
					if (var7 != null) {
						class493 var8 = var7.field1514;
						class239 var10;
						if (var8 != null && var8.field3510 instanceof class239) {
							class239 var9 = (class239)var8.field3510;
							this.method753(var9, var4, var5, var6, 1, 1);
							if (var8.field3511 instanceof class239) {
								var10 = (class239)var8.field3511;
								this.method753(var10, var4, var5, var6, 1, 1);
								class239.method1106(var9, var10, 0, 0, 0, false);
								var8.field3511 = var10.method1107(var10.field1602, var10.field1603, -50, -10, -50);
							}

							var8.field3510 = var9.method1107(var9.field1602, var9.field1603, -50, -10, -50);
						}

						for (int var12 = 0; var12 < var7.field1526; ++var12) {
							class486 var14 = var7.field1517[var12];
							if (var14 != null && var14.field3411 instanceof class239) {
								class239 var11 = (class239)var14.field3411;
								this.method753(var11, var4, var5, var6, var14.field3413 - var14.field3412 + 1, var14.field3410 - var14.field3414 + 1);
								var14.field3411 = var11.method1107(var11.field1602, var11.field1603, -50, -10, -50);
							}
						}

						class553 var13 = var7.field1506;
						if (var13 != null && var13.field4312 instanceof class239) {
							var10 = (class239)var13.field4312;
							this.method766(var10, var4, var5, var6);
							var13.field4312 = var10.method1107(var10.field1602, var10.field1603, -50, -10, -50);
						}
					}
				}
			}
		}

	}

	void method766(class239 var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.field939) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.field985 && (var9 >= var6 || var10 >= var8)) {
						class231 var11 = this.field989[var2][var9][var10];
						if (var11 != null && var11.field1506 != null && var11.field1506.field4312 instanceof class239) {
							int var12 = this.method754(var2, var9, var10, var2, var3, var4);
							class239 var13 = (class239)var11.field1506.field4312;
							class239.method1106(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	void method753(class239 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.field940) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field939) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field985 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								class231 var15 = this.field989[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method754(var12, var13, var14, var2, var3, var4);
									class493 var17 = var15.field1514;
									if (var17 != null) {
										class239 var18;
										if (var17.field3510 instanceof class239) {
											var18 = (class239)var17.field3510;
											class239.method1106(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.field3511 instanceof class239) {
											var18 = (class239)var17.field3511;
											class239.method1106(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.field1526; ++var23) {
										class486 var19 = var15.field1517[var23];
										if (var19 != null && var19.field3411 instanceof class239) {
											class239 var20 = (class239)var19.field3411;
											int var21 = var19.field3413 - var19.field3412 + 1;
											int var22 = var19.field3410 - var19.field3414 + 1;
											class239.method1106(var1, var20, (var19.field3412 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field3414 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	int method754(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method755(var1, var2, var3) - this.method755(var4, var5, var6);
	}

	int method755(int var1, int var2, int var3) {
		return (this.field943[var1][var2][var3] + this.field943[var1][var2 + 1][var3] + this.field943[var1][var2][var3 + 1] + this.field943[var1][var2 + 1][var3 + 1]) / 4;
	}

	public void method756(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class231 var7 = this.field989[var4][var5][var6];
		if (var7 != null) {
			class204 var8 = var7.field1510;
			int var10;
			if (var8 != null) {
				int var18 = var8.field1371;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += 512;
					}

				}
			} else {
				class314 var9 = var7.field1516;
				if (var9 != null) {
					var10 = var9.field2286;
					int var11 = var9.field2287;
					int var12 = var9.field2288;
					int var13 = var9.field2281;
					int[] var14 = this.field973[var10];
					int[] var15 = this.field987[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += 512;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += 512;
						}
					}

				}
			}
		}
	}

	public void method759(int var1, int var2, int var3, boolean var4) {
		if (!method761() || var4) {
			field960 = true;
			field971 = var4;
			field966 = var1;
			field963 = var2;
			field968 = var3;
			field969 = -1;
			field983 = -1;
		}
	}

	public void method760() {
		field971 = true;
	}

	public void method763(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field939 * 128) {
			var1 = this.field939 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field985 * 128) {
			var3 = this.field985 * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		++field953;
		field986 = class105.field670[var4];
		field981 = class105.field671[var4];
		field964 = class105.field670[var5];
		field948 = class105.field671[var5];
		field949 = field988[(var4 - 128) / 32][var5 / 64];
		field967 = var1;
		field961 = var2;
		field962 = var3;
		field958 = var1 / 128;
		field959 = var3 / 128;
		field952 = var6;
		field954 = field958 - 25;
		if (field954 < 0) {
			field954 = 0;
		}

		field956 = field959 - 25;
		if (field956 < 0) {
			field956 = 0;
		}

		field944 = field958 + 25;
		if (field944 > this.field939) {
			field944 = this.field939;
		}

		field941 = field959 + 25;
		if (field941 > this.field985) {
			field941 = this.field985;
		}

		this.method767();
		field955 = 0;

		int var7;
		class231[][] var8;
		int var9;
		int var10;
		for (var7 = this.field945; var7 < this.field940; ++var7) {
			var8 = this.field989[var7];

			for (var9 = field954; var9 < field944; ++var9) {
				for (var10 = field956; var10 < field941; ++var10) {
					class231 var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field1520 > var6 || !field949[var9 - field958 + 25][var10 - field959 + 25] && this.field943[var7][var9][var10] - var2 < 2000) {
							var11.field1521 = false;
							var11.field1522 = false;
							var11.field1524 = 0;
						} else {
							var11.field1521 = true;
							var11.field1522 = true;
							if (var11.field1526 > 0) {
								var11.field1523 = true;
							} else {
								var11.field1523 = false;
							}

							++field955;
						}
					}
				}
			}
		}

		int var12;
		int var13;
		int var14;
		class231 var15;
		int var16;
		for (var7 = this.field945; var7 < this.field940; ++var7) {
			var8 = this.field989[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field958 + var9;
				var16 = field958 - var9;
				if (var10 >= field954 || var16 < field944) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field959 + var12;
						var14 = field959 - var12;
						if (var10 >= field954) {
							if (var13 >= field956) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field1521) {
									this.method779(var15, true);
								}
							}

							if (var14 < field941) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field1521) {
									this.method779(var15, true);
								}
							}
						}

						if (var16 < field944) {
							if (var13 >= field956) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field1521) {
									this.method779(var15, true);
								}
							}

							if (var14 < field941) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field1521) {
									this.method779(var15, true);
								}
							}
						}

						if (field955 == 0) {
							field960 = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = this.field945; var7 < this.field940; ++var7) {
			var8 = this.field989[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field958 + var9;
				var16 = field958 - var9;
				if (var10 >= field954 || var16 < field944) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field959 + var12;
						var14 = field959 - var12;
						if (var10 >= field954) {
							if (var13 >= field956) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field1521) {
									this.method779(var15, false);
								}
							}

							if (var14 < field941) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field1521) {
									this.method779(var15, false);
								}
							}
						}

						if (var16 < field944) {
							if (var13 >= field956) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field1521) {
									this.method779(var15, false);
								}
							}

							if (var14 < field941) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field1521) {
									this.method779(var15, false);
								}
							}
						}

						if (field955 == 0) {
							field960 = false;
							return;
						}
					}
				}
			}
		}

		field960 = false;
	}

	void method779(class231 var1, boolean var2) {
		field977.method323(var1);

		while (true) {
			class231 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			class231[][] var8;
			class231 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class493 var10;
										class486 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										class231 var33;
										while (true) {
											do {
												var3 = (class231)field977.method326();
												if (var3 == null) {
													return;
												}
											} while(!var3.field1522);

											var4 = var3.field1513;
											var5 = var3.field1508;
											var6 = var3.field1511;
											var7 = var3.field1509;
											var8 = this.field989[var6];
											if (!var3.field1521) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.field989[var6 - 1][var4][var5];
													if (var9 != null && var9.field1522) {
														continue;
													}
												}

												if (var4 <= field958 && var4 > field954) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.field1522 && (var9.field1521 || (var3.field1519 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= field958 && var4 < field944 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.field1522 && (var9.field1521 || (var3.field1519 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= field959 && var5 > field956) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.field1522 && (var9.field1521 || (var3.field1519 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= field959 && var5 < field941 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.field1522 && (var9.field1521 || (var3.field1519 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.field1521 = false;
											if (var3.field1528 != null) {
												var9 = var3.field1528;
												if (var9.field1510 != null) {
													if (!this.method751(0, var4, var5)) {
														this.method764(var9.field1510, 0, field986, field981, field964, field948, var4, var5);
													}
												} else if (var9.field1516 != null && !this.method751(0, var4, var5)) {
													this.method765(var9.field1516, field986, field981, field964, field948, var4, var5);
												}

												var10 = var9.field1514;
												if (var10 != null) {
													var10.field3510.method2153(0, field986, field981, field964, field948, var10.field3505 - field967, var10.field3506 - field961, var10.field3507 - field962, var10.field3513);
												}

												for (var11 = 0; var11 < var9.field1526; ++var11) {
													var12 = var9.field1517[var11];
													if (var12 != null) {
														var12.field3411.method2153(var12.field3408, field986, field981, field964, field948, var12.field3409 - field967, var12.field3415 - field961, var12.field3420 - field962, var12.field3418);
													}
												}
											}

											var22 = false;
											if (var3.field1510 != null) {
												if (!this.method751(var7, var4, var5)) {
													var22 = true;
													if (var3.field1510.field1370 != 12345678 || field960 && var6 <= field966) {
														this.method764(var3.field1510, var7, field986, field981, field964, field948, var4, var5);
													}
												}
											} else if (var3.field1516 != null && !this.method751(var7, var4, var5)) {
												var22 = true;
												this.method765(var3.field1516, field986, field981, field964, field948, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											class493 var23 = var3.field1514;
											class76 var13 = var3.field1507;
											if (var23 != null || var13 != null) {
												if (field958 == var4) {
													++var21;
												} else if (field958 < var4) {
													var21 += 2;
												}

												if (field959 == var5) {
													var21 += 3;
												} else if (field959 > var5) {
													var21 += 6;
												}

												var11 = field978[var21];
												var3.field1527 = field970[var21];
											}

											if (var23 != null) {
												if ((var23.field3508 & field979[var21]) != 0) {
													if (var23.field3508 == 16) {
														var3.field1524 = 3;
														var3.field1525 = field957[var21];
														var3.field1512 = 3 - var3.field1525;
													} else if (var23.field3508 == 32) {
														var3.field1524 = 6;
														var3.field1525 = field982[var21];
														var3.field1512 = 6 - var3.field1525;
													} else if (var23.field3508 == 64) {
														var3.field1524 = 12;
														var3.field1525 = field974[var21];
														var3.field1512 = 12 - var3.field1525;
													} else {
														var3.field1524 = 9;
														var3.field1525 = field951[var21];
														var3.field1512 = 9 - var3.field1525;
													}
												} else {
													var3.field1524 = 0;
												}

												if ((var23.field3508 & var11) != 0 && !this.method776(var7, var4, var5, var23.field3508)) {
													var23.field3510.method2153(0, field986, field981, field964, field948, var23.field3505 - field967, var23.field3506 - field961, var23.field3507 - field962, var23.field3513);
												}

												if ((var23.field3509 & var11) != 0 && !this.method776(var7, var4, var5, var23.field3509)) {
													var23.field3511.method2153(0, field986, field981, field964, field948, var23.field3505 - field967, var23.field3506 - field961, var23.field3507 - field962, var23.field3513);
												}
											}

											if (var13 != null && !this.method781(var7, var4, var5, var13.field539.field3161)) {
												if ((var13.field530 & var11) != 0) {
													var13.field539.method2153(0, field986, field981, field964, field948, var13.field528 - field967 + var13.field532, var13.field538 - field961, var13.field529 - field962 + var13.field533, var13.field536);
												} else if (var13.field530 == 256) {
													var14 = var13.field528 - field967;
													var15 = var13.field538 - field961;
													var16 = var13.field529 - field962;
													var17 = var13.field531;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.field539.method2153(0, field986, field981, field964, field948, var14 + var13.field532, var15, var16 + var13.field533, var13.field536);
													} else if (var13.field527 != null) {
														var13.field527.method2153(0, field986, field981, field964, field948, var14, var15, var16, var13.field536);
													}
												}
											}

											if (var22) {
												class553 var27 = var3.field1506;
												if (var27 != null) {
													var27.field4312.method2153(0, field986, field981, field964, field948, var27.field4311 - field967, var27.field4313 - field961, var27.field4314 - field962, var27.field4310);
												}

												class85 var31 = var3.field1515;
												if (var31 != null && var31.field574 == 0) {
													if (var31.field569 != null) {
														var31.field569.method2153(0, field986, field981, field964, field948, var31.field575 - field967, var31.field573 - field961, var31.field570 - field962, var31.field576);
													}

													if (var31.field572 != null) {
														var31.field572.method2153(0, field986, field981, field964, field948, var31.field575 - field967, var31.field573 - field961, var31.field570 - field962, var31.field576);
													}

													if (var31.field571 != null) {
														var31.field571.method2153(0, field986, field981, field964, field948, var31.field575 - field967, var31.field573 - field961, var31.field570 - field962, var31.field576);
													}
												}
											}

											var14 = var3.field1519;
											if (var14 != 0) {
												if (var4 < field958 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.field1522) {
														field977.method323(var33);
													}
												}

												if (var5 < field959 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.field1522) {
														field977.method323(var33);
													}
												}

												if (var4 > field958 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.field1522) {
														field977.method323(var33);
													}
												}

												if (var5 > field959 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.field1522) {
														field977.method323(var33);
													}
												}
											}
											break;
										}

										if (var3.field1524 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.field1526; ++var21) {
												if (var3.field1517[var21].field3417 != field953 && (var3.field1518[var21] & var3.field1524) == var3.field1525) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.field1514;
												if (!this.method776(var7, var4, var5, var10.field3508)) {
													var10.field3510.method2153(0, field986, field981, field964, field948, var10.field3505 - field967, var10.field3506 - field961, var10.field3507 - field962, var10.field3513);
												}

												var3.field1524 = 0;
											}
										}

										if (!var3.field1523) {
											break;
										}

										try {
											int var25 = var3.field1526;
											var3.field1523 = false;
											var21 = 0;

											label563:
											for (var11 = 0; var11 < var25; ++var11) {
												var12 = var3.field1517[var11];
												if (var12.field3417 != field953) {
													for (var26 = var12.field3412; var26 <= var12.field3413; ++var26) {
														for (var14 = var12.field3414; var14 <= var12.field3410; ++var14) {
															var33 = var8[var26][var14];
															if (var33.field1521) {
																var3.field1523 = true;
																continue label563;
															}

															if (var33.field1524 != 0) {
																var16 = 0;
																if (var26 > var12.field3412) {
																	++var16;
																}

																if (var26 < var12.field3413) {
																	var16 += 4;
																}

																if (var14 > var12.field3414) {
																	var16 += 8;
																}

																if (var14 < var12.field3410) {
																	var16 += 2;
																}

																if ((var16 & var33.field1524) == var3.field1512) {
																	var3.field1523 = true;
																	continue label563;
																}
															}
														}
													}

													field950[var21++] = var12;
													var26 = field958 - var12.field3412;
													var14 = var12.field3413 - field958;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = field959 - var12.field3414;
													var16 = var12.field3410 - field959;
													if (var16 > var15) {
														var12.field3416 = var26 + var16;
													} else {
														var12.field3416 = var26 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; ++var26) {
													class486 var34 = field950[var26];
													if (var34.field3417 != field953) {
														if (var34.field3416 > var11) {
															var11 = var34.field3416;
															var24 = var26;
														} else if (var34.field3416 == var11) {
															var15 = var34.field3409 - field967;
															var16 = var34.field3420 - field962;
															var17 = field950[var24].field3409 - field967;
															var18 = field950[var24].field3420 - field962;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												class486 var35 = field950[var24];
												var35.field3417 = field953;
												if (!this.method768(var7, var35.field3412, var35.field3413, var35.field3414, var35.field3410, var35.field3411.field3161)) {
													var35.field3411.method2153(var35.field3408, field986, field981, field964, field948, var35.field3409 - field967, var35.field3415 - field961, var35.field3420 - field962, var35.field3418);
												}

												for (var14 = var35.field3412; var14 <= var35.field3413; ++var14) {
													for (var15 = var35.field3414; var15 <= var35.field3410; ++var15) {
														class231 var36 = var8[var14][var15];
														if (var36.field1524 != 0) {
															field977.method323(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.field1522) {
															field977.method323(var36);
														}
													}
												}
											}

											if (!var3.field1523) {
												break;
											}
										} catch (Exception var20) {
											var3.field1523 = false;
											break;
										}
									}
								} while(!var3.field1522);
							} while(var3.field1524 != 0);

							if (var4 > field958 || var4 <= field954) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while(var9 != null && var9.field1522);

						if (var4 < field958 || var4 >= field944 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while(var9 != null && var9.field1522);

					if (var5 > field959 || var5 <= field956) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while(var9 != null && var9.field1522);

				if (var5 < field959 || var5 >= field941 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while(var9 != null && var9.field1522);

			var3.field1522 = false;
			--field955;
			class85 var29 = var3.field1515;
			if (var29 != null && var29.field574 != 0) {
				if (var29.field569 != null) {
					var29.field569.method2153(0, field986, field981, field964, field948, var29.field575 - field967, var29.field573 - field961 - var29.field574, var29.field570 - field962, var29.field576);
				}

				if (var29.field572 != null) {
					var29.field572.method2153(0, field986, field981, field964, field948, var29.field575 - field967, var29.field573 - field961 - var29.field574, var29.field570 - field962, var29.field576);
				}

				if (var29.field571 != null) {
					var29.field571.method2153(0, field986, field981, field964, field948, var29.field575 - field967, var29.field573 - field961 - var29.field574, var29.field570 - field962, var29.field576);
				}
			}

			if (var3.field1527 != 0) {
				class76 var30 = var3.field1507;
				if (var30 != null && !this.method781(var7, var4, var5, var30.field539.field3161)) {
					if ((var30.field530 & var3.field1527) != 0) {
						var30.field539.method2153(0, field986, field981, field964, field948, var30.field528 - field967 + var30.field532, var30.field538 - field961, var30.field529 - field962 + var30.field533, var30.field536);
					} else if (var30.field530 == 256) {
						var11 = var30.field528 - field967;
						var24 = var30.field538 - field961;
						var26 = var30.field529 - field962;
						var14 = var30.field531;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var30.field539.method2153(0, field986, field981, field964, field948, var11 + var30.field532, var24, var26 + var30.field533, var30.field536);
						} else if (var30.field527 != null) {
							var30.field527.method2153(0, field986, field981, field964, field948, var11, var24, var26, var30.field536);
						}
					}
				}

				class493 var28 = var3.field1514;
				if (var28 != null) {
					if ((var28.field3509 & var3.field1527) != 0 && !this.method776(var7, var4, var5, var28.field3509)) {
						var28.field3511.method2153(0, field986, field981, field964, field948, var28.field3505 - field967, var28.field3506 - field961, var28.field3507 - field962, var28.field3513);
					}

					if ((var28.field3508 & var3.field1527) != 0 && !this.method776(var7, var4, var5, var28.field3508)) {
						var28.field3510.method2153(0, field986, field981, field964, field948, var28.field3505 - field967, var28.field3506 - field961, var28.field3507 - field962, var28.field3513);
					}
				}
			}

			class231 var32;
			if (var6 < this.field940 - 1) {
				var32 = this.field989[var6 + 1][var4][var5];
				if (var32 != null && var32.field1522) {
					field977.method323(var32);
				}
			}

			if (var4 < field958) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.field1522) {
					field977.method323(var32);
				}
			}

			if (var5 < field959) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.field1522) {
					field977.method323(var32);
				}
			}

			if (var4 > field958) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.field1522) {
					field977.method323(var32);
				}
			}

			if (var5 > field959) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.field1522) {
					field977.method323(var32);
				}
			}
		}
	}

	void method764(class204 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - field967;
		int var11;
		int var12 = var11 = (var8 << 7) - field962;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field943[var2][var7][var8] - field961;
		int var18 = this.field943[var2][var7 + 1][var8] - field961;
		int var19 = this.field943[var2][var7 + 1][var8 + 1] - field961;
		int var20 = this.field943[var2][var7][var8 + 1] - field961;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = class105.method495() + var10 * class105.method482() / var12;
						int var23 = class105.method494() + var17 * class105.method482() / var12;
						int var24 = class105.method495() + var14 * class105.method482() / var11;
						int var25 = class105.method494() + var18 * class105.method482() / var11;
						int var26 = class105.method495() + var13 * class105.method482() / var16;
						int var27 = class105.method494() + var19 * class105.method482() / var16;
						int var28 = class105.method495() + var9 * class105.method482() / var15;
						int var29 = class105.method494() + var21 * class105.method482() / var15;
						float var30 = class79.method390(var12);
						float var31 = class79.method390(var11);
						float var32 = class79.method390(var16);
						float var33 = class79.method390(var15);
						class105.field668.field1729 = 0;
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							class105.field668.field1731 = false;
							var34 = class105.method496();
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
								class105.field668.field1731 = true;
							}

							if (field960 && method771(field963, field968, var27, var29, var25, var26, var28, var24)) {
								field969 = var7;
								field983 = var8;
							}

							if (var1.field1366 == -1) {
								if (var1.field1370 != 12345678) {
									class105.method489(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1370, var1.field1367, var1.field1365);
								}
							} else if (!field942) {
								if (var1.field1368) {
									class105.method484(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1370, var1.field1367, var1.field1365, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1366);
								} else {
									class105.method484(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1370, var1.field1367, var1.field1365, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1366);
								}
							} else {
								var35 = class105.field668.field1730.method2620(var1.field1366);
								class105.method489(var27, var29, var25, var26, var28, var24, var32, var33, var31, method774(var35, var1.field1370), method774(var35, var1.field1367), method774(var35, var1.field1365));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							class105.field668.field1731 = false;
							var34 = class105.method496();
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
								class105.field668.field1731 = true;
							}

							if (field960 && method771(field963, field968, var23, var25, var29, var22, var24, var28)) {
								field969 = var7;
								field983 = var8;
							}

							if (var1.field1366 == -1) {
								if (var1.field1369 != 12345678) {
									class105.method489(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1369, var1.field1365, var1.field1367);
								}
							} else if (!field942) {
								class105.method484(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1369, var1.field1365, var1.field1367, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1366);
							} else {
								var35 = class105.field668.field1730.method2620(var1.field1366);
								class105.method489(var23, var25, var29, var22, var24, var28, var30, var31, var33, method774(var35, var1.field1369), method774(var35, var1.field1365), method774(var35, var1.field1367));
							}
						}

					}
				}
			}
		}
	}

	void method765(class314 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.field2289.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2289[var9] - field967;
			var11 = var1.field2280[var9] - field961;
			var12 = var1.field2277[var9] - field962;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.field2284 != null) {
				class314.field2293[var9] = var10;
				class314.field2294[var9] = var13;
				class314.field2295[var9] = var12;
			}

			class314.field2290[var9] = class105.method495() + var10 * class105.method482() / var12;
			class314.field2291[var9] = class105.method494() + var13 * class105.method482() / var12;
			class314.field2296[var9] = class79.method390(var12);
		}

		class105.field668.field1729 = 0;
		var8 = var1.field2276.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2276[var9];
			var11 = var1.field2285[var9];
			var12 = var1.field2283[var9];
			var13 = class314.field2290[var10];
			int var14 = class314.field2290[var11];
			int var15 = class314.field2290[var12];
			int var16 = class314.field2291[var10];
			int var17 = class314.field2291[var11];
			int var18 = class314.field2291[var12];
			float var19 = class314.field2296[var10];
			float var20 = class314.field2296[var11];
			float var21 = class314.field2296[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				class105.field668.field1731 = false;
				int var22 = class105.method496();
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
					class105.field668.field1731 = true;
				}

				if (field960 && method771(field963, field968, var16, var17, var18, var13, var14, var15)) {
					field969 = var6;
					field983 = var7;
				}

				if (var1.field2284 != null && var1.field2284[var9] != -1) {
					if (!field942) {
						if (var1.field2292) {
							class105.method484(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2278[var9], var1.field2279[var9], var1.field2282[var9], class314.field2293[0], class314.field2293[1], class314.field2293[3], class314.field2294[0], class314.field2294[1], class314.field2294[3], class314.field2295[0], class314.field2295[1], class314.field2295[3], var1.field2284[var9]);
						} else {
							class105.method484(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2278[var9], var1.field2279[var9], var1.field2282[var9], class314.field2293[var10], class314.field2293[var11], class314.field2293[var12], class314.field2294[var10], class314.field2294[var11], class314.field2294[var12], class314.field2295[var10], class314.field2295[var11], class314.field2295[var12], var1.field2284[var9]);
						}
					} else {
						int var23 = class105.field668.field1730.method2620(var1.field2284[var9]);
						class105.method489(var16, var17, var18, var13, var14, var15, var19, var20, var21, method774(var23, var1.field2278[var9]), method774(var23, var1.field2279[var9]), method774(var23, var1.field2282[var9]));
					}
				} else if (var1.field2278[var9] != 12345678) {
					class105.method489(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2278[var9], var1.field2279[var9], var1.field2282[var9]);
				}
			}
		}

	}

	void method767() {
		int var1 = field965[field952];
		class62[] var2 = field980[field952];
		field975 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			class62 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field286 == 1) {
				var5 = var4.field285 - field958 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field294 - field959 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field284 - field959 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field949[var5][var6++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field967 - var4.field287;
						if (var9 > 32) {
							var4.field292 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field292 = 2;
							var9 = -var9;
						}

						var4.field295 = (var4.field288 - field962 << 8) / var9;
						var4.field296 = (var4.field289 - field962 << 8) / var9;
						var4.field290 = (var4.field293 - field961 << 8) / var9;
						var4.field298 = (var4.field291 - field961 << 8) / var9;
						field976[field975++] = var4;
					}
				}
			} else if (var4.field286 == 2) {
				var5 = var4.field294 - field959 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field285 - field958 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field282 - field958 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field949[var6++][var5]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field962 - var4.field288;
						if (var9 > 32) {
							var4.field292 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field292 = 4;
							var9 = -var9;
						}

						var4.field281 = (var4.field287 - field967 << 8) / var9;
						var4.field297 = (var4.field283 - field967 << 8) / var9;
						var4.field290 = (var4.field293 - field961 << 8) / var9;
						var4.field298 = (var4.field291 - field961 << 8) / var9;
						field976[field975++] = var4;
					}
				}
			} else if (var4.field286 == 4) {
				var5 = var4.field293 - field961;
				if (var5 > 128) {
					var6 = var4.field294 - field959 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field284 - field959 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var8 = var4.field285 - field958 + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.field282 - field958 + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label144:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (field949[var11][var12]) {
									var10 = true;
									break label144;
								}
							}
						}

						if (var10) {
							var4.field292 = 5;
							var4.field281 = (var4.field287 - field967 << 8) / var5;
							var4.field297 = (var4.field283 - field967 << 8) / var5;
							var4.field295 = (var4.field288 - field962 << 8) / var5;
							var4.field296 = (var4.field289 - field962 << 8) / var5;
							field976[field975++] = var4;
						}
					}
				}
			}
		}

	}

	boolean method751(int var1, int var2, int var3) {
		int var4 = this.field947[var1][var2][var3];
		if (var4 == -field953) {
			return false;
		} else if (var4 == field953) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method777(var5 + 1, this.field943[var1][var2][var3], var6 + 1) && this.method777(var5 + 128 - 1, this.field943[var1][var2 + 1][var3], var6 + 1) && this.method777(var5 + 128 - 1, this.field943[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method777(var5 + 1, this.field943[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field947[var1][var2][var3] = field953;
				return true;
			} else {
				this.field947[var1][var2][var3] = -field953;
				return false;
			}
		}
	}

	boolean method776(int var1, int var2, int var3, int var4) {
		if (!this.method751(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field943[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > field967) {
						if (!this.method777(var5, var7, var6)) {
							return false;
						}

						if (!this.method777(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method777(var5, var8, var6)) {
							return false;
						}

						if (!this.method777(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method777(var5, var9, var6)) {
						return false;
					}

					if (!this.method777(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < field962) {
						if (!this.method777(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method777(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method777(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method777(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method777(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method777(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < field967) {
						if (!this.method777(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method777(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method777(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method777(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method777(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method777(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > field962) {
						if (!this.method777(var5, var7, var6)) {
							return false;
						}

						if (!this.method777(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method777(var5, var8, var6)) {
							return false;
						}

						if (!this.method777(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method777(var5, var9, var6)) {
						return false;
					}

					if (!this.method777(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method777(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method777(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method777(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method777(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method777(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	boolean method781(int var1, int var2, int var3, int var4) {
		if (!this.method751(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method777(var5 + 1, this.field943[var1][var2][var3] - var4, var6 + 1) && this.method777(var5 + 128 - 1, this.field943[var1][var2 + 1][var3] - var4, var6 + 1) && this.method777(var5 + 128 - 1, this.field943[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method777(var5 + 1, this.field943[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method768(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method751(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method777(var7 + 1, this.field943[var1][var2][var4] - var6, var8 + 1) && this.method777(var7 + 128 - 1, this.field943[var1][var2 + 1][var4] - var6, var8 + 1) && this.method777(var7 + 128 - 1, this.field943[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method777(var7 + 1, this.field943[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field947[var1][var7][var8] == -field953) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field943[var1][var2][var4] - var6;
			if (!this.method777(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method777(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method777(var7, var9, var11)) {
						return false;
					} else if (!this.method777(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method777(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < field975; ++var4) {
			class62 var5 = field976[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field292 == 1) {
				var6 = var5.field287 - var1;
				if (var6 > 0) {
					var7 = var5.field288 + (var5.field295 * var6 >> 8);
					var8 = var5.field289 + (var5.field296 * var6 >> 8);
					var9 = var5.field293 + (var5.field290 * var6 >> 8);
					var10 = var5.field291 + (var5.field298 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field292 == 2) {
				var6 = var1 - var5.field287;
				if (var6 > 0) {
					var7 = var5.field288 + (var5.field295 * var6 >> 8);
					var8 = var5.field289 + (var5.field296 * var6 >> 8);
					var9 = var5.field293 + (var5.field290 * var6 >> 8);
					var10 = var5.field291 + (var5.field298 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field292 == 3) {
				var6 = var5.field288 - var3;
				if (var6 > 0) {
					var7 = var5.field287 + (var5.field281 * var6 >> 8);
					var8 = var5.field283 + (var5.field297 * var6 >> 8);
					var9 = var5.field293 + (var5.field290 * var6 >> 8);
					var10 = var5.field291 + (var5.field298 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field292 == 4) {
				var6 = var3 - var5.field288;
				if (var6 > 0) {
					var7 = var5.field287 + (var5.field281 * var6 >> 8);
					var8 = var5.field283 + (var5.field297 * var6 >> 8);
					var9 = var5.field293 + (var5.field290 * var6 >> 8);
					var10 = var5.field291 + (var5.field298 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field292 == 5) {
				var6 = var2 - var5.field293;
				if (var6 > 0) {
					var7 = var5.field287 + (var5.field281 * var6 >> 8);
					var8 = var5.field283 + (var5.field297 * var6 >> 8);
					var9 = var5.field288 + (var5.field295 * var6 >> 8);
					var10 = var5.field289 + (var5.field296 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void method732(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		class62 var8 = new class62();
		var8.field285 = var2 / 128;
		var8.field282 = var3 / 128;
		var8.field294 = var4 / 128;
		var8.field284 = var5 / 128;
		var8.field286 = var1;
		var8.field287 = var2;
		var8.field283 = var3;
		var8.field288 = var4;
		var8.field289 = var5;
		var8.field293 = var6;
		var8.field291 = var7;
		field980[var0][field965[var0]++] = var8;
	}

	public static void method757(int[] var0, int var1, int var2, int var3, int var4) {
		field992 = 0;
		field993 = 0;
		field994 = var3;
		field995 = 334;
		field990 = var3 / 2;
		field991 = 167;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				field986 = class105.field670[var6];
				field981 = class105.field671[var6];
				field964 = class105.field670[var7];
				field948 = class105.field671[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -500; var15 <= 800; var15 += 128) {
							if (method739(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label76:
						for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}

						field988[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method739(int var0, int var1, int var2) {
		int var3 = var2 * field964 + var0 * field948 >> 16;
		int var4 = var2 * field948 - var0 * field964 >> 16;
		int var5 = var1 * field986 + var4 * field981 >> 16;
		int var6 = var1 * field981 - var4 * field986 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field990 + var3 * 128 / var5;
			int var8 = field991 + var6 * 128 / var5;
			return var7 >= field992 && var7 <= field994 && var8 >= field993 && var8 <= field995;
		} else {
			return false;
		}
	}

	public static boolean method761() {
		return field971 && field969 != -1;
	}

	public static void method775() {
		field969 = -1;
		field971 = false;
	}

	static final int method774(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static boolean method771(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
