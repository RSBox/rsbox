public class class177 {
	static String field1228;
	float[] field1227;
	int field1226;

	class177(float[] var1, int var2) {
		this.field1227 = var1;
		this.field1226 = var2;
	}

	public static int method925(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var8 = 0.0F;

		for (int var9 = 0; var9 < var1 + 1; ++var9) {
			var8 += Math.abs(var0[var9]);
		}

		float var42 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class384.field2642;
		if (var8 <= var42) {
			return -1;
		} else {
			float[] var10 = new float[var1 + 1];

			int var11;
			for (var11 = 0; var11 < var1 + 1; ++var11) {
				var10[var11] = var0[var11] * (1.0F / var8);
			}

			while (Math.abs(var10[var1]) < var42) {
				--var1;
			}

			var11 = 0;
			if (var1 == 0) {
				return 0;
			} else if (var1 == 1) {
				var6[0] = -var10[0] / var10[1];
				boolean var43 = var3 ? var2 < var6[0] + var42 : var2 < var6[0] - var42;
				boolean var44 = var5 ? var4 > var6[0] - var42 : var4 > var6[0] + var42;
				var11 = var43 && var44 ? 1 : 0;
				if (var11 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var11;
			} else {
				class177 var12 = new class177(var10, var1);
				float[] var13 = new float[var1 + 1];

				for (int var14 = 1; var14 <= var1; ++var14) {
					var13[var14 - 1] = (float)var14 * var10[var14];
				}

				float[] var45 = new float[var1 + 1];
				int var15 = method925(var13, var1 - 1, var2, false, var4, false, var45);
				if (var15 == -1) {
					return 0;
				} else {
					boolean var16 = false;
					float var18 = 0.0F;
					float var19 = 0.0F;
					float var20 = 0.0F;

					for (int var21 = 0; var21 <= var15; ++var21) {
						if (var11 > var1) {
							return var11;
						}

						float var17;
						if (var21 == 0) {
							var17 = var2;
							var19 = method924(var10, var1, var2);
							if (Math.abs(var19) <= var42 && var3) {
								var6[var11++] = var2;
							}
						} else {
							var17 = var20;
							var19 = var18;
						}

						if (var21 == var15) {
							var20 = var4;
							var16 = false;
						} else {
							var20 = var45[var21];
						}

						var18 = method924(var10, var1, var20);
						if (var16) {
							var16 = false;
						} else if (Math.abs(var18) < var42) {
							if (var15 != var21 || var5) {
								var6[var11++] = var20;
								var16 = true;
							}
						} else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
							int var23 = var11++;
							float var25 = var17;
							float var26 = var20;
							float var27 = method924(var12.field1227, var12.field1226, var17);
							float var24;
							if (Math.abs(var27) < class384.field2642) {
								var24 = var17;
							} else {
								float var28 = method924(var12.field1227, var12.field1226, var20);
								if (Math.abs(var28) < class384.field2642) {
									var24 = var20;
								} else {
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var31 = 0.0F;
									float var36 = 0.0F;
									boolean var37 = true;
									boolean var38 = false;

									do {
										var38 = false;
										if (var37) {
											var29 = var25;
											var36 = var27;
											var30 = var26 - var25;
											var31 = var30;
											var37 = false;
										}

										if (Math.abs(var36) < Math.abs(var28)) {
											var25 = var26;
											var26 = var29;
											var29 = var25;
											var27 = var28;
											var28 = var36;
											var36 = var27;
										}

										float var39 = class384.field2645 * Math.abs(var26) + 0.0F;
										float var40 = 0.5F * (var29 - var26);
										boolean var41 = Math.abs(var40) > var39 && 0.0F != var28;
										if (var41) {
											if (Math.abs(var31) >= var39 && Math.abs(var27) > Math.abs(var28)) {
												float var35 = var28 / var27;
												float var32;
												float var33;
												if (var25 == var29) {
													var32 = var35 * var40 * 2.0F;
													var33 = 1.0F - var35;
												} else {
													var33 = var27 / var36;
													float var34 = var28 / var36;
													var32 = var35 * ((var33 - var34) * var40 * 2.0F * var33 - (var34 - 1.0F) * (var26 - var25));
													var33 = (var33 - 1.0F) * (var34 - 1.0F) * (var35 - 1.0F);
												}

												if ((double)var32 > 0.0D) {
													var33 = -var33;
												} else {
													var32 = -var32;
												}

												var35 = var31;
												var31 = var30;
												if (var32 * 2.0F < var40 * 3.0F * var33 - Math.abs(var39 * var33) && var32 < Math.abs(var33 * var35 * 0.5F)) {
													var30 = var32 / var33;
												} else {
													var30 = var40;
													var31 = var40;
												}
											} else {
												var30 = var40;
												var31 = var40;
											}

											var25 = var26;
											var27 = var28;
											if (Math.abs(var30) > var39) {
												var26 += var30;
											} else if ((double)var40 > 0.0D) {
												var26 += var39;
											} else {
												var26 -= var39;
											}

											var28 = method924(var12.field1227, var12.field1226, var26);
											if ((double)(var28 * (var36 / Math.abs(var36))) > 0.0D) {
												var37 = true;
												var38 = true;
											} else {
												var38 = true;
											}
										}
									} while(var38);

									var24 = var26;
								}
							}

							var6[var23] = var24;
							if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var42) {
								var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
								--var11;
							}
						}
					}

					return var11;
				}
			}
		}
	}

	static float method924(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var2 * var4 + var0[var5];
		}

		return var4;
	}
}
