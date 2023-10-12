import java.util.Random;

public abstract class class229 extends class433 {
	public static class230[] field1486;
	static int field1476;
	static int field1477;
	static int field1479;
	static int field1488;
	static int field1491;
	static int field1492;
	static int field1493;
	static int field1494;
	static int field1495;
	static String[] field1497;
	static Random field1496;
	byte[] field1478;
	byte[][] field1489;
	int[] field1480;
	int[] field1481;
	int[] field1482;
	int[] field1485;
	int[] field1487;
	public int field1483;
	public int field1484;
	public int field1490;

	static {
		field1488 = -1;
		field1492 = -1;
		field1494 = -1;
		field1491 = -1;
		field1477 = 0;
		field1493 = 0;
		field1476 = 256;
		field1495 = 0;
		field1479 = 0;
		field1496 = new Random();
		field1497 = new String[100];
	}

	class229(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field1489 = new byte[256][];
		this.field1483 = 0;
		this.field1481 = var2;
		this.field1482 = var3;
		this.field1487 = var4;
		this.field1485 = var5;
		this.method1063(var1);
		this.field1489 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field1482[var10] < var8 && this.field1485[var10] != 0) {
				var8 = this.field1482[var10];
			}

			if (this.field1482[var10] + this.field1485[var10] > var9) {
				var9 = this.field1482[var10] + this.field1485[var10];
			}
		}

		this.field1484 = this.field1483 - var8;
		this.field1490 = var9 - this.field1483;
	}

	class229(byte[] var1) {
		this.field1489 = new byte[256][];
		this.field1483 = 0;
		this.method1063(var1);
	}

	abstract void method1052(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	abstract void method1057(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	void method1063(byte[] var1) {
		this.field1480 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field1480.length; ++var2) {
				this.field1480[var2] = var1[var2] & 255;
			}

			this.field1483 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field1480[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var10[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var10[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.field1478 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field1478[(var13 << 8) + var8] = (byte)method1054(var11, var12, var4, this.field1480, var10, var13, var8);
						}
					}
				}
			}

			this.field1483 = var4[32] + var10[32];
		}

	}

	public int method1032(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field1480[class65.method298(var1) & 255];
	}

	public int method1033(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = class385.method1807(var7.substring(4));
										var4 += field1486[var8].field1504;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.field1480[(char)(class65.method298(var6) & 255)];
						if (this.field1478 != null && var3 != -1) {
							var4 += this.field1478[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method1034(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method1032('<');
							if (this.field1478 != null && var11 != -1) {
								var4 += this.field1478[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method1032('>');
							if (this.field1478 != null && var11 != -1) {
								var4 += this.field1478[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class385.method1807(var16.substring(4));
								var4 += field1486[var17].field1504;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method1032(var15);
							if (this.field1478 != null && var11 != -1) {
								var4 += this.field1478[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	public int method1035(String var1, int var2) {
		int var3 = this.method1034(var1, new int[]{var2}, field1497);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method1033(field1497[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	public int method1059(String var1, int var2) {
		return this.method1034(var1, new int[]{var2}, field1497);
	}

	public class160 method1050(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method1033(var3) / 2;
			var6 += this.method1033(var3.substring(0, var1));
			int var7 = var5 - this.field1484;
			int var8 = this.method1033(var3.substring(var1, var1 + var2));
			int var9 = this.field1484 + this.field1490;
			return new class160(var6, var7, var8, var9);
		} else {
			return new class160(var4, var5, 0, 0);
		}
	}

	public void method1037(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1061(var4, var5);
			this.method1031(var1, var2, var3);
		}
	}

	public void method1038(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1061(var4, 0);
			field1476 = var6;
			this.method1031(var1, var2, var3);
		}
	}

	public void method1060(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1061(var4, -1);
			this.method1031(var1, var2 - this.method1033(var1), var3);
		}
	}

	public void method1045(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1061(var4, var5);
			this.method1031(var1, var2 - this.method1033(var1) / 2, var3);
		}
	}

	public int method1040(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method1041(var1, var2, var3, var4, var5, var6, var7, 256, 1, var9, var10);
	}

	public int method1041(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method1061(var6, var7);
			field1476 = var8;
			if (var11 == 0) {
				var11 = this.field1483;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field1484 + this.field1490 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method1034(var1, var12, field1497);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.field1484;
			} else if (var10 == 1) {
				var14 = var3 + this.field1484 + (var5 - this.field1484 - this.field1490 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field1490 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field1484 - this.field1490 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.field1484 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method1031(field1497[var15], var2, var14);
				} else if (var9 == 1) {
					this.method1031(field1497[var15], var2 + (var4 - this.method1033(field1497[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method1031(field1497[var15], var2 + var4 - this.method1033(field1497[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method1031(field1497[var15], var2, var14);
				} else {
					this.method1049(field1497[var15], var4);
					this.method1031(field1497[var15], var2, var14);
					field1495 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	public class203 method1064(class508 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method2391()) {
			this.method1061(var4, var5);
			var3 -= this.field1483;

			for (int var7 = 0; var7 < var1.method2392(); ++var7) {
				class101 var8 = var1.method2394(var7);
				char var9 = var8.field657;
				if (var9 != '\n') {
					if (var1.method2390(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field658;
						int var11 = var3 + var8.field659;
						int var12 = this.field1487[var9];
						int var13 = this.field1485[var9];
						if (field1491 != -1) {
							this.method1057(this.field1489[var9], var10 + this.field1481[var9] + 1, var11 + this.field1482[var9] + 1, var12, var13, field1491);
						}

						this.method1057(this.field1489[var9], var10 + this.field1481[var9], var11 + this.field1482[var9], var12, var13, field1493);
					}
				}
			}
		}

		return var1.method2393();
	}

	public void method1039(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1061(var4, 0);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1046(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1062(var1, var2 - this.method1033(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	public void method1043(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1061(var4, 0);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1046(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1062(var1, var2 - this.method1033(var1) / 2, var3, var8, var9, var10);
		}
	}

	public void method1044(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method1061(var4, 0);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method1046(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method1062(var1, var2 - this.method1033(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	public void method1042(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1061(var4, 0);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1046(var6, var1.length());
			}

			this.method1062(var1, var2 - this.method1033(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	public void method1058(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1061(var4, 0);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1046(var6, var1.length());
			}

			this.method1062(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	int[] method1046(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / (float)var2;

			for (int var5 = 0; var5 < var2; ++var5) {
				var3[var5] = var1[(int)((float)var5 * var4)];
			}

			return var3;
		}
	}

	public void method1047(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1061(16777215, 0);
			field1496.setSeed((long)var6);
			field1476 = 192 + (field1496.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field1496.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method1062(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	void method1061(int var1, int var2) {
		field1488 = -1;
		field1492 = -1;
		field1494 = var2;
		field1491 = var2;
		field1477 = var1;
		field1493 = var1;
		field1476 = 256;
		field1495 = 0;
		field1479 = 0;
	}

	void method1048(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = class265.method1244(var3, 16, true);
				field1493 = var2;
			} else if (var1.equals("/col")) {
				field1493 = field1477;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = class265.method1244(var3, 16, true);
				field1488 = var2;
			} else if (var1.equals("str")) {
				field1488 = 8388608;
			} else if (var1.equals("/str")) {
				field1488 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = class265.method1244(var3, 16, true);
				field1492 = var2;
			} else if (var1.equals("u")) {
				field1492 = 0;
			} else if (var1.equals("/u")) {
				field1492 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = class265.method1244(var3, 16, true);
				field1491 = var2;
			} else if (var1.equals("shad")) {
				field1491 = 0;
			} else if (var1.equals("/shad")) {
				field1491 = field1494;
			} else if (var1.equals("br")) {
				this.method1061(field1477, field1494);
			}
		} catch (Exception var4) {
		}

	}

	void method1049(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			field1495 = (var2 - this.method1033(var1) << 8) / var3;
		}

	}

	void method1031(String var1, int var2, int var3) {
		var3 -= this.field1483;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class65.method298(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = class385.method1807(var8.substring(4));
										class230 var13 = field1486[var9];
										var13.method1065(var2, var3 + this.field1483 - var13.field1505);
										var2 += var13.field1504;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method1048(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.field1478 != null && var5 != -1) {
							var2 += this.field1478[(var5 << 8) + var7];
						}

						int var12 = this.field1487[var7];
						var9 = this.field1485[var7];
						if (var7 != ' ') {
							if (field1476 == 256) {
								if (field1491 != -1) {
									method1053(this.field1489[var7], var2 + this.field1481[var7] + 1, var3 + this.field1482[var7] + 1, var12, var9, field1491);
								}

								this.method1057(this.field1489[var7], var2 + this.field1481[var7], var3 + this.field1482[var7], var12, var9, field1493);
							} else {
								if (field1491 != -1) {
									method1055(this.field1489[var7], var2 + this.field1481[var7] + 1, var3 + this.field1482[var7] + 1, var12, var9, field1491, field1476);
								}

								this.method1052(this.field1489[var7], var2 + this.field1481[var7], var3 + this.field1482[var7], var12, var9, field1493, field1476);
							}
						} else if (field1495 > 0) {
							field1479 += field1495;
							var2 += field1479 >> 8;
							field1479 &= 255;
						}

						int var10 = this.field1480[var7];
						if (field1488 != -1) {
							method1968(var2, var3 + (int)((double)this.field1483 * 0.7D), var10, field1488);
						}

						if (field1492 != -1) {
							method1968(var2, var3 + this.field1483 + 1, var10, field1492);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	void method1062(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field1483;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(class65.method298(var1.charAt(var10)) & 255);
				if (var11 == '<') {
					var7 = var10;
				} else {
					int var13;
					int var14;
					int var15;
					if (var11 == '>' && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										if (var5 != null) {
											var13 = var5[var9];
										} else {
											var13 = 0;
										}

										if (var6 != null) {
											var14 = var6[var9];
										} else {
											var14 = 0;
										}

										++var9;
										var15 = class385.method1807(var12.substring(4));
										class230 var20 = field1486[var15];
										var20.method1065(var2 + var13, var3 + this.field1483 - var20.field1505 + var14);
										var2 += var20.field1504;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method1048(var12);
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) {
						var11 = ' ';
					}

					if (var7 == -1) {
						if (this.field1478 != null && var8 != -1) {
							var2 += this.field1478[(var8 << 8) + var11];
						}

						int var19 = this.field1487[var11];
						var13 = this.field1485[var11];
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = field1493;
						}

						++var9;
						if (var11 != ' ') {
							if (field1476 == 256) {
								if (field1491 != -1) {
									method1053(this.field1489[var11], var2 + this.field1481[var11] + 1 + var14, var3 + this.field1482[var11] + 1 + var15, var19, var13, field1491);
								}

								this.method1057(this.field1489[var11], var2 + this.field1481[var11] + var14, var3 + this.field1482[var11] + var15, var19, var13, var16);
							} else {
								if (field1491 != -1) {
									method1055(this.field1489[var11], var2 + this.field1481[var11] + 1 + var14, var3 + this.field1482[var11] + 1 + var15, var19, var13, field1491, field1476);
								}

								this.method1052(this.field1489[var11], var2 + this.field1481[var11] + var14, var3 + this.field1482[var11] + var15, var19, var13, var16, field1476);
							}
						} else if (field1495 > 0) {
							field1479 += field1495;
							var2 += field1479 >> 8;
							field1479 &= 255;
						}

						int var17 = this.field1480[var11];
						if (field1488 != -1) {
							method1968(var2, var3 + (int)((double)this.field1483 * 0.7D), var17, field1488);
						}

						if (field1492 != -1) {
							method1968(var2, var3 + this.field1483, var17, field1492);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	static int method1054(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	public static String method1036(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	static void method1053(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class433.field2894;
		int var7 = class433.field2894 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class433.field2899) {
			var10 = class433.field2899 - var2;
			var4 -= var10;
			var2 = class433.field2899;
			var9 = 0 + var10 * var3;
			var6 += var10 * class433.field2894;
		}

		if (var2 + var4 > class433.field2895) {
			var4 -= var2 + var4 - class433.field2895;
		}

		if (var1 < class433.field2900) {
			var10 = class433.field2900 - var1;
			var3 -= var10;
			var1 = class433.field2900;
			var9 += var10;
			var6 += var10;
			var8 = 0 + var10;
			var7 += var10;
		}

		if (var1 + var3 > class433.field2901) {
			var10 = var1 + var3 - class433.field2901;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method1051(class433.field2898, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	static void method1051(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method1055(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class433.field2894;
		int var8 = class433.field2894 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class433.field2899) {
			var11 = class433.field2899 - var2;
			var4 -= var11;
			var2 = class433.field2899;
			var10 = 0 + var11 * var3;
			var7 += var11 * class433.field2894;
		}

		if (var2 + var4 > class433.field2895) {
			var4 -= var2 + var4 - class433.field2895;
		}

		if (var1 < class433.field2900) {
			var11 = class433.field2900 - var1;
			var3 -= var11;
			var1 = class433.field2900;
			var10 += var11;
			var7 += var11;
			var9 = 0 + var11;
			var8 += var11;
		}

		if (var1 + var3 > class433.field2901) {
			var11 = var1 + var3 - class433.field2901;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method1056(class433.field2898, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	static void method1056(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
