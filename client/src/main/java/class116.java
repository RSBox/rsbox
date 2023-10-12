import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class116 extends class292 {
	public static class352 field726;
	public static class352 field728;
	public static class352 field740;
	public static class5 field723;
	public static class5 field725;
	static boolean field732;
	static class174 field724;
	boolean[] field739;
	int field731;
	int field743;
	int[] field734;
	int[] field738;
	public boolean field727;
	public boolean field745;
	public int field729;
	public int field735;
	public int field737;
	public int field741;
	public int field742;
	public int field744;
	public int field746;
	public int field747;
	public int field748;
	public int[] field722;
	public int[] field733;
	public int[] field736;
	public Map field730;

	static {
		field732 = false;
		field726 = new class352(64);
		field740 = new class352(100);
		field728 = new class352(100);
	}

	class116() {
		this.field729 = -1;
		this.field731 = 0;
		this.field743 = 0;
		this.field737 = -1;
		this.field745 = false;
		this.field741 = 5;
		this.field742 = -1;
		this.field744 = -1;
		this.field748 = 99;
		this.field727 = false;
		this.field735 = -1;
		this.field746 = -1;
		this.field747 = 2;
	}

	void method527(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method528(var1, var3);
		}
	}

	void method528(Buffer var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.readUnsignedShort();
			this.field722 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field722[var5] = var1.readUnsignedShort();
			}

			this.field733 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field733[var5] = var1.readUnsignedShort();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field733[var5] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.field737 = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var4 = var1.readUnsignedByte();
			this.field738 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field738[var5] = var1.readUnsignedByte();
			}

			this.field738[var4] = 9999999;
		} else if (var2 == 4) {
			this.field745 = true;
		} else if (var2 == 5) {
			this.field741 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.field742 = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.field744 = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field748 = var1.readUnsignedByte();
			this.field727 = true;
		} else if (var2 == 9) {
			this.field735 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field746 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field747 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var4 = var1.readUnsignedByte();
			this.field734 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field734[var5] = var1.readUnsignedShort();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field734[var5] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.readUnsignedByte();
			this.field736 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field736[var5] = var1.readUnsignedMedium();
			}
		} else if (var2 == 14) {
			this.field729 = var1.readInt();
		} else if (var2 == 15) {
			var4 = var1.readUnsignedShort();
			this.field730 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedMedium();
				this.field730.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field731 = var1.readUnsignedShort();
			this.field743 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field739 = new boolean[256];

			for (var4 = 0; var4 < this.field739.length; ++var4) {
				this.field739[var4] = false;
			}

			var4 = var1.readUnsignedByte();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field739[var1.readUnsignedByte()] = true;
			}
		}

	}

	void method536() {
		if (this.field735 == -1) {
			if (null == this.field738 && null == this.field739) {
				this.field735 = 0;
			} else {
				this.field735 = 2;
			}
		}

		if (this.field746 == -1) {
			if (this.field738 == null && this.field739 == null) {
				this.field746 = 0;
			} else {
				this.field746 = 2;
			}
		}

	}

	public class490 method529(class490 var1, int var2) {
		class490 var5;
		if (!this.method533()) {
			var2 = this.field733[var2];
			class421 var6 = method538(var2 >> 16);
			var2 &= 65535;
			if (null == var6) {
				return var1.method2255(true);
			} else {
				var5 = var1.method2255(!var6.method1922(var2));
				var5.method2285(var6, var2);
				return var5;
			}
		} else {
			class19 var4 = method541(this.field729);
			if (var4 == null) {
				return var1.method2255(true);
			} else {
				var5 = var1.method2255(!var4.method76());
				var5.method2265(var4, var2);
				return var5;
			}
		}
	}

	class490 method530(class490 var1, int var2, int var3) {
		class490 var6;
		if (!this.method533()) {
			var2 = this.field733[var2];
			class421 var7 = method538(var2 >> 16);
			var2 &= 65535;
			if (var7 == null) {
				return var1.method2255(true);
			} else {
				var6 = var1.method2255(!var7.method1922(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method2283();
				} else if (var3 == 2) {
					var6.method2270();
				} else if (var3 == 3) {
					var6.method2288();
				}

				var6.method2285(var7, var2);
				if (var3 == 1) {
					var6.method2288();
				} else if (var3 == 2) {
					var6.method2270();
				} else if (var3 == 3) {
					var6.method2283();
				}

				return var6;
			}
		} else {
			class19 var5 = method541(this.field729);
			if (var5 == null) {
				return var1.method2255(true);
			} else {
				var6 = var1.method2255(!var5.method76());
				var3 &= 3;
				if (var3 == 1) {
					var6.method2283();
				} else if (var3 == 2) {
					var6.method2270();
				} else if (var3 == 3) {
					var6.method2288();
				}

				var6.method2265(var5, var2);
				if (var3 == 1) {
					var6.method2288();
				} else if (var3 == 2) {
					var6.method2270();
				} else if (var3 == 3) {
					var6.method2283();
				}

				return var6;
			}
		}
	}

	class490 method531(class490 var1, int var2) {
		class490 var5;
		if (!this.method533()) {
			var2 = this.field733[var2];
			class421 var6 = method538(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method2258(true);
			} else {
				var5 = var1.method2258(!var6.method1922(var2));
				var5.method2285(var6, var2);
				return var5;
			}
		} else {
			class19 var4 = method541(this.field729);
			if (var4 == null) {
				return var1.method2258(true);
			} else {
				var5 = var1.method2258(!var4.method76());
				var5.method2265(var4, var2);
				return var5;
			}
		}
	}

	public class490 method526(class490 var1, int var2, class116 var3, int var4) {
		if (field732 && !this.method533() && !var3.method533()) {
			return this.method537(var1, var2, var3, var4);
		} else {
			class490 var6 = var1.method2255(false);
			boolean var7 = false;
			class421 var8 = null;
			class307 var9 = null;
			class19 var10;
			if (this.method533()) {
				var10 = this.method534();
				if (var10 == null) {
					return var6;
				}

				if (var3.method533() && null == this.field739) {
					var6.method2265(var10, var2);
					return var6;
				}

				var9 = var10.field95;
				var6.method2267(var9, var10, var2, this.field739, false, !var3.method533());
			} else {
				var2 = this.field733[var2];
				var8 = method538(var2 >> 16);
				var2 &= 65535;
				if (null == var8) {
					return var3.method529(var1, var4);
				}

				if (!var3.method533() && (this.field738 == null || var4 == -1)) {
					var6.method2285(var8, var2);
					return var6;
				}

				if (this.field738 == null || var4 == -1) {
					var6.method2285(var8, var2);
					return var6;
				}

				var7 = var3.method533();
				if (!var7) {
					var6.method2268(var8, var2, this.field738, false);
				}
			}

			if (var3.method533()) {
				var10 = var3.method534();
				if (null == var10) {
					return var6;
				}

				if (var9 == null) {
					var9 = var10.field95;
				}

				var6.method2267(var9, var10, var4, this.field739, true, true);
			} else {
				var4 = var3.field733[var4];
				class421 var11 = method538(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method529(var1, var2);
				}

				var6.method2268(var11, var4, this.field738, true);
			}

			if (var7 && null != var8) {
				var6.method2268(var8, var2, this.field738, false);
			}

			var6.method2263();
			return var6;
		}
	}

	class490 method537(class490 var1, int var2, class116 var3, int var4) {
		var2 = this.field733[var2];
		class421 var6 = method538(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method529(var1, var4);
		} else {
			var4 = var3.field733[var4];
			class421 var7 = method538(var4 >> 16);
			var4 &= 65535;
			class490 var8;
			if (null == var7) {
				var8 = var1.method2255(!var6.method1922(var2));
				var8.method2285(var6, var2);
				return var8;
			} else {
				var8 = var1.method2255(!var6.method1922(var2) & !var7.method1922(var4));
				var8.method2264(var6, var2, var7, var4, this.field738);
				return var8;
			}
		}
	}

	public class490 method532(class490 var1, int var2) {
		if (!this.method533()) {
			int var4 = this.field733[var2];
			class421 var5 = method538(var4 >> 16);
			var4 &= 65535;
			if (var5 == null) {
				return var1.method2255(true);
			} else {
				class421 var6 = null;
				int var7 = 0;
				if (this.field734 != null && var2 < this.field734.length) {
					var7 = this.field734[var2];
					var6 = method538(var7 >> 16);
					var7 &= 65535;
				}

				class490 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method2255(!var5.method1922(var4) & !var6.method1922(var7));
					var8.method2285(var5, var4);
					var8.method2285(var6, var7);
					return var8;
				} else {
					var8 = var1.method2255(!var5.method1922(var4));
					var8.method2285(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method529(var1, var2);
		}
	}

	public boolean method533() {
		return this.field729 >= 0;
	}

	public int method535() {
		return this.field743 - this.field731;
	}

	class19 method534() {
		return this.method533() ? method541(this.field729) : null;
	}

	public static void method540(class5 var0, class5 var1, class5 var2) {
		class361.field2478 = var0;
		field723 = var1;
		field725 = var2;
	}

	public static class116 method539(int var0) {
		class116 var2 = (class116)field726.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class361.field2478.method39(12, var0);
			var2 = new class116();
			if (null != var3) {
				var2.method527(new Buffer(var3));
			}

			var2.method536();
			field726.method1680(var2, (long)var0);
			return var2;
		}
	}

	static class421 method538(int var0) {
		class421 var2 = (class421)field740.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = class421.method1923(field723, field725, var0, false);
			if (null != var2) {
				field740.method1680(var2, (long)var0);
			}

			return var2;
		}
	}

	static class19 method541(int var0) {
		class19 var4 = (class19)field728.method1678((long)var0);
		class19 var3;
		class19 var5;
		class5 var6;
		class5 var7;
		boolean var8;
		byte[] var9;
		int var10;
		byte[] var11;
		if (null != var4) {
			var3 = var4;
		} else {
			var6 = field723;
			var7 = field725;
			var8 = true;
			var9 = var6.method37(var0 >> 16 & 65535, var0 & 65535);
			if (null == var9) {
				var8 = false;
				var5 = null;
			} else {
				var10 = (var9[1] & 255) << 8 | var9[2] & 255;
				var11 = var7.method37(var10, 0);
				if (null == var11) {
					var8 = false;
				}

				if (!var8) {
					var5 = null;
				} else {
					if (class209.field1389 == null) {
						class217.field1414 = Runtime.getRuntime().availableProcessors();
						class209.field1389 = new ThreadPoolExecutor(0, class217.field1414, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class217.field1414 * 100), new class333());
					}

					try {
						var5 = new class19(var6, var7, var0, false);
					} catch (Exception var14) {
						var5 = null;
					}
				}
			}

			if (var5 != null) {
				field728.method1680(var5, (long)var0);
			}

			var3 = var5;
		}

		int var2;
		if (var3 == null) {
			var2 = 2;
		} else {
			var2 = var3.method79() ? 0 : 1;
		}

		if (var2 != 0) {
			return null;
		} else {
			var4 = (class19)field728.method1678((long)var0);
			if (var4 != null) {
				var3 = var4;
			} else {
				var6 = field723;
				var7 = field725;
				var8 = true;
				var9 = var6.method37(var0 >> 16 & 65535, var0 & 65535);
				if (var9 == null) {
					var8 = false;
					var5 = null;
				} else {
					var10 = (var9[1] & 255) << 8 | var9[2] & 255;
					var11 = var7.method37(var10, 0);
					if (null == var11) {
						var8 = false;
					}

					if (!var8) {
						var5 = null;
					} else {
						if (class209.field1389 == null) {
							class217.field1414 = Runtime.getRuntime().availableProcessors();
							class209.field1389 = new ThreadPoolExecutor(0, class217.field1414, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class217.field1414 * 100), new class186());
						}

						try {
							var5 = new class19(var6, var7, var0, false);
						} catch (Exception var13) {
							var5 = null;
						}
					}
				}

				if (var5 != null) {
					field728.method1680(var5, (long)var0);
				}

				var3 = var5;
			}

			return var3;
		}
	}
}
