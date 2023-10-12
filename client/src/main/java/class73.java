public class class73 extends class292 {
	public static class5 field479;
	public static class5 field519;
	static class352 field480;
	static class352 field481;
	class301 field483;
	int field496;
	int field503;
	int field505;
	int field509;
	int field512;
	int field515;
	int[] field485;
	int[] field487;
	int[] field520;
	short[] field500;
	short[] field501;
	short[] field521;
	public boolean field492;
	public boolean field506;
	public boolean field510;
	public boolean field514;
	public boolean field518;
	public int field478;
	public int field482;
	public int field484;
	public int field486;
	public int field488;
	public int field490;
	public int field491;
	public int field493;
	public int field494;
	public int field495;
	public int field497;
	public int field498;
	public int field499;
	public int field504;
	public int field507;
	public int field508;
	public int field513;
	public int field517;
	public int field522;
	public int[] field477;
	public String field516;
	public String[] field489;
	public short[] field502;
	public short[] field511;

	static {
		field480 = new class352(64);
		field481 = new class352(50);
	}

	class73() {
		this.field516 = class513.field3757;
		this.field484 = 1;
		this.field486 = -1;
		this.field482 = -1;
		this.field488 = -1;
		this.field478 = -1;
		this.field490 = -1;
		this.field491 = -1;
		this.field504 = -1;
		this.field493 = -1;
		this.field494 = -1;
		this.field495 = -1;
		this.field522 = -1;
		this.field497 = -1;
		this.field498 = -1;
		this.field499 = -1;
		this.field508 = -1;
		this.field489 = new String[5];
		this.field506 = true;
		this.field507 = -1;
		this.field496 = 128;
		this.field509 = 128;
		this.field510 = false;
		this.field505 = 0;
		this.field512 = 0;
		this.field513 = 32;
		this.field515 = -1;
		this.field503 = -1;
		this.field492 = true;
		this.field518 = true;
		this.field514 = false;
		this.field520 = null;
		this.field521 = null;
	}

	void method350() {
	}

	void method351(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method352(var1, var3);
		}
	}

	void method352(Buffer var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.readUnsignedByte();
			this.field485 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field485[var5] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.field516 = var1.readStringOrNull();
		} else if (var2 == 12) {
			this.field484 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field486 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.field478 = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.field482 = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.field488 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field478 = var1.readUnsignedShort();
			this.field490 = var1.readUnsignedShort();
			this.field491 = var1.readUnsignedShort();
			this.field504 = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.field489[var2 - 30] = var1.readStringOrNull();
			if (this.field489[var2 - 30].equalsIgnoreCase(class513.field3752)) {
				this.field489[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.readUnsignedByte();
			this.field501 = new short[var4];
			this.field502 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field501[var5] = (short)var1.readUnsignedShort();
				this.field502[var5] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var4 = var1.readUnsignedByte();
			this.field500 = new short[var4];
			this.field511 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field500[var5] = (short)var1.readUnsignedShort();
				this.field511[var5] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var4 = var1.readUnsignedByte();
			this.field487 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field487[var5] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.field506 = false;
		} else if (var2 == 95) {
			this.field507 = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.field496 = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.field509 = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.field510 = true;
		} else if (var2 == 100) {
			this.field505 = var1.readByte();
		} else if (var2 == 101) {
			this.field512 = var1.readByte() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				var4 = var1.readUnsignedByte();
				var5 = 0;

				for (var6 = var4; var6 != 0; var6 >>= 1) {
					++var5;
				}

				this.field520 = new int[var5];
				this.field521 = new short[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					if ((var4 & 1 << var7) == 0) {
						this.field520[var7] = -1;
						this.field521[var7] = -1;
					} else {
						this.field520[var7] = var1.method2482();
						this.field521[var7] = (short)var1.method2480();
					}
				}
			} else if (var2 == 103) {
				this.field513 = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field492 = false;
				} else if (var2 == 109) {
					this.field518 = false;
				} else if (var2 == 111) {
					this.field514 = true;
				} else if (var2 == 114) {
					this.field493 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field493 = var1.readUnsignedShort();
					this.field494 = var1.readUnsignedShort();
					this.field495 = var1.readUnsignedShort();
					this.field522 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field497 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field497 = var1.readUnsignedShort();
					this.field498 = var1.readUnsignedShort();
					this.field499 = var1.readUnsignedShort();
					this.field508 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.field483 = class522.method2453(var1, this.field483);
				}
			} else {
				this.field515 = var1.readUnsignedShort();
				if (this.field515 == 65535) {
					this.field515 = -1;
				}

				this.field503 = var1.readUnsignedShort();
				if (this.field503 == 65535) {
					this.field503 = -1;
				}

				var4 = -1;
				if (var2 == 118) {
					var4 = var1.readUnsignedShort();
					if (var4 == 65535) {
						var4 = -1;
					}
				}

				var5 = var1.readUnsignedByte();
				this.field477 = new int[var5 + 2];

				for (var6 = 0; var6 <= var5; ++var6) {
					this.field477[var6] = var1.readUnsignedShort();
					if (this.field477[var6] == 65535) {
						this.field477[var6] = -1;
					}
				}

				this.field477[var5 + 1] = var4;
			}
		}

	}

	public final class490 method353(class116 var1, int var2, class116 var3, int var4, class120 var5) {
		if (null != this.field477) {
			class73 var12 = this.method363();
			return null == var12 ? null : var12.method353(var1, var2, var3, var4, var5);
		} else {
			long var7 = (long)this.field517;
			if (var5 != null) {
				var7 |= var5.field792 << 16;
			}

			class490 var9 = (class490)field481.method1678(var7);
			if (null == var9) {
				class239 var10 = this.method355(this.field485, var5);
				if (null == var10) {
					return null;
				}

				var9 = var10.method1107(this.field505 + 64, 850 + this.field512, -30, -50, -30);
				field481.method1680(var9, var7);
			}

			class490 var11;
			if (null != var1 && null != var3) {
				var11 = var1.method526(var9, var2, var3, var4);
			} else if (null != var1) {
				var11 = var1.method529(var9, var2);
			} else if (var3 != null) {
				var11 = var3.method529(var9, var4);
			} else {
				var11 = var9.method2255(true);
			}

			if (this.field496 != 128 || this.field509 != 128) {
				var11.method2273(this.field496, this.field509, this.field496);
			}

			return var11;
		}
	}

	public final class239 method354(class120 var1) {
		if (this.field477 != null) {
			class73 var3 = this.method363();
			return null == var3 ? null : var3.method354(var1);
		} else {
			return this.method355(this.field487, var1);
		}
	}

	class239 method355(int[] var1, class120 var2) {
		int[] var4 = var1;
		if (null != var2 && var2.field789 != null) {
			var4 = var2.field789;
		}

		if (null == var4) {
			return null;
		} else {
			boolean var5 = false;

			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (var4[var6] != -1 && !field519.method16(var4[var6], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				class239[] var10 = new class239[var4.length];

				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = class239.method1092(field519, var4[var7], 0);
				}

				class239 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (var11 == null) {
						var11 = new class239(var10, var10.length);
					}
				} else {
					var11 = new class239(var10, var10.length);
				}

				short[] var8;
				int var9;
				if (this.field501 != null) {
					var8 = this.field502;
					if (var2 != null && null != var2.field788) {
						var8 = var2.field788;
					}

					for (var9 = 0; var9 < this.field501.length; ++var9) {
						var11.method1116(this.field501[var9], var8[var9]);
					}
				}

				if (this.field500 != null) {
					var8 = this.field511;
					if (var2 != null && null != var2.field791) {
						var8 = var2.field791;
					}

					for (var9 = 0; var9 < this.field500.length; ++var9) {
						var11.method1101(this.field500[var9], var8[var9]);
					}
				}

				return var11;
			}
		}
	}

	public final class73 method363() {
		int var2 = -1;
		if (this.field515 != -1) {
			var2 = class119.method580(this.field515);
		} else if (this.field503 != -1) {
			var2 = class119.field786[this.field503];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field477.length - 1) {
			var3 = this.field477[var2];
		} else {
			var3 = this.field477[this.field477.length - 1];
		}

		return var3 != -1 ? method366(var3) : null;
	}

	public boolean method356() {
		if (this.field477 == null) {
			return true;
		} else {
			int var2 = -1;
			if (this.field515 != -1) {
				var2 = class119.method580(this.field515);
			} else if (this.field503 != -1) {
				var2 = class119.field786[this.field503];
			}

			if (var2 >= 0 && var2 < this.field477.length) {
				return this.field477[var2] != -1;
			} else {
				return this.field477[this.field477.length - 1] != -1;
			}
		}
	}

	public int method357(int var1, int var2) {
		return class522.method2452(this.field483, var1, var2);
	}

	public String method364(int var1, String var2) {
		return class522.method2451(this.field483, var1, var2);
	}

	public boolean method358() {
		return this.field520 != null && this.field521 != null;
	}

	public int[] method359() {
		return this.field520;
	}

	public int method360(int var1) {
		return null != this.field520 && var1 < this.field520.length ? this.field520[var1] : -1;
	}

	public short[] method362() {
		return this.field521;
	}

	public short method361(int var1) {
		return null != this.field521 && var1 < this.field521.length ? this.field521[var1] : -1;
	}

	public static class73 method366(int var0) {
		class73 var2 = (class73)field480.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field479.method39(9, var0);
			var2 = new class73();
			var2.field517 = var0;
			if (var3 != null) {
				var2.method351(new Buffer(var3));
			}

			var2.method350();
			field480.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method365() {
		field480.method1679();
		field481.method1679();
	}
}
