public final class class129 {
	static byte[][][] field835;
	static byte[][][] field847;
	static int field834;
	static int field836;
	static int field842;
	static int field846;
	static int[] field838;
	static int[][][] field844;
	static final int[] field837;
	static final int[] field839;
	static final int[] field840;
	static final int[] field841;
	static final int[] field843;
	static final int[] field845;

	static {
		field844 = new int[4][105][105];
		field835 = new byte[4][104][104];
		field836 = 99;
		field839 = new int[]{1, 2, 4, 8};
		field840 = new int[]{16, 32, 64, 128};
		field841 = new int[]{1, 0, -1, 0};
		field837 = new int[]{0, -1, 0, 1};
		field843 = new int[]{1, -1, -1, 1};
		field845 = new int[]{-1, -1, 1, 1};
		field834 = (int)(Math.random() * 17.0D) - 8;
		field846 = (int)(Math.random() * 33.0D) - 16;
	}

	static void method604() {
		field836 = 99;
		class426.field2877 = new short[4][104][104];
		class215.field1407 = new short[4][104][104];
		class354.field2451 = new byte[4][104][104];
		class514.field4061 = new byte[4][104][104];
		class331.field2353 = new int[4][105][105];
		field847 = new byte[4][105][105];
		class342.field2398 = new int[105][105];
		class354.field2455 = new int[104];
		class315.field2300 = new int[104];
		field838 = new int[104];
		class311.field2257 = new int[104];
		class83.field560 = new int[104];
	}

	static void method602() {
		class426.field2877 = (short[][][])null;
		class215.field1407 = (short[][][])null;
		class354.field2451 = (byte[][][])null;
		class514.field4061 = (byte[][][])null;
		class331.field2353 = (int[][][])null;
		field847 = (byte[][][])null;
		class342.field2398 = (int[][])null;
		class354.field2455 = null;
		class315.field2300 = null;
		field838 = null;
		class311.field2257 = null;
		class83.field560 = null;
	}

