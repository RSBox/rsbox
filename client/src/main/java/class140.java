import java.io.IOException;
import java.util.zip.CRC32;

public class class140 {
	boolean field917;
	byte field927;
	class198[] field923;
	class205 field905;
	class326 field912;
	class375 field908;
	class375 field910;
	class375 field913;
	class375 field915;
	Buffer field919;
	Buffer field920;
	Buffer field924;
	class86 field906;
	int field909;
	int field911;
	int field914;
	int field916;
	int field922;
	int field925;
	int field926;
	int field929;
	CRC32 field918;
	long field907;
	public int field921;
	public int field928;

	public class140() {
		this.field914 = 0;
		this.field908 = new class375(4096);
		this.field929 = 0;
		this.field910 = new class375(32);
		this.field911 = 0;
		this.field912 = new class326();
		this.field913 = new class375(4096);
		this.field922 = 0;
		this.field915 = new class375(4096);
		this.field916 = 0;
		this.field919 = new Buffer(8);
		this.field909 = 0;
		this.field918 = new CRC32();
		this.field923 = new class198[256];
		this.field925 = -1;
		this.field926 = 255;
		this.field927 = 0;
		this.field928 = 0;
		this.field921 = 0;
	}

	public boolean method723() {
		long var2 = class38.method108();
		int var4 = (int)(var2 - this.field907);
		this.field907 = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.field914 += var4;
		if (this.field916 == 0 && this.field911 == 0 && this.field922 == 0 && this.field929 == 0) {
			return true;
		} else if (this.field906 == null) {
			return false;
		} else {
			try {
				if (this.field914 > 30000) {
					throw new IOException();
				} else {
					class205 var5;
					Buffer var6;
					while (this.field911 < 200 && this.field929 > 0) {
						var5 = (class205)this.field908.method1753();
						var6 = new Buffer(4);
						var6.writeByte(1);
						var6.writeMedium((int)var5.field2472);
						this.field906.method403(var6.data, 0, 4);
						this.field910.put(var5, var5.field2472);
						--this.field929;
						++this.field911;
					}

					while (this.field916 < 200 && this.field922 > 0) {
						var5 = (class205)this.field912.method1590();
						var6 = new Buffer(4);
						var6.writeByte(0);
						var6.writeMedium((int)var5.field2472);
						this.field906.method403(var6.data, 0, 4);
						var5.method1517();
						this.field915.put(var5, var5.field2472);
						--this.field922;
						++this.field916;
					}

					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field906.method408();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						this.field914 = 0;
						byte var7 = 0;
						if (null == this.field905) {
							var7 = 8;
						} else if (this.field909 == 0) {
							var7 = 1;
						}

						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var23;
						if (var7 > 0) {
							var8 = var7 - this.field919.offset;
							if (var8 > var21) {
								var8 = var21;
							}

							this.field906.method407(this.field919.data, this.field919.offset, var8);
							if (this.field927 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field919.data;
									var10001 = var9 + this.field919.offset;
									var10000[var10001] ^= this.field927;
								}
							}

							var23 = this.field919;
							var23.offset += var8;
							if (this.field919.offset < var7) {
								break;
							}

							if (this.field905 == null) {
								this.field919.offset = 0;
								var9 = this.field919.readUnsignedByte();
								var10 = this.field919.readUnsignedShort();
								int var11 = this.field919.readUnsignedByte();
								int var12 = this.field919.readInt();
								long var13 = (long)(var10 + (var9 << 16));
								class205 var15 = (class205)this.field910.get(var13);
								this.field917 = true;
								if (null == var15) {
									var15 = (class205)this.field915.get(var13);
									this.field917 = false;
								}

								if (null == var15) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.field905 = var15;
								this.field920 = new Buffer(var16 + var12 + this.field905.field1374);
								this.field920.writeByte(var11);
								this.field920.writeInt(var12);
								this.field909 = 8;
								this.field919.offset = 0;
							} else if (this.field909 == 0) {
								if (this.field919.data[0] == -1) {
									this.field909 = 1;
									this.field919.offset = 0;
								} else {
									this.field905 = null;
								}
							}
						} else {
							var8 = this.field920.data.length - this.field905.field1374;
							var9 = 512 - this.field909;
							if (var9 > var8 - this.field920.offset) {
								var9 = var8 - this.field920.offset;
							}

							if (var9 > var21) {
								var9 = var21;
							}

							this.field906.method407(this.field920.data, this.field920.offset, var9);
							if (this.field927 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field920.data;
									var10001 = var10 + this.field920.offset;
									var10000[var10001] ^= this.field927;
								}
							}

							var23 = this.field920;
							var23.offset += var9;
							this.field909 += var9;
							if (var8 == this.field920.offset) {
								if (16711935L == this.field905.field2472) {
									this.field924 = this.field920;

									for (var10 = 0; var10 < 256; ++var10) {
										class198 var22 = this.field923[var10];
										if (var22 != null) {
											this.method714(var22, var10);
										}
									}
								} else {
									this.field918.reset();
									this.field918.update(this.field920.data, 0, var8);
									var10 = (int)this.field918.getValue();
									if (var10 != this.field905.field1375) {
										try {
											this.field906.method406();
										} catch (Exception var18) {
										}

										++this.field928;
										this.field906 = null;
										this.field927 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field928 = 0;
									this.field921 = 0;
									this.field905.field1373.method959((int)(this.field905.field2472 & 65535L), this.field920.data, (this.field905.field2472 & 16711680L) == 16711680L, this.field917);
								}

								this.field905.method1719();
								if (this.field917) {
									--this.field911;
								} else {
									--this.field916;
								}

								this.field909 = 0;
								this.field905 = null;
								this.field920 = null;
							} else {
								if (this.field909 != 512) {
									break;
								}

								this.field909 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.field906.method406();
				} catch (Exception var17) {
				}

				++this.field921;
				this.field906 = null;
				return false;
			}
		}
	}

	public void method715(boolean var1) {
		if (this.field906 != null) {
			try {
				Buffer var3 = new Buffer(4);
				var3.writeByte(var1 ? 2 : 3);
				var3.writeMedium(0);
				this.field906.method403(var3.data, 0, 4);
			} catch (IOException var6) {
				try {
					this.field906.method406();
				} catch (Exception var5) {
				}

				++this.field921;
				this.field906 = null;
			}

		}
	}

	public void method716(class86 var1, boolean var2) {
		if (this.field906 != null) {
			try {
				this.field906.method406();
			} catch (Exception var8) {
			}

			this.field906 = null;
		}

		this.field906 = var1;
		this.method715(var2);
		this.field919.offset = 0;
		this.field905 = null;
		this.field920 = null;
		this.field909 = 0;

		while (true) {
			class205 var4 = (class205)this.field910.method1753();
			if (var4 == null) {
				while (true) {
					var4 = (class205)this.field915.method1753();
					if (null == var4) {
						if (this.field927 != 0) {
							try {
								Buffer var9 = new Buffer(4);
								var9.writeByte(4);
								var9.writeByte(this.field927);
								var9.writeShort(0);
								this.field906.method403(var9.data, 0, 4);
							} catch (IOException var7) {
								try {
									this.field906.method406();
								} catch (Exception var6) {
								}

								++this.field921;
								this.field906 = null;
							}
						}

						this.field914 = 0;
						this.field907 = class38.method108();
						return;
					}

					this.field912.method1589(var4);
					this.field913.put(var4, var4.field2472);
					++this.field922;
					--this.field916;
				}
			}

			this.field908.put(var4, var4.field2472);
			++this.field929;
			--this.field911;
		}
	}

	void method717(class198 var1, int var2) {
		if (var1.field1344 && !var1.field1345) {
			if (var2 <= this.field925) {
				throw new RuntimeException("");
			}

			if (var2 < this.field926) {
				this.field926 = var2;
			}
		} else {
			if (var2 >= this.field926) {
				throw new RuntimeException("");
			}

			if (var2 > this.field925) {
				this.field925 = var2;
			}
		}

		if (null != this.field924) {
			this.method714(var1, var2);
		} else {
			this.method718((class198)null, 255, 255, 0, (byte)0, true);
			this.field923[var2] = var1;
		}
	}

	void method714(class198 var1, int var2) {
		this.field924.offset = 5 + var2 * 8;
		if (this.field924.offset >= this.field924.data.length) {
			if (var1.field1344) {
				var1.method958();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field924.readInt();
			int var5 = this.field924.readInt();
			var1.method965(var4, var5);
		}
	}

	void method718(class198 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long)((var2 << 16) + var3);
		class205 var10 = (class205)this.field908.get(var8);
		if (var10 == null) {
			var10 = (class205)this.field910.get(var8);
			if (null == var10) {
				var10 = (class205)this.field913.get(var8);
				if (var10 != null) {
					if (var6) {
						var10.method1517();
						this.field908.put(var10, var8);
						--this.field922;
						++this.field929;
					}

				} else {
					if (!var6) {
						var10 = (class205)this.field915.get(var8);
						if (null != var10) {
							return;
						}
					}

					var10 = new class205();
					var10.field1373 = var1;
					var10.field1375 = var4;
					var10.field1374 = var5;
					if (var6) {
						this.field908.put(var10, var8);
						++this.field929;
					} else {
						this.field912.method1588(var10);
						this.field913.put(var10, var8);
						++this.field922;
					}

				}
			}
		}
	}

	void method719(int var1, int var2) {
		long var4 = (long)((var1 << 16) + var2);
		class205 var6 = (class205)this.field913.get(var4);
		if (var6 != null) {
			this.field912.method1589(var6);
		}
	}

	int method720(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		return this.field905 != null && var4 == this.field905.field2472 ? this.field920.offset * 99 / (this.field920.data.length - this.field905.field1374) + 1 : 0;
	}

	public int method721(boolean var1, boolean var2) {
		boolean var4 = false;
		int var5 = 0 + this.field911 + this.field929;
		return var5;
	}

	public void method722() {
		if (null != this.field906) {
			this.field906.method406();
		}

	}
}
