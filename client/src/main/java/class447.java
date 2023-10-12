public class class447 {
	static int field2982;
	class265[] field2983;

	public void method2100() {
		this.field2983 = new class265[1];
		class298 var2 = class298.field2202;
		this.field2983[0] = new class265(var2.field2200, var2.field2194);
	}

	public int method2101(int var1, int var2, int var3, class304 var4, class151 var5, boolean var6, int[] var7, int[] var8) {
		return this.method2104(var1, var2, var3, var4, var5, true, var7, var8, this.field2983[0]);
	}

	int method2104(int var1, int var2, int var3, class304 var4, class151 var5, boolean var6, int[] var7, int[] var8, class265 var9) {
		var9.method1240();
		int var11 = var9.method1251();
		int var12 = var9.method1245();
		int[][] var13 = var9.method1247();
		int[][] var14 = var9.method1246();
		int[] var15 = var9.method1248();
		int[] var16 = var9.method1249();
		boolean var17;
		if (var3 == 1) {
			var17 = this.method2105(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var17 = this.method2102(var1, var2, var4, var5, var9);
		} else {
			var17 = this.method2103(var1, var2, var3, var4, var5, var9, (byte)58);
		}

		int var18 = var1 - (var11 >> 1);
		int var19 = var2 - (var12 >> 1);
		int var20 = var9.method1242();
		int var21 = var9.method1243();
		int var22;
		int var23;
		int var25;
		if (!var17) {
			var22 = Integer.MAX_VALUE;
			var23 = Integer.MAX_VALUE;
			boolean var24 = true;
			var25 = var4.field2225;
			int var26 = var4.field2224;
			int var27 = var4.field2222;
			int var28 = var4.field2223;

			for (int var29 = var25 - 10; var29 <= 10 + var25; ++var29) {
				for (int var30 = var26 - 10; var30 <= var26 + 10; ++var30) {
					int var31 = var29 - var18;
					int var32 = var30 - var19;
					if (var31 >= 0 && var32 >= 0 && var31 < var11 && var32 < var12 && var13[var31][var32] < 100) {
						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var25 + var27 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = 0;
						if (var30 < var26) {
							var34 = var26 - var30;
						} else if (var30 > var28 + var26 - 1) {
							var34 = var30 - (var28 + var26 - 1);
						}

						int var35 = var33 * var33 + var34 * var34;
						if (var35 < var22 || var35 == var22 && var13[var31][var32] < var23) {
							var22 = var35;
							var23 = var13[var31][var32];
							var20 = var29;
							var21 = var30;
						}
					}
				}
			}

			if (var22 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var20 && var21 == var2) {
			var7[0] = var20;
			var8[0] = var21;
			return 0;
		} else {
			byte var36 = 0;
			var15[0] = var20;
			var22 = var36 + 1;
			var16[0] = var21;

			int var37;
			for (var23 = var37 = var14[var20 - var18][var21 - var19]; var1 != var20 || var21 != var2; var23 = var14[var20 - var18][var21 - var19]) {
				if (var37 != var23) {
					var37 = var23;
					var15[var22] = var20;
					var16[var22++] = var21;
				}

				if ((var23 & 2) != 0) {
					++var20;
				} else if ((var23 & 8) != 0) {
					--var20;
				}

				if ((var23 & 1) != 0) {
					++var21;
				} else if ((var23 & 4) != 0) {
					--var21;
				}
			}

			var25 = 0;

			while (var22-- > 0) {
				var7[var25] = var15[var22];
				var8[var25++] = var16[var22];
				if (var25 >= var7.length) {
					break;
				}
			}

			return var25;
		}
	}

	final boolean method2105(int var1, int var2, class304 var3, class151 var4, class265 var5) {
		int var7 = var5.method1251();
		int var8 = var5.method1245();
		int[][] var9 = var5.method1247();
		int[][] var10 = var5.method1246();
		int[] var11 = var5.method1248();
		int[] var12 = var5.method1249();
		int var13 = var5.method1250();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[0] = var1;
		int var26 = var20 + 1;
		var12[0] = var2;
		int[][] var22 = var4.field1052;

		while (var26 != var21) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field1050;
			int var24 = var15 - var4.field1047;
			if (var3.method1554(1, var14, var15, var4)) {
				var5.method1241(var14, var15);
				return true;
			}

			int var25 = 1 + var9[var16][var17];
			if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136776) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var25;
			}

			if (var16 < var7 - 1 && var10[var16 + 1][var17] == 0 && (var22[var23 + 1][var24] & 19136896) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136770) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 1 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + 1] & 19136800) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0 && (var22[var23 - 1][var24] & 19136776) == 0 && (var22[var23][var24 - 1] & 19136770) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 1 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + 1][var24 - 1] & 19136899) == 0 && (var22[var23 + 1][var24] & 19136896) == 0 && (var22[var23][var24 - 1] & 19136770) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 1 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + 1] & 19136824) == 0 && (var22[var23 - 1][var24] & 19136776) == 0 && (var22[var23][var24 + 1] & 19136800) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 1 && var17 < var8 - 1 && var10[var16 + 1][var17 + 1] == 0 && (var22[var23 + 1][var24 + 1] & 19136992) == 0 && (var22[var23 + 1][var24] & 19136896) == 0 && (var22[var23][var24 + 1] & 19136800) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method1241(var14, var15);
		return false;
	}

	final boolean method2102(int var1, int var2, class304 var3, class151 var4, class265 var5) {
		int var7 = var5.method1251();
		int var8 = var5.method1245();
		int[][] var9 = var5.method1247();
		int[][] var10 = var5.method1246();
		int[] var11 = var5.method1248();
		int[] var12 = var5.method1249();
		int var13 = var5.method1250();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[0] = var1;
		int var26 = var20 + 1;
		var12[0] = var2;
		int[][] var22 = var4.field1052;

		while (var26 != var21) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field1050;
			int var24 = var15 - var4.field1047;
			if (var3.method1554(2, var14, var15, var4)) {
				var5.method1241(var14, var15);
				return true;
			}

			int var25 = var9[var16][var17] + 1;
			if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136782) == 0 && (var22[var23 - 1][var24 + 1] & 19136824) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var25;
			}

			if (var16 < var7 - 2 && var10[var16 + 1][var17] == 0 && (var22[var23 + 2][var24] & 19136899) == 0 && (var22[var23 + 2][var24 + 1] & 19136992) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136782) == 0 && (var22[var23 + 1][var24 - 1] & 19136899) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 2 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + 2] & 19136824) == 0 && (var22[var23 + 1][var24 + 2] & 19136992) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24] & 19136830) == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0 && (var22[var23][var24 - 1] & 19136911) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 2 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + 1][var24 - 1] & 19136911) == 0 && (var22[var23 + 2][var24 - 1] & 19136899) == 0 && (var22[var23 + 2][var24] & 19136995) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 2 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + 1] & 19136830) == 0 && (var22[var23 - 1][var24 + 2] & 19136824) == 0 && (var22[var23][var24 + 2] & 19137016) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 2 && var17 < var8 - 2 && var10[var16 + 1][var17 + 1] == 0 && (var22[var23 + 1][var24 + 2] & 19137016) == 0 && (var22[var23 + 2][var24 + 2] & 19136992) == 0 && (var22[var23 + 2][var24 + 1] & 19136995) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method1241(var14, var15);
		return false;
	}

	final boolean method2103(int var1, int var2, int var3, class304 var4, class151 var5, class265 var6, byte var7) {
		int var8 = var6.method1251();
		int var9 = var6.method1245();
		int[][] var10 = var6.method1247();
		int[][] var11 = var6.method1246();
		int[] var12 = var6.method1248();
		int[] var13 = var6.method1249();
		int var14 = var6.method1250();
		int var15 = var1;
		int var16 = var2;
		int var17 = var8 >> 1;
		int var18 = var9 >> 1;
		int var19 = var1 - var17;
		int var20 = var2 - var18;
		var11[var17][var18] = 99;
		var10[var17][var18] = 0;
		byte var21 = 0;
		int var22 = 0;
		var12[0] = var1;
		int var28 = var21 + 1;
		var13[0] = var2;
		int[][] var23 = var5.field1052;

		while (true) {
			label309:
			while (true) {
				int var24;
				int var25;
				int var26;
				int var27;
				do {
					do {
						do {
							label286:
							do {
								if (var22 == var28) {
									var6.method1241(var15, var16);
									return false;
								}

								var15 = var12[var22];
								var16 = var13[var22];
								var22 = var22 + 1 & var14;
								var17 = var15 - var19;
								var18 = var16 - var20;
								var24 = var15 - var5.field1050;
								var25 = var16 - var5.field1047;
								if (var4.method1554(var3, var15, var16, var5)) {
									var6.method1241(var15, var16);
									return true;
								}

								var26 = 1 + var10[var17][var18];
								if (var17 > 0 && var11[var17 - 1][var18] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var3 - 1] & 19136824) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15 - 1;
											var13[var28] = var16;
											var28 = var28 + 1 & var14;
											var11[var17 - 1][var18] = 2;
											var10[var17 - 1][var18] = var26;
											break;
										}

										if ((var23[var24 - 1][var25 + var27] & 19136830) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && var11[var17 + 1][var18] == 0 && (var23[var24 + var3][var25] & 19136899) == 0 && (var23[var24 + var3][var3 + var25 - 1] & 19136992) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15 + 1;
											var13[var28] = var16;
											var28 = var28 + 1 & var14;
											var11[var17 + 1][var18] = 8;
											var10[var17 + 1][var18] = var26;
											break;
										}

										if ((var23[var24 + var3][var25 + var27] & 19136995) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var18 > 0 && var11[var17][var18 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var3 + var24 - 1][var25 - 1] & 19136899) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17][var18 - 1] = 1;
											var10[var17][var18 - 1] = var26;
											break;
										}

										if ((var23[var24 + var27][var25 - 1] & 19136911) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var18 < var9 - var3 && var11[var17][var18 + 1] == 0 && (var23[var24][var25 + var3] & 19136824) == 0 && (var23[var3 + var24 - 1][var25 + var3] & 19136992) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15;
											var13[var28] = var16 + 1;
											var28 = var28 + 1 & var14;
											var11[var17][var18 + 1] = 4;
											var10[var17][var18 + 1] = var26;
											break;
										}

										if ((var23[var24 + var27][var3 + var25] & 19137016) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 > 0 && var11[var17 - 1][var18 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3) {
											var12[var28] = var15 - 1;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17 - 1][var18 - 1] = 3;
											var10[var17 - 1][var18 - 1] = var26;
											break;
										}

										if ((var23[var24 - 1][var25 - 1 + var27] & 19136830) != 0 || (var23[var24 - 1 + var27][var25 - 1] & 19136911) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && var18 > 0 && var11[var17 + 1][var18 - 1] == 0 && (var23[var24 + var3][var25 - 1] & 19136899) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3) {
											var12[var28] = var15 + 1;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17 + 1][var18 - 1] = 9;
											var10[var17 + 1][var18 - 1] = var26;
											break;
										}

										if ((var23[var24 + var3][var25 - 1 + var27] & 19136995) != 0 || (var23[var24 + var27][var25 - 1] & 19136911) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 < var9 - var3 && var11[var17 - 1][var18 + 1] == 0 && (var23[var24 - 1][var25 + var3] & 19136824) == 0) {
									for (var27 = 1; var27 < var3; ++var27) {
										if ((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var24 - 1 + var27][var25 + var3] & 19137016) != 0) {
											continue label286;
										}
									}

									var12[var28] = var15 - 1;
									var13[var28] = var16 + 1;
									var28 = var28 + 1 & var14;
									var11[var17 - 1][var18 + 1] = 6;
									var10[var17 - 1][var18 + 1] = var26;
								}
							} while(var17 >= var8 - var3);
						} while(var18 >= var9 - var3);
					} while(var11[var17 + 1][var18 + 1] != 0);
				} while((var23[var3 + var24][var25 + var3] & 19136992) != 0);

				for (var27 = 1; var27 < var3; ++var27) {
					if ((var23[var27 + var24][var3 + var25] & 19137016) != 0 || (var23[var24 + var3][var27 + var25] & 19136995) != 0) {
						continue label309;
					}
				}

				var12[var28] = var15 + 1;
				var13[var28] = var16 + 1;
				var28 = var28 + 1 & var14;
				var11[var17 + 1][var18 + 1] = 12;
				var10[var17 + 1][var18 + 1] = var26;
			}
		}
	}

	static final int method2106() {
		if (class109.field693.method437()) {
			return class212.field1393;
		} else {
			int var1 = Client.method1347(Client.field2135, class353.field2437, class212.field1393);
			return var1 - class122.field794 < 800 && (class129.field835[class212.field1393][Client.field2135 >> 7][class353.field2437 >> 7] & 4) != 0 ? class212.field1393 : 3;
		}
	}
}
