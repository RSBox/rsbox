public class class137 extends class292 {
	public static class5 field886;
	public static class5 field887;
	static class352 field885;
	static class352 field890;
	int field883;
	int field888;
	int field893;
	int field894;
	int field895;
	int field897;
	int field898;
	short[] field884;
	short[] field889;
	short[] field891;
	short[] field892;
	public int field896;

	static {
		field885 = new class352(64);
		field890 = new class352(30);
	}

	class137() {
		this.field896 = -1;
		this.field894 = 128;
		this.field895 = 128;
		this.field883 = 0;
		this.field893 = 0;
		this.field898 = 0;
	}

	void method702(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method705(var1, var3);
		}
	}

	void method705(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field888 = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.field896 = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.field894 = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.field895 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.field883 = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.field893 = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.field898 = var1.readUnsignedByte();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.readUnsignedByte();
				this.field884 = new short[var4];
				this.field891 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field884[var5] = (short)var1.readUnsignedShort();
					this.field891[var5] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUnsignedByte();
				this.field892 = new short[var4];
				this.field889 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field892[var5] = (short)var1.readUnsignedShort();
					this.field889[var5] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	public final class490 method703(int var1) {
		class490 var3 = this.method704();
		class490 var4;
		if (this.field896 != -1 && var1 != -1) {
			var4 = class116.method539(this.field896).method531(var3, var1);
		} else {
			var4 = var3.method2258(true);
		}

		if (this.field894 != 128 || this.field895 != 128) {
			var4.method2273(this.field894, this.field895, this.field894);
		}

		if (this.field883 != 0) {
			if (this.field883 == 90) {
				var4.method2288();
			}

			if (this.field883 == 180) {
				var4.method2288();
				var4.method2288();
			}

			if (this.field883 == 270) {
				var4.method2288();
				var4.method2288();
				var4.method2288();
			}
		}

		return var4;
	}

	public final class490 method704() {
		class490 var2 = (class490)field890.method1678((long)this.field897);
		if (null == var2) {
			class239 var3 = class239.method1092(field886, this.field888, 0);
			if (null == var3) {
				return null;
			}

			int var4;
			if (null != this.field884) {
				for (var4 = 0; var4 < this.field884.length; ++var4) {
					var3.method1116(this.field884[var4], this.field891[var4]);
				}
			}

			if (null != this.field892) {
				for (var4 = 0; var4 < this.field892.length; ++var4) {
					var3.method1101(this.field892[var4], this.field889[var4]);
				}
			}

			var2 = var3.method1107(64 + this.field893, this.field898 + 850, -30, -50, -30);
			field890.method1680(var2, (long)this.field897);
		}

		return var2;
	}

	public static class137 method707(int var0) {
		class137 var2 = (class137)field885.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field887.method39(13, var0);
			var2 = new class137();
			var2.field897 = var0;
			if (null != var3) {
				var2.method702(new Buffer(var3));
			}

			field885.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static void method706() {
		field885.method1679();
		field890.method1679();
	}
}
