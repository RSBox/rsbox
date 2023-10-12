public final class class206 {
	static class230 field1377;

	public static int method974(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte)var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte)(192 | var7 >> 6);
				var0[var5++] = (byte)(128 | var7 & '?');
			} else {
				var0[var5++] = (byte)(224 | var7 >> '\f');
				var0[var5++] = (byte)(128 | var7 >> 6 & 63);
				var0[var5++] = (byte)(128 | var7 & '?');
			}
		}

		return var5 - var1;
	}

	public static String method973(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;
		int var6 = var1;

		int var9;
		for (int var7 = var1 + var2; var6 < var7; var4[var5++] = (char)var9) {
			int var8 = var0[var6++] & 255;
			if (var8 < 128) {
				if (var8 == 0) {
					var9 = 65533;
				} else {
					var9 = var8;
				}
			} else if (var8 < 192) {
				var9 = 65533;
			} else if (var8 < 224) {
				if (var6 < var7 && (var0[var6] & 192) == 128) {
					var9 = (var8 & 31) << 6 | var0[var6++] & 63;
					if (var9 < 128) {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else if (var8 < 240) {
				if (var6 + 1 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128) {
					var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
					if (var9 < 2048) {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else if (var8 < 248) {
				if (var6 + 2 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128 && (var0[var6 + 2] & 192) == 128) {
					var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
					if (var9 >= 65536 && var9 <= 1114111) {
						var9 = 65533;
					} else {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else {
				var9 = 65533;
			}
		}

		return new String(var4, 0, var5);
	}
}
