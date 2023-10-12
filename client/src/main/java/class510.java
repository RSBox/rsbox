public class class510 {
	public static short[][] field3717;
	int field3714;
	int field3715;
	int field3716;
	int field3718;

	class510(int var1, int var2, int var3, int var4) {
		this.field3718 = var1;
		this.field3714 = var2;
		this.field3715 = var3;
		this.field3716 = var4;
	}

	int method2404() {
		return this.field3718;
	}

	int method2403() {
		return this.field3714;
	}

	int method2405() {
		return this.field3715;
	}

	int method2402() {
		return this.field3716;
	}

	static final void method2407(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var9;
		if (var8) {
			class129.field835[var1][var2][var3] = 0;

			while (true) {
				var9 = var0.readUnsignedShort();
				if (var9 == 0) {
					if (var1 == 0) {
						class129.field844[0][var2][var3] = -class306.method1563(var4 + 0xe3b7b, var5 + 0x87cce) * 8;
					} else {
						class129.field844[var1][var2][var3] = class129.field844[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var9 == 1) {
					int var10 = var0.readUnsignedByte();
					if (var10 == 1) {
						var10 = 0;
					}

					if (var1 == 0) {
						class129.field844[0][var2][var3] = -var10 * 8;
					} else {
						class129.field844[var1][var2][var3] = class129.field844[var1 - 1][var2][var3] - var10 * 8;
					}
					break;
				}

				if (var9 <= 49) {
					class215.field1407[var1][var2][var3] = (short)var0.readShort();
					class354.field2451[var1][var2][var3] = (byte)((var9 - 2) / 4);
					class514.field4061[var1][var2][var3] = (byte)(var9 - 2 + var6 & 3);
				} else if (var9 <= 81) {
					class129.field835[var1][var2][var3] = (byte)(var9 - 49);
				} else {
					class426.field2877[var1][var2][var3] = (short)(var9 - 81);
				}
			}
		} else {
			while (true) {
				var9 = var0.readUnsignedShort();
				if (var9 == 0) {
					break;
				}

				if (var9 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var9 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	static float method2406(class234 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (null != var0 && var0.method1077() != 0) {
			float var5 = (float)var0.field1541[0].field1445;
			float var6 = (float)var0.field1541[var0.method1077() - 1].field1445;
			float var7 = var6 - var5;
			if (0.0D == (double)var7) {
				return var0.field1541[0].field1443;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (var0.field1547 == class166.field1174) {
						if ((double)var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field1547 != class166.field1177 && class166.field1178 != var0.field1547) {
						if (class166.field1175 == var0.field1547) {
							var12 = var5 - var1;
							var17 = var0.field1541[0].field1444;
							var18 = var0.field1541[0].field1448;
							var4 = var0.field1541[0].field1443;
							if ((double)var17 != 0.0D) {
								var4 -= var18 * var12 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (var0.field1553 == class166.field1174) {
					if ((double)var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (var0.field1553 != class166.field1177 && var0.field1553 != class166.field1178) {
					if (class166.field1175 == var0.field1553) {
						var12 = var1 - var6;
						var17 = var0.field1541[var0.method1077() - 1].field1442;
						var18 = var0.field1541[var0.method1077() - 1].field1447;
						var4 = var0.field1541[var0.method1077() - 1].field1443;
						if ((double)var17 != 0.0D) {
							var4 += var12 * var18 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = class384.method1805(var0, var12);
				float var19;
				if (var2 && class166.field1178 == var0.field1547) {
					var19 = var0.field1541[var0.method1077() - 1].field1443 - var0.field1541[0].field1443;
					var4 = (float)((double)var4 - (double)var19 * var9);
				} else if (!var2 && class166.field1178 == var0.field1553) {
					var19 = var0.field1541[var0.method1077() - 1].field1443 - var0.field1541[0].field1443;
					var4 = (float)((double)var4 + (double)var19 * var9);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}
}
