public class class161 extends class292 {
	public static class352 field1152;
	public static class352 field1161;
	public static class5 field1151;
	public static class5 field1153;
	static class507 field1159;
	static String field1165;
	int field1150;
	int field1164;
	public int field1154;
	public int field1155;
	public int field1156;
	public int field1157;
	public int field1158;
	public int field1160;
	public int field1162;
	public int field1163;

	static {
		field1152 = new class352(64);
		field1161 = new class352(64);
	}

	class161() {
		this.field1160 = 255;
		this.field1156 = 255;
		this.field1157 = -1;
		this.field1158 = 1;
		this.field1155 = 70;
		this.field1164 = -1;
		this.field1150 = -1;
		this.field1162 = 30;
		this.field1163 = 0;
	}

	void method874(Buffer var1) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.method873(var1, var3);
		}
	}

	void method873(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.field1160 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.field1156 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.field1157 = 0;
		} else if (var2 == 5) {
			this.field1155 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.field1164 = var1.method2482();
		} else if (var2 == 8) {
			this.field1150 = var1.method2482();
		} else if (var2 == 11) {
			this.field1157 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.field1162 = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.field1163 = var1.readUnsignedByte();
		}

	}

	public class42 method871() {
		if (this.field1164 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1161.method1678((long)this.field1164);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class168.method884(field1151, this.field1164, 0);
				if (var2 != null) {
					field1161.method1680(var2, (long)this.field1164);
				}

				return var2;
			}
		}
	}

	public class42 method872() {
		if (this.field1150 < 0) {
			return null;
		} else {
			class42 var2 = (class42)field1161.method1678((long)this.field1150);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class168.method884(field1151, this.field1150, 0);
				if (null != var2) {
					field1161.method1680(var2, (long)this.field1150);
				}

				return var2;
			}
		}
	}

	static final void method870(int var0, int var1) {
		if (Client.field1853 == 2) {
			Client.method1351((Client.field1896 - class80.selectedTileX << 7) + Client.field1942, (Client.field1857 - class425.selectedTileXYIdk << 7) + Client.field2109, Client.field1858 * 2);
			if (Client.field1948 > -1 && Client.field1846 % 20 < 10) {
				class108.field683[0].method159(var0 + Client.field1948 - 12, var1 + Client.field1966 - 28);
			}

		}
	}
}
