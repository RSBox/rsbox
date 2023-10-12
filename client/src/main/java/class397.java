public class class397 extends class292 {
	public static class352 field2691;
	static boolean field2686;
	static class239[] field2692;
	static class352 field2688;
	static class352 field2690;
	static class352 field2718;
	static class5 field2687;
	static class5 field2695;
	static int field2719;
	boolean field2707;
	boolean field2725;
	boolean field2732;
	class301 field2736;
	int field2694;
	int field2697;
	int field2700;
	int field2708;
	int field2711;
	int field2712;
	int field2715;
	int field2716;
	int field2721;
	int field2722;
	int field2723;
	int[] field2717;
	int[] field2728;
	short[] field2685;
	short[] field2698;
	short[] field2699;
	short[] field2730;
	public boolean field2689;
	public boolean field2720;
	public boolean field2724;
	public boolean field2729;
	public boolean field2735;
	public int field2693;
	public int field2701;
	public int field2702;
	public int field2703;
	public int field2705;
	public int field2706;
	public int field2709;
	public int field2710;
	public int field2714;
	public int field2726;
	public int field2731;
	public int field2733;
	public int field2734;
	public int field2737;
	public int[] field2704;
	public int[] field2727;
	public String field2696;
	public String[] field2713;

	static {
		field2686 = false;
		field2688 = new class352(4096);
		field2691 = new class352(500);
		field2690 = new class352(30);
		field2718 = new class352(30);
		field2692 = new class239[4];
	}

	class397() {
		this.field2696 = class513.field3757;
		this.field2701 = 1;
		this.field2702 = 1;
		this.field2703 = 2;
		this.field2729 = true;
		this.field2705 = -1;
		this.field2708 = -1;
		this.field2707 = false;
		this.field2689 = false;
		this.field2709 = -1;
		this.field2710 = 16;
		this.field2711 = 0;
		this.field2712 = 0;
		this.field2713 = new String[5];
		this.field2714 = -1;
		this.field2737 = -1;
		this.field2732 = false;
		this.field2720 = true;
		this.field2694 = 128;
		this.field2697 = 128;
		this.field2716 = 128;
		this.field2721 = 0;
		this.field2722 = 0;
		this.field2723 = 0;
		this.field2724 = false;
		this.field2725 = false;
		this.field2726 = -1;
		this.field2715 = -1;
		this.field2700 = -1;
		this.field2706 = -1;
		this.field2731 = 0;
		this.field2734 = 0;
		this.field2733 = 0;
		this.field2735 = true;
	}

	void method1836() {
		if (this.field2705 == -1) {
			this.field2705 = 0;
			if (null != this.field2728 && (this.field2717 == null || this.field2717[0] == 10)) {
				this.field2705 = 1;
			}

			for (int var2 = 0; var2 < 5; ++var2) {
				if (this.field2713[var2] != null) {
					this.field2705 = 1;
				}
			}
		}

		if (this.field2726 == -1) {
			this.field2726 = this.field2703 != 0 ? 1 : 0;
		}

	}

	void method1837(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method1838(var1, var3);
		}
	}

	void method1838(Buffer var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.readUnsignedByte();
			if (var4 > 0) {
				if (this.field2728 != null && !field2686) {
					var1.offset += var4 * 3;
				} else {
					this.field2717 = new int[var4];
					this.field2728 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2728[var5] = var1.readUnsignedShort();
						this.field2717[var5] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.field2696 = var1.readStringOrNull();
		} else if (var2 == 5) {
			var4 = var1.readUnsignedByte();
			if (var4 > 0) {
				if (this.field2728 != null && !field2686) {
					var1.offset += var4 * 2;
				} else {
					this.field2717 = null;
					this.field2728 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2728[var5] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.field2701 = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.field2702 = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.field2703 = 0;
			this.field2729 = false;
		} else if (var2 == 18) {
			this.field2729 = false;
		} else if (var2 == 19) {
			this.field2705 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.field2708 = 0;
		} else if (var2 == 22) {
			this.field2707 = true;
		} else if (var2 == 23) {
			this.field2689 = true;
		} else if (var2 == 24) {
			this.field2709 = var1.readUnsignedShort();
			if (this.field2709 == 65535) {
				this.field2709 = -1;
			}
		} else if (var2 == 27) {
			this.field2703 = 1;
		} else if (var2 == 28) {
			this.field2710 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.field2711 = var1.readByte();
		} else if (var2 == 39) {
			this.field2712 = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.field2713[var2 - 30] = var1.readStringOrNull();
			if (this.field2713[var2 - 30].equalsIgnoreCase(class513.field3752)) {
				this.field2713[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.readUnsignedByte();
			this.field2685 = new short[var4];
			this.field2698 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2685[var5] = (short)var1.readUnsignedShort();
				this.field2698[var5] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var4 = var1.readUnsignedByte();
			this.field2699 = new short[var4];
			this.field2730 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2699[var5] = (short)var1.readUnsignedShort();
				this.field2730[var5] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.field2732 = true;
		} else if (var2 == 64) {
			this.field2720 = false;
		} else if (var2 == 65) {
			this.field2694 = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.field2697 = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.field2716 = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.field2737 = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.field2721 = var1.readShort();
		} else if (var2 == 71) {
			this.field2722 = var1.readShort();
		} else if (var2 == 72) {
			this.field2723 = var1.readShort();
		} else if (var2 == 73) {
			this.field2724 = true;
		} else if (var2 == 74) {
			this.field2725 = true;
		} else if (var2 == 75) {
			this.field2726 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.field2706 = var1.readUnsignedShort();
				this.field2731 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.field2734 = var1.readUnsignedShort();
				this.field2733 = var1.readUnsignedShort();
				this.field2731 = var1.readUnsignedByte();
				var4 = var1.readUnsignedByte();
				this.field2704 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2704[var5] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.field2708 = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.field2714 = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.field2735 = false;
			} else if (var2 == 249) {
				this.field2736 = class522.method2453(var1, this.field2736);
			}
		} else {
			this.field2715 = var1.readUnsignedShort();
			if (this.field2715 == 65535) {
				this.field2715 = -1;
			}

			this.field2700 = var1.readUnsignedShort();
			if (this.field2700 == 65535) {
				this.field2700 = -1;
			}

			var4 = -1;
			if (var2 == 92) {
				var4 = var1.readUnsignedShort();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			var5 = var1.readUnsignedByte();
			this.field2727 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2727[var6] = var1.readUnsignedShort();
				if (this.field2727[var6] == 65535) {
					this.field2727[var6] = -1;
				}
			}

			this.field2727[var5 + 1] = var4;
		}

	}

	public final boolean method1839(int var1) {
		if (null != this.field2717) {
			for (int var5 = 0; var5 < this.field2717.length; ++var5) {
				if (this.field2717[var5] == var1) {
					return field2687.method16(this.field2728[var5] & 65535, 0);
				}
			}

			return true;
		} else if (null == this.field2728) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var4 = 0; var4 < this.field2728.length; ++var4) {
				var3 &= field2687.method16(this.field2728[var4] & 65535, 0);
			}

			return var3;
		}
	}

	public final boolean method1840() {
		if (null == this.field2728) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2728.length; ++var3) {
				var2 &= field2687.method16(this.field2728[var3] & 65535, 0);
			}

			return var2;
		}
	}

	public final class462 method1841(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2717 == null) {
			var8 = (long)((this.field2693 << 10) + var2);
		} else {
			var8 = (long)(var2 + (this.field2693 << 10) + (var1 << 3));
		}

		Object var10 = (class462)field2690.method1678(var8);
		if (var10 == null) {
			class239 var11 = this.method1844(var1, var2);
			if (var11 == null) {
				return null;
			}

			if (!this.field2707) {
				var10 = var11.method1107(64 + this.field2711, 768 + this.field2712, -50, -10, -50);
			} else {
				var11.field1602 = (short)(64 + this.field2711);
				var11.field1603 = (short)(this.field2712 + 768);
				var11.method1096();
				var10 = var11;
			}

			field2690.method1680((class292)var10, var8);
		}

		if (this.field2707) {
			var10 = ((class239)var10).method1097();
		}

		if (this.field2708 >= 0) {
			if (var10 instanceof class490) {
				var10 = ((class490)var10).method2257(var3, var4, var5, var6, true, this.field2708);
			} else if (var10 instanceof class239) {
				var10 = ((class239)var10).method1109(var3, var4, var5, var6, true, this.field2708);
			}
		}

		return (class462)var10;
	}

	public final class490 method1842(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (null == this.field2717) {
			var8 = (long)((this.field2693 << 10) + var2);
		} else {
			var8 = (long)(var2 + (var1 << 3) + (this.field2693 << 10));
		}

		class490 var10 = (class490)field2718.method1678(var8);
		if (null == var10) {
			class239 var11 = this.method1844(var1, var2);
			if (null == var11) {
				return null;
			}

			var10 = var11.method1107(this.field2711 + 64, 768 + this.field2712, -50, -10, -50);
			field2718.method1680(var10, var8);
		}

		if (this.field2708 >= 0) {
			var10 = var10.method2257(var3, var4, var5, var6, true, this.field2708);
		}

		return var10;
	}

	public final class490 method1843(int var1, int var2, int[][] var3, int var4, int var5, int var6, class116 var7, int var8) {
		long var10;
		if (this.field2717 == null) {
			var10 = (long)((this.field2693 << 10) + var2);
		} else {
			var10 = (long)(var2 + (this.field2693 << 10) + (var1 << 3));
		}

		class490 var12 = (class490)field2718.method1678(var10);
		if (null == var12) {
			class239 var13 = this.method1844(var1, var2);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method1107(this.field2711 + 64, 768 + this.field2712, -50, -10, -50);
			field2718.method1680(var12, var10);
		}

		if (var7 == null && this.field2708 == -1) {
			return var12;
		} else {
			if (null != var7) {
				var12 = var7.method530(var12, var8, var2);
			} else {
				var12 = var12.method2255(true);
			}

			if (this.field2708 >= 0) {
				var12 = var12.method2257(var3, var4, var5, var6, false, this.field2708);
			}

			return var12;
		}
	}

	final class239 method1844(int var1, int var2) {
		class239 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (this.field2717 == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.field2728 == null) {
				return null;
			}

			var5 = this.field2732;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var6 = this.field2728.length;

			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2728[var7];
				if (var5) {
					var8 += 65536;
				}

				var4 = (class239)field2691.method1678((long)var8);
				if (var4 == null) {
					var4 = class239.method1092(field2687, var8 & 65535, 0);
					if (null == var4) {
						return null;
					}

					if (var5) {
						var4.method1102();
					}

					field2691.method1680(var4, (long)var8);
				}

				if (var6 > 1) {
					field2692[var7] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new class239(field2692, var6);
			}
		} else {
			int var9 = -1;

			for (var6 = 0; var6 < this.field2717.length; ++var6) {
				if (var1 == this.field2717[var6]) {
					var9 = var6;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var6 = this.field2728[var9];
			boolean var10 = this.field2732 ^ var2 > 3;
			if (var10) {
				var6 += 65536;
			}

			var4 = (class239)field2691.method1678((long)var6);
			if (var4 == null) {
				var4 = class239.method1092(field2687, var6 & 65535, 0);
				if (var4 == null) {
					return null;
				}

				if (var10) {
					var4.method1102();
				}

				field2691.method1680(var4, (long)var6);
			}
		}

		if (this.field2694 == 128 && this.field2697 == 128 && this.field2716 == 128) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var11;
		if (this.field2721 == 0 && this.field2722 == 0 && this.field2723 == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		class239 var12 = new class239(var4, var2 == 0 && !var5 && !var11, this.field2685 == null, null == this.field2699, true);
		if (var1 == 4 && var2 > 3) {
			var12.method1100(256);
			var12.method1111(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var12.method1099();
		} else if (var2 == 2) {
			var12.method1103();
		} else if (var2 == 3) {
			var12.method1110();
		}

		if (null != this.field2685) {
			for (var8 = 0; var8 < this.field2685.length; ++var8) {
				var12.method1116(this.field2685[var8], this.field2698[var8]);
			}
		}

		if (this.field2699 != null) {
			for (var8 = 0; var8 < this.field2699.length; ++var8) {
				var12.method1101(this.field2699[var8], this.field2730[var8]);
			}
		}

		if (var5) {
			var12.method1112(this.field2694, this.field2697, this.field2716);
		}

		if (var11) {
			var12.method1111(this.field2721, this.field2722, this.field2723);
		}

		return var12;
	}

	public final class397 method1845() {
		int var2 = -1;
		if (this.field2715 != -1) {
			var2 = class119.method580(this.field2715);
		} else if (this.field2700 != -1) {
			var2 = class119.field786[this.field2700];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2727.length - 1) {
			var3 = this.field2727[var2];
		} else {
			var3 = this.field2727[this.field2727.length - 1];
		}

		return var3 != -1 ? class109.method504(var3) : null;
	}

	public int method1848(int var1, int var2) {
		return class522.method2452(this.field2736, var1, var2);
	}

	public String method1846(int var1, String var2) {
		return class522.method2451(this.field2736, var1, var2);
	}

	public boolean method1847() {
		if (null == this.field2727) {
			return this.field2706 != -1 || null != this.field2704;
		} else {
			for (int var2 = 0; var2 < this.field2727.length; ++var2) {
				if (this.field2727[var2] != -1) {
					class397 var3 = class109.method504(this.field2727[var2]);
					if (var3.field2706 != -1 || null != var3.field2704) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public static void method1850(class5 var0, class5 var1, boolean var2) {
		field2695 = var0;
		field2687 = var1;
		field2686 = var2;
	}

	public static void method1849() {
		field2688.method1679();
		field2691.method1679();
		field2690.method1679();
		field2718.method1679();
	}
}
