import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class438 {
	public static class45 field2942;
	class60 field2941;
	int field2943;
	int field2945;
	int field2946;
	int field2947;
	HashMap field2948;
	LinkedList field2944;
	List field2950;
	final HashMap field2949;

	static {
		field2942 = new class45(37748736, 256);
	}

	class438(int var1, int var2, int var3, HashMap var4) {
		this.field2946 = var1;
		this.field2943 = var2;
		this.field2944 = new LinkedList();
		this.field2950 = new LinkedList();
		this.field2948 = new HashMap();
		this.field2945 = var3 | -16777216;
		this.field2949 = var4;
	}

	void method1997(int var1, int var2, int var3) {
		class42 var5 = method2024(this.field2946, this.field2943, this.field2947);
		if (var5 != null) {
			if (var3 == this.field2947 * 64) {
				var5.method157(var1, var2);
			} else {
				var5.method176(var1, var2, var3, var3);
			}

		}
	}

	void method2022(class60 var1, List var2) {
		this.field2948.clear();
		this.field2941 = var1;
		this.method1994(var2);
	}

	void method1990(HashSet var1, List var2) {
		this.field2948.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class232 var5 = (class232)var4.next();
			if (var5.method585() == this.field2946 && var5.method590() == this.field2943) {
				this.field2944.add(var5);
			}
		}

		this.method1994(var2);
	}

	void method1991(int var1, int var2, int var3, int var4, class124 var5) {
		for (int var7 = var1; var7 < var1 + var3; ++var7) {
			label44:
			for (int var8 = var2; var8 < var2 + var4; ++var8) {
				for (int var9 = 0; var9 < var5.field806; ++var9) {
					class222[] var10 = var5.field811[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class222[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class222 var13 = var11[var12];
							class397 var14 = class109.method504(var13.field1450);
							if (class441.method2084(var14)) {
								this.method1992(var14, var9, var7, var8, var5);
								continue label44;
							}
						}
					}
				}
			}
		}

	}

	void method1992(class397 var1, int var2, int var3, int var4, class124 var5) {
		class370 var7 = new class370(var2, var3 + this.field2946 * 64, var4 + this.field2943 * 64);
		class370 var8 = null;
		if (this.field2941 != null) {
			var8 = new class370(this.field2941.field805 + var2, this.field2941.field804 * 64 + var3, var4 + this.field2941.field802 * 64);
		} else {
			class232 var9 = (class232)var5;
			var8 = new class370(var9.field805 + var2, var9.field804 * 64 + var3 + var9.method1072() * 8, var4 + var9.field802 * 64 + var9.method1075() * 8);
		}

		class63 var10;
		Object var11;
		if (null != var1.field2727) {
			var11 = new class366(var8, var7, var1.field2693, this);
		} else {
			var10 = class63.method269(var1.field2714);
			var11 = new class512(var8, var7, var10.field321, this.method2015(var10));
		}

		var10 = class63.method269(((class283)var11).method1483());
		if (var10.field307) {
			this.field2948.put(new class370(0, var3, var4), var11);
		}

	}

	void method1993() {
		Iterator var2 = this.field2948.values().iterator();

		while (var2.hasNext()) {
			class283 var3 = (class283)var2.next();
			if (var3 instanceof class366) {
				((class366)var3).method1731();
			}
		}

	}

	void method1994(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class512 var4 = (class512)var3.next();
			if (class63.method269(var4.field3745).field307 && var4.field2150.field2561 >> 6 == this.field2946 && var4.field2150.field2559 >> 6 == this.field2943) {
				class512 var5 = new class512(var4.field2150, var4.field2150, var4.field3745, this.method2014(var4.field3745));
				this.field2950.add(var5);
			}
		}

	}

	void method1995() {
		if (this.field2941 != null) {
			this.field2941.method592();
		} else {
			Iterator var2 = this.field2944.iterator();

			while (var2.hasNext()) {
				class232 var3 = (class232)var2.next();
				var3.method592();
			}
		}

	}

	boolean method1996(class5 var1) {
		this.field2948.clear();
		if (this.field2941 != null) {
			this.field2941.method584(var1);
			if (this.field2941.method591()) {
				this.method1991(0, 0, 64, 64, this.field2941);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class232 var5;
			for (var4 = this.field2944.iterator(); var4.hasNext(); var3 &= var5.method591()) {
				var5 = (class232)var4.next();
				var5.method584(var1);
			}

			if (var3) {
				var4 = this.field2944.iterator();

				while (var4.hasNext()) {
					var5 = (class232)var4.next();
					this.method1991(var5.method1074() * 8, var5.method1073() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	void method2023(int var1, class497 var2, class230[] var3, class5 var4, class5 var5) {
		this.field2947 = var1;
		if (this.field2941 != null || !this.field2944.isEmpty()) {
			if (method2024(this.field2946, this.field2943, var1) == null) {
				boolean var7 = true;
				var7 = true & this.method1996(var4);
				int var9;
				if (this.field2941 != null) {
					var9 = this.field2941.field807;
				} else {
					var9 = ((class124)this.field2944.getFirst()).field807;
				}

				var7 &= var5.method40(var9);
				if (var7) {
					byte[] var8 = var5.method19(var9);
					class277 var10 = class277.method1471(var8);
					class42 var11 = new class42(this.field2947 * 64, this.field2947 * 64);
					var11.method179();
					if (this.field2941 != null) {
						this.method2000(var2, var3, var10);
					} else {
						this.method2001(var2, var3, var10);
					}

					method2026(var11, this.field2946, this.field2943, this.field2947);
					this.method1995();
				}
			}
		}
	}

	void method1998(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method2006(var1, var2, var4, var3);
		this.method2019(var1, var2, var4, var3);
	}

	void method1999(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2948.values().iterator();

		while (var5.hasNext()) {
			class283 var6 = (class283)var5.next();
			if (var6.method1487()) {
				int var7 = var6.method1483();
				if (var1.contains(var7)) {
					class63 var8 = class63.method269(var7);
					this.method2008(var8, var6.field2152, var6.field2151, var2, var3);
				}
			}
		}

		this.method2007(var1, var2, var3);
	}

	void method2000(class497 var1, class230[] var2, class277 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method2002(var5, var6, this.field2941, var1, var3);
				this.method2020(var5, var6, this.field2941, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method2018(var5, var6, this.field2941, var1, var2);
			}
		}

	}

	void method2001(class497 var1, class230[] var2, class277 var3) {
		Iterator var5 = this.field2944.iterator();

		class232 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class232)var5.next();

			for (var7 = var6.method1074() * 8; var7 < var6.method1074() * 8 + 8; ++var7) {
				for (var8 = var6.method1073() * 8; var8 < var6.method1073() * 8 + 8; ++var8) {
					this.method2002(var7, var8, var6, var1, var3);
					this.method2020(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field2944.iterator();

		while (var5.hasNext()) {
			var6 = (class232)var5.next();

			for (var7 = var6.method1074() * 8; var7 < var6.method1074() * 8 + 8; ++var7) {
				for (var8 = var6.method1073() * 8; var8 < var6.method1073() * 8 + 8; ++var8) {
					this.method2018(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	void method2018(int var1, int var2, class124 var3, class497 var4, class230[] var5) {
		this.method2005(var1, var2, var3);
		this.method2004(var1, var2, var3, var5);
	}

	void method2002(int var1, int var2, class124 var3, class497 var4, class277 var5) {
		int var7 = var3.field808[0][var1][var2] - 1;
		int var8 = var3.field815[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class433.method1977(var1 * this.field2947, (63 - var2) * this.field2947, this.field2947, this.field2947, this.field2945);
		}

		int var9 = 16711935;
		if (var8 != -1) {
			var9 = class376.method1759(var8, this.field2945);
		}

		if (var8 > -1 && var3.field809[0][var1][var2] == 0) {
			class433.method1977(var1 * this.field2947, (63 - var2) * this.field2947, this.field2947, this.field2947, var9);
		} else {
			int var10 = this.method2003(var1, var2, var3, var5);
			if (var8 == -1) {
				class433.method1977(var1 * this.field2947, (63 - var2) * this.field2947, this.field2947, this.field2947, var10);
			} else {
				var4.method2357(this.field2947 * var1, (63 - var2) * this.field2947, var10, var9, this.field2947, this.field2947, var3.field809[0][var1][var2], var3.field810[0][var1][var2]);
			}
		}
	}

	void method2020(int var1, int var2, class124 var3, class497 var4) {
		for (int var6 = 1; var6 < var3.field806; ++var6) {
			int var7 = var3.field815[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var8 = class376.method1759(var7, this.field2945);
				if (var3.field809[var6][var1][var2] == 0) {
					class433.method1977(this.field2947 * var1, (63 - var2) * this.field2947, this.field2947, this.field2947, var8);
				} else {
					var4.method2357(var1 * this.field2947, (63 - var2) * this.field2947, 0, var8, this.field2947, this.field2947, var3.field809[var6][var1][var2], var3.field810[var6][var1][var2]);
				}
			}
		}

	}

	int method2003(int var1, int var2, class124 var3, class277 var4) {
		return var3.field808[0][var1][var2] == 0 ? this.field2945 : var4.method1470(var1, var2);
	}

	void method2004(int var1, int var2, class124 var3, class230[] var4) {
		for (int var6 = 0; var6 < var3.field806; ++var6) {
			class222[] var7 = var3.field811[var6][var1][var2];
			if (null != var7 && var7.length != 0) {
				class222[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class222 var10 = var8[var9];
					if (class478.method2198(var10.field1451) || class478.method2197(var10.field1451)) {
						class397 var11 = class109.method504(var10.field1450);
						if (var11.field2737 != -1) {
							if (var11.field2737 != 46 && var11.field2737 != 52) {
								var4[var11.field2737].method1070(var1 * this.field2947, this.field2947 * (63 - var2), this.field2947 * 2, this.field2947 * 2);
							} else {
								var4[var11.field2737].method1070(var1 * this.field2947, this.field2947 * (63 - var2), 1 + this.field2947 * 2, this.field2947 * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	void method2005(int var1, int var2, class124 var3) {
		for (int var5 = 0; var5 < var3.field806; ++var5) {
			class222[] var6 = var3.field811[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class222[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class222 var9 = var7[var8];
					if (class478.method2196(var9.field1451)) {
						class397 var10 = class109.method504(var9.field1450);
						int var11 = var10.field2705 != 0 ? -3407872 : -3355444;
						if (var9.field1451 == class478.field3359.field3363) {
							this.method2021(var1, var2, var9.field1452, var11);
						}

						if (var9.field1451 == class478.field3342.field3363) {
							this.method2021(var1, var2, var9.field1452, -3355444);
							this.method2021(var1, var2, var9.field1452 + 1, var11);
						}

						if (var9.field1451 == class478.field3343.field3363) {
							if (var9.field1452 == 0) {
								class433.method1968(var1 * this.field2947, (63 - var2) * this.field2947, 1, var11);
							}

							if (var9.field1452 == 1) {
								class433.method1968(var1 * this.field2947 + this.field2947 - 1, this.field2947 * (63 - var2), 1, var11);
							}

							if (var9.field1452 == 2) {
								class433.method1968(var1 * this.field2947 + this.field2947 - 1, this.field2947 * (63 - var2) + this.field2947 - 1, 1, var11);
							}

							if (var9.field1452 == 3) {
								class433.method1968(this.field2947 * var1, (63 - var2) * this.field2947 + this.field2947 - 1, 1, var11);
							}
						}

						if (class478.field3344.field3363 == var9.field1451) {
							int var12 = var9.field1452 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field2947; ++var13) {
									class433.method1968(var1 * this.field2947 + var13, this.field2947 * (64 - var2) - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field2947; ++var13) {
									class433.method1968(var1 * this.field2947 + var13, var13 + (63 - var2) * this.field2947, 1, var11);
								}
							}
						}
					}
				}
			}
		}

	}

	void method2006(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field2948.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class370 var10 = (class370)var9.getKey();
			int var11 = (int)((float)var10.field2561 * var6 + (float)var1 - var7);
			int var12 = (int)((float)(var4 + var2) - (float)var10.field2559 * var6 - var7);
			class283 var13 = (class283)var9.getValue();
			if (var13 != null && var13.method1487()) {
				var13.field2152 = var11;
				var13.field2151 = var12;
				class63 var14 = class63.method269(var13.method1483());
				if (!var3.contains(var14.method265())) {
					this.method2009(var13, var11, var12, var6);
				}
			}
		}

	}

	void method2007(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2950.iterator();

		while (var5.hasNext()) {
			class283 var6 = (class283)var5.next();
			if (var6.method1487()) {
				class63 var7 = class63.method269(var6.method1483());
				if (null != var7 && var1.contains(var7.method265())) {
					this.method2008(var7, var6.field2152, var6.field2151, var2, var3);
				}
			}
		}

	}

	void method2008(class63 var1, int var2, int var3, int var4, int var5) {
		class42 var7 = var1.method264(false);
		if (null != var7) {
			var7.method159(var2 - var7.field207 / 2, var3 - var7.field209 / 2);
			if (var4 % var5 < var5 / 2) {
				class433.method1980(var2, var3, 15, 16776960, 128);
				class433.method1980(var2, var3, 7, 16777215, 256);
			}

		}
	}

	void method2009(class283 var1, int var2, int var3, float var4) {
		class63 var6 = class63.method269(var1.method1483());
		this.method2010(var6, var2, var3);
		this.method2011(var1, var6, var2, var3, var4);
	}

	void method2010(class63 var1, int var2, int var3) {
		class42 var5 = var1.method264(false);
		if (var5 != null) {
			int var6 = this.method2012(var5, var1.field316);
			int var7 = this.method2013(var5, var1.field299);
			var5.method159(var6 + var2, var3 + var7);
		}

	}

	void method2011(class283 var1, class63 var2, int var3, int var4, float var5) {
		class40 var7 = var1.method1484();
		if (null != var7) {
			if (var7.field201.method60(var5)) {
				class282 var8 = (class282)this.field2949.get(var7.field201);
				var8.method1040(var7.field199, var3 - var7.field200 / 2, var4, var7.field200, var7.field198, -16777216 | var2.field320, 0, 1, 0, var8.field1483 / 2);
			}
		}
	}

	void method2019(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field2950.iterator();

		while (var7.hasNext()) {
			class283 var8 = (class283)var7.next();
			if (var8.method1487()) {
				int var9 = var8.field2150.field2561 % 64;
				int var10 = var8.field2150.field2559 % 64;
				var8.field2152 = (int)((float)var9 * var6 + (float)var1);
				var8.field2151 = (int)((float)var2 + var6 * (float)(63 - var10));
				if (!var3.contains(var8.method1483())) {
					this.method2009(var8, var8.field2152, var8.field2151, var6);
				}
			}
		}

	}

	int method2012(class42 var1, class516 var2) {
		switch(var2.field4075) {
		case 0:
			return -var1.field207 / 2;
		case 1:
			return 0;
		default:
			return -var1.field207;
		}
	}

	int method2013(class42 var1, class465 var2) {
		switch(var2.field3298) {
		case 0:
			return -var1.field209 / 2;
		case 1:
			return 0;
		default:
			return -var1.field209;
		}
	}

	class40 method2014(int var1) {
		class63 var3 = class63.method269(var1);
		return this.method2015(var3);
	}

	class40 method2015(class63 var1) {
		if (var1.field304 != null && this.field2949 != null && this.field2949.get(class13.field74) != null) {
			class13 var3 = class13.method59(var1.field306);
			if (var3 == null) {
				return null;
			} else {
				class282 var4 = (class282)this.field2949.get(var3);
				if (var4 == null) {
					return null;
				} else {
					int var5 = var4.method1059(var1.field304, 1000000);
					String[] var6 = new String[var5];
					var4.method1034(var1.field304, (int[])null, var6);
					int var7 = var4.field1483 * var6.length / 2;
					int var8 = 0;
					String[] var9 = var6;

					for (int var10 = 0; var10 < var9.length; ++var10) {
						String var11 = var9[var10];
						int var12 = var4.method1033(var11);
						if (var12 > var8) {
							var8 = var12;
						}
					}

					return new class40(var1.field304, var8, var7, var3);
				}
			}
		} else {
			return null;
		}
	}

	List method2016(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var8 = this.field2948.values().iterator();

				class283 var9;
				while (var8.hasNext()) {
					var9 = (class283)var8.next();
					if (var9.method1487() && var9.method1482(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field2950.iterator();

				while (var8.hasNext()) {
					var9 = (class283)var8.next();
					if (var9.method1487() && var9.method1482(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	List method2017() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field2950);
		var2.addAll(this.field2948.values());
		return var2;
	}

	void method2021(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class433.method1970(this.field2947 * var1, this.field2947 * (63 - var2), this.field2947, var4);
		}

		if (var3 == 1) {
			class433.method1968(var1 * this.field2947, (63 - var2) * this.field2947, this.field2947, var4);
		}

		if (var3 == 2) {
			class433.method1970(this.field2947 * var1 + this.field2947 - 1, this.field2947 * (63 - var2), this.field2947, var4);
		}

		if (var3 == 3) {
			class433.method1968(this.field2947 * var1, this.field2947 + (63 - var2) * this.field2947 - 1, this.field2947, var4);
		}

	}

	static class42 method2024(int var0, int var1, int var2) {
		class45 var4 = field2942;
		long var5 = (long)(var2 << 16 | var0 << 8 | var1);
		return (class42)var4.method186(var5);
	}

	static void method2026(class42 var0, int var1, int var2, int var3) {
		class45 var5 = field2942;
		long var7 = (long)(var3 << 16 | var1 << 8 | var2);
		var5.method185(var0, var7, var0.field205.length * 4);
	}

	static void method2025() {
		field2942.method190();
	}
}
