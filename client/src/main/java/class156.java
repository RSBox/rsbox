public class class156 extends class292 {
	public static class352 field1062;
	public static class352 field1063;
	public static class352 field1075;
	static class5 field1060;
	static class5 field1073;
	int field1061;
	int field1070;
	int field1071;
	int field1076;
	int field1077;
	int field1079;
	int field1080;
	String field1068;
	public int field1064;
	public int field1065;
	public int field1066;
	public int field1067;
	public int field1069;
	public int field1072;
	public int field1074;
	public int[] field1078;

	static {
		field1062 = new class352(64);
		field1063 = new class352(64);
		field1075 = new class352(20);
	}

	class156() {
		this.field1061 = -1;
		this.field1066 = 16777215;
		this.field1067 = 70;
		this.field1070 = -1;
		this.field1077 = -1;
		this.field1076 = -1;
		this.field1071 = -1;
		this.field1072 = 0;
		this.field1064 = 0;
		this.field1074 = -1;
		this.field1068 = "";
		this.field1069 = -1;
		this.field1065 = 0;
		this.field1079 = -1;
		this.field1080 = -1;
	}

	void method820(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method826(var1, var3);
		}
	}

	void method826(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field1061 = var1.method2482();
		} else if (var2 == 2) {
			this.field1066 = var1.readUnsignedMedium();
		} else if (var2 == 3) {
			this.field1070 = var1.method2482();
		} else if (var2 == 4) {
			this.field1076 = var1.method2482();
		} else if (var2 == 5) {
			this.field1077 = var1.method2482();
		} else if (var2 == 6) {
			this.field1071 = var1.method2482();
		} else if (var2 == 7) {
			this.field1072 = var1.readShort();
		} else if (var2 == 8) {
			this.field1068 = var1.readJagexString();
		} else if (var2 == 9) {
			this.field1067 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1064 = var1.readShort();
		} else if (var2 == 11) {
			this.field1074 = 0;
		} else if (var2 == 12) {
			this.field1069 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1065 = var1.readShort();
		} else if (var2 == 14) {
			this.field1074 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.field1079 = var1.readUnsignedShort();
			if (this.field1079 == 65535) {
				this.field1079 = -1;
			}

			this.field1080 = var1.readUnsignedShort();
			if (this.field1080 == 65535) {
				this.field1080 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.readUnsignedShort();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			int var5 = var1.readUnsignedByte();
			this.field1078 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field1078[var6] = var1.readUnsignedShort();
				if (this.field1078[var6] == 65535) {
					this.field1078[var6] = -1;
				}
			}

			this.field1078[var5 + 1] = var4;
		}

	}

	public final class156 method821() {
		int var2 = -1;
		if (this.field1079 != -1) {
			var2 = class119.method580(this.field1079);
		} else if (this.field1080 != -1) {
			var2 = class119.field786[this.field1080];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field1078.length - 1) {
			var3 = this.field1078[var2];
		} else {
			var3 = this.field1078[this.field1078.length - 1];
		}

		return var3 != -1 ? method830(var3) : null;
	}

	public String method827(int var1) {
		String var3 = this.field1068;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + class385.method1819(var1, false) + var3.substring(var4 + 2);
		}
	}

	public class42 method822() {
		if (this.field1070 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1063.method1678((long)this.field1070);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class168.method884(field1060, this.field1070, 0);
				if (var2 != null) {
					field1063.method1680(var2, (long)this.field1070);
				}

				return var2;
			}
		}
	}

	public class42 method823() {
		if (this.field1077 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1063.method1678((long)this.field1077);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class168.method884(field1060, this.field1077, 0);
				if (null != var2) {
					field1063.method1680(var2, (long)this.field1077);
				}

				return var2;
			}
		}
	}

	public class42 method824() {
		if (this.field1076 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1063.method1678((long)this.field1076);
			if (null != var2) {
				return var2;
			} else {
				var2 = class168.method884(field1060, this.field1076, 0);
				if (var2 != null) {
					field1063.method1680(var2, (long)this.field1076);
				}

				return var2;
			}
		}
	}

	public class42 method825() {
		if (this.field1071 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1063.method1678((long)this.field1071);
			if (null != var2) {
				return var2;
			} else {
				var2 = class168.method884(field1060, this.field1071, 0);
				if (null != var2) {
					field1063.method1680(var2, (long)this.field1071);
				}

				return var2;
			}
		}
	}

	public class282 method828() {
		if (this.field1061 == -1) {
			return null;
		} else {
			class282 var2 = (class282)field1075.method1678((long)this.field1061);
			if (var2 != null) {
				return var2;
			} else {
				class5 var4 = field1060;
				class5 var5 = class315.field2299;
				int var6 = this.field1061;
				class282 var3;
				if (!class168.method887(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.method39(var6, 0);
					class282 var7;
					if (null == var8) {
						var7 = null;
					} else {
						class282 var9 = new class282(var8, class498.field3673, class442.field2971, class28.field136, class168.field1184, class205.field1376, class299.field2203);
						class345.method1664();
						var7 = var9;
					}

					var3 = var7;
				}

				if (null != var3) {
					field1075.method1680(var3, (long)this.field1061);
				}

				return var3;
			}
		}
	}

	public static void method829(class5 var0, class5 var1, class5 var2) {
		field1073 = var0;
		field1060 = var1;
		class315.field2299 = var2;
	}

	public static class156 method830(int var0) {
		class156 var2 = (class156)field1062.method1678((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1073.method39(32, var0);
			var2 = new class156();
			if (var3 != null) {
				var2.method820(new Buffer(var3));
			}

			field1062.method1680(var2, (long)var0);
			return var2;
		}
	}
}
