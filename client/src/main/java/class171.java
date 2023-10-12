import java.util.Arrays;

public class class171 {
	public static class157 field1215;
	public static class352 field1212;
	public static int field1214;
	public static short[] field1205;
	static final int[] field1211;
	boolean field1210;
	class272[] field1203;
	int[] field1202;
	int[] field1209;
	int[] field1213;
	long field1207;
	long field1208;
	public int field1201;
	public int field1204;
	public int field1206;

	static {
		field1211 = new int[]{class246.field1640.field1635, class246.field1641.field1635, class246.field1639.field1635, class246.field1647.field1635, class246.field1644.field1635, class246.field1642.field1635, class246.field1645.field1635};
		field1212 = new class352(260);
		field1215 = new class157(16, class481.field3379);
		field1214 = 0;
	}

	public class171() {
		this.field1204 = -1;
		this.field1201 = 0;
		this.field1210 = false;
	}

	class171(class171 var1) {
		this.field1204 = -1;
		this.field1201 = 0;
		this.field1210 = false;
		int[] var2 = Arrays.copyOf(var1.field1202, var1.field1202.length);
		int[] var3 = Arrays.copyOf(var1.field1209, var1.field1209.length);
		class272[] var4 = (class272[])(var1.field1203 != null ? (class272[])Arrays.copyOf(var1.field1203, var1.field1203.length) : null);
		int[] var5 = Arrays.copyOf(var1.field1213, var1.field1213.length);
		this.method898(var3, var2, var4, false, var5, var1.field1201, var1.field1206, var1.field1204);
	}

	public void method898(int[] var1, int[] var2, class272[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field1203 = var3;
		this.field1210 = var4;
		this.field1204 = var8;
		this.method899(var1, var2, var5, var6, var7);
	}

	public void method899(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (null == var1) {
			var1 = this.method900(var4);
		}

		if (null == var2) {
			var2 = this.method900(var4);
		}

		this.field1209 = var1;
		this.field1202 = var2;
		this.field1213 = var3;
		this.field1201 = var4;
		this.field1206 = var5;
		this.method904();
	}

	int[] method900(int var1) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			for (int var5 = 0; var5 < class132.field855; ++var5) {
				class11 var6 = class11.method55(var5);
				if (null != var6 && !var6.field62 && var4 + (var1 == 1 ? 7 : 0) == var6.field59) {
					var3[field1211[var4]] = var5 + 256;
					break;
				}
			}
		}

