public final class class62 {
	int field281;
	int field282;
	int field283;
	int field284;
	int field285;
	int field286;
	int field287;
	int field288;
	int field289;
	int field290;
	int field291;
	int field292;
	int field293;
	int field294;
	int field295;
	int field296;
	int field297;
	int field298;

	class62() {
	}

	static final void method261() {
		Client.method1386(false);
		Client.field1901 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < class445.field2975.length; ++var2) {
			if (class516.field4078[var2] != -1 && null == class445.field2975[var2]) {
				class445.field2975[var2] = class522.field4107.method39(class516.field4078[var2], 0);
				if (null == class445.field2975[var2]) {
					var1 = false;
					++Client.field1901;
				}
			}

			if (class512.field3748[var2] != -1 && null == class413.field2848[var2]) {
				class413.field2848[var2] = class522.field4107.method15(class512.field3748[var2], 0, class94.regionXteaKeys[var2]);
				if (null == class413.field2848[var2]) {
					var1 = false;
					++Client.field1901;
				}
			}
		}

		if (!var1) {
			Client.field1859 = 1;
		} else {
			Client.field1903 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < class445.field2975.length; ++var2) {
				byte[] var3 = class413.field2848[var2];
				if (null != var3) {
					var4 = 64 * (class529.field4140[var2] >> 8) - class80.selectedTileX;
					var5 = (class529.field4140[var2] & 255) * 64 - class425.selectedTileXYIdk;
					if (Client.isInstance) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= class129.method606(var3, var4, var5);
				}
			}

			if (!var1) {
				Client.field1859 = 2;
			} else {
				if (Client.field1859 != 0) {
					Client.method1452(class513.field3797 + class274.field1824 + class274.field1821 + 100 + "%" + class274.field1822, true);
				}

				class253.method1209();
				class141.field937.method729();

				for (var2 = 0; var2 < 4; ++var2) {
					Client.field1906[var2].method801();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class129.field835[var2][var16][var4] = 0;
						}
					}
				}

				class253.method1209();
				class129.method604();
				var2 = class445.field2975.length;
				class218.method1005();
				Client.method1386(true);
				int var18;
				if (!Client.isInstance) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (class529.field4140[var16] >> 8) * 64 - class80.selectedTileX;
						var5 = 64 * (class529.field4140[var16] & 255) - class425.selectedTileXYIdk;
						var6 = class445.field2975[var16];
						if (var6 != null) {
							class253.method1209();
							class129.method609(var6, var4, var5, class344.field2404 * 8 - 48, class130.field848 * 8 - 48, Client.field1906);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class529.field4140[var16] >> 8) - class80.selectedTileX;
						var5 = 64 * (class529.field4140[var16] & 255) - class425.selectedTileXYIdk;
						var6 = class445.field2975[var16];
						if (null == var6 && class130.field848 < 800) {
							class253.method1209();
							class129.method598(var4, var5, 64, 64);
						}
					}

					Client.method1386(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = class413.field2848[var16];
						if (var17 != null) {
							var5 = 64 * (class529.field4140[var16] >> 8) - class80.selectedTileX;
							var18 = (class529.field4140[var16] & 255) * 64 - class425.selectedTileXYIdk;
							class253.method1209();
							class129.method611(var17, var5, var18, class141.field937, Client.field1906);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (Client.isInstance) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						class253.method1209();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = Client.field1908[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;

									for (int var13 = 0; var13 < class529.field4140.length; ++var13) {
										if (var12 == class529.field4140[var13] && class445.field2975[var13] != null) {
											int var14 = (var10 - var4) * 8;
											int var15 = 8 * (var11 - var5);
											class129.method601(class445.field2975[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, Client.field1906);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									class129.method596(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = Client.field1908[0][var16][var4];
							if (var5 == -1) {
								class129.method598(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					Client.method1386(true);

					for (var16 = 0; var16 < 4; ++var16) {
						class253.method1209();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = Client.field1908[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class529.field4140.length; ++var12) {
										if (var11 == class529.field4140[var12] && null != class413.field2848[var12]) {
											class129.method595(class413.field2848[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, class141.field937, Client.field1906);
											break;
										}
									}
								}
							}
						}
					}
				}

				Client.method1386(true);
				class253.method1209();
				class129.method610(class141.field937, Client.field1906);
				Client.method1386(true);
				var16 = class129.field836;
				if (var16 > class212.field1393) {
					var16 = class212.field1393;
				}

				if (var16 < class212.field1393 - 1) {
					var16 = class212.field1393 - 1;
				}

				if (Client.field2059) {
					class141.field937.method730(class129.field836);
				} else {
					class141.field937.method730(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						Client.method1314(var4, var5);
					}
				}

				class253.method1209();
				Client.method1419();
				class397.field2691.method1679();
				class341 var20;
				if (class190.field1287.method2581()) {
					var20 = class341.createClientPacket(ClientPacket.field3125, Client.field1891.field4219);
					var20.buffer.writeInt(1057001181);
					Client.field1891.method2612(var20);
				}

				if (!Client.isInstance) {
					var4 = (class344.field2404 - 6) / 8;
					var5 = (class344.field2404 + 6) / 8;
					var18 = (class130.field848 - 6) / 8;
					var7 = (6 + class130.field848) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								class522.field4107.method32("m" + var8 + "_" + var9);
								class522.field4107.method32("l" + var8 + "_" + var9);
							}
						}
					}
				}

				class432.method1954(30);
				class253.method1209();
				class129.method602();
				var20 = class341.createClientPacket(ClientPacket.field3087, Client.field1891.field4219);
				Client.field1891.method2612(var20);
				class535.method2591();
			}
		}
	}
}
