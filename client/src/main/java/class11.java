public class class11 extends class292 {
	public static class352 field57;
	static class230[] field63;
	static class5 field52;
	static class5 field54;
	int[] field56;
	int[] field61;
	short[] field53;
	short[] field55;
	short[] field58;
	short[] field60;
	public boolean field62;
	public int field59;

	static {
		field57 = new class352(64);
	}

	class11() {
		this.field59 = -1;
		this.field61 = new int[]{-1, -1, -1, -1, -1};
		this.field62 = false;
	}

	void method54(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method49(var1, var3);
		}
	}

	void method49(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field59 = var1.readUnsignedByte();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.readUnsignedByte();
				this.field56 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field56[var5] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.field62 = true;
			} else if (var2 == 40) {
				var4 = var1.readUnsignedByte();
				this.field53 = new short[var4];
				this.field58 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field53[var5] = (short)var1.readUnsignedShort();
					this.field58[var5] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUnsignedByte();
				this.field55 = new short[var4];
				this.field60 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field55[var5] = (short)var1.readUnsignedShort();
					this.field60[var5] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field61[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	public boolean method50() {
		if (this.field56 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field56.length; ++var3) {
				if (!field54.method16(this.field56[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	public class239 method51() {
		if (this.field56 == null) {
			return null;
		} else {
			class239[] var2 = new class239[this.field56.length];

			for (int var3 = 0; var3 < this.field56.length; ++var3) {
				var2[var3] = class239.method1092(field54, this.field56[var3], 0);
			}

			class239 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new class239(var2, var2.length);
			}

			int var4;
			if (null != this.field53) {
				for (var4 = 0; var4 < this.field53.length; ++var4) {
					var5.method1116(this.field53[var4], this.field58[var4]);
				}
			}

			if (this.field55 != null) {
				for (var4 = 0; var4 < this.field55.length; ++var4) {
					var5.method1101(this.field55[var4], this.field60[var4]);
				}
			}

			return var5;
		}
	}

	public boolean method52() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field61[var3] != -1 && !field54.method16(this.field61[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	public class239 method53() {
		class239[] var2 = new class239[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field61[var4] != -1) {
				var2[var3++] = class239.method1092(field54, this.field61[var4], 0);
			}
		}

		class239 var6 = new class239(var2, var3);
		int var5;
		if (this.field53 != null) {
			for (var5 = 0; var5 < this.field53.length; ++var5) {
				var6.method1116(this.field53[var5], this.field58[var5]);
			}
		}

		if (null != this.field55) {
			for (var5 = 0; var5 < this.field55.length; ++var5) {
				var6.method1101(this.field55[var5], this.field60[var5]);
			}
		}

		return var6;
	}

	static final int method56(int var0, int var1, int var2, int var3) {
		return var1 * var2 - var3 * var0 >> 16;
	}

	public static void method57(class5 var0, class5 var1) {
		field52 = var0;
		field54 = var1;
		class132.field855 = field52.method23(3);
	}

	public static class11 method55(int var0) {
		class11 var2 = (class11)field57.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field52.method39(3, var0);
			var2 = new class11();
			if (var3 != null) {
				var2.method54(new Buffer(var3));
			}

			field57.method1680(var2, (long)var0);
			return var2;
		}
	}
}
