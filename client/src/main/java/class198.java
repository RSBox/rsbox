import java.util.zip.CRC32;

public class class198 extends class5 {
	static CRC32 field1341;
	boolean field1334;
	boolean field1344;
	boolean field1345;
	class140 field1346;
	class471 field1336;
	class471 field1337;
	int field1335;
	int field1339;
	int field1342;
	int field1343;
	volatile boolean[] field1340;
	volatile int field1338;

	static {
		field1341 = new CRC32();
	}

	public class198(class471 var1, class471 var2, class140 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field1338 = 0;
		this.field1334 = false;
		this.field1335 = -1;
		this.field1344 = false;
		this.field1345 = false;
		this.field1336 = var1;
		this.field1337 = var2;
		this.field1343 = var4;
		this.field1334 = var7;
		this.field1344 = var8;
		this.field1345 = var9;
		this.field1346 = var3;
		this.field1346.method717(this, this.field1343);
	}

	public boolean method956() {
		return this.field1338 == 1;
	}

	public int method957() {
		if (this.field1338 == 1 || this.field1344 && this.field1338 == 2) {
			return 100;
		} else if (null != super.field24) {
			return 99;
		} else {
			int var2 = this.field1346.method720(255, this.field1343);
			if (var2 >= 100) {
				var2 = 99;
			}

			return var2;
		}
	}

	@Override
	void method14(int var1) {
		this.field1346.method719(this.field1343, var1);
	}

	@Override
	void method21(int var1) {
		if (this.field1336 != null && null != this.field1340 && this.field1340[var1]) {
			class471 var3 = this.field1336;
			byte[] var5 = null;
			synchronized(class106.field679) {
				for (class87 var7 = (class87)class106.field679.method327(); var7 != null; var7 = (class87)class106.field679.method331()) {
					if (var7.field2472 == (long)var1 && var3 == var7.field578 && var7.field577 == 0) {
						var5 = var7.field580;
						break;
					}
				}
			}

			if (var5 != null) {
				this.method963(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method2185(var1);
				this.method963(var3, var1, var6, true);
			}
		} else {
			this.field1346.method718(this, this.field1343, var1, super.field27[var1], (byte)2, true);
		}

	}

	void method958() {
		this.field1338 = 2;
		super.field15 = new int[0];
		super.field27 = new int[0];
		super.field19 = new int[0];
		super.field21 = new int[0];
		super.field25 = new int[0][];
		super.field24 = new Object[0];
		super.field18 = new Object[0][];
	}

	void method965(int var1, int var2) {
		this.field1342 = var1;
		this.field1339 = var2;
		if (null != this.field1337) {
			int var4 = this.field1343;
			class471 var5 = this.field1337;
			byte[] var7 = null;
			synchronized(class106.field679) {
				for (class87 var9 = (class87)class106.field679.method327(); null != var9; var9 = (class87)class106.field679.method331()) {
					if ((long)var4 == var9.field2472 && var9.field578 == var5 && var9.field577 == 0) {
						var7 = var9.field580;
						break;
					}
				}
			}

			if (var7 != null) {
				this.method963(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method2185(var4);
				this.method963(var5, var4, var8, true);
			}
		} else {
			this.field1346.method718(this, 255, this.field1343, this.field1342, (byte)0, true);
		}

	}

	void method959(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field1338 == 1) {
				throw new RuntimeException();
			}

			if (null != this.field1337) {
				class106.method499(this.field1343, var2, this.field1337);
			}

			this.method13(var2);
			this.method962();
		} else {
			var2[var2.length - 2] = (byte)(super.field19[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field19[var1];
			if (null != this.field1336) {
				class106.method499(var1, var2, this.field1336);
				this.field1340[var1] = true;
			}

			if (var4) {
				Object[] var6 = super.field24;
				Object var8;
				if (var2 == null) {
					var8 = null;
				} else if (var2.length > 136) {
					class443 var9 = new class443();
					var9.method2300(var2);
					var8 = var9;
				} else {
					var8 = var2;
				}

				var6[var1] = var8;
			}
		}

	}

	void method963(class471 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field1337) {
			if (this.field1338 == 1) {
				throw new RuntimeException();
			} else if (null == var3) {
				this.field1346.method718(this, 255, this.field1343, this.field1342, (byte)0, true);
			} else {
				field1341.reset();
				field1341.update(var3, 0, var3.length);
				var6 = (int)field1341.getValue();
				if (var6 != this.field1342) {
					this.field1346.method718(this, 255, this.field1343, this.field1342, (byte)0, true);
				} else {
					Buffer var12 = new Buffer(class205.method972(var3));
					int var13 = var12.readUnsignedByte();
					if (var13 != 5 && var13 != 6) {
						throw new RuntimeException(var13 + "," + this.field1343 + "," + var2);
					} else {
						int var9 = 0;
						if (var13 >= 6) {
							var9 = var12.readInt();
						}

						if (this.field1339 != var9) {
							this.field1346.method718(this, 255, this.field1343, this.field1342, (byte)0, true);
						} else {
							this.method13(var3);
							this.method962();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field1335 == var2) {
				this.field1338 = 1;
			}

			if (null != var3 && var3.length > 2) {
				field1341.reset();
				field1341.update(var3, 0, var3.length - 2);
				var6 = (int)field1341.getValue();
				int var7 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
				if (var6 == super.field27[var2] && super.field19[var2] == var7) {
					this.field1340[var2] = true;
					if (var4) {
						Object[] var8 = super.field24;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							class443 var11 = new class443();
							var11.method2300(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}

						var8[var2] = var10;
					}

				} else {
					this.field1340[var2] = false;
					if (this.field1334 || var4) {
						this.field1346.method718(this, this.field1343, var2, super.field27[var2], (byte)2, var4);
					}

				}
			} else {
				this.field1340[var2] = false;
				if (this.field1334 || var4) {
					this.field1346.method718(this, this.field1343, var2, super.field27[var2], (byte)2, var4);
				}

			}
		}
	}

	void method962() {
		this.field1340 = new boolean[super.field24.length];

		int var2;
		for (var2 = 0; var2 < this.field1340.length; ++var2) {
			this.field1340[var2] = false;
		}

		if (this.field1336 == null) {
			this.field1338 = 1;
		} else {
			this.field1335 = -1;

			for (var2 = 0; var2 < this.field1340.length; ++var2) {
				if (super.field21[var2] > 0) {
					class106.method498(var2, this.field1336, this);
					this.field1335 = var2;
				}
			}

			if (this.field1335 == -1) {
				this.field1338 = 1;
			}

		}
	}

	@Override
	int method18(int var1) {
		if (super.field24[var1] != null) {
			return 100;
		} else {
			return this.field1340[var1] ? 100 : this.field1346.method720(this.field1343, var1);
		}
	}

	public boolean method960(int var1) {
		return this.field1340[var1];
	}

	public boolean method961(int var1) {
		return this.method22(var1) != null;
	}

	public int method964() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field24.length; ++var4) {
			if (super.field21[var4] > 0) {
				var2 += 100;
				var3 += this.method18(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}
}