		return var3;
	}

	public void method901(int var1, boolean var2) {
		int var4 = this.field1202[field1211[var1]];
		if (var4 != 0) {
			var4 -= 256;

			class11 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = class132.field855 - 1;
					}
				} else {
					++var4;
					if (var4 >= class132.field855) {
						var4 = 0;
					}
				}

				var5 = class11.method55(var4);
			} while(null == var5 || var5.field62 || (this.field1201 == 1 ? 7 : 0) + var1 != var5.field59);

			this.field1202[field1211[var1]] = var4 + 256;
			this.method904();
		}
	}

	public void method902(int var1, boolean var2) {
		int var4 = this.field1213[var1];
		boolean var5;
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = class510.field3717[var1].length - 1;
				}

				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while(!var5);
		} else {
			do {
				++var4;
				if (var4 >= class510.field3717[var1].length) {
					var4 = 0;
				}

				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while(!var5);
		}

		this.field1213[var1] = var4;
		this.method904();
	}

	public void method897(int var1) {
		if (this.field1201 != var1) {
			this.method899((int[])null, (int[])null, this.field1213, var1, -1);
		}
	}

	public void method903(Buffer var1) {
		var1.writeByte(this.field1201);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field1202[field1211[var3]];
			if (var4 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.writeByte(this.field1213[var3]);
		}

	}

	void method904() {
		long var2 = this.field1207;
		int var4 = this.field1202[5];
		int var5 = this.field1202[9];
		this.field1202[5] = var5;
		this.field1202[9] = var4;
		this.field1207 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field1207 <<= 4;
			if (this.field1202[var6] >= 256) {
				this.field1207 += (long)(this.field1202[var6] - 256);
			}
		}

		if (this.field1202[0] >= 256) {
			this.field1207 += (long)(this.field1202[0] - 256 >> 4);
		}

		if (this.field1202[1] >= 256) {
			this.field1207 += (long)(this.field1202[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field1207 <<= 3;
			this.field1207 += (long)this.field1213[var6];
		}

		this.field1207 <<= 1;
		this.field1207 += (long)this.field1201;
		this.field1202[5] = var4;
		this.field1202[9] = var5;
		if (var2 != 0L && var2 != this.field1207 || this.field1210) {
			field1212.method1677(var2);
		}

	}

	public class490 method906(class116 var1, int var2, class116 var3, int var4) {
		if (this.field1206 != -1) {
			return class73.method366(this.field1206).method353(var1, var2, var3, var4, (class120)null);
		} else {
			long var6 = this.field1207;
			int[] var8 = this.field1202;
			if (var1 != null && (var1.field742 >= 0 || var1.field744 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field1202[var9];
				}

				if (var1.field742 >= 0) {
					var6 += (long)(var1.field742 - this.field1202[5] << 40);
					var8[5] = var1.field742;
				}

				if (var1.field744 >= 0) {
					var6 += (long)(var1.field744 - this.field1202[3] << 48);
					var8[3] = var1.field744;
				}
			}

			class490 var19 = (class490)field1212.method1678(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class11.method55(var12 - 256).method50()) {
						var10 = true;
					}

					if (var12 >= 512 && !class158.method857(var12 - 512).method842(this.field1201)) {
						var10 = true;
					}
				}

				if (var10) {
					if (this.field1208 != -1L) {
						var19 = (class490)field1212.method1678(this.field1208);
					}

					if (null == var19) {
						return null;
					}
				}

				if (var19 == null) {
					class239[] var21 = new class239[12];
					var12 = 0;

					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class239 var15 = class11.method55(var14 - 256).method51();
							if (null != var15) {
								var21[var12++] = var15;
							}
						}

						if (var14 >= 512) {
							class158 var23 = class158.method857(var14 - 512);
							class239 var16 = var23.method852(this.field1201);
							if (null != var16) {
								if (null != this.field1203) {
									class272 var17 = this.field1203[var13];
									if (null != var17) {
										int var18;
										if (null != var17.field1796 && null != var23.field1096 && var23.field1097.length == var17.field1796.length) {
											for (var18 = 0; var18 < var23.field1096.length; ++var18) {
												var16.method1116(var23.field1097[var18], var17.field1796[var18]);
											}
										}

										if (null != var17.field1795 && var23.field1129 != null && var23.field1130.length == var17.field1795.length) {
											for (var18 = 0; var18 < var23.field1129.length; ++var18) {
												var16.method1101(var23.field1130[var18], var17.field1795[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					class239 var22 = new class239(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field1213[var14] < class510.field3717[var14].length) {
							var22.method1116(field1205[var14], class510.field3717[var14][this.field1213[var14]]);
						}

						if (this.field1213[var14] < class208.field1385[var14].length) {
							var22.method1116(class370.field2558[var14], class208.field1385[var14][this.field1213[var14]]);
						}
					}

					var19 = var22.method1107(64, 850, -30, -50, -30);
					field1212.method1680(var19, var6);
					this.field1208 = var6;
				}
			}

			class490 var20;
			if (var1 == null && var3 == null) {
				var20 = var19.method2255(true);
			} else if (var1 != null && null != var3) {
				var20 = var1.method526(var19, var2, var3, var4);
			} else if (null != var1) {
				var20 = var1.method529(var19, var2);
			} else {
				var20 = var3.method529(var19, var4);
			}

			return var20;
		}
	}

	class239 method905() {
		if (this.field1206 != -1) {
			return class73.method366(this.field1206).method354((class120)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field1202[var3];
				if (var4 >= 256 && var4 < 512 && !class11.method55(var4 - 256).method52()) {
					var2 = true;
				}

				if (var4 >= 512 && !class158.method857(var4 - 512).method844(this.field1201)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				class239[] var8 = new class239[12];
				var4 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field1202[var5];
					class239 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class11.method55(var6 - 256).method53();
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}

					if (var6 >= 512) {
						var7 = class158.method857(var6 - 512).method845(this.field1201);
						if (null != var7) {
							var8[var4++] = var7;
						}
					}
				}

				class239 var9 = new class239(var8, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field1213[var6] < class510.field3717[var6].length) {
						var9.method1116(field1205[var6], class510.field3717[var6][this.field1213[var6]]);
					}

					if (this.field1213[var6] < class208.field1385[var6].length) {
						var9.method1116(class370.field2558[var6], class208.field1385[var6][this.field1213[var6]]);
					}
				}

				return var9;
			}
		}
	}

	public int method907() {
		long var2 = this.field1207;
		if (this.field1206 != -1) {
			var2 = -65536L | (long)this.field1206;
		}

		Integer var4 = (Integer)field1215.method835(var2);
		if (null == var4) {
			var4 = ++field1214 - 1;
			field1215.method832(var2, var4);
			field1214 %= 65535;
		}

		return var4;
	}

	void method908() {
		this.method899(this.field1209, this.field1202, this.field1213, this.field1201, this.field1206);
	}
}
