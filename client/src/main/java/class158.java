public class class158 extends class292 {
	public static class352 field1114;
	static class352 field1090;
	static class352 field1109;
	class301 field1136;
	int field1091;
	int field1092;
	int field1093;
	int field1094;
	int field1098;
	int field1099;
	int field1100;
	int field1106;
	int field1115;
	int field1116;
	int field1119;
	int field1120;
	int field1121;
	int field1122;
	int field1124;
	int field1127;
	int field1131;
	int field1132;
	int field1138;
	int field1139;
	int[] field1089;
	int[] field1118;
	public boolean field1110;
	public boolean field1137;
	public int field1088;
	public int field1101;
	public int field1102;
	public int field1103;
	public int field1104;
	public int field1105;
	public int field1107;
	public int field1108;
	public int field1113;
	public int field1117;
	public int field1123;
	public int field1125;
	public int field1126;
	public int field1128;
	public int field1133;
	public int field1134;
	public int field1135;
	public int field1140;
	public int field1141;
	public String field1095;
	public String[] field1111;
	public String[] field1112;
	public short[] field1096;
	public short[] field1097;
	public short[] field1129;
	public short[] field1130;

	static {
		field1090 = new class352(64);
		field1109 = new class352(50);
		field1114 = new class352(200);
	}

	class158() {
		this.field1095 = class513.field3757;
		this.field1113 = 2000;
		this.field1117 = 0;
		this.field1088 = 0;
		this.field1102 = 0;
		this.field1103 = 0;
		this.field1125 = 0;
		this.field1105 = 0;
		this.field1101 = 1;
		this.field1107 = -1;
		this.field1108 = -1;
		this.field1126 = -1;
		this.field1110 = false;
		this.field1111 = new String[]{null, null, class513.field3750, null, null};
		this.field1112 = new String[]{null, null, null, null, class513.field3925};
		this.field1093 = -2;
		this.field1127 = -1;
		this.field1115 = -1;
		this.field1092 = 0;
		this.field1091 = -1;
		this.field1116 = -1;
		this.field1119 = 0;
		this.field1120 = -1;
		this.field1121 = -1;
		this.field1122 = -1;
		this.field1099 = -1;
		this.field1124 = -1;
		this.field1132 = -1;
		this.field1128 = -1;
		this.field1133 = -1;
		this.field1106 = 128;
		this.field1100 = 128;
		this.field1131 = 128;
		this.field1104 = 0;
		this.field1123 = 0;
		this.field1134 = 0;
		this.field1135 = 0;
		this.field1137 = false;
		this.field1138 = -1;
		this.field1139 = -1;
		this.field1140 = -1;
		this.field1141 = -1;
	}

	void method837() {
		if (this.field1105 == 1) {
			this.field1135 = 0;
		}

	}

	void method838(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method850(var1, var3);
		}
	}

	void method850(Buffer var1, int var2) {
		if (var2 == 1) {
			this.field1094 = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.field1095 = var1.readStringOrNull();
		} else if (var2 == 4) {
			this.field1113 = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.field1117 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.field1088 = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.field1103 = var1.readUnsignedShort();
			if (this.field1103 > 32767) {
				this.field1103 -= 65536;
			}
		} else if (var2 == 8) {
			this.field1125 = var1.readUnsignedShort();
			if (this.field1125 > 32767) {
				this.field1125 -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringOrNull();
		} else if (var2 == 11) {
			this.field1105 = 1;
		} else if (var2 == 12) {
			this.field1101 = var1.readInt();
		} else if (var2 == 13) {
			this.field1107 = var1.readUnsignedByte();
		} else if (var2 == 14) {
			this.field1108 = var1.readUnsignedByte();
		} else if (var2 == 16) {
			this.field1110 = true;
		} else if (var2 == 23) {
			this.field1127 = var1.readUnsignedShort();
			this.field1092 = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.field1115 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.field1091 = var1.readUnsignedShort();
			this.field1119 = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.field1116 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.field1126 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.field1111[var2 - 30] = var1.readStringOrNull();
			if (this.field1111[var2 - 30].equalsIgnoreCase(class513.field3752)) {
				this.field1111[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field1112[var2 - 35] = var1.readStringOrNull();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.readUnsignedByte();
				this.field1096 = new short[var4];
				this.field1097 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1096[var5] = (short)var1.readUnsignedShort();
					this.field1097[var5] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUnsignedByte();
				this.field1129 = new short[var4];
				this.field1130 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1129[var5] = (short)var1.readUnsignedShort();
					this.field1130[var5] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 42) {
				this.field1093 = var1.readByte();
			} else if (var2 == 65) {
				this.field1137 = true;
			} else if (var2 == 75) {
				this.field1135 = var1.readShort();
			} else if (var2 == 78) {
				this.field1120 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.field1121 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.field1122 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field1124 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field1099 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field1132 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.field1102 = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.field1128 = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.field1133 = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field1118 == null) {
					this.field1118 = new int[10];
					this.field1089 = new int[10];
				}

				this.field1118[var2 - 100] = var1.readUnsignedShort();
				this.field1089[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.field1106 = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.field1100 = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.field1131 = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.field1104 = var1.readByte();
			} else if (var2 == 114) {
				this.field1123 = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.field1134 = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.field1138 = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.field1139 = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.field1140 = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.field1141 = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.field1136 = class522.method2453(var1, this.field1136);
			}
		}

	}

	void method843(class158 var1, class158 var2) {
		this.field1094 = var1.field1094;
		this.field1113 = var1.field1113;
		this.field1117 = var1.field1117;
		this.field1088 = var1.field1088;
		this.field1102 = var1.field1102;
		this.field1103 = var1.field1103;
		this.field1125 = var1.field1125;
		this.field1096 = var1.field1096;
		this.field1097 = var1.field1097;
		this.field1129 = var1.field1129;
		this.field1130 = var1.field1130;
		this.field1095 = var2.field1095;
		this.field1110 = var2.field1110;
		this.field1101 = var2.field1101;
		this.field1105 = 1;
	}

	void method853(class158 var1, class158 var2) {
		this.field1094 = var1.field1094;
		this.field1113 = var1.field1113;
		this.field1117 = var1.field1117;
		this.field1088 = var1.field1088;
		this.field1102 = var1.field1102;
		this.field1103 = var1.field1103;
		this.field1125 = var1.field1125;
		this.field1096 = var2.field1096;
		this.field1097 = var2.field1097;
		this.field1129 = var2.field1129;
		this.field1130 = var2.field1130;
		this.field1095 = var2.field1095;
		this.field1110 = var2.field1110;
		this.field1105 = var2.field1105;
		this.field1107 = var2.field1107;
		this.field1108 = var2.field1108;
		this.field1126 = var2.field1126;
		this.field1127 = var2.field1127;
		this.field1115 = var2.field1115;
		this.field1120 = var2.field1120;
		this.field1091 = var2.field1091;
		this.field1116 = var2.field1116;
		this.field1121 = var2.field1121;
		this.field1122 = var2.field1122;
		this.field1099 = var2.field1099;
		this.field1124 = var2.field1124;
		this.field1132 = var2.field1132;
		this.field1134 = var2.field1134;
		this.field1111 = var2.field1111;
		this.field1135 = var2.field1135;
		this.field1112 = new String[5];
		if (null != var2.field1112) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field1112[var4] = var2.field1112[var4];
			}
		}

		this.field1112[4] = class513.field3877;
		this.field1101 = 0;
	}

	void method848(class158 var1, class158 var2) {
		this.field1094 = var1.field1094;
		this.field1113 = var1.field1113;
		this.field1117 = var1.field1117;
		this.field1088 = var1.field1088;
		this.field1102 = var1.field1102;
		this.field1103 = var1.field1103;
		this.field1125 = var1.field1125;
		this.field1096 = var1.field1096;
		this.field1097 = var1.field1097;
		this.field1129 = var1.field1129;
		this.field1130 = var1.field1130;
		this.field1105 = var1.field1105;
		this.field1095 = var2.field1095;
		this.field1101 = 0;
		this.field1110 = false;
		this.field1137 = false;
	}

	public final class239 method840(int var1) {
		int var4;
		if (null != this.field1118 && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1089[var4] && this.field1089[var4] != 0) {
					var3 = this.field1118[var4];
				}
			}

			if (var3 != -1) {
				return method857(var3).method840(1);
			}
		}

		class239 var5 = class239.method1092(class380.field2623, this.field1094, 0);
		if (null == var5) {
			return null;
		} else {
			if (this.field1106 != 128 || this.field1100 != 128 || this.field1131 != 128) {
				var5.method1112(this.field1106, this.field1100, this.field1131);
			}

			if (null != this.field1096) {
				for (var4 = 0; var4 < this.field1096.length; ++var4) {
					var5.method1116(this.field1096[var4], this.field1097[var4]);
				}
			}

			if (this.field1129 != null) {
				for (var4 = 0; var4 < this.field1129.length; ++var4) {
					var5.method1101(this.field1129[var4], this.field1130[var4]);
				}
			}

			return var5;
		}
	}

	public final class490 method849(int var1) {
		if (null != this.field1118 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1089[var4] && this.field1089[var4] != 0) {
					var3 = this.field1118[var4];
				}
			}

			if (var3 != -1) {
				return method857(var3).method849(1);
			}
		}

		class490 var6 = (class490)field1109.method1678((long)this.field1098);
		if (var6 != null) {
			return var6;
		} else {
			class239 var7 = class239.method1092(class380.field2623, this.field1094, 0);
			if (var7 == null) {
				return null;
			} else {
				if (this.field1106 != 128 || this.field1100 != 128 || this.field1131 != 128) {
					var7.method1112(this.field1106, this.field1100, this.field1131);
				}

				int var5;
				if (null != this.field1096) {
					for (var5 = 0; var5 < this.field1096.length; ++var5) {
						var7.method1116(this.field1096[var5], this.field1097[var5]);
					}
				}

				if (null != this.field1129) {
					for (var5 = 0; var5 < this.field1129.length; ++var5) {
						var7.method1101(this.field1129[var5], this.field1130[var5]);
					}
				}

				var6 = var7.method1107(64 + this.field1104, 768 + this.field1123, -50, -10, -50);
				var6.field3454 = true;
				field1109.method1680(var6, (long)this.field1098);
				return var6;
			}
		}
	}

	public class158 method841(int var1) {
		if (this.field1118 != null && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1089[var4] && this.field1089[var4] != 0) {
					var3 = this.field1118[var4];
				}
			}

			if (var3 != -1) {
				return method857(var3);
			}
		}

		return this;
	}

	public final boolean method842(int var1) {
		int var3 = this.field1127;
		int var4 = this.field1115;
		int var5 = this.field1120;
		if (var1 == 1) {
			var3 = this.field1091;
			var4 = this.field1116;
			var5 = this.field1121;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!class380.field2623.method16(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !class380.field2623.method16(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !class380.field2623.method16(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	public final class239 method852(int var1) {
		int var3 = this.field1127;
		int var4 = this.field1115;
		int var5 = this.field1120;
		if (var1 == 1) {
			var3 = this.field1091;
			var4 = this.field1116;
			var5 = this.field1121;
		}

		if (var3 == -1) {
			return null;
		} else {
			class239 var6 = class239.method1092(class380.field2623, var3, 0);
			if (var4 != -1) {
				class239 var7 = class239.method1092(class380.field2623, var4, 0);
				if (var5 != -1) {
					class239 var8 = class239.method1092(class380.field2623, var5, 0);
					class239[] var9 = new class239[]{var6, var7, var8};
					var6 = new class239(var9, 3);
				} else {
					class239[] var11 = new class239[]{var6, var7};
					var6 = new class239(var11, 2);
				}
			}

			if (var1 == 0 && this.field1092 != 0) {
				var6.method1111(0, this.field1092, 0);
			}

			if (var1 == 1 && this.field1119 != 0) {
				var6.method1111(0, this.field1119, 0);
			}

			int var10;
			if (null != this.field1096) {
				for (var10 = 0; var10 < this.field1096.length; ++var10) {
					var6.method1116(this.field1096[var10], this.field1097[var10]);
				}
			}

			if (null != this.field1129) {
				for (var10 = 0; var10 < this.field1129.length; ++var10) {
					var6.method1101(this.field1129[var10], this.field1130[var10]);
				}
			}

			return var6;
		}
	}

	public final boolean method844(int var1) {
		int var3 = this.field1122;
		int var4 = this.field1099;
		if (var1 == 1) {
			var3 = this.field1124;
			var4 = this.field1132;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class380.field2623.method16(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class380.field2623.method16(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final class239 method845(int var1) {
		int var3 = this.field1122;
		int var4 = this.field1099;
		if (var1 == 1) {
			var3 = this.field1124;
			var4 = this.field1132;
		}

		if (var3 == -1) {
			return null;
		} else {
			class239 var5 = class239.method1092(class380.field2623, var3, 0);
			if (var4 != -1) {
				class239 var6 = class239.method1092(class380.field2623, var4, 0);
				class239[] var7 = new class239[]{var5, var6};
				var5 = new class239(var7, 2);
			}

			int var8;
			if (this.field1096 != null) {
				for (var8 = 0; var8 < this.field1096.length; ++var8) {
					var5.method1116(this.field1096[var8], this.field1097[var8]);
				}
			}

			if (null != this.field1129) {
				for (var8 = 0; var8 < this.field1129.length; ++var8) {
					var5.method1101(this.field1129[var8], this.field1130[var8]);
				}
			}

			return var5;
		}
	}

	public int method839(int var1, int var2) {
		return class522.method2452(this.field1136, var1, var2);
	}

	public String method851(int var1, String var2) {
		return class522.method2451(this.field1136, var1, var2);
	}

	public int method854() {
		if (this.field1093 != -1 && null != this.field1112) {
			if (this.field1093 >= 0) {
				return this.field1112[this.field1093] != null ? this.field1093 : -1;
			} else {
				return class513.field3925.equalsIgnoreCase(this.field1112[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	boolean method846() {
		return null != this.field1097;
	}

	boolean method847() {
		return null != this.field1130;
	}

	public static void method855(class5 var0, class5 var1, boolean var2, class282 var3) {
		class254.field1724 = var0;
		class380.field2623 = var1;
		class12.field68 = var2;
		class216.field1411 = class254.field1724.method23(10);
		class202.field1360 = var3;
	}

	public static class158 method857(int var0) {
		class158 var2 = (class158)field1090.method1678((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class254.field1724.method39(10, var0);
			var2 = new class158();
			var2.field1098 = var0;
			if (null != var3) {
				var2.method838(new Buffer(var3));
			}

			var2.method837();
			if (var2.field1133 != -1) {
				var2.method843(method857(var2.field1133), method857(var2.field1128));
			}

			if (var2.field1139 != -1) {
				var2.method853(method857(var2.field1139), method857(var2.field1138));
			}

			if (var2.field1141 != -1) {
				var2.method848(method857(var2.field1141), method857(var2.field1140));
			}

			if (!class12.field68 && var2.field1110) {
				if (var2.field1133 == -1 && var2.field1139 == -1 && var2.field1141 == -1) {
					var2.field1095 = var2.field1095 + class513.field4007;
				}

				var2.field1137 = false;

				int var4;
				for (var4 = 0; var4 < var2.field1111.length; ++var4) {
					var2.field1111[var4] = null;
				}

				for (var4 = 0; var4 < var2.field1112.length; ++var4) {
					if (var4 != 4) {
						var2.field1112[var4] = null;
					}
				}

				var2.field1093 = -2;
				var2.field1134 = 0;
				if (var2.field1136 != null) {
					boolean var7 = false;

					for (class359 var5 = var2.field1136.method1536(); null != var5; var5 = var2.field1136.method1537()) {
						class47 var6 = class47.method197((int)var5.field2472);
						if (var6.field231) {
							var5.method1719();
						} else {
							var7 = true;
						}
					}

					if (!var7) {
						var2.field1136 = null;
					}
				}
			}

			field1090.method1680(var2, (long)var0);
			return var2;
		}
	}

	public static final class42 method856(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var3 << 42);
		class42 var9;
		if (!var5) {
			var9 = (class42)field1114.method1678(var7);
			if (var9 != null) {
				return var9;
			}
		}

		class158 var10 = method857(var0);
		if (var1 > 1 && var10.field1118 != null) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field1089[var12] && var10.field1089[var12] != 0) {
					var11 = var10.field1118[var12];
				}
			}

			if (var11 != -1) {
				var10 = method857(var11);
			}
		}

		class490 var21 = var10.method849(1);
		if (var21 == null) {
			return null;
		} else {
			class42 var22 = null;
			if (var10.field1133 != -1) {
				var22 = method856(var10.field1128, 10, 1, 0, 0, true);
				if (null == var22) {
					return null;
				}
			} else if (var10.field1139 != -1) {
				var22 = method856(var10.field1138, var1, var2, var3, 0, false);
				if (null == var22) {
					return null;
				}
			} else if (var10.field1141 != -1) {
				var22 = method856(var10.field1140, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var13 = class433.field2898;
			int var14 = class433.field2894;
			int var15 = class433.field2896;
			float[] var16 = class433.field2897;
			int[] var17 = new int[4];
			class433.method1960(var17);
			var9 = new class42(36, 32);
			class105.method483(var9.field205, 36, 32, (float[])null);
			class433.method1962();
			class105.method488();
			class105.method487(16, 16);
			class105.field668.field1728 = false;
			if (var10.field1141 != -1) {
				var22.method159(0, 0);
			}

			int var18 = var10.field1113;
			if (var5) {
				var18 = (int)(1.5D * (double)var18);
			} else if (var2 == 2) {
				var18 = (int)(1.04D * (double)var18);
			}

			int var19 = var18 * class105.field670[var10.field1117] >> 16;
			int var20 = var18 * class105.field671[var10.field1117] >> 16;
			var21.method2261();
			var21.method2278(0, var10.field1088, var10.field1102, var10.field1117, var10.field1103, var10.field1125 + var19 + var21.field3161 / 2, var20 + var10.field1125);
			if (var10.field1139 != -1) {
				var22.method159(0, 0);
			}

			if (var2 >= 1) {
				var9.method169(1);
			}

			if (var2 >= 2) {
				var9.method169(16777215);
			}

			if (var3 != 0) {
				var9.method182(var3);
			}

			class105.method483(var9.field205, 36, 32, (float[])null);
			if (var10.field1133 != -1) {
				var22.method159(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var10.field1105 == 1) {
				class202.field1360.method1037(method860(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				field1114.method1680(var9, var7);
			}

			class105.method483(var13, var14, var15, var16);
			class433.method1961(var17);
			class105.method488();
			class105.field668.field1728 = true;
			return var9;
		}
	}

	static final String method860(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class513.field4019 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class513.field4056 + "</col>";
		}
	}

	public static void method858() {
		field1090.method1679();
		field1109.method1679();
		field1114.method1679();
	}

	public static void method859(boolean var0) {
		if (class12.field68 != var0) {
			method858();
			class12.field68 = var0;
		}

	}
}
