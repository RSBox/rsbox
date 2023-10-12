public class class384 {
	public static final float field2642;
	public static final float field2645;
	static float[] field2643;
	static float[] field2644;

	static {
		field2642 = Math.ulp(1.0F);
		field2645 = field2642 * 2.0F;
		field2643 = new float[4];
		field2644 = new float[5];
	}

	static float method1805(class234 var0, float var1) {
		if (null != var0 && var0.method1077() != 0) {
			if (var1 < (float)var0.field1541[0].field1445) {
				return var0.field1547 == class166.field1176 ? var0.field1541[0].field1443 : class510.method2406(var0, var1, true);
			} else if (var1 > (float)var0.field1541[var0.method1077() - 1].field1445) {
				return class166.field1176 == var0.field1553 ? var0.field1541[var0.method1077() - 1].field1443 : class510.method2406(var0, var1, false);
			} else if (var0.field1548) {
				return var0.field1541[0].field1443;
			} else {
				class220 var3 = var0.method1085(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					float var8;
					if ((double)var3.field1442 == 0.0D && 0.0D == (double)var3.field1447) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.field1442 && Float.MAX_VALUE == var3.field1447) {
						var5 = true;
					} else if (var3.field1446 != null) {
						if (var0.field1552) {
							var6 = (float)var3.field1445;
							float var10 = var3.field1443;
							var7 = var6 + var3.field1442 * 0.33333334F;
							float var11 = var3.field1447 * 0.33333334F + var10;
							float var9 = (float)var3.field1446.field1445;
							float var13 = var3.field1446.field1443;
							var8 = var9 - var3.field1446.field1444 * 0.33333334F;
							float var12 = var13 - 0.33333334F * var3.field1446.field1448;
							if (var0.field1558) {
								float var16 = var11;
								float var17 = var12;
								if (null != var0) {
									float var18 = var9 - var6;
									if (0.0D != (double)var18) {
										float var19 = var7 - var6;
										float var20 = var8 - var6;
										float[] var21 = new float[]{var19 / var18, var20 / var18};
										var0.field1556 = 0.33333334F == var21[0] && var21[1] == 0.6666667F;
										float var22 = var21[0];
										float var23 = var21[1];
										if ((double)var21[0] < 0.0D) {
											var21[0] = 0.0F;
										}

										if ((double)var21[1] > 1.0D) {
											var21[1] = 1.0F;
										}

										float var24;
										if ((double)var21[0] > 1.0D || var21[1] < -1.0F) {
											var21[1] = 1.0F - var21[1];
											if (var21[0] < 0.0F) {
												var21[0] = 0.0F;
											}

											if (var21[1] < 0.0F) {
												var21[1] = 0.0F;
											}

											if (var21[0] > 1.0F || var21[1] > 1.0F) {
												var24 = (float)(1.0D + (double)(var21[0] * (var21[0] - 2.0F + var21[1])) + (double)var21[1] * ((double)var21[1] - 2.0D));
												if (field2642 + var24 > 0.0F) {
													method1802(var21);
												}
											}

											var21[1] = 1.0F - var21[1];
										}

										if (var22 != var21[0]) {
											float var14 = var18 * var21[0] + var6;
											if ((double)var22 != 0.0D) {
												var16 = var10 + var21[0] * (var11 - var10) / var22;
											}
										}

										if (var23 != var21[1]) {
											float var15 = var21[1] * var18 + var6;
											if (1.0D != (double)var23) {
												var17 = (float)((double)var13 - (1.0D - (double)var21[1]) * (double)(var13 - var12) / (1.0D - (double)var23));
											}
										}

										var0.field1543 = var6;
										var0.field1544 = var9;
										method1806(0.0F, var21[0], var21[1], 1.0F, var0);
										var24 = var16 - var10;
										float var25 = var17 - var16;
										float var26 = var13 - var17;
										float var27 = var25 - var24;
										var0.field1554 = var26 - var25 - var27;
										var0.field1551 = var27 + var27 + var27;
										var0.field1550 = var24 + var24 + var24;
										var0.field1549 = var10;
									}
								}
							} else {
								method1804(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							}

							var0.field1552 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1443;
					} else if (var5) {
						return (float)var3.field1445 != var1 && null != var3.field1446 ? var3.field1446.field1443 : var3.field1443;
					} else if (var0.field1558) {
						if (null == var0) {
							var6 = 0.0F;
						} else {
							if (var0.field1543 == var1) {
								var7 = 0.0F;
							} else if (var0.field1544 == var1) {
								var7 = 1.0F;
							} else {
								var7 = (var1 - var0.field1543) / (var0.field1544 - var0.field1543);
							}

							if (var0.field1556) {
								var8 = var7;
							} else {
								field2643[3] = var0.field1542;
								field2643[2] = var0.field1538;
								field2643[1] = var0.field1546;
								field2643[0] = var0.field1545 - var7;
								field2644[0] = 0.0F;
								field2644[1] = 0.0F;
								field2644[2] = 0.0F;
								field2644[3] = 0.0F;
								field2644[4] = 0.0F;
								int var28 = class177.method925(field2643, 3, 0.0F, true, 1.0F, true, field2644);
								if (var28 == 1) {
									var8 = field2644[0];
								} else {
									var8 = 0.0F;
								}
							}

							var6 = var8 * ((var0.field1554 * var8 + var0.field1551) * var8 + var0.field1550) + var0.field1549;
						}

						return var6;
					} else {
						return method1803(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	static float method1803(class234 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3 = var1 - var0.field1543;
			return var3 * (var3 * (var0.field1546 + var3 * var0.field1545) + var0.field1538) + var0.field1542;
		}
	}

	static void method1804(class234 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1543 = var1;
			float var10 = var4 - var1;
			float var11 = var8 - var5;
			float var12 = var2 - var1;
			float var13 = 0.0F;
			float var14 = 0.0F;
			if ((double)var12 != 0.0D) {
				var13 = (var6 - var5) / var12;
			}

			var12 = var4 - var3;
			if (0.0D != (double)var12) {
				var14 = (var8 - var7) / var12;
			}

			float var15 = 1.0F / (var10 * var10);
			float var16 = var13 * var10;
			float var17 = var10 * var14;
			var0.field1545 = var15 * (var16 + var17 - var11 - var11) / var10;
			var0.field1546 = (var11 + var11 + var11 - var16 - var16 - var17) * var15;
			var0.field1538 = var13;
			var0.field1542 = var5;
		}
	}

	static void method1802(float[] var0) {
		if (field2642 + var0[0] < 1.3333334F) {
			float var2 = var0[0] - 2.0F;
			float var3 = var0[0] - 1.0F;
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
			float var5 = (var4 + -var2) * 0.5F;
			if (var0[1] + field2642 > var5) {
				var0[1] = var5 - field2642;
			} else {
				var5 = (-var2 - var4) * 0.5F;
				if (var0[1] < field2642 + var5) {
					var0[1] = var5 + field2642;
				}
			}
		} else {
			var0[0] = 1.3333334F - field2642;
			var0[1] = 0.33333334F - field2642;
		}

	}

	static void method1806(float var0, float var1, float var2, float var3, class234 var4) {
		float var6 = var1 - var0;
		float var7 = var2 - var1;
		float var8 = var3 - var2;
		float var9 = var7 - var6;
		var4.field1542 = var8 - var7 - var9;
		var4.field1538 = var9 + var9 + var9;
		var4.field1546 = var6 + var6 + var6;
		var4.field1545 = var0;
	}
}
