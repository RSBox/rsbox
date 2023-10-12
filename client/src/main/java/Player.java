public final class Player extends class65 {
	boolean teleporting;
	boolean field3006;
	boolean field3008;
	class171 field2989;
	class188 field3002;
	class188 field3012;
	class188 field3013;
	class490 field2991;
	class509 field3005;
	int field2988;
	int field2990;
	int field2993;
	int field2995;
	int field2996;
	int field2997;
	int field2998;
	int field2999;
	int field3000;
	int field3001;
	int field3003;
	int field3004;
	int field3007;
	int field3009;
	int field3010;
	int field3011;
	int field3014;
	int field3015;
	int field3016;
	String[] field2992;

	Player() {
		this.field3000 = -1;
		this.field2988 = -1;
		this.field2992 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field2992[var1] = "";
		}

		this.field2993 = 0;
		this.field2999 = 0;
		this.field2996 = 0;
		this.field3011 = 0;
		this.field3006 = false;
		this.field3007 = 0;
		this.field3008 = false;
		this.field3002 = class188.field1281;
		this.field3012 = class188.field1281;
		this.field3013 = class188.field1281;
		this.teleporting = false;
	}

	final void decode(Buffer var1) {
		var1.offset = 0;
		int var3 = var1.readUnsignedByte();
		boolean var4 = true;
		this.field3000 = var1.readByte();
		this.field2988 = var1.readByte();
		int var5 = -1;
		this.field3007 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var6[var7] = (var8 << 8) + var9;
				if (var7 == 0 && var6[0] == 65535) {
					var5 = var1.readUnsignedShort();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = class158.method857(var6[var7] - 512).field1134;
					if (var10 != 0) {
						this.field3007 = var10;
					}
				}
			}
		}

		int[] var28 = null;
		if (Client.field1841 >= 213) {
			var28 = new int[12];

			for (var8 = 0; var8 < 12; ++var8) {
				var9 = var1.readUnsignedByte();
				if (var9 == 0) {
					var28[var8] = 0;
				} else {
					var10 = var1.readUnsignedByte();
					var28[var8] = var10 + (var9 << 8);
				}
			}
		}

		int[] var29 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.readUnsignedByte();
			if (var10 < 0 || var10 >= class510.field3717[var9].length) {
				var10 = 0;
			}

			var29[var9] = var10;
		}

		super.field383 = var1.readUnsignedShort();
		if (super.field383 == 65535) {
			super.field383 = -1;
		}

		super.field335 = var1.readUnsignedShort();
		if (super.field335 == 65535) {
			super.field335 = -1;
		}

		super.field336 = super.field335;
		super.field331 = var1.readUnsignedShort();
		if (super.field331 == 65535) {
			super.field331 = -1;
		}

		super.field338 = var1.readUnsignedShort();
		if (super.field338 == 65535) {
			super.field338 = -1;
		}

		super.field341 = var1.readUnsignedShort();
		if (super.field341 == 65535) {
			super.field341 = -1;
		}

		super.field340 = var1.readUnsignedShort();
		if (super.field340 == 65535) {
			super.field340 = -1;
		}

		super.field401 = var1.readUnsignedShort();
		if (super.field401 == 65535) {
			super.field401 = -1;
		}

		this.field3005 = new class509(var1.readStringOrNull(), class474.field3325);
		this.method2116();
		this.method2124();
		this.method2125();
		if (class114.field720 == this) {
			class2.field5 = this.field3005.method2398();
		}

		this.field2993 = var1.readUnsignedByte();
		this.field2999 = var1.readUnsignedShort();
		this.field3008 = var1.readUnsignedByte() == 1;
		if (Client.field1842 == 0 && Client.field2087 >= 2) {
			this.field3008 = false;
		}

		class272[] var30 = null;
		boolean var31 = false;
		int var11 = var1.readUnsignedShort();
		var31 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var30 = new class272[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					int var17 = var6[var12] - 512;
					int var18 = var1.readUnsignedByte();
					boolean var19 = (var18 & 1) != 0;
					boolean var20 = (var18 & 2) != 0;
					class272 var21 = new class272(var17);
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					short var26;
					if (var19) {
						var22 = var1.readUnsignedByte();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = var21.field1796 != null && var23.length == var21.field1796.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.readUnsignedShort();
								if (var24) {
									var21.field1796[var23[var25]] = var26;
								}
							}
						}
					}

					if (var20) {
						var22 = var1.readUnsignedByte();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = null != var21.field1795 && var23.length == var21.field1795.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.readUnsignedShort();
								if (var24) {
									var21.field1795[var23[var25]] = var26;
								}
							}
						}
					}

					var30[var12] = var21;
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field2992[var12] = var1.readStringOrNull();
		}

		int var27 = var1.readUnsignedByte();
		if (this.field2989 == null) {
			this.field2989 = new class171();
		}

		this.field2989.method898(var28, var6, var30, var31, var29, var3, var5, var27);
	}

	boolean method2115() {
		if (this.field3002 == class188.field1281) {
			this.method2128();
		}

		return this.field3002 == class188.field1284;
	}

	void method2116() {
		this.field3002 = class188.field1281;
	}

	void method2128() {
		this.field3002 = class35.field176.method381(this.field3005) ? class188.field1284 : class188.field1282;
	}

	boolean method2117() {
		if (class188.field1281 == this.field3012) {
			this.method2118();
		}

		return class188.field1284 == this.field3012;
	}

	void method2124() {
		this.field3012 = class188.field1281;
	}

	void method2118() {
		this.field3012 = class257.field1749 != null && class257.field1749.method2232(this.field3005) ? class188.field1284 : class188.field1282;
	}

	void method2119() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field1919[var2] != null && Client.field1919[var2].method2408(this.field3005.method2398()) != -1 && var2 != 2) {
				this.field3013 = class188.field1284;
				return;
			}
		}

		this.field3013 = class188.field1282;
	}

	void method2125() {
		this.field3013 = class188.field1281;
	}

	boolean method2126() {
		if (class188.field1281 == this.field3013) {
			this.method2119();
		}

		return this.field3013 == class188.field1284;
	}

	int method2120() {
		return this.field2989 != null && this.field2989.field1206 != -1 ? class73.method366(this.field2989.field1206).field484 : 1;
	}

	@Override
	protected final class490 method2152() {
		if (this.field2989 == null) {
			return null;
		} else {
			class116 var2 = super.field373 != -1 && super.field376 == 0 ? class116.method539(super.field373) : null;
			class116 var3 = super.field369 != -1 && !this.field3006 && (super.field383 != super.field369 || var2 == null) ? class116.method539(super.field369) : null;
			class490 var4 = this.field2989.method906(var2, super.field334, var3, super.field370);
			if (null == var4) {
				return null;
			} else {
				var4.method2261();
				super.field353 = var4.field3161;
				int var5 = var4.field3448;
				if (!this.field3006) {
					var4 = this.method296(var4);
				}

				if (!this.field3006 && null != this.field2991) {
					if (Client.field1846 >= this.field3011) {
						this.field2991 = null;
					}

					if (Client.field1846 >= this.field2996 && Client.field1846 < this.field3011) {
						class490 var6 = this.field2991;
						var6.method2272(this.field2998 - super.field368, this.field2997 - this.field2995, this.field2990 - super.field329);
						if (super.field351 == 512) {
							var6.method2288();
							var6.method2288();
							var6.method2288();
						} else if (super.field351 == 1024) {
							var6.method2288();
							var6.method2288();
						} else if (super.field351 == 1536) {
							var6.method2288();
						}

						class490[] var7 = new class490[]{var4, var6};
						var4 = new class490(var7, 2);
						if (super.field351 == 512) {
							var6.method2288();
						} else if (super.field351 == 1024) {
							var6.method2288();
							var6.method2288();
						} else if (super.field351 == 1536) {
							var6.method2288();
							var6.method2288();
							var6.method2288();
						}

						var6.method2272(super.field368 - this.field2998, this.field2995 - this.field2997, super.field329 - this.field2990);
					}
				}

				var4.field3454 = true;
				if (super.field394 != 0 && Client.field1846 >= super.field389 && Client.field1846 < super.field390) {
					var4.field3490 = super.field391;
					var4.field3467 = super.field392;
					var4.field3492 = super.field393;
					var4.field3493 = super.field394;
					var4.field3494 = (short)var5;
				} else {
					var4.field3493 = 0;
				}

				return var4;
			}
		}
	}

	final void moveTo(int var1, int var2, MovementType var3) {
		if (super.field373 != -1 && class116.method539(super.field373).field746 == 1) {
			super.field373 = -1;
		}

		this.method294();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field399[0] >= 0 && super.field399[0] < 104 && super.field400[0] >= 0 && super.field400[0] < 104) {
				if (var3 == MovementType.run) {
					Client.method1375(this, var1, var2, MovementType.run);
				}

				this.method2123(var1, var2, var3);
			} else {
				this.teleport(var1, var2);
			}
		} else {
			this.teleport(var1, var2);
		}

	}

	void teleport(int var1, int var2) {
		super.field360 = 0;
		super.field403 = 0;
		super.field375 = 0;
		super.field399[0] = var1;
		super.field400[0] = var2;
		int var4 = this.method2120();
		super.field368 = var4 * 64 + 128 * super.field399[0];
		super.field329 = var4 * 64 + super.field400[0] * 128;
	}

	final void method2123(int var1, int var2, MovementType var3) {
		if (super.field360 < 9) {
			++super.field360;
		}

		for (int var5 = super.field360; var5 > 0; --var5) {
			super.field399[var5] = super.field399[var5 - 1];
			super.field400[var5] = super.field400[var5 - 1];
			super.field342[var5] = super.field342[var5 - 1];
		}

		super.field399[0] = var1;
		super.field400[0] = var2;
		super.field342[0] = var3;
	}

	@Override
	final boolean method289() {
		return this.field2989 != null;
	}

	static int method2129(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}
}
