public class class83 extends class292 {
	static class352 field557;
	static int[] field560;
	class301[] field559;
	int field555;
	int field561;
	int field562;
	int field563;
	int[] field558;
	int[] field564;
	String field556;
	String[] field565;

	static {
		field557 = new class352(128);
	}

	class83() {
	}

	class301[] method397(int var1) {
		return new class301[var1];
	}

	static class83 method400(int var0) {
		class83 var2 = (class83)field557.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class4.field13.method39(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = method401(var3);
				field557.method1680(var2, (long)var0);
				return var2;
			}
		}
	}

	static class83 method399(int var0, int var1, int var2) {
		int var4 = class411.method1900(var1, var0);
		class83 var5 = method398(var4, var0);
		if (null != var5) {
			return var5;
		} else {
			var4 = class411.method1901(var2, var0);
			var5 = method398(var4, var0);
			if (null != var5) {
				return var5;
			} else {
				var4 = class411.method1899(var0);
				var5 = method398(var4, var0);
				return null != var5 ? var5 : null;
			}
		}
	}

	static class83 method398(int var0, int var1) {
		class83 var3 = (class83)field557.method1678((long)(var0 << 16));
		if (var3 != null) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = class4.field13.method28(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = class4.field13.method19(var5);
				if (var6 != null) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = method401(var6);
					if (null != var3) {
						field557.method1680(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}

	static class83 method401(byte[] var0) {
		class83 var2 = new class83();
		Buffer var3 = new Buffer(var0);
		var3.offset = var3.data.length - 2;
		int var4 = var3.readUnsignedShort();
		int var5 = var3.data.length - 2 - var4 - 12;
		var3.offset = var5;
		int var6 = var3.readInt();
		var2.field561 = var3.readUnsignedShort();
		var2.field555 = var3.readUnsignedShort();
		var2.field562 = var3.readUnsignedShort();
		var2.field563 = var3.readUnsignedShort();
		int var7 = var3.readUnsignedByte();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field559 = var2.method397(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.readUnsignedShort();
				class301 var10 = new class301(var9 > 0 ? class254.method1215(var9) : 1);
				var2.field559[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.readInt();
					int var12 = var3.readInt();
					var10.method1534(new class252(var12), (long)var11);
				}
			}
		}

		var3.offset = 0;
		var2.field556 = var3.readString();
		var2.field564 = new int[var6];
		var2.field558 = new int[var6];
		var2.field565 = new String[var6];

		for (var8 = 0; var3.offset < var5; var2.field564[var8++] = var9) {
			var9 = var3.readUnsignedShort();
			if (var9 == 3) {
				var2.field565[var8] = var3.readStringOrNull();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field558[var8] = var3.readInt();
			} else {
				var2.field558[var8] = var3.readUnsignedByte();
			}
		}

		return var2;
	}
}
