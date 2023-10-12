import java.util.Arrays;
import java.util.HashMap;

public class class490 extends class462 {
	static boolean field3484;
	static boolean[] field3432;
	static boolean[] field3482;
	static byte[] field3424;
	static byte[] field3426;
	static char[] field3470;
	static char[][] field3471;
	static class490 field3425;
	static class490 field3459;
	static class64 field3427;
	static class64 field3428;
	static class64 field3429;
	static float[] field3462;
	static float[] field3465;
	static int field3478;
	static int field3481;
	static int field3483;
	static int[] field3423;
	static int[] field3433;
	static int[] field3438;
	static int[] field3457;
	static int[] field3458;
	static int[] field3461;
	static int[] field3463;
	static int[] field3464;
	static int[] field3466;
	static int[] field3468;
	static int[] field3474;
	static int[] field3475;
	static int[] field3476;
	static int[] field3477;
	static int[] field3479;
	static int[] field3480;
	static int[] field3486;
	static int[][] field3473;
	static final float field3489;
	byte[] field3435;
	byte[] field3442;
	byte[] field3443;
	int field3431;
	int field3455;
	int field3456;
	int field3487;
	int field3488;
	int[] field3434;
	int[] field3436;
	int[] field3437;
	int[] field3439;
	int[] field3440;
	int[] field3441;
	int[] field3444;
	int[] field3447;
	int[] field3449;
	int[] field3469;
	int[] field3472;
	int[] field3485;
	int[][] field3450;
	int[][] field3451;
	int[][] field3452;
	int[][] field3453;
	HashMap field3460;
	short[] field3430;
	public boolean field3454;
	public byte field3445;
	public byte field3467;
	public byte field3490;
	public byte field3492;
	public byte field3493;
	public int field3446;
	public int field3448;
	public int field3491;
	public short field3494;

	static {
		field3459 = new class490();
		field3424 = new byte[1];
		field3425 = new class490();
		field3426 = new byte[1];
		field3427 = new class64();
		field3428 = new class64();
		field3429 = new class64();
		field3482 = new boolean[6500];
		field3432 = new boolean[6500];
		field3463 = new int[6500];
		field3464 = new int[6500];
		field3465 = new float[6500];
		field3466 = new int[6500];
		field3433 = new int[6500];
		field3457 = new int[6500];
		field3480 = new int[6500];
		field3470 = new char[6000];
		field3471 = new char[6000][512];
		field3423 = new int[12];
		field3473 = new int[12][2000];
		field3474 = new int[2000];
		field3468 = new int[2000];
		field3476 = new int[12];
		field3477 = new int[10];
		field3438 = new int[10];
		field3479 = new int[10];
		field3462 = new float[10];
		field3484 = true;
		field3486 = class105.field670;
		field3458 = class105.field671;
		field3475 = class105.field672;
		field3461 = class105.field673;
		field3489 = class79.method390(50);
	}

	class490() {
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3445 = 0;
		this.field3446 = 0;
		this.field3454 = false;
		this.field3460 = new HashMap();
	}

	public class490(class490[] var1, int var2) {
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3445 = 0;
		this.field3446 = 0;
		this.field3454 = false;
		this.field3460 = new HashMap();
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3446 = 0;
		this.field3445 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			class490 var4 = var1[var3];
			if (var4 != null) {
				this.field3491 += var4.field3491;
				this.field3448 += var4.field3448;
				this.field3446 += var4.field3446;
				if (this.field3445 == -1) {
					this.field3445 = var4.field3445;
				}
			}
		}

