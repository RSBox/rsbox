public class class380 {
	public static class59 field2622;
	static class5 field2623;

	public static int method1791(Buffer var0, String var1) {
		int var3 = var0.offset;
		int var5 = var1.length();
		byte[] var6 = new byte[var5];

		for (int var7 = 0; var7 < var5; ++var7) {
			char var8 = var1.charAt(var7);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var6[var7] = -128;
				} else if (var8 == 8218) {
					var6[var7] = -126;
				} else if (var8 == 402) {
					var6[var7] = -125;
				} else if (var8 == 8222) {
					var6[var7] = -124;
				} else if (var8 == 8230) {
					var6[var7] = -123;
				} else if (var8 == 8224) {
					var6[var7] = -122;
				} else if (var8 == 8225) {
					var6[var7] = -121;
				} else if (var8 == 710) {
					var6[var7] = -120;
				} else if (var8 == 8240) {
					var6[var7] = -119;
				} else if (var8 == 352) {
					var6[var7] = -118;
				} else if (var8 == 8249) {
					var6[var7] = -117;
				} else if (var8 == 338) {
					var6[var7] = -116;
				} else if (var8 == 381) {
					var6[var7] = -114;
				} else if (var8 == 8216) {
					var6[var7] = -111;
				} else if (var8 == 8217) {
					var6[var7] = -110;
				} else if (var8 == 8220) {
					var6[var7] = -109;
				} else if (var8 == 8221) {
					var6[var7] = -108;
				} else if (var8 == 8226) {
					var6[var7] = -107;
				} else if (var8 == 8211) {
					var6[var7] = -106;
				} else if (var8 == 8212) {
					var6[var7] = -105;
				} else if (var8 == 732) {
					var6[var7] = -104;
				} else if (var8 == 8482) {
					var6[var7] = -103;
				} else if (var8 == 353) {
					var6[var7] = -102;
				} else if (var8 == 8250) {
					var6[var7] = -101;
				} else if (var8 == 339) {
					var6[var7] = -100;
				} else if (var8 == 382) {
					var6[var7] = -98;
				} else if (var8 == 376) {
					var6[var7] = -97;
				} else {
					var6[var7] = 63;
				}
			} else {
				var6[var7] = (byte)var8;
			}
		}

		var0.writeSmartByteShort(var6.length);
		var0.offset += field2622.method255(var6, 0, var6.length, var0.data, var0.offset);
		return var0.offset - var3;
	}

	public static String method1792(Buffer var0) {
		String var2;
		try {
			int var3 = var0.method2522();
			if (var3 > 32767) {
				var3 = 32767;
			}

			byte[] var4 = new byte[var3];
			var0.offset += field2622.method254(var0.data, var0.offset, var4, 0, var3);
			String var5 = class88.method411(var4, 0, var3);
			var2 = var5;
		} catch (Exception var6) {
			var2 = "Cabbage";
		}

		return var2;
	}
}
