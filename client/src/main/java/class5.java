public abstract class class5 {
	static class52 field26;
	static int field30;
	boolean field28;
	boolean field29;
	class221 field17;
	class221[] field23;
	int field20;
	int[] field15;
	int[] field16;
	int[] field19;
	int[] field21;
	int[] field27;
	int[][] field22;
	int[][] field25;
	Object[] field24;
	Object[][] field18;
	public int field14;

	static {
		field26 = new class52();
		field30 = 0;
	}

	class5(boolean var1, boolean var2) {
		this.field28 = var1;
		this.field29 = var2;
	}

	void method13(byte[] var1) {
		int var4 = var1.length;
		int var3 = Buffer.method2534(var1, 0, var4);
		this.field14 = var3;
		Buffer var5 = new Buffer(class205.method972(var1));
		int var6 = var5.readUnsignedByte();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.readInt();
			}

			int var7 = var5.readUnsignedByte();
			if (var6 >= 7) {
				this.field20 = var5.method2481();
			} else {
				this.field20 = var5.readUnsignedShort();
			}

			int var8 = 0;
			int var9 = -1;
			this.field15 = new int[this.field20];
			int var10;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field20; ++var10) {
					this.field15[var10] = var8 += var5.method2481();
					if (this.field15[var10] > var9) {
						var9 = this.field15[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.field20; ++var10) {
					this.field15[var10] = var8 += var5.readUnsignedShort();
					if (this.field15[var10] > var9) {
						var9 = this.field15[var10];
					}
				}
			}

			this.field27 = new int[var9 + 1];
			this.field19 = new int[var9 + 1];
			this.field21 = new int[var9 + 1];
			this.field25 = new int[var9 + 1][];
			this.field24 = new Object[var9 + 1];
			this.field18 = new Object[var9 + 1][];
			if (var7 != 0) {
				this.field16 = new int[var9 + 1];

				for (var10 = 0; var10 < this.field20; ++var10) {
					this.field16[this.field15[var10]] = var5.readInt();
				}

				this.field17 = new class221(this.field16);
			}

			for (var10 = 0; var10 < this.field20; ++var10) {
				this.field27[this.field15[var10]] = var5.readInt();
			}

			for (var10 = 0; var10 < this.field20; ++var10) {
				this.field19[this.field15[var10]] = var5.readInt();
			}

			for (var10 = 0; var10 < this.field20; ++var10) {
				this.field21[this.field15[var10]] = var5.readUnsignedShort();
			}

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field20; ++var10) {
					var11 = this.field15[var10];
					var12 = this.field21[var11];
					var8 = 0;
					var13 = -1;
					this.field25[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field25[var11][var14] = var8 += var5.method2481();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field18[var11] = new Object[var13 + 1];
				}
			} else {
				for (var10 = 0; var10 < this.field20; ++var10) {
					var11 = this.field15[var10];
					var12 = this.field21[var11];
					var8 = 0;
					var13 = -1;
					this.field25[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field25[var11][var14] = var8 += var5.readUnsignedShort();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field18[var11] = new Object[var13 + 1];
				}
			}

			if (var7 != 0) {
				this.field22 = new int[var9 + 1][];
				this.field23 = new class221[var9 + 1];

				for (var10 = 0; var10 < this.field20; ++var10) {
					var11 = this.field15[var10];
					var12 = this.field21[var11];
					this.field22[var11] = new int[this.field18[var11].length];

					for (var13 = 0; var13 < var12; ++var13) {
						this.field22[var11][this.field25[var11][var13]] = var5.readInt();
					}

					this.field23[var11] = new class221(this.field22[var11]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method14(int var1) {
	}

	public byte[] method39(int var1, int var2) {
		return this.method15(var1, var2, (int[])null);
	}

	public byte[] method15(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field18.length && this.field18[var1] != null && var2 >= 0 && var2 < this.field18[var1].length) {
			if (this.field18[var1][var2] == null) {
				boolean var5 = this.method27(var1, var3);
				if (!var5) {
					this.method21(var1);
					var5 = this.method27(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = class494.method2301(this.field18[var1][var2], false);
			if (this.field29) {
				this.field18[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method16(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field18.length && this.field18[var1] != null && var2 >= 0 && var2 < this.field18[var1].length) {
			if (this.field18[var1][var2] != null) {
				return true;
			} else if (this.field24[var1] != null) {
				return true;
			} else {
				this.method21(var1);
				return this.field24[var1] != null;
			}
		} else {
			return false;
		}
	}

	public boolean method35(int var1) {
		if (this.field18.length == 1) {
			return this.method16(0, var1);
		} else if (this.field18[var1].length == 1) {
			return this.method16(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method40(int var1) {
		if (null != this.field24[var1]) {
			return true;
		} else {
			this.method21(var1);
			return this.field24[var1] != null;
		}
	}

	public boolean method38() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field15.length; ++var3) {
			int var4 = this.field15[var3];
			if (null == this.field24[var4]) {
				this.method21(var4);
				if (this.field24[var4] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	int method18(int var1) {
		return this.field24[var1] != null ? 100 : 0;
	}

	public byte[] method19(int var1) {
		if (this.field18.length == 1) {
			return this.method39(0, var1);
		} else if (this.field18[var1].length == 1) {
			return this.method39(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method37(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field18.length && this.field18[var1] != null && var2 >= 0 && var2 < this.field18[var1].length) {
			if (null == this.field18[var1][var2]) {
				boolean var4 = this.method27(var1, (int[])null);
				if (!var4) {
					this.method21(var1);
					var4 = this.method27(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class494.method2301(this.field18[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	public byte[] method20(int var1) {
		if (this.field18.length == 1) {
			return this.method37(0, var1);
		} else if (this.field18[var1].length == 1) {
			return this.method37(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method21(int var1) {
	}

	public int[] method22(int var1) {
		return var1 >= 0 && var1 < this.field25.length ? this.field25[var1] : null;
	}

	public int method23(int var1) {
		return null != this.field18 && var1 < this.field18.length && this.field18[var1] != null ? this.field18[var1].length : 0;
	}

	public int method24() {
		return this.field18.length;
	}

	public void method34() {
		for (int var2 = 0; var2 < this.field24.length; ++var2) {
			this.field24[var2] = null;
		}

	}

	public void method25(int var1) {
		for (int var3 = 0; var3 < this.field18[var1].length; ++var3) {
			this.field18[var1][var3] = null;
		}

	}

	public void method26() {
		for (int var2 = 0; var2 < this.field18.length; ++var2) {
			if (this.field18[var2] != null) {
				for (int var3 = 0; var3 < this.field18[var2].length; ++var3) {
					this.field18[var2][var3] = null;
				}
			}
		}

	}

	boolean method27(int var1, int[] var2) {
		if (null == this.field24[var1]) {
			return false;
		} else {
			int var4 = this.field21[var1];
			int[] var5 = this.field25[var1];
			Object[] var6 = this.field18[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var22;
				if (null == var2 || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var22 = class494.method2301(this.field24[var1], false);
				} else {
					var22 = class494.method2301(this.field24[var1], true);
					Buffer var9 = new Buffer(var22);
					var9.decryptXtea(var2, 5, var9.data.length);
				}

				byte[] var23 = class205.method972(var22);
				if (this.field28) {
					this.field24[var1] = null;
				}

				int var11;
				if (var4 > 1) {
					int var10 = var23.length;
					--var10;
					var11 = var23[var10] & 255;
					var10 -= 4 * var11 * var4;
					Buffer var12 = new Buffer(var23);
					int[] var13 = new int[var4];
					var12.offset = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.readInt();
							var13[var16] += var15;
						}
					}

					byte[][] var26 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var26[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.offset = var10;
					var15 = 0;

					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.readInt();
							System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field29) {
							var18 = var5[var16];
							byte[] var20 = var26[var16];
							Object var19;
							if (null == var20) {
								var19 = null;
							} else if (var20.length > 136) {
								class443 var21 = new class443();
								var21.method2300(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var26[var16];
						}
					}
				} else if (!this.field29) {
					var11 = var5[0];
					Object var24;
					if (null == var23) {
						var24 = null;
					} else if (var23.length > 136) {
						class443 var25 = new class443();
						var25.method2300(var23);
						var24 = var25;
					} else {
						var24 = var23;
					}

					var6[var11] = var24;
				} else {
					var6[var5[0]] = var23;
				}

				return true;
			}
		}
	}

	public int method28(String var1) {
		var1 = var1.toLowerCase();
		return this.field17.method1017(class385.method1816(var1));
	}

	public int method17(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field23[var1].method1017(class385.method1816(var2));
	}

	public boolean method33(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field17.method1017(class385.method1816(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field23[var4].method1017(class385.method1816(var2));
			return var5 >= 0;
		}
	}

	public byte[] method29(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field17.method1017(class385.method1816(var1));
		int var5 = this.field23[var4].method1017(class385.method1816(var2));
		return this.method39(var4, var5);
	}

	public boolean method30(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field17.method1017(class385.method1816(var1));
		int var5 = this.field23[var4].method1017(class385.method1816(var2));
		return this.method16(var4, var5);
	}

	public boolean method31(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field17.method1017(class385.method1816(var1));
		return this.method40(var3);
	}

	public void method32(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field17.method1017(class385.method1816(var1));
		if (var3 >= 0) {
			this.method14(var3);
		}
	}

	public int method36(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field17.method1017(class385.method1816(var1));
		return this.method18(var3);
	}
}
