import java.io.EOFException;
import java.io.IOException;

public final class class471 {
	static byte[] field3306;
	class219 field3305;
	class219 field3307;
	int field3308;
	int field3309;

	static {
		field3306 = new byte[520];
	}

	public class471(int var1, class219 var2, class219 var3, int var4) {
		this.field3307 = null;
		this.field3305 = null;
		this.field3309 = 65000;
		this.field3308 = var1;
		this.field3307 = var2;
		this.field3305 = var3;
		this.field3309 = var4;
	}

	public byte[] method2185(int var1) {
		synchronized(this.field3307) {
			Object var10000;
			try {
				if (this.field3305.method1011() < (long)(var1 * 6 + 6)) {
					var10000 = null;
					return (byte[])var10000;
				}

				this.field3305.method1010((long)(var1 * 6));
				this.field3305.method1015(field3306, 0, 6);
				int var4 = ((field3306[1] & 255) << 8) + ((field3306[0] & 255) << 16) + (field3306[2] & 255);
				int var5 = (field3306[5] & 255) + ((field3306[3] & 255) << 16) + ((field3306[4] & 255) << 8);
				if (var4 < 0 || var4 > this.field3309) {
					var10000 = null;
					return (byte[])var10000;
				}

				if (var5 > 0 && (long)var5 <= this.field3307.method1011() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;

					while (var7 < var4) {
						if (var5 == 0) {
							var10000 = null;
							return (byte[])var10000;
						}

						this.field3307.method1010((long)var5 * 520L);
						int var9 = var4 - var7;
						int var10;
						int var11;
						int var12;
						int var13;
						byte var14;
						if (var1 > 65535) {
							if (var9 > 510) {
								var9 = 510;
							}

							var14 = 10;
							this.field3307.method1015(field3306, 0, var9 + 10);
							var10 = ((field3306[2] & 255) << 8) + ((field3306[1] & 255) << 16) + ((field3306[0] & 255) << 24) + (field3306[3] & 255);
							var11 = ((field3306[4] & 255) << 8) + (field3306[5] & 255);
							var12 = (field3306[8] & 255) + ((field3306[7] & 255) << 8) + ((field3306[6] & 255) << 16);
							var13 = field3306[9] & 255;
						} else {
							if (var9 > 512) {
								var9 = 512;
							}

							var14 = 8;
							this.field3307.method1015(field3306, 0, var9 + 8);
							var10 = ((field3306[0] & 255) << 8) + (field3306[1] & 255);
							var11 = ((field3306[2] & 255) << 8) + (field3306[3] & 255);
							var12 = ((field3306[4] & 255) << 16) + ((field3306[5] & 255) << 8) + (field3306[6] & 255);
							var13 = field3306[7] & 255;
						}

						if (var1 == var10 && var8 == var11 && var13 == this.field3308) {
							if (var12 >= 0 && (long)var12 <= this.field3307.method1011() / 520L) {
								int var15 = var14 + var9;

								for (int var16 = var14; var16 < var15; ++var16) {
									var6[var7++] = field3306[var16];
								}

								var5 = var12;
								++var8;
								continue;
							}

							var10000 = null;
							return (byte[])var10000;
						}

						var10000 = null;
						return (byte[])var10000;
					}

					byte[] var20 = var6;
					return var20;
				}

				var10000 = null;
			} catch (IOException var18) {
				return null;
			}

			return (byte[])var10000;
		}
	}

	public boolean method2186(int var1, byte[] var2, int var3) {
		synchronized(this.field3307) {
			if (var3 >= 0 && var3 <= this.field3309) {
				boolean var6 = this.method2184(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method2184(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field3308 + ',' + var1 + ',' + var3);
			}
		}
	}

	boolean method2184(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field3307) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field3305.method1011() < (long)(6 + var1 * 6)) {
						var10000 = false;
						return var10000;
					}

