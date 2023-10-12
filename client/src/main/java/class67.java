public class class67 {
	public static int field437;
	static boolean field438;
	static class42 field435;
	boolean field433;
	class362 field421;
	class362[] field427;
	class362[] field436;
	int field423;
	int field425;
	int field429;
	int field430;
	int field431;
	int field434;
	long field424;
	long field428;
	long field432;
	public int field420;
	public int field422;
	public int[] field426;

	public class67() {
		this.field423 = 32;
		this.field424 = class38.method108();
		this.field428 = 0L;
		this.field429 = 0;
		this.field425 = 0;
		this.field431 = 0;
		this.field432 = 0L;
		this.field433 = true;
		this.field434 = 0;
		this.field427 = new class362[8];
		this.field436 = new class362[8];
	}

	public final synchronized void method314(class362 var1) {
		this.field421 = var1;
	}

	public final synchronized void method304() {
		if (null != this.field426) {
			long var2 = class38.method108();

			try {
				if (this.field428 != 0L) {
					if (var2 < this.field428) {
						return;
					}

					this.method308(this.field422);
					this.field428 = 0L;
					this.field433 = true;
				}

				int var4 = this.method313();
				if (this.field431 - var4 > this.field429) {
					this.field429 = this.field431 - var4;
				}

				int var5 = this.field430 + this.field420;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field422) {
					this.field422 += 1024;
					if (this.field422 > 16384) {
						this.field422 = 16384;
					}

					this.method311();
					this.method308(this.field422);
					var4 = 0;
					this.field433 = true;
					if (var5 + 256 > this.field422) {
						var5 = this.field422 - 256;
						this.field430 = var5 - this.field420;
					}
				}

				while (var4 < var5) {
					this.method318(this.field426, 256);
					this.method309();
					var4 += 256;
				}

				if (var2 > this.field432) {
					if (!this.field433) {
						if (this.field429 == 0 && this.field425 == 0) {
							this.method311();
							this.field428 = var2 + 2000L;
							return;
						}

						this.field430 = Math.min(this.field425, this.field429);
						this.field425 = this.field429;
					} else {
						this.field433 = false;
					}

					this.field429 = 0;
					this.field432 = var2 + 2000L;
				}

				this.field431 = var4;
			} catch (Exception var7) {
				this.method311();
				this.field428 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field424) {
					var2 = this.field424;
				}

				while (var2 > 5000L + this.field424) {
					this.method315(256);
					this.field424 += (long)(256000 / field437);
				}
			} catch (Exception var6) {
				this.field424 = var2;
			}

		}
	}

	public final void method305() {
		this.field433 = true;
	}

	public final synchronized void method306() {
		this.field433 = true;

		try {
			this.method310();
		} catch (Exception var3) {
			this.method311();
			this.field428 = class38.method108() + 2000L;
		}

	}

	public final synchronized void method307() {
		if (class472.field3312 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (class472.field3312.field2338[var3] == this) {
					class472.field3312.field2338[var3] = null;
				}

				if (class472.field3312.field2338[var3] != null) {
					var2 = false;
				}
			}

			if (var2) {
				class504.field3702.shutdownNow();
				class504.field3702 = null;
				class472.field3312 = null;
			}
		}

		this.method311();
		this.field426 = null;
	}

	final void method315(int var1) {
		this.field434 -= 256;
		if (this.field434 < 0) {
			this.field434 = 0;
		}

		if (null != this.field421) {
			this.field421.method1726(256);
		}

	}

	final void method318(int[] var1, int var2) {
		short var3 = 256;
		if (class107.field681) {
			var3 = 512;
		}

		class96.method427(var1, 0, var3);
		this.field434 -= 256;
		if (this.field421 != null && this.field434 <= 0) {
			this.field434 += field437 >> 4;
			method320(this.field421);
			this.method317(this.field421, this.field421.method1722());
			int var4 = 0;
			int var5 = 255;

			int var6;
			class362 var10;
			label104:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						class362 var11 = this.field427[var7];

						label98:
						while (true) {
							while (true) {
								if (null == var11) {
									break label98;
								}

								class22 var12 = var11.field2483;
								if (var12 != null && var12.field102 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field2481;
								} else {
									var11.field2484 = true;
									int var13 = var11.method1723();
									var4 += var13;
									if (var12 != null) {
										var12.field102 += var13;
									}

									if (var4 >= this.field423) {
										break label104;
									}

									class362 var14 = var11.method1727();
									if (var14 != null) {
										for (int var15 = var11.field2482; null != var14; var14 = var11.method1728()) {
											this.method317(var14, var15 * var14.method1722() >> 8);
										}
									}

									class362 var18 = var11.field2481;
									var11.field2481 = null;
									if (var10 == null) {
										this.field427[var7] = var18;
									} else {
										var10.field2481 = var18;
									}

									if (var18 == null) {
										this.field436[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				class362 var16 = this.field427[var6];
				class362[] var17 = this.field427;
				this.field436[var6] = null;

				for (var17[var6] = null; null != var16; var16 = var10) {
					var10 = var16.field2481;
					var16.field2481 = null;
				}
			}
		}

		if (this.field434 < 0) {
			this.field434 = 0;
		}

		if (this.field421 != null) {
			this.field421.method1725(var1, 0, 256);
		}

		this.field424 = class38.method108();
	}

	final void method317(class362 var1, int var2) {
		int var4 = var2 >> 5;
		class362 var5 = this.field436[var4];
		if (null == var5) {
			this.field427[var4] = var1;
		} else {
			var5.field2481 = var1;
		}

		this.field436[var4] = var1;
		var1.field2482 = var2;
	}

	public void method312() throws Exception {
	}

	public void method308(int var1) throws Exception {
	}

	protected int method313() throws Exception {
		return this.field422;
	}

	protected void method309() throws Exception {
	}

	protected void method311() {
	}

	protected void method310() throws Exception {
	}

	public static final void method321(class554 var0) {
		class93.field596 = var0;
	}

	public static final void method319(int var0, boolean var1, int var2) {
		field437 = 22050;
		class107.field681 = var1;
		class399.field2751 = 2;
	}

	static final void method320(class362 var0) {
		var0.field2484 = false;
		if (var0.field2483 != null) {
			var0.field2483.field102 = 0;
		}

		for (class362 var2 = var0.method1727(); var2 != null; var2 = var0.method1728()) {
			method320(var2);
		}

	}

	static final void method316() {
		int var1;
		int var2;
		int var3;
		if (!Client.field2091) {
			var1 = 64 + class393.field2672 * 128;
			var2 = 64 + class316.field2301 * 128;
			var3 = Client.method1347(var1, var2, class212.field1393) - class323.field2339;
			Client.method1422(var1, var3, var2);
		} else if (null != Client.field2094) {
			Client.field2135 = Client.field2094.method932();
			class353.field2437 = Client.field2094.method934();
			if (Client.field2093) {
				class122.field794 = Client.field2094.method933();
			} else {
				class122.field794 = Client.method1347(Client.field2135, class353.field2437, class212.field1393) - Client.field2094.method933();
			}

			Client.field2094.method1473();
		}

		if (!Client.field2092) {
			var1 = 64 + class14.field78 * 128;
			var2 = class149.field1030 * 128 + 64;
			var3 = Client.method1347(var1, var2, class212.field1393) - class551.field4305;
			int var4 = var1 - Client.field2135;
			int var5 = var3 - class122.field794;
			int var6 = var2 - class353.field2437;
			int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
			int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531D) & 2047;
			int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531D) & 2047;
			Client.method1337(var8, var9);
		} else {
			if (Client.field2096 != null) {
				class130.field849 = Client.field2096.method402();
				class130.field849 = Math.min(Math.max(class130.field849, 128), 383);
				Client.field2096.method1473();
			}

			if (null != Client.field2095) {
				class76.field537 = Client.field2095.method402() & 2047;
				Client.field2095.method1473();
			}
		}

	}
}
