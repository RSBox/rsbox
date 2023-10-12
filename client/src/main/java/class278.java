public class class278 {
	static char[] field2138;
	static char[] field2139;
	static char[] field2140;
	static int[] field2141;

	static {
		field2139 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field2139[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2139[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2139[var0] = (char)(var0 + 48 - 52);
		}

		field2139[62] = '+';
		field2139[63] = '/';
		field2138 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field2138[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2138[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2138[var0] = (char)(var0 + 48 - 52);
		}

		field2138[62] = '*';
		field2138[63] = '-';
		field2140 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field2140[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2140[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2140[var0] = (char)(var0 + 48 - 52);
		}

		field2140[62] = '-';
		field2140[63] = '_';
		field2141 = new int[128];

		for (var0 = 0; var0 < field2141.length; ++var0) {
			field2141[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field2141[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field2141[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field2141[var0] = 52 + (var0 - 48);
		}

		int[] var2 = field2141;
		field2141[43] = 62;
		var2[42] = 62;
		int[] var1 = field2141;
		field2141[47] = 63;
		var1[45] = 63;
	}

	public static String method1472(byte[] var0) {
		int var3 = var0.length;
		StringBuilder var4 = new StringBuilder();

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(field2139[var6 >>> 2]);
			if (var5 < var3 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(field2139[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(field2139[(var7 & 15) << 2 | var8 >>> 6]).append(field2139[var8 & 63]);
				} else {
					var4.append(field2139[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(field2139[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		return var2;
	}
}