	static final void method598(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var1 + var3; ++var5) {
			for (int var6 = var0; var6 <= var0 + var2; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					field847[0][var6][var5] = 127;
					if (var0 == var6 && var6 > 0) {
						field844[0][var6][var5] = field844[0][var6 - 1][var5];
					}

					if (var6 == var2 + var0 && var6 < 103) {
						field844[0][var6][var5] = field844[0][var6 + 1][var5];
					}

					if (var1 == var5 && var5 > 0) {
						field844[0][var6][var5] = field844[0][var6][var5 - 1];
					}

					if (var5 == var3 + var1 && var5 < 103) {
						field844[0][var6][var5] = field844[0][var6][var5 + 1];
					}
				}
			}
		}

	}

	static final void method609(byte[] var0, int var1, int var2, int var3, int var4, class151[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var8 + var1 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field1052[var1 + var8];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		Buffer var13 = new Buffer(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var10 + var2;
					class510.method2407(var13, var8, var11, var12, var3 + var11, var4 + var12, 0);
				}
			}
		}

	}

	static final void method601(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class151[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var2 + var12 > 0 && var2 + var12 < 103 && var13 + var3 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field1052[var2 + var12];
					var10000[var3 + var13] &= -16777217;
				}
			}
		}

		Buffer var25 = new Buffer(var0);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var17 + var2;
						int var22 = var3 + class164.method880(var14 & 7, var15 & 7, var7);
						int var23 = (var14 & 7) + var8 + var2;
						int var24 = var3 + var9 + (var15 & 7);
						class510.method2407(var25, var1, var21, var22, var23, var24, var7);
					} else {
						class510.method2407(var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	static final void method596(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				field844[var0][var4 + var1][var5 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field844[var0][var1][var4 + var2] = field844[var0][var1 - 1][var4 + var2];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field844[var0][var4 + var1][var2] = field844[var0][var4 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && field844[var0][var1 - 1][var2] != 0) {
			field844[var0][var1][var2] = field844[var0][var1 - 1][var2];
		} else if (var2 > 0 && field844[var0][var1][var2 - 1] != 0) {
			field844[var0][var1][var2] = field844[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && field844[var0][var1 - 1][var2 - 1] != 0) {
			field844[var0][var1][var2] = field844[var0][var1 - 1][var2 - 1];
		}

	}

	static final boolean method606(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		label57:
		while (true) {
			int var7 = var5.method2516();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method2522();
					if (var10 == 0) {
						continue label57;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.readUnsignedByte() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class397 var16 = class109.method504(var6);
						if (var13 != 22 || !Client.field2059 || var16.field2705 != 0 || var16.field2703 == 1 || var16.field2724) {
							if (!var16.method1840()) {
								++Client.field1903;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method2522();
				if (var10 == 0) {
					break;
				}

				var5.readUnsignedByte();
			}
		}
	}

	static final void method611(byte[] var0, int var1, int var2, class142 var3, class151[] var4) {
		Buffer var6 = new Buffer(var0);
		int var7 = -1;

		while (true) {
			int var8 = var6.method2516();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var10 = var6.method2522();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.readUnsignedByte();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var12 + var1;
				int var18 = var2 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field835[1][var17][var18] & 2) == 2) {
						var19 = var13 - 1;
					}

					class151 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}

					method608(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}

	static final void method595(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class142 var8, class151[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method2516();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.method2522();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var4 == var17 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class397 var21 = class109.method504(var11);
					int var22 = var2 + class164.method879(var16 & 7, var15 & 7, var7, var21.field2701, var21.field2702, var20);
					int var25 = var16 & 7;
					int var26 = var15 & 7;
					int var28 = var21.field2701;
					int var29 = var21.field2702;
					int var30;
					if ((var20 & 1) == 1) {
						var30 = var28;
						var28 = var29;
						var29 = var30;
					}

					int var27 = var7 & 3;
					int var24;
					if (var27 == 0) {
						var24 = var26;
					} else if (var27 == 1) {
						var24 = 7 - var25 - (var28 - 1);
					} else if (var27 == 2) {
						var24 = 7 - var26 - (var29 - 1);
					} else {
						var24 = var25;
					}

					var30 = var24 + var3;
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
						int var31 = var1;
						if ((field835[1][var22][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						class151 var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						method608(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	static final void method608(int var0, int var1, int var2, int var3, int var4, int var5, class142 var6, class151 var7) {
		if (!Client.field2059 || (field835[0][var1][var2] & 2) != 0 || (field835[var0][var1][var2] & 16) == 0) {
			if (var0 < field836) {
				field836 = var0;
			}

			class397 var9 = class109.method504(var3);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2701;
				var11 = var9.field2702;
			} else {
				var10 = var9.field2702;
				var11 = var9.field2701;
			}

			int var12;
			int var13;
			if (var10 + var1 <= 104) {
				var12 = (var10 >> 1) + var1;
				var13 = (var10 + 1 >> 1) + var1;
			} else {
				var12 = var1;
				var13 = var1 + 1;
			}

			int var14;
			int var15;
			if (var2 + var11 <= 104) {
				var14 = var2 + (var11 >> 1);
				var15 = (var11 + 1 >> 1) + var2;
			} else {
				var14 = var2;
				var15 = var2 + 1;
			}

			int[][] var16 = field844[var0];
			int var17 = var16[var13][var14] + var16[var12][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
			int var18 = (var10 << 6) + (var1 << 7);
			int var19 = (var2 << 7) + (var11 << 6);
			long var20 = class503.method2386(var1, var2, 2, var9.field2705 == 0, var3);
			int var22 = var5 + (var4 << 6);
			if (var9.field2726 == 1) {
				var22 += 256;
			}

			if (var9.method1847()) {
				class218.method1006(var0, var1, var2, var9, var4);
			}

			Object var23;
			if (var5 == 22) {
				if (!Client.field2059 || var9.field2705 != 0 || var9.field2703 == 1 || var9.field2724) {
					if (var9.field2709 == -1 && null == var9.field2727) {
						var23 = var9.method1841(22, var4, var16, var18, var17, var19);
					} else {
						var23 = new class525(var3, 22, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
					}

					var6.method735(var0, var1, var2, var17, (class462)var23, var20, var22);
					if (var9.field2703 == 1 && null != var7) {
						var7.method804(var1, var2);
					}

				}
			} else {
				int var24;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var9.field2709 == -1 && var9.field2727 == null) {
							var23 = var9.method1841(var5, var4, var16, var18, var17, var19);
						} else {
							var23 = new class525(var3, var5, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
						}

						var6.method769(var0, var1, var2, var17, 1, 1, (class462)var23, 0, var20, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class331.field2353[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var9.field2703 != 0 && null != var7) {
							var7.method802(var1, var2, var10, var11, var9.field2729);
						}

					} else if (var5 == 0) {
						if (var9.field2709 == -1 && null == var9.field2727) {
							var23 = var9.method1841(0, var4, var16, var18, var17, var19);
						} else {
							var23 = new class525(var3, 0, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
						}

						var6.method737(var0, var1, var2, var17, (class462)var23, (class462)null, field839[var4], 0, var20, var22);
						if (var4 == 0) {
							if (var9.field2720) {
								field847[var0][var1][var2] = 50;
								field847[var0][var1][var2 + 1] = 50;
							}

							if (var9.field2689) {
								var10000 = class331.field2353[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.field2720) {
								field847[var0][var1][var2 + 1] = 50;
								field847[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2689) {
								var10000 = class331.field2353[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.field2720) {
								field847[var0][var1 + 1][var2] = 50;
								field847[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2689) {
								var10000 = class331.field2353[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.field2720) {
								field847[var0][var1][var2] = 50;
								field847[var0][var1 + 1][var2] = 50;
							}

							if (var9.field2689) {
								var10000 = class331.field2353[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var9.field2703 != 0 && var7 != null) {
							var7.method810(var1, var2, var5, var4, var9.field2729);
						}

						if (var9.field2710 != 16) {
							var6.method772(var0, var1, var2, var9.field2710);
						}

					} else if (var5 == 1) {
						if (var9.field2709 == -1 && var9.field2727 == null) {
							var23 = var9.method1841(1, var4, var16, var18, var17, var19);
						} else {
							var23 = new class525(var3, 1, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
						}

						var6.method737(var0, var1, var2, var17, (class462)var23, (class462)null, field840[var4], 0, var20, var22);
						if (var9.field2720) {
							if (var4 == 0) {
								field847[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								field847[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								field847[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								field847[var0][var1][var2] = 50;
							}
						}

						if (var9.field2703 != 0 && var7 != null) {
							var7.method810(var1, var2, var5, var4, var9.field2729);
						}

					} else {
						int var29;
						if (var5 == 2) {
							var29 = var4 + 1 & 3;
							Object var31;
							Object var32;
							if (var9.field2709 == -1 && null == var9.field2727) {
								var32 = var9.method1841(2, var4 + 4, var16, var18, var17, var19);
								var31 = var9.method1841(2, var29, var16, var18, var17, var19);
							} else {
								var32 = new class525(var3, 2, var4 + 4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
								var31 = new class525(var3, 2, var29, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
							}

							var6.method737(var0, var1, var2, var17, (class462)var32, (class462)var31, field839[var4], field839[var29], var20, var22);
							if (var9.field2689) {
								if (var4 == 0) {
									var10000 = class331.field2353[var0][var1];
									var10000[var2] |= 585;
									var10000 = class331.field2353[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class331.field2353[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = class331.field2353[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class331.field2353[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class331.field2353[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class331.field2353[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class331.field2353[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var9.field2703 != 0 && null != var7) {
								var7.method810(var1, var2, var5, var4, var9.field2729);
							}

							if (var9.field2710 != 16) {
								var6.method772(var0, var1, var2, var9.field2710);
							}

						} else if (var5 == 3) {
							if (var9.field2709 == -1 && null == var9.field2727) {
								var23 = var9.method1841(3, var4, var16, var18, var17, var19);
							} else {
								var23 = new class525(var3, 3, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
							}

							var6.method737(var0, var1, var2, var17, (class462)var23, (class462)null, field840[var4], 0, var20, var22);
							if (var9.field2720) {
								if (var4 == 0) {
									field847[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									field847[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									field847[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									field847[var0][var1][var2] = 50;
								}
							}

							if (var9.field2703 != 0 && null != var7) {
								var7.method810(var1, var2, var5, var4, var9.field2729);
							}

						} else if (var5 == 9) {
							if (var9.field2709 == -1 && null == var9.field2727) {
								var23 = var9.method1841(var5, var4, var16, var18, var17, var19);
							} else {
								var23 = new class525(var3, var5, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
							}

							var6.method769(var0, var1, var2, var17, 1, 1, (class462)var23, 0, var20, var22);
							if (var9.field2703 != 0 && var7 != null) {
								var7.method802(var1, var2, var10, var11, var9.field2729);
							}

							if (var9.field2710 != 16) {
								var6.method772(var0, var1, var2, var9.field2710);
							}

						} else if (var5 == 4) {
							if (var9.field2709 == -1 && var9.field2727 == null) {
								var23 = var9.method1841(4, var4, var16, var18, var17, var19);
							} else {
								var23 = new class525(var3, 4, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
							}

							var6.method738(var0, var1, var2, var17, (class462)var23, (class462)null, field839[var4], 0, 0, 0, var20, var22);
						} else {
							long var30;
							Object var33;
							if (var5 == 5) {
								var29 = 16;
								var30 = var6.method758(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class109.method504(class503.method2376(var30)).field2710;
								}

								if (var9.field2709 == -1 && var9.field2727 == null) {
									var33 = var9.method1841(4, var4, var16, var18, var17, var19);
								} else {
									var33 = new class525(var3, 4, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
								}

								var6.method738(var0, var1, var2, var17, (class462)var33, (class462)null, field839[var4], 0, field841[var4] * var29, field837[var4] * var29, var20, var22);
							} else if (var5 == 6) {
								var29 = 8;
								var30 = var6.method758(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class109.method504(class503.method2376(var30)).field2710 / 2;
								}

								if (var9.field2709 == -1 && null == var9.field2727) {
									var33 = var9.method1841(4, var4 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class525(var3, 4, var4 + 4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
								}

								var6.method738(var0, var1, var2, var17, (class462)var33, (class462)null, 256, var4, field843[var4] * var29, var29 * field845[var4], var20, var22);
							} else if (var5 == 7) {
								var24 = var4 + 2 & 3;
								if (var9.field2709 == -1 && var9.field2727 == null) {
									var23 = var9.method1841(4, var24 + 4, var16, var18, var17, var19);
								} else {
									var23 = new class525(var3, 4, var24 + 4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
								}

								var6.method738(var0, var1, var2, var17, (class462)var23, (class462)null, 256, var24, 0, 0, var20, var22);
							} else if (var5 == 8) {
								var29 = 8;
								var30 = var6.method758(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class109.method504(class503.method2376(var30)).field2710 / 2;
								}

								int var28 = var4 + 2 & 3;
								Object var27;
								if (var9.field2709 == -1 && null == var9.field2727) {
									var33 = var9.method1841(4, var4 + 4, var16, var18, var17, var19);
									var27 = var9.method1841(4, var28 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class525(var3, 4, var4 + 4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
									var27 = new class525(var3, 4, var28 + 4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
								}

								var6.method738(var0, var1, var2, var17, (class462)var33, (class462)var27, 256, var4, field843[var4] * var29, var29 * field845[var4], var20, var22);
							}
						}
					}
				} else {
					if (var9.field2709 == -1 && null == var9.field2727) {
						var23 = var9.method1841(10, var4, var16, var18, var17, var19);
					} else {
						var23 = new class525(var3, 10, var4, var0, var1, var2, var9.field2709, var9.field2735, (class462)null);
					}

					if (null != var23 && var6.method769(var0, var1, var2, var17, var10, var11, (class462)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2720) {
						var24 = 15;
						if (var23 instanceof class490) {
							var24 = ((class490)var23).method2262() / 4;
							if (var24 > 30) {
								var24 = 30;
							}
						}

						for (int var25 = 0; var25 <= var10; ++var25) {
							for (int var26 = 0; var26 <= var11; ++var26) {
								if (var24 > field847[var0][var25 + var1][var26 + var2]) {
									field847[var0][var1 + var25][var26 + var2] = (byte)var24;
								}
							}
						}
					}

					if (var9.field2703 != 0 && null != var7) {
						var7.method802(var1, var2, var10, var11, var9.field2729);
					}

				}
			}
		}
	}

	static final void method610(class142 var0, class151[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((field835[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if ((field835[1][var4][var5] & 2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method803(var4, var5);
						}
					}
				}
			}
		}

		field834 += (int)(Math.random() * 5.0D) - 2;
		if (field834 < -8) {
			field834 = -8;
		}

		if (field834 > 8) {
			field834 = 8;
		}

		field846 += (int)(Math.random() * 5.0D) - 2;
		if (field846 < -16) {
			field846 = -16;
		}

		if (field846 > 16) {
			field846 = 16;
		}

		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		for (var3 = 0; var3 < 4; ++var3) {
			byte[][] var46 = field847[var3];
			boolean var47 = true;
			boolean var48 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int)Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;

			int var20;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = field844[var3][var13 + 1][var12] - field844[var3][var13 - 1][var12];
					var15 = field844[var3][var13][var12 + 1] - field844[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
					int var21 = (var46[var13][var12] >> 1) + (var46[var13][var12 + 1] >> 3) + (var46[var13 - 1][var12] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13][var12 - 1] >> 2);
					class342.field2398[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class354.field2455[var12] = 0;
				class315.field2300[var12] = 0;
				field838[var12] = 0;
				class311.field2257[var12] = 0;
				class83.field560[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var52;
						var18 = class426.field2877[var3][var14][var13] & var17;
						if (var18 > 0) {
							class479 var55 = class479.method2203(var18 - 1);
							var10000 = class354.field2455;
							var10000[var13] += var55.field3371;
							var10000 = class315.field2300;
							var10000[var13] += var55.field3369;
							var10000 = field838;
							var10000[var13] += var55.field3370;
							var10000 = class311.field2257;
							var10000[var13] += var55.field3368;
							var10002 = class83.field560[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						long var53 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var18 = (int)var53;
						var19 = class426.field2877[var3][var15][var13] & var18;
						if (var19 > 0) {
							class479 var56 = class479.method2203(var19 - 1);
							var10000 = class354.field2455;
							var10000[var13] -= var56.field3371;
							var10000 = class315.field2300;
							var10000[var13] -= var56.field3369;
							var10000 = field838;
							var10000[var13] -= var56.field3370;
							var10000 = class311.field2257;
							var10000[var13] -= var56.field3368;
							var10002 = class83.field560[var13]--;
						}
					}
				}

				if (var12 >= 1 && var12 < 103) {
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					var17 = 0;

					for (var18 = -5; var18 < 109; ++var18) {
						var19 = var18 + 5;
						if (var19 >= 0 && var19 < 104) {
							var13 += class354.field2455[var19];
							var14 += class315.field2300[var19];
							var15 += field838[var19];
							var16 += class311.field2257[var19];
							var17 += class83.field560[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class354.field2455[var20];
							var14 -= class315.field2300[var20];
							var15 -= field838[var20];
							var16 -= class311.field2257[var20];
							var17 -= class83.field560[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!Client.field2059 || (field835[0][var12][var18] & 2) != 0 || (field835[var3][var12][var18] & 16) == 0)) {
							if (var3 < field836) {
								field836 = var3;
							}

							long var57 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var23 = (int)var57;
							int var24 = class426.field2877[var3][var12][var18] & var23;
							int var25 = class215.field1407[var3][var12][var18] & var23;
							if (var24 > 0 || var25 > 0) {
								int var26 = field844[var3][var12][var18];
								int var27 = field844[var3][var12 + 1][var18];
								int var28 = field844[var3][var12 + 1][var18 + 1];
								int var29 = field844[var3][var12][var18 + 1];
								int var30 = class342.field2398[var12][var18];
								int var31 = class342.field2398[var12 + 1][var18];
								int var32 = class342.field2398[var12 + 1][var18 + 1];
								int var33 = class342.field2398[var12][var18 + 1];
								int var34 = -1;
								int var35 = -1;
								int var36;
								int var37;
								if (var24 > 0) {
									var36 = var13 * 256 / var16;
									var37 = var14 / var17;
									int var38 = var15 / var17;
									var34 = method603(var36, var37, var38);
									var36 = var36 + field834 & 255;
									var38 += field846;
									if (var38 < 0) {
										var38 = 0;
									} else if (var38 > 255) {
										var38 = 255;
									}

									var35 = method603(var36, var37, var38);
								}

								if (var3 > 0) {
									boolean var58 = true;
									if (var24 == 0 && class354.field2451[var3][var12][var18] != 0) {
										var58 = false;
									}

									if (var25 > 0 && !class406.method1866(var25 - 1).field4197) {
										var58 = false;
									}

									if (var58 && var26 == var27 && var26 == var28 && var26 == var29) {
										var10000 = class331.field2353[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var36 = 0;
								if (var35 != -1) {
									var36 = class105.field672[method599(var35, 96)];
								}

								if (var25 == 0) {
									var0.method734(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method599(var34, var30), method599(var34, var31), method599(var34, var32), method599(var34, var33), 0, 0, 0, 0, var36, 0);
								} else {
									var37 = 1 + class354.field2451[var3][var12][var18];
									byte var59 = class514.field4061[var3][var12][var18];
									class536 var39 = class406.method1866(var25 - 1);
									int var40 = var39.field4198;
									int var41;
									int var42;
									int var43;
									int var44;
									if (var40 >= 0) {
										var42 = class105.field668.field1730.method2620(var40);
										var41 = -1;
									} else if (var39.field4194 == 16711935) {
										var41 = -2;
										var40 = -1;
										var42 = -2;
									} else {
										var41 = method603(var39.field4199, var39.field4204, var39.field4200);
										var43 = var39.field4199 + field834 & 255;
										var44 = var39.field4200 + field846;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var42 = method603(var43, var39.field4204, var44);
									}

									var43 = 0;
									if (var42 != -2) {
										var43 = class105.field672[method605(var42, 96)];
									}

									if (var39.field4202 != -1) {
										var44 = field834 + var39.field4201 & 255;
										int var45 = var39.field4203 + field846;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var42 = method603(var44, var39.field4195, var45);
										var43 = class105.field672[method605(var42, 96)];
									}

									var0.method734(var3, var12, var18, var37, var59, var40, var26, var27, var28, var29, method599(var34, var30), method599(var34, var31), method599(var34, var32), method599(var34, var33), method605(var41, var30), method605(var41, var31), method605(var41, var32), method605(var41, var33), var36, var43);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method733(var3, var13, var12, method607(var3, var13, var12));
				}
			}

			class426.field2877[var3] = (short[][])null;
			class215.field1407[var3] = (short[][])null;
			class354.field2451[var3] = (byte[][])null;
			class514.field4061[var3] = (byte[][])null;
			field847[var3] = (byte[][])null;
		}

		var0.method752(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((field835[1][var3][var4] & 2) == 2) {
					var0.method731(var3, var4);
				}
			}
		}

		var3 = 1;
		var4 = 2;
		var5 = 4;

		for (var6 = 0; var6 < 4; ++var6) {
			if (var6 > 0) {
				var3 <<= 3;
				var4 <<= 3;
				var5 <<= 3;
			}

			for (int var49 = 0; var49 <= var6; ++var49) {
				for (int var50 = 0; var50 <= 104; ++var50) {
					for (int var51 = 0; var51 <= 104; ++var51) {
						boolean var54;
						if ((class331.field2353[var49][var51][var50] & var3) != 0) {
							var10 = var50;
							var11 = var50;
							var12 = var49;

							for (var13 = var49; var10 > 0 && (class331.field2353[var49][var51][var10 - 1] & var3) != 0; --var10) {
							}

							while (var11 < 104 && (class331.field2353[var49][var51][var11 + 1] & var3) != 0) {
								++var11;
							}

							label332:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class331.field2353[var12 - 1][var51][var14] & var3) == 0) {
										break label332;
									}
								}

								--var12;
							}

							label321:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class331.field2353[var13 + 1][var51][var14] & var3) == 0) {
										break label321;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (var11 - var10 + 1);
							if (var14 >= 8) {
								var54 = true;
								var16 = field844[var13][var51][var10] - 240;
								var17 = field844[var12][var51][var10];
								class142.method732(var6, 1, var51 * 128, var51 * 128, var10 * 128, 128 + var11 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class331.field2353[var18][var51];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if ((class331.field2353[var49][var51][var50] & var4) != 0) {
							var10 = var51;
							var11 = var51;
							var12 = var49;

							for (var13 = var49; var10 > 0 && (class331.field2353[var49][var10 - 1][var50] & var4) != 0; --var10) {
							}

							while (var11 < 104 && (class331.field2353[var49][var11 + 1][var50] & var4) != 0) {
								++var11;
							}

							label385:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class331.field2353[var12 - 1][var14][var50] & var4) == 0) {
										break label385;
									}
								}

								--var12;
							}

							label374:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class331.field2353[var13 + 1][var14][var50] & var4) == 0) {
										break label374;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (var11 - var10 + 1);
							if (var14 >= 8) {
								var54 = true;
								var16 = field844[var13][var10][var50] - 240;
								var17 = field844[var12][var10][var50];
								class142.method732(var6, 2, var10 * 128, 128 + var11 * 128, var50 * 128, var50 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class331.field2353[var18][var19];
										var10000[var50] &= ~var4;
									}
								}
							}
						}

						if ((class331.field2353[var49][var51][var50] & var5) != 0) {
							var10 = var51;
							var11 = var51;
							var12 = var50;

							for (var13 = var50; var12 > 0 && (class331.field2353[var49][var51][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && (class331.field2353[var49][var51][var13 + 1] & var5) != 0) {
								++var13;
							}

							label438:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class331.field2353[var49][var10 - 1][var14] & var5) == 0) {
										break label438;
									}
								}

								--var10;
							}

							label427:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class331.field2353[var49][var11 + 1][var14] & var5) == 0) {
										break label427;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
								var14 = field844[var49][var10][var12];
								class142.method732(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class331.field2353[var49][var15];
										var10000[var16] &= ~var5;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	static int method607(int var0, int var1, int var2) {
		if ((field835[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (field835[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	static final int method597(int var0, int var1) {
		int var3 = method600(var0 - 1, var1 - 1) + method600(var0 + 1, var1 - 1) + method600(var0 - 1, var1 + 1) + method600(var0 + 1, var1 + 1);
		int var4 = method600(var0 - 1, var1) + method600(var0 + 1, var1) + method600(var0, var1 - 1) + method600(var0, var1 + 1);
		int var5 = method600(var0, var1);
		return var3 / 16 + var4 / 8 + var5 / 4;
	}

	static final int method600(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = 1376312589 + var3 * (var3 * var3 * 15731 + 789221) & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	static final int method599(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	static final int method605(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	static final int method603(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
		return var4;
	}
}