					this.field3305.method1010((long)(var1 * 6));
					this.field3305.method1015(field3306, 0, 6);
					var7 = ((field3306[3] & 255) << 16) + ((field3306[4] & 255) << 8) + (field3306[5] & 255);
					if (var7 <= 0 || (long)var7 > this.field3307.method1011() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int)((this.field3307.method1011() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				field3306[0] = (byte)(var3 >> 16);
				field3306[1] = (byte)(var3 >> 8);
				field3306[2] = (byte)var3;
				field3306[3] = (byte)(var7 >> 16);
				field3306[4] = (byte)(var7 >> 8);
				field3306[5] = (byte)var7;
				this.field3305.method1010((long)(var1 * 6));
				this.field3305.method1013(field3306, 0, 6);
				int var8 = 0;
				int var9 = 0;

				while (true) {
					if (var8 < var3) {
						label154: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field3307.method1010((long)var7 * 520L);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field3307.method1015(field3306, 0, 10);
									} catch (EOFException var17) {
										break label154;
									}

									var11 = (field3306[3] & 255) + ((field3306[1] & 255) << 16) + ((field3306[0] & 255) << 24) + ((field3306[2] & 255) << 8);
									var12 = (field3306[5] & 255) + ((field3306[4] & 255) << 8);
									var10 = (field3306[8] & 255) + ((field3306[7] & 255) << 8) + ((field3306[6] & 255) << 16);
									var13 = field3306[9] & 255;
								} else {
									try {
										this.field3307.method1015(field3306, 0, 8);
									} catch (EOFException var16) {
										break label154;
									}

									var11 = (field3306[1] & 255) + ((field3306[0] & 255) << 8);
									var12 = ((field3306[2] & 255) << 8) + (field3306[3] & 255);
									var10 = (field3306[6] & 255) + ((field3306[4] & 255) << 16) + ((field3306[5] & 255) << 8);
									var13 = field3306[7] & 255;
								}

								if (var1 != var11 || var12 != var9 || this.field3308 != var13) {
									var10000 = false;
									return var10000;
								}

								if (var10 < 0 || (long)var10 > this.field3307.method1011() / 520L) {
									var10000 = false;
									return var10000;
								}
							}

							if (var10 == 0) {
								var4 = false;
								var10 = (int)((this.field3307.method1011() + 519L) / 520L);
								if (var10 == 0) {
									++var10;
								}

								if (var7 == var10) {
									++var10;
								}
							}

							if (var1 > 65535) {
								if (var3 - var8 <= 510) {
									var10 = 0;
								}

								field3306[0] = (byte)(var1 >> 24);
								field3306[1] = (byte)(var1 >> 16);
								field3306[2] = (byte)(var1 >> 8);
								field3306[3] = (byte)var1;
								field3306[4] = (byte)(var9 >> 8);
								field3306[5] = (byte)var9;
								field3306[6] = (byte)(var10 >> 16);
								field3306[7] = (byte)(var10 >> 8);
								field3306[8] = (byte)var10;
								field3306[9] = (byte)this.field3308;
								this.field3307.method1010(520L * (long)var7);
								this.field3307.method1013(field3306, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}

								this.field3307.method1013(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}

								field3306[0] = (byte)(var1 >> 8);
								field3306[1] = (byte)var1;
								field3306[2] = (byte)(var9 >> 8);
								field3306[3] = (byte)var9;
								field3306[4] = (byte)(var10 >> 16);
								field3306[5] = (byte)(var10 >> 8);
								field3306[6] = (byte)var10;
								field3306[7] = (byte)this.field3308;
								this.field3307.method1010(520L * (long)var7);
								this.field3307.method1013(field3306, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}

								this.field3307.method1013(var2, var8, var11);
								var8 += var11;
							}

							var7 = var10;
							++var9;
							continue;
						}
					}

					var10000 = true;
					return var10000;
				}
			} catch (IOException var18) {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return "" + this.field3308;
	}

	static void method2187(class376 var0, int var1, int var2) {
		Object[] var4 = var0.field2594;
		class83 var5;
		if (class68.method322(var0.field2591)) {
			class265.field1779 = (class102)var4[0];
			class63 var6 = class63.method269(class265.field1779.field663);
			var5 = class83.method399(var0.field2591, var6.field321, var6.field302);
		} else {
			int var7 = (Integer)var4[0];
			var5 = class83.method400(var7);
		}

		if (null != var5) {
			class440.method2060(var0, var5, var1, var2);
		}

	}
}
