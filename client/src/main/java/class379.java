import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class379 {
	boolean field2618;
	boolean field2619;
	class230[] field2613;
	class343 field2611;
	class42 field2609;
	class438[][] field2607;
	int field2606;
	int field2608;
	int field2620;
	int field2621;
	HashMap field2610;
	HashMap field2612;
	final class5 field2614;
	final class5 field2615;
	final HashMap field2616;
	public int field2617;

	public class379(class230[] var1, HashMap var2, class5 var3, class5 var4) {
		this.field2618 = false;
		this.field2619 = false;
		this.field2612 = new HashMap();
		this.field2617 = 0;
		this.field2613 = var1;
		this.field2616 = var2;
		this.field2614 = var3;
		this.field2615 = var4;
	}

	public void method1779(class5 var1, String var2, boolean var3, boolean var4) {
		if (!this.field2619) {
			this.field2618 = false;
			this.field2619 = true;
			System.nanoTime();
			int var6 = var1.method28(class31.field156.field153);
			int var7 = var1.method17(var6, var2);
			Buffer var8 = new Buffer(var1.method29(class31.field156.field153, var2));
			Buffer var9 = new Buffer(var1.method29(class31.field152.field153, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2611 = new class343();

			try {
				this.field2611.method1661(var8, var9, var7, var3, var4);
			} catch (IllegalStateException var18) {
				return;
			}

			this.field2611.method1692();
			this.field2611.method1693();
			this.field2611.method1694();
			this.field2621 = this.field2611.method1690() * 64;
			this.field2608 = this.field2611.method1691() * 64;
			this.field2606 = (this.field2611.method1695() - this.field2611.method1690() + 1) * 64;
			this.field2620 = (this.field2611.method1702() - this.field2611.method1691() + 1) * 64;
			int var10 = this.field2611.method1695() - this.field2611.method1690() + 1;
			int var11 = this.field2611.method1702() - this.field2611.method1691() + 1;
			System.nanoTime();
			System.nanoTime();
			class438.method2025();
			this.field2607 = new class438[var10][var11];
			Iterator var12 = this.field2611.field2401.iterator();

			while (var12.hasNext()) {
				class60 var13 = (class60)var12.next();
				int var14 = var13.field803;
				int var15 = var13.field816;
				int var16 = var14 - this.field2611.method1690();
				int var17 = var15 - this.field2611.method1691();
				this.field2607[var16][var17] = new class438(var14, var15, this.field2611.method1701(), this.field2616);
				this.field2607[var16][var17].method2022(var13, this.field2611.field2399);
			}

			for (int var19 = 0; var19 < var10; ++var19) {
				for (int var21 = 0; var21 < var11; ++var21) {
					if (this.field2607[var19][var21] == null) {
						this.field2607[var19][var21] = new class438(this.field2611.method1690() + var19, this.field2611.method1691() + var21, this.field2611.method1701(), this.field2616);
						this.field2607[var19][var21].method1990(this.field2611.field2400, this.field2611.field2399);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method33(class31.field151.field153, var2)) {
				byte[] var20 = var1.method29(class31.field151.field153, var2);
				this.field2609 = class412.method1902(var20);
			}

			System.nanoTime();
			var1.method34();
			var1.method26();
			this.field2618 = true;
		}
	}

	public final void method1788() {
		this.field2610 = null;
	}

	public final void method1780(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class433.field2898;
		int var11 = class433.field2894;
		int var12 = class433.field2896;
		float[] var13 = class433.field2897;
		int[] var14 = new int[4];
		class433.method1960(var14);
		class431 var15 = this.method1783(var1, var2, var3, var4);
		float var16 = this.method1787(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field2617 = var17;
		if (!this.field2612.containsKey(var17)) {
			class497 var18 = new class497(var17);
			var18.method2347();
			this.field2612.put(var17, var18);
		}

		int var25 = var15.field2890 + var15.field2891 - 1;
		int var19 = var15.field2888 + var15.field2889 - 1;

		int var20;
		int var21;
		for (var20 = var15.field2891; var20 <= var25; ++var20) {
			for (var21 = var15.field2888; var21 <= var19; ++var21) {
				this.field2607[var20][var21].method2023(var17, (class497)this.field2612.get(var17), this.field2613, this.field2614, this.field2615);
			}
		}

		class105.method483(var10, var11, var12, var13);
		class433.method1961(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = var1 + this.field2621;
		int var22 = var2 + this.field2608;

		for (int var23 = var15.field2891; var23 < var15.field2891 + var15.field2890; ++var23) {
			for (int var24 = var15.field2888; var24 < var15.field2889 + var15.field2888; ++var24) {
				this.field2607[var23][var24].method1997(var5 + (this.field2607[var23][var24].field2946 * 64 - var21) * var20 / 64, var8 - (this.field2607[var23][var24].field2943 * 64 - var22 + 64) * var20 / 64, var20);
			}
		}

	}

	public final void method1781(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class431 var15 = this.method1783(var1, var2, var3, var4);
		float var16 = this.method1787(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = this.field2621 + var1;
		int var19 = this.field2608 + var2;

		int var20;
		int var21;
		for (var20 = var15.field2891; var20 < var15.field2891 + var15.field2890; ++var20) {
			for (var21 = var15.field2888; var21 < var15.field2888 + var15.field2889; ++var21) {
				if (var13) {
					this.field2607[var20][var21].method1993();
				}

				this.field2607[var20][var21].method1998((this.field2607[var20][var21].field2946 * 64 - var18) * var17 / 64 + var5, var8 - var17 * (this.field2607[var20][var21].field2943 * 64 - var19 + 64) / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field2891; var20 < var15.field2890 + var15.field2891; ++var20) {
				for (var21 = var15.field2888; var21 < var15.field2889 + var15.field2888; ++var21) {
					this.field2607[var20][var21].method1999(var10, var11, var12);
				}
			}
		}

	}

	public void method1789(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, byte var8) {
		if (this.field2609 != null) {
			this.field2609.method161(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.field2610) {
					this.method1786();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2610.get(var10);
					} while(null == var11);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class283 var13 = (class283)var12.next();
						int var14 = var3 * (var13.field2150.field2561 - this.field2621) / this.field2606;
						int var15 = var4 - var4 * (var13.field2150.field2559 - this.field2608) / this.field2620;
						class433.method1980(var1 + var14, var2 + var15, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method1782(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2618) {
			return var12;
		} else {
			class431 var13 = this.method1783(var1, var2, var3, var4);
			float var14 = this.method1787(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field2621;
			int var17 = var2 + this.field2608;

			for (int var18 = var13.field2891; var18 < var13.field2891 + var13.field2890; ++var18) {
				for (int var19 = var13.field2888; var19 < var13.field2888 + var13.field2889; ++var19) {
					List var20 = this.field2607[var18][var19].method2016(var15 * (this.field2607[var18][var19].field2946 * 64 - var16) / 64 + var5, var6 + var8 - var15 * (64 + (this.field2607[var18][var19].field2943 * 64 - var17)) / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	class431 method1783(int var1, int var2, int var3, int var4) {
		class431 var6 = new class431(this);
		int var7 = var1 + this.field2621;
		int var8 = var2 + this.field2608;
		int var9 = this.field2621 + var3;
		int var10 = var4 + this.field2608;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field2890 = 1 + (var13 - var11);
		var6.field2889 = 1 + (var14 - var12);
		var6.field2891 = var11 - this.field2611.method1690();
		var6.field2888 = var12 - this.field2611.method1691();
		if (var6.field2891 < 0) {
			var6.field2890 += var6.field2891;
			var6.field2891 = 0;
		}

		if (var6.field2891 > this.field2607.length - var6.field2890) {
			var6.field2890 = this.field2607.length - var6.field2891;
		}

		if (var6.field2888 < 0) {
			var6.field2889 += var6.field2888;
			var6.field2888 = 0;
		}

		if (var6.field2888 > this.field2607[0].length - var6.field2889) {
			var6.field2889 = this.field2607[0].length - var6.field2888;
		}

		var6.field2890 = Math.min(var6.field2890, this.field2607.length);
		var6.field2889 = Math.min(var6.field2889, this.field2607[0].length);
		return var6;
	}

	public boolean method1784() {
		return this.field2618;
	}

	public int method1785() {
		return this.field2611.method1688();
	}

	public HashMap method1790() {
		this.method1786();
		return this.field2610;
	}

	void method1786() {
		if (this.field2610 == null) {
			this.field2610 = new HashMap();
		}

		this.field2610.clear();

		for (int var2 = 0; var2 < this.field2607.length; ++var2) {
			for (int var3 = 0; var3 < this.field2607[var2].length; ++var3) {
				List var4 = this.field2607[var2][var3].method2017();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class283 var6 = (class283)var5.next();
					if (var6.method1487()) {
						int var7 = var6.method1483();
						if (!this.field2610.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2610.put(var7, var8);
						} else {
							List var9 = (List)this.field2610.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	float method1787(int var1, int var2) {
		float var4 = (float)var1 / (float)var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
		}
	}
}
