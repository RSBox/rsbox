public class class63 extends class292 {
	public static class5 field318;
	public static class63[] field300;
	static class352 field301;
	byte[] field319;
	int field305;
	int field312;
	int field314;
	int field315;
	int field317;
	int[] field311;
	int[] field313;
	public boolean field307;
	public boolean field308;
	public class465 field299;
	public class516 field316;
	public int field302;
	public int field303;
	public int field306;
	public int field320;
	public String field304;
	public String field310;
	public String[] field309;
	public final int field321;

	static {
		field301 = new class352(256);
	}

	public class63(int var1) {
		this.field303 = -1;
		this.field314 = -1;
		this.field306 = 0;
		this.field307 = true;
		this.field308 = false;
		this.field309 = new String[5];
		this.field312 = Integer.MAX_VALUE;
		this.field317 = Integer.MAX_VALUE;
		this.field305 = Integer.MIN_VALUE;
		this.field315 = Integer.MIN_VALUE;
		this.field316 = class516.field4074;
		this.field299 = class465.field3293;
		this.field302 = -1;
		this.field321 = var1;
	}

	public void method262(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method263(var1, var3);
		}
	}

	void method263(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field303 = var1.method2482();
		} else if (var2 == 2) {
			this.field314 = var1.method2482();
		} else if (var2 == 3) {
			this.field304 = var1.readStringOrNull();
		} else if (var2 == 4) {
			this.field320 = var1.readUnsignedMedium();
		} else if (var2 == 5) {
			var1.readUnsignedMedium();
		} else if (var2 == 6) {
			this.field306 = var1.readUnsignedByte();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.readUnsignedByte();
				if ((var4 & 1) == 0) {
					this.field307 = false;
				}

				if ((var4 & 2) == 2) {
					this.field308 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field309[var2 - 10] = var1.readStringOrNull();
			} else if (var2 == 15) {
				var4 = var1.readUnsignedByte();
				this.field311 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field311[var5] = var1.readShort();
				}

				var1.readInt();
				var5 = var1.readUnsignedByte();
				this.field313 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field313.length; ++var6) {
					this.field313[var6] = var1.readInt();
				}

				this.field319 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field319[var6] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field310 = var1.readStringOrNull();
				} else if (var2 == 18) {
					var1.method2482();
				} else if (var2 == 19) {
					this.field302 = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method2482();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.field316 = (class516)class26.method87(class516.method2430(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					class465[] var7 = new class465[]{class465.field3293, class465.field3297, class465.field3295};
					this.field299 = (class465)class26.method87(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	public void method266() {
		if (this.field311 != null) {
			for (int var2 = 0; var2 < this.field311.length; var2 += 2) {
				if (this.field311[var2] < this.field312) {
					this.field312 = this.field311[var2];
				} else if (this.field311[var2] > this.field305) {
					this.field305 = this.field311[var2];
				}

				if (this.field311[var2 + 1] < this.field317) {
					this.field317 = this.field311[var2 + 1];
				} else if (this.field311[var2 + 1] > this.field315) {
					this.field315 = this.field311[var2 + 1];
				}
			}
		}

	}

	public class42 method264(boolean var1) {
		int var3 = this.field303;
		return this.method267(var3);
	}

	class42 method267(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class42 var3 = (class42)field301.method1678((long)var1);
			if (null != var3) {
				return var3;
			} else {
				var3 = class168.method884(field318, var1, 0);
				if (null != var3) {
					field301.method1680(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	public int method265() {
		return this.field321;
	}

	public static class63 method269(int var0) {
		return var0 >= 0 && var0 < field300.length && null != field300[var0] ? field300[var0] : new class63(var0);
	}

	public static void method268() {
		field301.method1679();
	}
}
