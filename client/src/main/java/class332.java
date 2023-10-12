public class class332 implements Runnable {
	boolean field2360;
	int field2358;
	int[] field2355;
	int[] field2357;
	Object field2356;
	long[] field2359;

	class332() {
		this.field2360 = true;
		this.field2356 = new Object();
		this.field2358 = 0;
		this.field2355 = new int[500];
		this.field2357 = new int[500];
		this.field2359 = new long[500];
	}

	@Override
	public void run() {
		for (; this.field2360; class325.method1587(50L)) {
			synchronized(this.field2356) {
				if (this.field2358 < 500) {
					this.field2355[this.field2358] = class316.field2309;
					this.field2357[this.field2358] = class316.field2315;
					this.field2359[this.field2358] = class316.field2311;
					++this.field2358;
				}
			}
		}

	}

	static final void method1598(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class142 var8, class151 var9) {
		class397 var11 = class109.method504(var4);
		int var12 = var7 >= 0 ? var7 : var11.field2709;
		int var13;
		int var14;
		if (var5 != 1 && var5 != 3) {
			var13 = var11.field2701;
			var14 = var11.field2702;
		} else {
			var13 = var11.field2702;
			var14 = var11.field2701;
		}

		int var15;
		int var16;
		if (var13 + var2 <= 104) {
			var15 = var2 + (var13 >> 1);
			var16 = var2 + (var13 + 1 >> 1);
		} else {
			var15 = var2;
			var16 = var2 + 1;
		}

		int var17;
		int var18;
		if (var3 + var14 <= 104) {
			var17 = var3 + (var14 >> 1);
			var18 = var3 + (var14 + 1 >> 1);
		} else {
			var17 = var3;
			var18 = var3 + 1;
		}

		int[][] var19 = class129.field844[var1];
		int var20 = var19[var16][var18] + var19[var15][var17] + var19[var16][var17] + var19[var15][var18] >> 2;
		int var21 = (var2 << 7) + (var13 << 6);
		int var22 = (var3 << 7) + (var14 << 6);
		long var23 = class503.method2386(var2, var3, 2, var11.field2705 == 0, var4);
		int var25 = var6 + (var5 << 6);
		if (var11.field2726 == 1) {
			var25 += 256;
		}

		Object var26;
		if (var6 == 22) {
			if (var12 == -1 && var11.field2727 == null) {
				var26 = var11.method1842(22, var5, var19, var21, var20, var22);
			} else {
				var26 = new class525(var4, 22, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
			}

			var8.method735(var0, var2, var3, var20, (class462)var26, var23, var25);
			if (var11.field2703 == 1) {
				var9.method804(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var12 == -1 && var11.field2727 == null) {
					var26 = var11.method1842(var6, var5, var19, var21, var20, var22);
				} else {
					var26 = new class525(var4, var6, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
				}

				var8.method769(var0, var2, var3, var20, 1, 1, (class462)var26, 0, var23, var25);
				if (var11.field2703 != 0) {
					var9.method802(var2, var3, var13, var14, var11.field2729);
				}

			} else if (var6 == 0) {
				if (var12 == -1 && null == var11.field2727) {
					var26 = var11.method1842(0, var5, var19, var21, var20, var22);
				} else {
					var26 = new class525(var4, 0, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
				}

				var8.method737(var0, var2, var3, var20, (class462)var26, (class462)null, class129.field839[var5], 0, var23, var25);
				if (var11.field2703 != 0) {
					var9.method810(var2, var3, var6, var5, var11.field2729);
				}

			} else if (var6 == 1) {
				if (var12 == -1 && null == var11.field2727) {
					var26 = var11.method1842(1, var5, var19, var21, var20, var22);
				} else {
					var26 = new class525(var4, 1, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
				}

				var8.method737(var0, var2, var3, var20, (class462)var26, (class462)null, class129.field840[var5], 0, var23, var25);
				if (var11.field2703 != 0) {
					var9.method810(var2, var3, var6, var5, var11.field2729);
				}

			} else {
				int var32;
				if (var6 == 2) {
					var32 = var5 + 1 & 3;
					Object var28;
					Object var34;
					if (var12 == -1 && null == var11.field2727) {
						var34 = var11.method1842(2, var5 + 4, var19, var21, var20, var22);
						var28 = var11.method1842(2, var32, var19, var21, var20, var22);
					} else {
						var34 = new class525(var4, 2, var5 + 4, var1, var2, var3, var12, var11.field2735, (class462)null);
						var28 = new class525(var4, 2, var32, var1, var2, var3, var12, var11.field2735, (class462)null);
					}

					var8.method737(var0, var2, var3, var20, (class462)var34, (class462)var28, class129.field839[var5], class129.field839[var32], var23, var25);
					if (var11.field2703 != 0) {
						var9.method810(var2, var3, var6, var5, var11.field2729);
					}

				} else if (var6 == 3) {
					if (var12 == -1 && null == var11.field2727) {
						var26 = var11.method1842(3, var5, var19, var21, var20, var22);
					} else {
						var26 = new class525(var4, 3, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
					}

					var8.method737(var0, var2, var3, var20, (class462)var26, (class462)null, class129.field840[var5], 0, var23, var25);
					if (var11.field2703 != 0) {
						var9.method810(var2, var3, var6, var5, var11.field2729);
					}

				} else if (var6 == 9) {
					if (var12 == -1 && var11.field2727 == null) {
						var26 = var11.method1842(var6, var5, var19, var21, var20, var22);
					} else {
						var26 = new class525(var4, var6, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
					}

					var8.method769(var0, var2, var3, var20, 1, 1, (class462)var26, 0, var23, var25);
					if (var11.field2703 != 0) {
						var9.method802(var2, var3, var13, var14, var11.field2729);
					}

				} else if (var6 == 4) {
					if (var12 == -1 && var11.field2727 == null) {
						var26 = var11.method1842(4, var5, var19, var21, var20, var22);
					} else {
						var26 = new class525(var4, 4, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
					}

					var8.method738(var0, var2, var3, var20, (class462)var26, (class462)null, class129.field839[var5], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var6 == 5) {
						var32 = 16;
						var27 = var8.method758(var0, var2, var3);
						if (0L != var27) {
							var32 = class109.method504(class503.method2376(var27)).field2710;
						}

						if (var12 == -1 && var11.field2727 == null) {
							var29 = var11.method1842(4, var5, var19, var21, var20, var22);
						} else {
							var29 = new class525(var4, 4, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
						}

						var8.method738(var0, var2, var3, var20, (class462)var29, (class462)null, class129.field839[var5], 0, class129.field841[var5] * var32, class129.field837[var5] * var32, var23, var25);
					} else if (var6 == 6) {
						var32 = 8;
						var27 = var8.method758(var0, var2, var3);
						if (0L != var27) {
							var32 = class109.method504(class503.method2376(var27)).field2710 / 2;
						}

						if (var12 == -1 && var11.field2727 == null) {
							var29 = var11.method1842(4, var5 + 4, var19, var21, var20, var22);
						} else {
							var29 = new class525(var4, 4, var5 + 4, var1, var2, var3, var12, var11.field2735, (class462)null);
						}

						var8.method738(var0, var2, var3, var20, (class462)var29, (class462)null, 256, var5, var32 * class129.field843[var5], var32 * class129.field845[var5], var23, var25);
					} else if (var6 == 7) {
						int var33 = var5 + 2 & 3;
						if (var12 == -1 && var11.field2727 == null) {
							var26 = var11.method1842(4, var33 + 4, var19, var21, var20, var22);
						} else {
							var26 = new class525(var4, 4, var33 + 4, var1, var2, var3, var12, var11.field2735, (class462)null);
						}

						var8.method738(var0, var2, var3, var20, (class462)var26, (class462)null, 256, var33, 0, 0, var23, var25);
					} else if (var6 == 8) {
						var32 = 8;
						var27 = var8.method758(var0, var2, var3);
						if (0L != var27) {
							var32 = class109.method504(class503.method2376(var27)).field2710 / 2;
						}

						int var31 = var5 + 2 & 3;
						Object var30;
						if (var12 == -1 && null == var11.field2727) {
							var29 = var11.method1842(4, var5 + 4, var19, var21, var20, var22);
							var30 = var11.method1842(4, var31 + 4, var19, var21, var20, var22);
						} else {
							var29 = new class525(var4, 4, var5 + 4, var1, var2, var3, var12, var11.field2735, (class462)null);
							var30 = new class525(var4, 4, var31 + 4, var1, var2, var3, var12, var11.field2735, (class462)null);
						}

						var8.method738(var0, var2, var3, var20, (class462)var29, (class462)var30, 256, var5, var32 * class129.field843[var5], class129.field845[var5] * var32, var23, var25);
					}
				}
			}
		} else {
			if (var12 == -1 && null == var11.field2727) {
				var26 = var11.method1842(10, var5, var19, var21, var20, var22);
			} else {
				var26 = new class525(var4, 10, var5, var1, var2, var3, var12, var11.field2735, (class462)null);
			}

			if (var26 != null) {
				var8.method769(var0, var2, var3, var20, var13, var14, (class462)var26, var6 == 11 ? 256 : 0, var23, var25);
			}

			if (var11.field2703 != 0) {
				var9.method802(var2, var3, var13, var14, var11.field2729);
			}

		}
	}
}
