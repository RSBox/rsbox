public class class168 {
	public static int field1185;
	public static int[] field1184;
	static class71 field1183;

	public static class42[] method885(class5 var0, int var1, int var2) {
		if (!method887(var0, var1, 0)) {
			return null;
		} else {
			class42[] var5 = new class42[field1185];

			for (int var6 = 0; var6 < field1185; ++var6) {
				class42 var7 = var5[var6] = new class42();
				var7.field204 = class190.field1289;
				var7.field210 = class203.field1364;
				var7.field206 = class498.field3673[var6];
				var7.field208 = class442.field2971[var6];
				var7.field207 = class28.field136[var6];
				var7.field209 = field1184[var6];
				int var8 = var7.field207 * var7.field209;
				byte[] var9 = class299.field2203[var6];
				var7.field205 = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.field205[var10] = class205.field1376[var9[var10] & 255];
				}
			}

			class345.method1664();
			return var5;
		}
	}

	public static class42 method884(class5 var0, int var1, int var2) {
		if (!method887(var0, var1, 0)) {
			return null;
		} else {
			class42 var5 = new class42();
			var5.field204 = class190.field1289;
			var5.field210 = class203.field1364;
			var5.field206 = class498.field3673[0];
			var5.field208 = class442.field2971[0];
			var5.field207 = class28.field136[0];
			var5.field209 = field1184[0];
			int var6 = var5.field209 * var5.field207;
			byte[] var7 = class299.field2203[0];
			var5.field205 = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.field205[var8] = class205.field1376[var7[var8] & 255];
			}

			class345.method1664();
			return var5;
		}
	}

	public static class42[] method886(class5 var0, String var1, String var2) {
		if (!var0.method33(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method28(var1);
			int var5 = var0.method17(var4, var2);
			class42[] var6;
			if (!method887(var0, var4, var5)) {
				var6 = null;
			} else {
				class42[] var8 = new class42[field1185];

				for (int var9 = 0; var9 < field1185; ++var9) {
					class42 var10 = var8[var9] = new class42();
					var10.field204 = class190.field1289;
					var10.field210 = class203.field1364;
					var10.field206 = class498.field3673[var9];
					var10.field208 = class442.field2971[var9];
					var10.field207 = class28.field136[var9];
					var10.field209 = field1184[var9];
					int var11 = var10.field207 * var10.field209;
					byte[] var12 = class299.field2203[var9];
					var10.field205 = new int[var11];

					for (int var13 = 0; var13 < var11; ++var13) {
						var10.field205[var13] = class205.field1376[var12[var13] & 255];
					}
				}

				class345.method1664();
				var6 = var8;
			}

			return var6;
		}
	}

	public static class230[] method891() {
		class230[] var1 = new class230[field1185];

		for (int var2 = 0; var2 < field1185; ++var2) {
			class230 var3 = var1[var2] = new class230();
			var3.field1504 = class190.field1289;
			var3.field1505 = class203.field1364;
			var3.field1500 = class498.field3673[var2];
			var3.field1498 = class442.field2971[var2];
			var3.field1503 = class28.field136[var2];
			var3.field1501 = field1184[var2];
			var3.field1499 = class205.field1376;
			var3.field1502 = class299.field2203[var2];
		}

		class345.method1664();
		return var1;
	}

	static class230 method889() {
		class230 var1 = new class230();
		var1.field1504 = class190.field1289;
		var1.field1505 = class203.field1364;
		var1.field1500 = class498.field3673[0];
		var1.field1498 = class442.field2971[0];
		var1.field1503 = class28.field136[0];
		var1.field1501 = field1184[0];
		var1.field1499 = class205.field1376;
		var1.field1502 = class299.field2203[0];
		class345.method1664();
		return var1;
	}

	public static boolean method887(class5 var0, int var1, int var2) {
		byte[] var4 = var0.method39(var1, var2);
		if (var4 == null) {
			return false;
		} else {
			method888(var4);
			return true;
		}
	}

	public static boolean method890(class5 var0, int var1) {
		byte[] var3 = var0.method19(var1);
		if (null == var3) {
			return false;
		} else {
			method888(var3);
			return true;
		}
	}

	static void method888(byte[] var0) {
		Buffer var2 = new Buffer(var0);
		var2.offset = var0.length - 2;
		field1185 = var2.readUnsignedShort();
		class498.field3673 = new int[field1185];
		class442.field2971 = new int[field1185];
		class28.field136 = new int[field1185];
		field1184 = new int[field1185];
		class299.field2203 = new byte[field1185][];
		var2.offset = var0.length - 7 - field1185 * 8;
		class190.field1289 = var2.readUnsignedShort();
		class203.field1364 = var2.readUnsignedShort();
		int var3 = (var2.readUnsignedByte() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < field1185; ++var4) {
			class498.field3673[var4] = var2.readUnsignedShort();
		}

		for (var4 = 0; var4 < field1185; ++var4) {
			class442.field2971[var4] = var2.readUnsignedShort();
		}

		for (var4 = 0; var4 < field1185; ++var4) {
			class28.field136[var4] = var2.readUnsignedShort();
		}

		for (var4 = 0; var4 < field1185; ++var4) {
			field1184[var4] = var2.readUnsignedShort();
		}

		var2.offset = var0.length - 7 - field1185 * 8 - (var3 - 1) * 3;
		class205.field1376 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			class205.field1376[var4] = var2.readUnsignedMedium();
			if (class205.field1376[var4] == 0) {
				class205.field1376[var4] = 1;
			}
		}

		var2.offset = 0;

		for (var4 = 0; var4 < field1185; ++var4) {
			int var5 = class28.field136[var4];
			int var6 = field1184[var4];
			int var7 = var5 * var6;
			byte[] var8 = new byte[var7];
			class299.field2203[var4] = var8;
			int var9 = var2.readUnsignedByte();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.readByte();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var10 + var5 * var11] = var2.readByte();
					}
				}
			}
		}

	}
}
