public class class170 {
	static final char[] field1199;
	static final char[] field1200;

	static {
		field1199 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
		field1200 = new char[]{'[', ']', '#'};
	}

	static final boolean method896(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class385.method1808(var0)) {
			return true;
		} else {
			char[] var2 = field1199;

			int var3;
			char var4;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var4 == var0) {
					return true;
				}
			}

			var2 = field1200;

			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var4 == var0) {
					return true;
				}
			}

			return false;
		}
	}

	static final boolean method895(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}
}
