public final class class470 {
	static class180 field3304;

	static {
		field3304 = new class180();
	}

	public static int method2183(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field3304) {
			field3304.field1249 = var2;
			field3304.field1267 = 9;
			field3304.field1243 = var0;
			field3304.field1254 = 0;
			field3304.field1239 = var1;
			field3304.field1259 = 0;
			field3304.field1244 = 0;
			field3304.field1241 = 0;
			field3304.field1245 = 0;
			method2177(field3304);
			var1 -= field3304.field1239;
			field3304.field1249 = null;
			field3304.field1243 = null;
			return var1;
		}
	}

	static void method2178(class180 var0) {
		byte var2 = var0.field1246;
		int var3 = var0.field1247;
		int var4 = var0.field1255;
		int var5 = var0.field1253;
		int[] var6 = class28.field138;
		int var7 = var0.field1252;
		byte[] var8 = var0.field1243;
		int var9 = var0.field1254;
		int var10 = var0.field1239;
		int var12 = var0.field1270 + 1;

		label61:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label61;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label61;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										++var4;
									}
								}
							}
						}
						continue label61;
					}

					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field1245;
		var0.field1245 += var10 - var10;
		if (var0.field1245 < var13) {
		}

		var0.field1246 = var2;
		var0.field1247 = var3;
		var0.field1255 = var4;
		var0.field1253 = var5;
		class28.field138 = var6;
		var0.field1252 = var7;
		var0.field1243 = var8;
		var0.field1254 = var9;
		var0.field1239 = var10;
	}

	static void method2177(class180 var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		Object var23 = null;
		Object var24 = null;
		Object var25 = null;
		var0.field1250 = 1284764955;
		if (class28.field138 == null) {
			class28.field138 = new int[var0.field1250 * -1161486880];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method2179(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2179(var0);
				var1 = method2176(var0);
				if (var1 != 0) {
				}

				var0.field1251 = 0;
				var1 = method2179(var0);
				var0.field1251 = var0.field1251 << 8 | var1 & 255;
				var1 = method2179(var0);
				var0.field1251 = var0.field1251 << 8 | var1 & 255;
				var1 = method2179(var0);
				var0.field1251 = var0.field1251 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method2176(var0);
					if (var1 == 1) {
						var0.field1240[var35] = true;
					} else {
						var0.field1240[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field1258[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field1240[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method2176(var0);
							if (var1 == 1) {
								var0.field1258[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method2180(var0);
				int var38 = var0.field1257 + 2;
				int var39 = method2182(3, var0);
				int var40 = method2182(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method2176(var0);
						if (var1 == 0) {
							var0.field1264[var35] = (byte)var36;
							break;
						}

						++var36;
					}
				}

				byte[] var27 = new byte[6];

				byte var29;
				for (var29 = 0; var29 < var39; var27[var29] = var29++) {
				}

				for (var35 = 0; var35 < var40; ++var35) {
					var29 = var0.field1264[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field1263[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var50 = method2182(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method2176(var0);
							if (var1 == 0) {
								var0.field1265[var37][var35] = (byte)var50;
								break;
							}

							var1 = method2176(var0);
							if (var1 == 0) {
								++var50;
							} else {
								--var50;
							}
						}
					}
				}

				for (var37 = 0; var37 < var39; ++var37) {
					byte var2 = 32;
					byte var3 = 0;

					for (var35 = 0; var35 < var38; ++var35) {
						if (var0.field1265[var37][var35] > var3) {
							var3 = var0.field1265[var37][var35];
						}

						if (var0.field1265[var37][var35] < var2) {
							var2 = var0.field1265[var37][var35];
						}
					}

					method2181(var0.field1248[var37], var0.field1235[var37], var0.field1268[var37], var0.field1265[var37], var2, var3, var38);
					var0.field1269[var37] = var2;
				}

				int var41 = var0.field1257 + 1;
				byte var42 = -1;
				var12 = false;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field1266[var35] = 0;
				}

				int var61 = 4095;

				int var59;
				int var60;
				for (var59 = 15; var59 >= 0; --var59) {
					for (var60 = 15; var60 >= 0; --var60) {
						var0.field1242[var61] = (byte)(var59 * 16 + var60);
						--var61;
					}

					var0.field1262[var59] = var61 + 1;
				}

				int var47 = 0;
				int var43 = var42 + 1;
				byte var44 = 50;
				byte var54 = var0.field1263[0];
				int var55 = var0.field1269[var54];
				int[] var56 = var0.field1248[var54];
				int[] var58 = var0.field1268[var54];
				int[] var57 = var0.field1235[var54];
				int var45 = var44 - 1;
				int var51 = var55;

				int var52;
				byte var53;
				for (var52 = method2182(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
					++var51;
					var53 = method2176(var0);
				}

				int var46 = var58[var52 - var57[var51]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var46 != var41) {
						if (var46 != 0 && var46 != 1) {
							int var33 = var46 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field1262[0];

								for (var1 = var0.field1242[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field1242[var34] = var0.field1242[var34 - 1];
									var0.field1242[var34 - 1] = var0.field1242[var34 - 2];
									var0.field1242[var34 - 2] = var0.field1242[var34 - 3];
									var0.field1242[var34 - 3] = var0.field1242[var34 - 4];
								}

								while (var33 > 0) {
									var0.field1242[var30 + var33] = var0.field1242[var30 + var33 - 1];
									--var33;
								}

								var0.field1242[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field1262[var31] + var32;

								for (var1 = var0.field1242[var30]; var30 > var0.field1262[var31]; --var30) {
									var0.field1242[var30] = var0.field1242[var30 - 1];
								}

								for (var10002 = var0.field1262[var31]++; var31 > 0; --var31) {
									var10002 = var0.field1262[var31]--;
									var0.field1242[var0.field1262[var31]] = var0.field1242[var0.field1262[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field1262[0]--;
								var0.field1242[var0.field1262[0]] = var1;
								if (var0.field1262[0] == 0) {
									var61 = 4095;

									for (var59 = 15; var59 >= 0; --var59) {
										for (var60 = 15; var60 >= 0; --var60) {
											var0.field1242[var61] = var0.field1242[var0.field1262[var59] + var60];
											--var61;
										}

										var0.field1262[var59] = var61 + 1;
									}
								}
							}

							var10002 = var0.field1266[var0.field1233[var1 & 255] & 255]++;
							class28.field138[var47] = var0.field1233[var1 & 255] & 255;
							++var47;
							if (var45 == 0) {
								++var43;
								var45 = 50;
								var54 = var0.field1263[var43];
								var55 = var0.field1269[var54];
								var56 = var0.field1248[var54];
								var58 = var0.field1268[var54];
								var57 = var0.field1235[var54];
							}

							--var45;
							var51 = var55;

							for (var52 = method2182(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
								++var51;
								var53 = method2176(var0);
							}

							var46 = var58[var52 - var57[var51]];
						} else {
							int var48 = -1;
							int var49 = 1;

							do {
								if (var46 == 0) {
									var48 += var49;
								} else if (var46 == 1) {
									var48 += var49 * 2;
								}

								var49 *= 2;
								if (var45 == 0) {
									++var43;
									var45 = 50;
									var54 = var0.field1263[var43];
									var55 = var0.field1269[var54];
									var56 = var0.field1248[var54];
									var58 = var0.field1268[var54];
									var57 = var0.field1235[var54];
								}

								--var45;
								var51 = var55;

								for (var52 = method2182(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
									++var51;
									var53 = method2176(var0);
								}

								var46 = var58[var52 - var57[var51]];
							} while(var46 == 0 || var46 == 1);

							++var48;
							var1 = var0.field1233[var0.field1242[var0.field1262[0]] & 255];
							var10000 = var0.field1266;

							for (var10000[var1 & 255] += var48; var48 > 0; --var48) {
								class28.field138[var47] = var1 & 255;
								++var47;
							}
						}
					}

					var0.field1247 = 0;
					var0.field1246 = 0;
					var0.field1256[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field1256[var35] = var0.field1266[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field1256;
						var10000[var35] += var0.field1256[var35 - 1];
					}

					for (var35 = 0; var35 < var47; ++var35) {
						var1 = (byte)(class28.field138[var35] & 255);
						var10000 = class28.field138;
						int var10001 = var0.field1256[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field1256[var1 & 255]++;
					}

					var0.field1252 = class28.field138[var0.field1251] >> 8;
					var0.field1255 = 0;
					var0.field1252 = class28.field138[var0.field1252];
					var0.field1253 = (byte)(var0.field1252 & 255);
					var0.field1252 >>= 8;
					++var0.field1255;
					var0.field1270 = var47;
					method2178(var0);
					if (var0.field1255 == var0.field1270 + 1 && var0.field1247 == 0) {
						var26 = true;
						break;
					}

					var26 = false;
					break;
				}
			}

			return;
		}
	}

	static byte method2179(class180 var0) {
		return (byte)method2182(8, var0);
	}

	static byte method2176(class180 var0) {
		return (byte)method2182(1, var0);
	}

	static int method2182(int var0, class180 var1) {
		while (var1.field1259 < var0) {
			var1.field1244 = var1.field1244 << 8 | var1.field1249[var1.field1267] & 255;
			var1.field1259 += 8;
			++var1.field1267;
			++var1.field1241;
			if (var1.field1241 == 0) {
			}
		}

		int var2 = var1.field1244 >> var1.field1259 - var0 & (1 << var0) - 1;
		var1.field1259 -= var0;
		return var2;
	}

	static void method2180(class180 var0) {
		var0.field1257 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field1258[var1]) {
				var0.field1233[var0.field1257] = (byte)var1;
				++var0.field1257;
			}
		}

	}

	static void method2181(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
}
