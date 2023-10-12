import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class417 {
	static class230 field2850;
	boolean field2855;
	boolean[] field2854;
	/** @deprecated */
	@Deprecated
	String[] field2853;
	Map field2851;
	long field2852;

	class417() {
		this.field2855 = false;
		int var1 = class323.field2337.method23(19);
		this.field2851 = new HashMap();
		this.field2854 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class241 var3 = class241.method1119(var2);
			this.field2854[var2] = var3.field1616;
		}

		var2 = 0;
		if (class323.field2337.method961(15)) {
			var2 = class323.field2337.method23(15);
		}

		this.field2853 = new String[var2];
		this.method1914();
	}

	void method1918(int var1, int var2) {
		this.field2851.put(var1, var2);
		if (this.field2854[var1]) {
			this.field2855 = true;
		}

	}

	int method1907(int var1) {
		Object var3 = this.field2851.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	void method1908(int var1, String var2) {
		this.field2851.put(var1, var2);
	}

	String method1909(int var1) {
		Object var3 = this.field2851.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	void method1910(int var1, String var2) {
		this.field2853[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	String method1911(int var1) {
		return this.field2853[var1];
	}

	void method1916() {
		int var2;
		for (var2 = 0; var2 < this.field2854.length; ++var2) {
			if (!this.field2854[var2]) {
				this.field2851.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field2853.length; ++var2) {
			this.field2853[var2] = null;
		}

	}

	class356 method1912(boolean var1) {
		return class258.method1223("2", class138.field900.field3027, var1);
	}

	void method1913() {
		class356 var2 = this.method1912(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field2851.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field2854[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += Buffer.method2535((String)var8);
					}

					++var4;
				}
			}

			Buffer var24 = new Buffer(var3);
			var24.writeByte(2);
			var24.writeShort(var4);
			Iterator var25 = this.field2851.entrySet().iterator();

			while (var25.hasNext()) {
				Entry var26 = (Entry)var25.next();
				int var27 = (Integer)var26.getKey();
				if (this.field2854[var27]) {
					var24.writeShort(var27);
					Object var9 = var26.getValue();
					class499 var10 = class499.method2358(var9.getClass());
					var24.writeByte(var10.field3678);
					Class var12 = var9.getClass();
					class499 var13 = class499.method2358(var12);
					if (var13 == null) {
						throw new IllegalArgumentException();
					}

					class350 var11 = var13.field3680;
					var11.method1675(var9, var24);
				}
			}

			var2.method1707(var24.data, 0, var24.offset);
		} catch (Exception var22) {
		} finally {
			try {
				var2.method1708();
			} catch (Exception var21) {
			}

		}

		this.field2855 = false;
		this.field2852 = class38.method108();
	}

	void method1914() {
		class356 var2 = this.method1912(false);

		label219: {
			try {
				byte[] var3 = new byte[(int)var2.method1710()];

				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method1711(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}

				Buffer var25 = new Buffer(var3);
				if (var25.data.length - var25.offset >= 1) {
					int var6 = var25.readUnsignedByte();
					if (var6 < 0 || var6 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var10;
					if (var6 >= 2) {
						var7 = var25.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label219;
							}

							var9 = var25.readUnsignedShort();
							var10 = var25.readUnsignedByte();
							class499 var11 = (class499)class26.method87(class499.method2361(), var10);
							Object var12 = var11.method2360(var25);
							if (var9 >= 0 && var9 < this.field2854.length && this.field2854[var9]) {
								this.field2851.put(var9, var12);
							}

							++var8;
						}
					} else {
						var7 = var25.readUnsignedShort();

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var25.readUnsignedShort();
							var10 = var25.readInt();
							if (var9 >= 0 && var9 < this.field2854.length && this.field2854[var9]) {
								this.field2851.put(var9, var10);
							}
						}

						var8 = var25.readUnsignedShort();
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								break label219;
							}

							var25.readUnsignedShort();
							var25.readStringOrNull();
							++var9;
						}
					}
				}
			} catch (Exception var23) {
				break label219;
			} finally {
				try {
					var2.method1708();
				} catch (Exception var22) {
				}

			}

			return;
		}

		this.field2855 = false;
	}

	void method1917() {
		if (this.field2855 && this.field2852 < class38.method108() - 60000L) {
			this.method1913();
		}

	}

	boolean method1915() {
		return this.field2855;
	}
}
