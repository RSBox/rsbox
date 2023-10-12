import java.util.Random;

public class class95 {
	static int[] field605;
	static int[] field617;
	static int[] field621;
	static int[] field624;
	static int[] field625;
	static int[] field626;
	static int[] field627;
	static int[] field628;
	class223 field606;
	class223 field607;
	class223 field608;
	class223 field609;
	class223 field610;
	class223 field611;
	class223 field612;
	class223 field615;
	class223 field622;
	class517 field618;
	int field616;
	int field619;
	int field620;
	int field623;
	int[] field613;
	int[] field614;
	int[] field629;

	static {
		field605 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field605[var1] = (var0.nextInt() & 2) - 1;
		}

		field624 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field624[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field621 = new int[220500];
		field625 = new int[5];
		field617 = new int[5];
		field626 = new int[5];
		field628 = new int[5];
		field627 = new int[5];
	}

	class95() {
		this.field613 = new int[]{0, 0, 0, 0, 0};
		this.field614 = new int[]{0, 0, 0, 0, 0};
		this.field629 = new int[]{0, 0, 0, 0, 0};
		this.field616 = 0;
		this.field623 = 100;
		this.field620 = 500;
		this.field619 = 0;
	}

	final int[] method423(int var1, int var2) {
		class96.method427(field621, 0, var1);
		if (var2 < 10) {
			return field621;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field615.method1020();
			this.field606.method1020();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field607 != null) {
				this.field607.method1020();
				this.field608.method1020();
				var5 = (int)((double)(this.field607.field1457 - this.field607.field1456) * 32.768D / var3);
				var6 = (int)((double)this.field607.field1456 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field609 != null) {
				this.field609.method1020();
				this.field610.method1020();
				var8 = (int)((double)(this.field609.field1457 - this.field609.field1456) * 32.768D / var3);
				var9 = (int)((double)this.field609.field1456 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field613[var11] != 0) {
					field625[var11] = 0;
					field617[var11] = (int)((double)this.field629[var11] * var3);
					field626[var11] = (this.field613[var11] << 14) / 100;
					field628[var11] = (int)((double)(this.field615.field1457 - this.field615.field1456) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field614[var11]) / var3);
					field627[var11] = (int)((double)this.field615.field1456 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field615.method1021(var1);
				var13 = this.field606.method1021(var1);
				if (this.field607 != null) {
					var14 = this.field607.method1021(var1);
					var15 = this.field608.method1021(var1);
					var12 += this.method424(var7, var15, this.field607.field1453) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field609 != null) {
					var14 = this.field609.method1021(var1);
					var15 = this.field610.method1021(var1);
					var13 = var13 * ((this.method424(var10, var15, this.field609.field1453) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field613[var14] != 0) {
						var15 = var11 + field617[var14];
						if (var15 < var1) {
							var10000 = field621;
							var10000[var15] += this.method424(field625[var14], var13 * field626[var14] >> 15, this.field615.field1453);
							var10000 = field625;
							var10000[var14] += (var12 * field628[var14] >> 16) + field627[var14];
						}
					}
				}
			}

			int var16;
			if (this.field611 != null) {
				this.field611.method1020();
				this.field612.method1020();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field611.method1021(var1);
					var16 = this.field612.method1021(var1);
					if (var20) {
						var12 = this.field611.field1456 + ((this.field611.field1457 - this.field611.field1456) * var15 >> 8);
					} else {
						var12 = this.field611.field1456 + ((this.field611.field1457 - this.field611.field1456) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field621[var14] = 0;
					}
				}
			}

			if (this.field616 > 0 && this.field623 > 0) {
				var11 = (int)((double)this.field616 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field621;
					var10000[var12] += field621[var12 - var11] * this.field623 / 100;
				}
			}

			if (this.field618.field4086[0] > 0 || this.field618.field4086[1] > 0) {
				this.field622.method1020();
				var11 = this.field622.method1021(var1 + 1);
				var12 = this.field618.method2432(0, (float)var11 / 65536.0F);
				var13 = this.field618.method2432(1, (float)var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field621[var14 + var12] * (long)class517.field4085 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field621[var14 + var12 - 1 - var17] * (long)class517.field4083[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field621[var14 - 1 - var17] * (long)class517.field4083[1][var17] >> 16);
						}

						field621[var14] = var16;
						var11 = this.field622.method1021(var1 + 1);
						++var14;
					}

					boolean var21 = true;
					var15 = 128;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)field621[var14 + var12] * (long)class517.field4085 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field621[var14 + var12 - 1 - var18] * (long)class517.field4083[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field621[var14 - 1 - var18] * (long)class517.field4083[1][var18] >> 16);
							}

							field621[var14] = var17;
							var11 = this.field622.method1021(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field621[var14 + var12 - 1 - var18] * (long)class517.field4083[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field621[var14 - 1 - var18] * (long)class517.field4083[1][var18] >> 16);
								}

								field621[var14] = var17;
								this.field622.method1021(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field618.method2432(0, (float)var11 / 65536.0F);
						var13 = this.field618.method2432(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field621[var11] < -32768) {
					field621[var11] = -32768;
				}

				if (field621[var11] > 32767) {
					field621[var11] = 32767;
				}
			}

			return field621;
		}
	}

	final int method424(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field624[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field605[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	final void method425(Buffer var1) {
		this.field615 = new class223();
		this.field615.method1018(var1);
		this.field606 = new class223();
		this.field606.method1018(var1);
		int var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.field607 = new class223();
			this.field607.method1018(var1);
			this.field608 = new class223();
			this.field608.method1018(var1);
		}

		var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.field609 = new class223();
			this.field609.method1018(var1);
			this.field610 = new class223();
			this.field610.method1018(var1);
		}

		var2 = var1.readUnsignedByte();
		if (var2 != 0) {
			--var1.offset;
			this.field611 = new class223();
			this.field611.method1018(var1);
			this.field612 = new class223();
			this.field612.method1018(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method2522();
			if (var4 == 0) {
				break;
			}

			this.field613[var3] = var4;
			this.field614[var3] = var1.method2517();
			this.field629[var3] = var1.method2522();
		}

		this.field616 = var1.method2522();
		this.field623 = var1.method2522();
		this.field620 = var1.readUnsignedShort();
		this.field619 = var1.readUnsignedShort();
		this.field618 = new class517();
		this.field622 = new class223();
		this.field618.method2433(var1, this.field622);
	}
}
