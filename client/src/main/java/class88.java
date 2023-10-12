public class class88 {
	public static final char[] field582;

	static {
		field582 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
	}

	static char method413(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	public static char method412(byte var0) {
		int var2 = var0 & 255;
		if (var2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var2, 16));
		} else {
			if (var2 >= 128 && var2 < 160) {
				char var3 = field582[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}

				var2 = var3;
			}

			return (char)var2;
		}
	}

	public static int method410(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - 0;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(0 + var7);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var4 + var7] = -128;
				} else if (var8 == 8218) {
					var3[var7 + var4] = -126;
				} else if (var8 == 402) {
					var3[var7 + var4] = -125;
				} else if (var8 == 8222) {
					var3[var4 + var7] = -124;
				} else if (var8 == 8230) {
					var3[var4 + var7] = -123;
				} else if (var8 == 8224) {
					var3[var7 + var4] = -122;
				} else if (var8 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var8 == 710) {
					var3[var4 + var7] = -120;
				} else if (var8 == 8240) {
					var3[var7 + var4] = -119;
				} else if (var8 == 352) {
					var3[var7 + var4] = -118;
				} else if (var8 == 8249) {
					var3[var7 + var4] = -117;
				} else if (var8 == 338) {
					var3[var4 + var7] = -116;
				} else if (var8 == 381) {
					var3[var4 + var7] = -114;
				} else if (var8 == 8216) {
					var3[var7 + var4] = -111;
				} else if (var8 == 8217) {
					var3[var4 + var7] = -110;
				} else if (var8 == 8220) {
					var3[var7 + var4] = -109;
				} else if (var8 == 8221) {
					var3[var4 + var7] = -108;
				} else if (var8 == 8226) {
					var3[var7 + var4] = -107;
				} else if (var8 == 8211) {
					var3[var7 + var4] = -106;
				} else if (var8 == 8212) {
					var3[var4 + var7] = -105;
				} else if (var8 == 732) {
					var3[var4 + var7] = -104;
				} else if (var8 == 8482) {
					var3[var7 + var4] = -103;
				} else if (var8 == 353) {
					var3[var7 + var4] = -102;
				} else if (var8 == 8250) {
					var3[var4 + var7] = -101;
				} else if (var8 == 339) {
					var3[var7 + var4] = -100;
				} else if (var8 == 382) {
					var3[var4 + var7] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var4 + var7] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}

	public static String method411(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var1 + var6] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = field582[var7 - 128];
					if (var8 == 0) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