		this.method2282(this.field3491, this.field3448, this.field3446);
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3446 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method2256(var1[var3]);
		}

	}

	public class490(int var1, int var2, int var3, byte var4) {
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3445 = 0;
		this.field3446 = 0;
		this.field3454 = false;
		this.field3460 = new HashMap();
		this.method2282(var1, var2, var3);
		this.field3445 = var4;
		this.field3491 = 0;
		this.field3448 = 0;
		this.field3446 = 0;
	}

	void method2282(int var1, int var2, int var3) {
		this.field3469 = new int[var1];
		this.field3434 = new int[var1];
		this.field3444 = new int[var1];
		this.field3472 = new int[var2];
		this.field3436 = new int[var2];
		this.field3437 = new int[var2];
		this.field3485 = new int[var2];
		this.field3439 = new int[var2];
		this.field3440 = new int[var2];
		if (var3 > 0) {
			this.field3447 = new int[var3];
			this.field3441 = new int[var3];
			this.field3449 = new int[var3];
		}

	}

	void method2284(class490 var1) {
		int var2 = this.field3472.length;
		if (this.field3435 == null && (var1.field3435 != null || this.field3445 != var1.field3445)) {
			this.field3435 = new byte[var2];
			Arrays.fill(this.field3435, this.field3445);
		}

		if (this.field3442 == null && var1.field3442 != null) {
			this.field3442 = new byte[var2];
			Arrays.fill(this.field3442, (byte)0);
		}

		if (this.field3430 == null && var1.field3430 != null) {
			this.field3430 = new short[var2];
			Arrays.fill(this.field3430, (short)-1);
		}

		if (this.field3443 == null && var1.field3443 != null) {
			this.field3443 = new byte[var2];
			Arrays.fill(this.field3443, (byte)-1);
		}

	}

	public void method2256(class490 var1) {
		if (var1 != null) {
			this.method2284(var1);

			int var2;
			for (var2 = 0; var2 < var1.field3448; ++var2) {
				this.field3472[this.field3448] = var1.field3472[var2] + this.field3491;
				this.field3436[this.field3448] = var1.field3436[var2] + this.field3491;
				this.field3437[this.field3448] = var1.field3437[var2] + this.field3491;
				this.field3485[this.field3448] = var1.field3485[var2];
				this.field3439[this.field3448] = var1.field3439[var2];
				this.field3440[this.field3448] = var1.field3440[var2];
				if (this.field3435 != null) {
					this.field3435[this.field3448] = var1.field3435 != null ? var1.field3435[var2] : var1.field3445;
				}

				if (this.field3442 != null && var1.field3442 != null) {
					this.field3442[this.field3448] = var1.field3442[var2];
				}

				if (this.field3430 != null) {
					this.field3430[this.field3448] = var1.field3430 != null ? var1.field3430[var2] : -1;
				}

				if (this.field3443 != null) {
					if (var1.field3443 != null && var1.field3443[var2] != -1) {
						this.field3443[this.field3448] = (byte)(var1.field3443[var2] + this.field3446);
					} else {
						this.field3443[this.field3448] = -1;
					}
				}

				++this.field3448;
			}

			for (var2 = 0; var2 < var1.field3446; ++var2) {
				this.field3447[this.field3446] = var1.field3447[var2] + this.field3491;
				this.field3441[this.field3446] = var1.field3441[var2] + this.field3491;
				this.field3449[this.field3446] = var1.field3449[var2] + this.field3491;
				++this.field3446;
			}

			for (var2 = 0; var2 < var1.field3491; ++var2) {
				this.field3469[this.field3491] = var1.field3469[var2];
				this.field3434[this.field3491] = var1.field3434[var2];
				this.field3444[this.field3491] = var1.field3444[var2];
				++this.field3491;
			}

		}
	}

	public class490 method2257(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method2261();
		int var7 = var2 - this.field3431;
		int var8 = var2 + this.field3431;
		int var9 = var4 - this.field3431;
		int var10 = var4 + this.field3431;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class490 var11;
				if (var5) {
					var11 = new class490();
					var11.field3491 = this.field3491;
					var11.field3448 = this.field3448;
					var11.field3446 = this.field3446;
					var11.field3469 = this.field3469;
					var11.field3444 = this.field3444;
					var11.field3472 = this.field3472;
					var11.field3436 = this.field3436;
					var11.field3437 = this.field3437;
					var11.field3485 = this.field3485;
					var11.field3439 = this.field3439;
					var11.field3440 = this.field3440;
					var11.field3435 = this.field3435;
					var11.field3442 = this.field3442;
					var11.field3443 = this.field3443;
					var11.field3430 = this.field3430;
					var11.field3445 = this.field3445;
					var11.field3447 = this.field3447;
					var11.field3441 = this.field3441;
					var11.field3449 = this.field3449;
					var11.field3450 = this.field3450;
					var11.field3451 = this.field3451;
					var11.field3454 = this.field3454;
					var11.field3434 = new int[var11.field3491];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field3491; ++var12) {
						var13 = this.field3469[var12] + var2;
						var14 = this.field3444[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field3434[var12] = this.field3434[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field3491; ++var12) {
						var13 = (-this.field3434[var12] << 16) / super.field3161;
						if (var13 < var6) {
							var14 = this.field3469[var12] + var2;
							var15 = this.field3444[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field3434[var12] = this.field3434[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method2263();
				return var11;
			}
		} else {
			return this;
		}
	}

	public class490 method2255(boolean var1) {
		if (!var1 && field3424.length < this.field3448) {
			field3424 = new byte[this.field3448 + 100];
		}

		return this.method2259(var1, field3459, field3424);
	}

	public class490 method2258(boolean var1) {
		if (!var1 && field3426.length < this.field3448) {
			field3426 = new byte[this.field3448 + 100];
		}

		return this.method2259(var1, field3425, field3426);
	}

	class490 method2259(boolean var1, class490 var2, byte[] var3) {
		var2.field3491 = this.field3491;
		var2.field3448 = this.field3448;
		var2.field3446 = this.field3446;
		if (var2.field3469 == null || var2.field3469.length < this.field3491) {
			var2.field3469 = new int[this.field3491 + 100];
			var2.field3434 = new int[this.field3491 + 100];
			var2.field3444 = new int[this.field3491 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field3491; ++var4) {
			var2.field3469[var4] = this.field3469[var4];
			var2.field3434[var4] = this.field3434[var4];
			var2.field3444[var4] = this.field3444[var4];
		}

		if (var1) {
			var2.field3442 = this.field3442;
		} else {
			var2.field3442 = var3;
			if (this.field3442 == null) {
				for (var4 = 0; var4 < this.field3448; ++var4) {
					var2.field3442[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field3448; ++var4) {
					var2.field3442[var4] = this.field3442[var4];
				}
			}
		}

		var2.field3472 = this.field3472;
		var2.field3436 = this.field3436;
		var2.field3437 = this.field3437;
		var2.field3485 = this.field3485;
		var2.field3439 = this.field3439;
		var2.field3440 = this.field3440;
		var2.field3435 = this.field3435;
		var2.field3443 = this.field3443;
		var2.field3430 = this.field3430;
		var2.field3445 = this.field3445;
		var2.field3447 = this.field3447;
		var2.field3441 = this.field3441;
		var2.field3449 = this.field3449;
		var2.field3450 = this.field3450;
		var2.field3451 = this.field3451;
		var2.field3452 = this.field3452;
		var2.field3453 = this.field3453;
		var2.field3454 = this.field3454;
		var2.method2263();
		var2.field3493 = 0;
		return var2;
	}

	void method2286(int var1) {
		if (!this.field3460.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field3458[var1];
			int var9 = field3486[var1];

			for (int var10 = 0; var10 < this.field3491; ++var10) {
				int var11 = class79.method392(this.field3469[var10], this.field3444[var10], var8, var9);
				int var12 = this.field3434[var10];
				int var13 = class11.method56(this.field3469[var10], this.field3444[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			class365 var14 = new class365((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var15 = true;
			if (var14.field2530 < 32) {
				var14.field2530 = 32;
			}

			if (var14.field2532 < 32) {
				var14.field2532 = 32;
			}

			if (this.field3454) {
				boolean var16 = true;
				var14.field2530 += 8;
				var14.field2532 += 8;
			}

			this.field3460.put(var1, var14);
		}
	}

	public void method2261() {
		if (this.field3455 != 1) {
			this.field3455 = 1;
			super.field3161 = 0;
			this.field3456 = 0;
			this.field3431 = 0;

			for (int var1 = 0; var1 < this.field3491; ++var1) {
				int var2 = this.field3469[var1];
				int var3 = this.field3434[var1];
				int var4 = this.field3444[var1];
				if (-var3 > super.field3161) {
					super.field3161 = -var3;
				}

				if (var3 > this.field3456) {
					this.field3456 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field3431) {
					this.field3431 = var5;
				}
			}

			this.field3431 = (int)(Math.sqrt((double)this.field3431) + 0.99D);
			this.field3487 = (int)(Math.sqrt((double)(this.field3431 * this.field3431 + super.field3161 * super.field3161)) + 0.99D);
			this.field3488 = this.field3487 + (int)(Math.sqrt((double)(this.field3431 * this.field3431 + this.field3456 * this.field3456)) + 0.99D);
		}
	}

	void method2287() {
		if (this.field3455 != 2) {
			this.field3455 = 2;
			this.field3431 = 0;

			for (int var1 = 0; var1 < this.field3491; ++var1) {
				int var2 = this.field3469[var1];
				int var3 = this.field3434[var1];
				int var4 = this.field3444[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field3431) {
					this.field3431 = var5;
				}
			}

			this.field3431 = (int)(Math.sqrt((double)this.field3431) + 0.99D);
			this.field3487 = this.field3431;
			this.field3488 = this.field3431 + this.field3431;
		}
	}

	public int method2262() {
		this.method2261();
		return this.field3431;
	}

	public void method2263() {
		this.field3455 = 0;
		this.field3460.clear();
	}

	public void method2285(class421 var1, int var2) {
		if (this.field3450 != null) {
			if (var2 != -1) {
				class369 var3 = var1.field2857[var2];
				class307 var4 = var3.field2551;
				field3481 = 0;
				field3478 = 0;
				field3483 = 0;

				for (int var5 = 0; var5 < var3.field2552; ++var5) {
					int var6 = var3.field2553[var5];
					this.method2269(var4.field2230[var6], var4.field2228[var6], var3.field2547[var5], var3.field2554[var5], var3.field2556[var5]);
				}

				this.method2263();
			}
		}
	}

	public void method2265(class19 var1, int var2) {
		class307 var3 = var1.field95;
		class97 var4 = var3.method1565();
		if (var4 != null) {
			var3.method1565().method434(var1, var2);
			this.method2271(var3.method1565(), var1.method82());
		}

		if (var1.method76()) {
			this.method2275(var1, var2);
		}

		this.method2263();
	}

	void method2275(class19 var1, int var2) {
		class307 var3 = var1.field95;

		for (int var4 = 0; var4 < var3.field2232; ++var4) {
			int var5 = var3.field2230[var4];
			if (var5 == 5 && var1.field92 != null && var1.field92[var4] != null && var1.field92[var4][0] != null && this.field3451 != null && this.field3442 != null) {
				class234 var6 = var1.field92[var4][0];
				int[] var7 = var3.field2228[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field3451.length) {
						int[] var11 = this.field3451[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.field3442[var13] & 255) + var6.method1081(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.field3442[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	void method2271(class97 var1, int var2) {
		this.method2281(var1, var2);
	}

	public void method2264(class421 var1, int var2, class421 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				class369 var6 = var1.field2857[var2];
				class369 var7 = var3.field2857[var4];
				class307 var8 = var6.field2551;
				field3481 = 0;
				field3478 = 0;
				field3483 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[0];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field2552; ++var11) {
					for (var12 = var6.field2553[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.field2230[var12] == 0) {
						this.method2269(var8.field2230[var12], var8.field2228[var12], var6.field2547[var11], var6.field2554[var11], var6.field2556[var11]);
					}
				}

				field3481 = 0;
				field3478 = 0;
				field3483 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[0];

				for (var11 = 0; var11 < var7.field2552; ++var11) {
					for (var12 = var7.field2553[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.field2230[var12] == 0) {
						this.method2269(var8.field2230[var12], var8.field2228[var12], var7.field2547[var11], var7.field2554[var11], var7.field2556[var11]);
					}
				}

				this.method2263();
			} else {
				this.method2285(var1, var2);
			}
		}
	}

	public void method2267(class307 var1, class19 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class97 var7 = var1.method1565();
		if (var7 != null) {
			var7.method432(var2, var3, var4, var5);
			if (var6) {
				this.method2271(var7, var2.method82());
			}
		}

		if (!var5 && var2.method76()) {
			this.method2275(var2, var3);
		}

	}

	public void method2268(class421 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method2285(var1, var2);
		} else {
			class369 var5 = var1.field2857[var2];
			class307 var6 = var5.field2551;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[0];
			field3481 = 0;
			field3478 = 0;
			field3483 = 0;

			for (int var9 = 0; var9 < var5.field2552; ++var9) {
				int var10;
				for (var10 = var5.field2553[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.field2230[var10] == 0) {
						this.method2269(var6.field2230[var10], var6.field2228[var10], var5.field2547[var9], var5.field2554[var9], var5.field2556[var9]);
					}
				} else if (var10 != var8 || var6.field2230[var10] == 0) {
					this.method2269(var6.field2230[var10], var6.field2228[var10], var5.field2547[var9], var5.field2554[var9], var5.field2556[var9]);
				}
			}

		}
	}

	void method2269(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field3481 = 0;
			field3478 = 0;
			field3483 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.field3450.length) {
					int[] var19 = this.field3450[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						field3481 += this.field3469[var12];
						field3478 += this.field3434[var12];
						field3483 += this.field3444[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field3481 = field3481 / var7 + var3;
				field3478 = field3478 / var7 + var4;
				field3483 = field3483 / var7 + var5;
			} else {
				field3481 = var3;
				field3478 = var4;
				field3483 = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field3450.length) {
						var9 = this.field3450[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field3469;
							var10000[var11] += var3;
							var10000 = this.field3434;
							var10000[var11] += var4;
							var10000 = this.field3444;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field3450.length) {
						var9 = this.field3450[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field3469;
							var10000[var11] -= field3481;
							var10000 = this.field3434;
							var10000[var11] -= field3478;
							var10000 = this.field3444;
							var10000[var11] -= field3483;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field3486[var14];
								var16 = field3458[var14];
								var17 = this.field3434[var11] * var15 + this.field3469[var11] * var16 >> 16;
								this.field3434[var11] = this.field3434[var11] * var16 - this.field3469[var11] * var15 >> 16;
								this.field3469[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field3486[var12];
								var16 = field3458[var12];
								var17 = this.field3434[var11] * var16 - this.field3444[var11] * var15 >> 16;
								this.field3444[var11] = this.field3434[var11] * var15 + this.field3444[var11] * var16 >> 16;
								this.field3434[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field3486[var13];
								var16 = field3458[var13];
								var17 = this.field3444[var11] * var15 + this.field3469[var11] * var16 >> 16;
								this.field3444[var11] = this.field3444[var11] * var16 - this.field3469[var11] * var15 >> 16;
								this.field3469[var11] = var17;
							}

							var10000 = this.field3469;
							var10000[var11] += field3481;
							var10000 = this.field3434;
							var10000[var11] += field3478;
							var10000 = this.field3444;
							var10000[var11] += field3483;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field3450.length) {
						var9 = this.field3450[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field3469;
							var10000[var11] -= field3481;
							var10000 = this.field3434;
							var10000[var11] -= field3478;
							var10000 = this.field3444;
							var10000[var11] -= field3483;
							this.field3469[var11] = this.field3469[var11] * var3 / 128;
							this.field3434[var11] = this.field3434[var11] * var4 / 128;
							this.field3444[var11] = this.field3444[var11] * var5 / 128;
							var10000 = this.field3469;
							var10000[var11] += field3481;
							var10000 = this.field3434;
							var10000[var11] += field3478;
							var10000 = this.field3444;
							var10000[var11] += field3483;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field3451 != null && this.field3442 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field3451.length) {
							var9 = this.field3451[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.field3442[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field3442[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	public void method2288() {
		for (int var1 = 0; var1 < this.field3491; ++var1) {
			int var2 = this.field3469[var1];
			this.field3469[var1] = this.field3444[var1];
			this.field3444[var1] = -var2;
		}

		this.method2263();
	}

	public void method2270() {
		for (int var1 = 0; var1 < this.field3491; ++var1) {
			this.field3469[var1] = -this.field3469[var1];
			this.field3444[var1] = -this.field3444[var1];
		}

		this.method2263();
	}

	public void method2283() {
		for (int var1 = 0; var1 < this.field3491; ++var1) {
			int var2 = this.field3444[var1];
			this.field3444[var1] = this.field3469[var1];
			this.field3469[var1] = -var2;
		}

		this.method2263();
	}

	public void method2260(int var1) {
		int var2 = field3486[var1];
		int var3 = field3458[var1];

		for (int var4 = 0; var4 < this.field3491; ++var4) {
			int var5 = this.field3434[var4] * var3 - this.field3444[var4] * var2 >> 16;
			this.field3444[var4] = this.field3434[var4] * var2 + this.field3444[var4] * var3 >> 16;
			this.field3434[var4] = var5;
		}

		this.method2263();
	}

	public void method2272(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3491; ++var4) {
			int[] var10000 = this.field3469;
			var10000[var4] += var1;
			var10000 = this.field3434;
			var10000[var4] += var2;
			var10000 = this.field3444;
			var10000[var4] += var3;
		}

		this.method2263();
	}

	public void method2273(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3491; ++var4) {
			this.field3469[var4] = this.field3469[var4] * var1 / 128;
			this.field3434[var4] = this.field3434[var4] * var2 / 128;
			this.field3444[var4] = this.field3444[var4] * var3 / 128;
		}

		this.method2263();
	}

	public final void method2278(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field3455 != 2 && this.field3455 != 1) {
			this.method2287();
		}

		int var8 = class105.method495();
		int var9 = class105.method494();
		int var10 = field3486[0];
		int var11 = field3458[0];
		int var12 = field3486[var2];
		int var13 = field3458[var2];
		int var14 = field3486[var3];
		int var15 = field3458[var3];
		int var16 = field3486[var4];
		int var17 = field3458[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < this.field3491; ++var19) {
			int var20 = this.field3469[var19];
			int var21 = this.field3434[var19];
			int var22 = this.field3444[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field3466[var19] = var22 - var18;
			field3463[var19] = var8 + var20 * class105.method482() / var22;
			field3464[var19] = var9 + var23 * class105.method482() / var22;
			field3465[var19] = class79.method390(var22);
			if (this.field3446 > 0) {
				field3433[var19] = var20;
				field3457[var19] = var23;
				field3480[var19] = var22;
			}
		}

		try {
			this.method2276(false, false, false, 0L);
		} catch (Exception var24) {
		}

	}

	public final void method2274(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field3455 != 2 && this.field3455 != 1) {
			this.method2287();
		}

		int var9 = class105.method495();
		int var10 = class105.method494();
		int var11 = field3486[0];
		int var12 = field3458[0];
		int var13 = field3486[var2];
		int var14 = field3458[var2];
		int var15 = field3486[var3];
		int var16 = field3458[var3];
		int var17 = field3486[var4];
		int var18 = field3458[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.field3491; ++var20) {
			int var21 = this.field3469[var20];
			int var22 = this.field3434[var20];
			int var23 = this.field3444[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field3466[var20] = var23 - var19;
			field3463[var20] = var9 + var21 * class105.method482() / var8;
			field3464[var20] = var10 + var24 * class105.method482() / var8;
			field3465[var20] = class79.method390(var8);
			if (this.field3446 > 0) {
				field3433[var20] = var21;
				field3457[var20] = var24;
				field3480[var20] = var23;
			}
		}

		try {
			this.method2276(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@Override
	void method2153(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field3455 != 1) {
			this.method2261();
		}

		this.method2286(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field3431 * var3 >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field3431) * class105.method482();
			if (var16 / var14 < class105.method479()) {
				int var17 = (var15 + this.field3431) * class105.method482();
				if (var17 / var14 > class105.method478()) {
					int var18 = var7 * var3 - var11 * var2 >> 16;
					int var19 = this.field3431 * var2 >> 16;
					int var20 = var19 + (this.field3456 * var3 >> 16);
					int var21 = (var18 + var20) * class105.method482();
					if (var21 / var14 > class105.method481()) {
						int var22 = var19 + (super.field3161 * var3 >> 16);
						int var23 = (var18 - var22) * class105.method482();
						if (var23 / var14 < class105.method480()) {
							int var24 = var13 + (super.field3161 * var2 >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field3446 > 0;
							int var28 = class503.method2373();
							int var29 = class503.method2383();
							boolean var30 = class503.method2384();
							boolean var31 = class503.method2385(var9);
							boolean var32 = false;
							int var34;
							int var35;
							int var36;
							if (var31 && var30) {
								boolean var33 = false;
								if (field3484) {
									var33 = class503.method2371(this, var1, var6, var7, var8);
								} else {
									var34 = var12 - var13;
									if (var34 <= 50) {
										var34 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var34;
									} else {
										var17 /= var14;
										var16 /= var34;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var34;
									} else {
										var21 /= var14;
										var23 /= var34;
									}

									var35 = var28 - class105.method495();
									var36 = var29 - class105.method494();
									if (var35 > var16 && var35 < var17 && var36 > var23 && var36 < var21) {
										var33 = true;
									}
								}

								if (var33) {
									if (this.field3454) {
										class503.method2378(var9);
									} else {
										var32 = true;
									}
								}
							}

							int var43 = class105.method495();
							var34 = class105.method494();
							var35 = 0;
							var36 = 0;
							if (var1 != 0) {
								var35 = field3486[var1];
								var36 = field3458[var1];
							}

							for (int var37 = 0; var37 < this.field3491; ++var37) {
								int var38 = this.field3469[var37];
								int var39 = this.field3434[var37];
								int var40 = this.field3444[var37];
								int var41;
								if (var1 != 0) {
									var41 = var40 * var35 + var38 * var36 >> 16;
									var40 = var40 * var36 - var38 * var35 >> 16;
									var38 = var41;
								}

								var38 += var6;
								var39 += var7;
								var40 += var8;
								var41 = var40 * var4 + var38 * var5 >> 16;
								var40 = var40 * var5 - var38 * var4 >> 16;
								var38 = var41;
								var41 = var39 * var3 - var40 * var2 >> 16;
								var40 = var39 * var2 + var40 * var3 >> 16;
								field3466[var37] = var40 - var12;
								if (var40 >= 50) {
									field3463[var37] = var43 + var38 * class105.method482() / var40;
									field3464[var37] = var34 + var41 * class105.method482() / var40;
									field3465[var37] = class79.method390(var40);
								} else {
									field3463[var37] = -5000;
									var25 = true;
								}

								if (var27) {
									field3433[var37] = var38;
									field3457[var37] = var41;
									field3480[var37] = var40;
								}
							}

							try {
								this.method2276(var25, var32, this.field3454, var9);
							} catch (Exception var42) {
							}

						}
					}
				}
			}
		}
	}

	final void method2276(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field3488 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field3488; ++var6) {
				field3470[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field3448; ++var7) {
				if (this.field3440[var7] != -2) {
					var8 = this.field3472[var7];
					var9 = this.field3436[var7];
					var10 = this.field3437[var7];
					var11 = field3463[var8];
					var12 = field3463[var9];
					var13 = field3463[var10];
					int var14;
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var14 = field3433[var8];
						var15 = field3433[var9];
						var16 = field3433[var10];
						int var17 = field3457[var8];
						var18 = field3457[var9];
						int var19 = field3457[var10];
						int var20 = field3480[var8];
						int var21 = field3480[var9];
						int var22 = field3480[var10];
						var14 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var14 * var22;
						int var25 = var14 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field3432[var7] = true;
							int var26 = (field3466[var8] + field3466[var9] + field3466[var10]) / 3 + this.field3487;
							field3471[var26][field3470[var26]++] = var7;
						}
					} else {
						if (var2 && class503.method2377(field3464[var8], field3464[var9], field3464[var10], var11, var12, var13, var6)) {
							class503.method2378(var4);
							var2 = false;
						}

						if ((var11 - var12) * (field3464[var10] - field3464[var9]) - (field3464[var8] - field3464[var9]) * (var13 - var12) > 0) {
							field3432[var7] = false;
							var14 = class105.method496();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
								field3482[var7] = false;
							} else {
								field3482[var7] = true;
							}

							var15 = (field3466[var8] + field3466[var9] + field3466[var10]) / 3 + this.field3487;
							field3471[var15][field3470[var15]++] = var7;
						}
					}
				}
			}

			int var27;
			char var28;
			char[] var29;
			if (this.field3435 == null) {
				for (var27 = this.field3488 - 1; var27 >= 0; --var27) {
					var28 = field3470[var27];
					if (var28 > 0) {
						var29 = field3471[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							this.method2266(var29[var10]);
						}
					}
				}

			} else {
				for (var27 = 0; var27 < 12; ++var27) {
					field3423[var27] = 0;
					field3476[var27] = 0;
				}

				for (var27 = this.field3488 - 1; var27 >= 0; --var27) {
					var28 = field3470[var27];
					if (var28 > 0) {
						var29 = field3471[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							char var30 = var29[var10];
							byte var31 = this.field3435[var30];
							var13 = field3423[var31]++;
							field3473[var31][var13] = var30;
							if (var31 < 10) {
								int[] var34 = field3476;
								var34[var31] += var27;
							} else if (var31 == 10) {
								field3474[var13] = var27;
							} else {
								field3468[var13] = var27;
							}
						}
					}
				}

				var27 = 0;
				if (field3423[1] > 0 || field3423[2] > 0) {
					var27 = (field3476[1] + field3476[2]) / (field3423[1] + field3423[2]);
				}

				var8 = 0;
				if (field3423[3] > 0 || field3423[4] > 0) {
					var8 = (field3476[3] + field3476[4]) / (field3423[3] + field3423[4]);
				}

				var9 = 0;
				if (field3423[6] > 0 || field3423[8] > 0) {
					var9 = (field3476[6] + field3476[8]) / (field3423[6] + field3423[8]);
				}

				var11 = 0;
				var12 = field3423[10];
				int[] var32 = field3473[10];
				int[] var33 = field3474;
				if (0 == var12) {
					var11 = 0;
					var12 = field3423[11];
					var32 = field3473[11];
					var33 = field3468;
				}

				if (0 < var12) {
					var10 = var33[0];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var27) {
						this.method2266(var32[var11++]);
						if (var11 == var12 && var32 != field3473[11]) {
							var11 = 0;
							var12 = field3423[11];
							var32 = field3473[11];
							var33 = field3468;
						}

						if (var11 < var12) {
							var10 = var33[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.method2266(var32[var11++]);
						if (var11 == var12 && var32 != field3473[11]) {
							var11 = 0;
							var12 = field3423[11];
							var32 = field3473[11];
							var33 = field3468;
						}

						if (var11 < var12) {
							var10 = var33[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.method2266(var32[var11++]);
						if (var11 == var12 && var32 != field3473[11]) {
							var11 = 0;
							var12 = field3423[11];
							var32 = field3473[11];
							var33 = field3468;
						}

						if (var11 < var12) {
							var10 = var33[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field3423[var15];
					int[] var35 = field3473[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.method2266(var35[var18]);
					}
				}

				while (var10 != -1000) {
					this.method2266(var32[var11++]);
					if (var11 == var12 && var32 != field3473[11]) {
						var11 = 0;
						var32 = field3473[11];
						var12 = field3423[11];
						var33 = field3468;
					}

					if (var11 < var12) {
						var10 = var33[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	final void method2266(int var1) {
		if (field3432[var1]) {
			this.method2279(var1);
		} else {
			int var2 = this.field3472[var1];
			int var3 = this.field3436[var1];
			int var4 = this.field3437[var1];
			class105.field668.field1731 = field3482[var1];
			if (this.field3442 == null) {
				class105.field668.field1729 = 0;
			} else {
				class105.field668.field1729 = (this.field3442[var1] == -1 ? 253 : this.field3442[var1]) & 255;
			}

			this.method2289(var1, field3464[var2], field3464[var3], field3464[var4], field3463[var2], field3463[var3], field3463[var4], field3465[var2], field3465[var3], field3465[var4], this.field3485[var1], this.field3439[var1], this.field3440[var1]);
		}
	}

	boolean method2277(int var1) {
		return this.field3493 > 0 && var1 < this.field3494;
	}

	final void method2289(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.field3430 != null && this.field3430[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.field3443 != null && this.field3443[var1] != -1) {
				int var17 = this.field3443[var1] & 255;
				var18 = this.field3447[var17];
				var15 = this.field3441[var17];
				var16 = this.field3449[var17];
			} else {
				var18 = this.field3472[var1];
				var15 = this.field3436[var1];
				var16 = this.field3437[var1];
			}

			if (this.field3440[var1] == -1) {
				class105.method490(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3433[var18], field3433[var15], field3433[var16], field3457[var18], field3457[var15], field3457[var16], field3480[var18], field3480[var15], field3480[var16], this.field3430[var1]);
			} else {
				class105.method490(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3433[var18], field3433[var15], field3433[var16], field3457[var18], field3457[var15], field3457[var16], field3480[var18], field3480[var15], field3480[var16], this.field3430[var1]);
			}
		} else {
			boolean var14 = this.method2277(var1);
			if (this.field3440[var1] == -1 && var14) {
				class105.method477(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3475[this.field3485[var1]], this.field3490, this.field3467, this.field3492, this.field3493);
			} else if (this.field3440[var1] == -1) {
				class105.method493(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3475[this.field3485[var1]]);
			} else if (var14) {
				class105.method491(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field3490, this.field3467, this.field3492, this.field3493);
			} else {
				class105.method489(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	final void method2279(int var1) {
		int var2 = class105.method495();
		int var3 = class105.method494();
		int var4 = 0;
		int var5 = this.field3472[var1];
		int var6 = this.field3436[var1];
		int var7 = this.field3437[var1];
		int var8 = field3480[var5];
		int var9 = field3480[var6];
		int var10 = field3480[var7];
		if (this.field3442 == null) {
			class105.field668.field1729 = 0;
		} else {
			class105.field668.field1729 = this.field3442[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field3477[0] = field3463[var5];
			field3438[0] = field3464[var5];
			field3462[0] = field3465[var7];
			++var4;
			field3479[0] = this.field3485[var1];
		} else {
			var11 = field3433[var5];
			var12 = field3457[var5];
			var13 = this.field3485[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field3461[var10 - var8];
				field3477[0] = var2 + (var11 + ((field3433[var7] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[0] = var3 + (var12 + ((field3457[var7] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3462[0] = field3489;
				++var4;
				field3479[0] = var13 + ((this.field3440[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * field3461[var9 - var8];
				field3477[var4] = var2 + (var11 + ((field3433[var6] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[var4] = var3 + (var12 + ((field3457[var6] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3462[var4] = field3489;
				field3479[var4++] = var13 + ((this.field3439[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field3477[var4] = field3463[var6];
			field3438[var4] = field3464[var6];
			field3462[var4] = field3465[var7];
			field3479[var4++] = this.field3439[var1];
		} else {
			var11 = field3433[var6];
			var12 = field3457[var6];
			var13 = this.field3439[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field3461[var8 - var9];
				field3477[var4] = var2 + (var11 + ((field3433[var5] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[var4] = var3 + (var12 + ((field3457[var5] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3462[var4] = field3489;
				field3479[var4++] = var13 + ((this.field3485[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * field3461[var10 - var9];
				field3477[var4] = var2 + (var11 + ((field3433[var7] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[var4] = var3 + (var12 + ((field3457[var7] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3479[var4++] = var13 + ((this.field3440[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field3477[var4] = field3463[var7];
			field3438[var4] = field3464[var7];
			field3462[var4] = field3465[var7];
			field3479[var4++] = this.field3440[var1];
		} else {
			var11 = field3433[var7];
			var12 = field3457[var7];
			var13 = this.field3440[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field3461[var9 - var10];
				field3477[var4] = var2 + (var11 + ((field3433[var6] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[var4] = var3 + (var12 + ((field3457[var6] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3462[var4] = field3489;
				field3479[var4++] = var13 + ((this.field3439[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * field3461[var8 - var10];
				field3477[var4] = var2 + (var11 + ((field3433[var5] - var11) * var14 >> 16)) * class105.method482() / 50;
				field3438[var4] = var3 + (var12 + ((field3457[var5] - var12) * var14 >> 16)) * class105.method482() / 50;
				field3462[var4] = field3489;
				field3479[var4++] = var13 + ((this.field3485[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field3477[0];
		var12 = field3477[1];
		var13 = field3477[2];
		var14 = field3438[0];
		int var15 = field3438[1];
		int var16 = field3438[2];
		float var17 = field3462[0];
		float var18 = field3462[1];
		float var19 = field3462[2];
		class105.field668.field1731 = false;
		int var20 = class105.method496();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				class105.field668.field1731 = true;
			}

			this.method2289(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3479[0], field3479[1], field3479[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3477[3] < 0 || field3477[3] > var20) {
				class105.field668.field1731 = true;
			}

			int var22;
			if (this.field3430 != null && this.field3430[var1] != -1) {
				int var23;
				int var25;
				if (this.field3443 != null && this.field3443[var1] != -1) {
					int var24 = this.field3443[var1] & 255;
					var25 = this.field3447[var24];
					var22 = this.field3441[var24];
					var23 = this.field3449[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.field3430[var1];
				if (this.field3440[var1] == -1) {
					class105.method490(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field3485[var1], this.field3485[var1], this.field3485[var1], field3433[var25], field3433[var22], field3433[var23], field3457[var25], field3457[var22], field3457[var23], field3480[var25], field3480[var22], field3480[var23], var26);
					class105.method490(var14, var16, field3438[3], var11, var13, field3477[3], var17, var19, field3462[3], this.field3485[var1], this.field3485[var1], this.field3485[var1], field3433[var25], field3433[var22], field3433[var23], field3457[var25], field3457[var22], field3457[var23], field3480[var25], field3480[var22], field3480[var23], var26);
				} else {
					class105.method490(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3479[0], field3479[1], field3479[2], field3433[var25], field3433[var22], field3433[var23], field3457[var25], field3457[var22], field3457[var23], field3480[var25], field3480[var22], field3480[var23], var26);
					class105.method490(var14, var16, field3438[3], var11, var13, field3477[3], var17, var19, field3462[3], field3479[0], field3479[2], field3479[3], field3433[var25], field3433[var22], field3433[var23], field3457[var25], field3457[var22], field3457[var23], field3480[var25], field3480[var22], field3480[var23], var26);
				}
			} else {
				boolean var21 = this.method2277(var1);
				if (this.field3440[var1] == -1 && var21) {
					var22 = field3475[this.field3485[var1]];
					class105.method477(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field3490, this.field3467, this.field3492, this.field3493);
					class105.method477(var14, var16, field3438[3], var11, var13, field3477[3], var17, var19, field3462[3], var22, this.field3490, this.field3467, this.field3492, this.field3493);
				} else if (this.field3440[var1] == -1) {
					var22 = field3475[this.field3485[var1]];
					class105.method493(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					class105.method493(var14, var16, field3438[3], var11, var13, field3477[3], var17, var19, field3462[3], var22);
				} else if (var21) {
					class105.method491(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3479[0], field3479[1], field3479[2], this.field3490, this.field3492, this.field3467, this.field3493);
					class105.method491(var14, var16, field3438[3], var11, var13, field3477[3], 0.0F, 0.0F, 0.0F, field3479[0], field3479[2], field3479[3], this.field3490, this.field3492, this.field3467, this.field3493);
				} else {
					class105.method489(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3479[0], field3479[1], field3479[2]);
					class105.method489(var14, var16, field3438[3], var11, var13, field3477[3], var17, var19, field3462[3], field3479[0], field3479[2], field3479[3]);
				}
			}
		}

	}

	void method2280(int var1, class64 var2) {
		float var3 = (float)this.field3469[var1];
		float var4 = (float)(-this.field3434[var1]);
		float var5 = (float)(-this.field3444[var1]);
		float var6 = 1.0F;
		this.field3469[var1] = (int)(var2.field326[0] * var3 + var2.field326[4] * var4 + var2.field326[8] * var5 + var2.field326[12] * var6);
		this.field3434[var1] = -((int)(var2.field326[1] * var3 + var2.field326[5] * var4 + var2.field326[9] * var5 + var2.field326[13] * var6));
		this.field3444[var1] = -((int)(var2.field326[2] * var3 + var2.field326[6] * var4 + var2.field326[10] * var5 + var2.field326[14] * var6));
	}

	void method2281(class97 var1, int var2) {
		if (this.field3452 != null) {
			for (int var3 = 0; var3 < this.field3491; ++var3) {
				int[] var4 = this.field3452[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field3453[var3];
					field3427.method274();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class457 var8 = var1.method433(var7);
						if (var8 != null) {
							field3428.method276((float)var5[var6] / 255.0F);
							field3429.method275(var8.method2132(var2));
							field3429.method277(field3428);
							field3427.method283(field3429);
						}
					}

					this.method2280(var3, field3427);
				}
			}

		}
	}
}
