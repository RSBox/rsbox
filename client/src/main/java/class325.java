public class class325 {
	public static final void method1587(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var7) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var6) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var5) {
				}
			}

		}
	}

	public static String method1586(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var9 = var0[var1];
			return var9 == null ? "null" : var9.toString();
		} else {
			int var4 = var1 + var2;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var4; ++var11) {
				CharSequence var8 = var0[var11];
				if (null == var8) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}
}
