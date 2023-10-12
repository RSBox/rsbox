import java.net.URL;

public class class426 {
	static int field2866;
	static int field2867;
	static int[] field2868;
	static int[] field2872;
	static short[][][] field2877;
	int field2869;
	int field2870;
	int field2874;
	int field2875;
	int field2876;
	String field2865;
	String field2871;
	String field2873;

	static {
		field2866 = 0;
		field2867 = 0;
		field2868 = new int[]{1, 1, 1, 1};
		field2872 = new int[]{0, 1, 2, 3};
	}

	class426() {
	}

	boolean method1928() {
		return (class550.field4292.getId() & this.field2869) != 0;
	}

	boolean method1929() {
		return (class550.field4289.getId() & this.field2869) != 0;
	}

	boolean method1930() {
		return (class550.field4288.getId() & this.field2869) != 0;
	}

	boolean method1936() {
		return (class550.field4273.getId() & this.field2869) != 0;
	}

	boolean method1931() {
		return (class550.field4295.getId() & this.field2869) != 0;
	}

	boolean method1932() {
		return (class550.field4301.getId() & this.field2869) != 0;
	}

	boolean method1927() {
		return (class550.field4297.getId() & this.field2869) != 0;
	}

	boolean method1933() {
		return (class550.field4302.getId() & this.field2869) != 0;
	}

	boolean method1934() {
		return (class550.field4280.getId() & this.field2869) != 0;
	}

	boolean method1935() {
		return (class550.field4278.getId() & this.field2869) != 0;
	}

	static boolean method1938() {
		try {
			if (null == class109.field691) {
				class109.field691 = class283.field2153.method709(new URL(class28.field142));
			} else if (class109.field691.method1831()) {
				byte[] var1 = class109.field691.method1830();
				Buffer var2 = new Buffer(var1);
				var2.readInt();
				field2866 = var2.readUnsignedShort();
				class233.field1534 = new class426[field2866];

				class426 var4;
				for (int var3 = 0; var3 < field2866; var4.field2876 = var3++) {
					var4 = class233.field1534[var3] = new class426();
					var4.field2870 = var2.readUnsignedShort();
					var4.field2869 = var2.readInt();
					var4.field2865 = var2.readStringOrNull();
					var4.field2873 = var2.readStringOrNull();
					var4.field2874 = var2.readUnsignedByte();
					var4.field2875 = var2.readShort();
				}

				method1937(class233.field1534, 0, class233.field1534.length - 1, field2872, field2868);
				class109.field691 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class109.field691 = null;
		}

		return false;
	}

	static void method1941(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != field2872[var6]) {
				var3[var5] = field2872[var6];
				var4[var5] = field2868[var6];
				++var5;
			}
		}

		field2872 = var3;
		field2868 = var4;
		method1937(class233.field1534, 0, class233.field1534.length - 1, field2872, field2868);
	}

	static void method1937(class426[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var2 + var1) / 2;
			class426 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var7].field2876;
							var13 = var9.field2876;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field2875;
							var13 = var9.field2875;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].method1928() ? 1 : 0;
							var13 = var9.method1928() ? 1 : 0;
						} else {
							var12 = var0[var7].field2870;
							var13 = var9.field2870;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var6].field2876;
							var13 = var9.field2876;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field2875;
							var13 = var9.field2875;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method1928() ? 1 : 0;
							var13 = var9.method1928() ? 1 : 0;
						} else {
							var12 = var0[var6].field2870;
							var13 = var9.field2870;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					class426 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method1937(var0, var1, var7, var3, var4);
			method1937(var0, var7 + 1, var2, var3, var4);
		}

	}

	static void method1944(int var0, boolean var1, int var2, boolean var3) {
		if (class233.field1534 != null) {
			method1945(0, class233.field1534.length - 1, var0, var1, var2, var3);
		}

	}

	static void method1945(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class426 var9 = class233.field1534[var7];
			class233.field1534[var7] = class233.field1534[var1];
			class233.field1534[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (method1939(class233.field1534[var10], var9, var2, var3, var4, var5) <= 0) {
					class426 var11 = class233.field1534[var10];
					class233.field1534[var10] = class233.field1534[var8];
					class233.field1534[var8++] = var11;
				}
			}

			class233.field1534[var1] = class233.field1534[var8];
			class233.field1534[var8] = var9;
			method1945(var0, var8 - 1, var2, var3, var4, var5);
			method1945(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	static int method1939(class426 var0, class426 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = method1942(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = method1942(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	static int method1942(class426 var0, class426 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field2875;
			int var6 = var1.field2875;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field2874 - var1.field2874;
		} else if (var2 == 3) {
			if (var0.field2873.equals("-")) {
				if (var1.field2873.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field2873.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field2873.compareTo(var1.field2873);
			}
		} else if (var2 == 4) {
			return var0.method1931() ? (var1.method1931() ? 0 : 1) : (var1.method1931() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1930() ? (var1.method1930() ? 0 : 1) : (var1.method1930() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1936() ? (var1.method1936() ? 0 : 1) : (var1.method1936() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1928() ? (var1.method1928() ? 0 : 1) : (var1.method1928() ? -1 : 0);
		} else {
			return var0.field2870 - var1.field2870;
		}
	}

	static class426 method1943() {
		field2867 = 0;
		return method1940();
	}

	static class426 method1940() {
		return field2867 < field2866 ? class233.field1534[++field2867 - 1] : null;
	}
}
