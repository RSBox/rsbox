public final class class144 {
	public static byte[] method786(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}
}
