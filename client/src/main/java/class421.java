public class class421 extends class292 {
	class369[] field2857;

	class421(class5 var1, class5 var2, int var3, boolean var4) {
		class69 var5 = new class69();
		int var6 = var1.method23(var3);
		this.field2857 = new class369[var6];
		int[] var7 = var1.method22(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method39(var3, var7[var8]);
			class307 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (class307 var12 = (class307)var5.method327(); null != var12; var12 = (class307)var5.method331()) {
				if (var12.field2229 == var11) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13 = var2.method37(var11, 0);
				var10 = new class307(var11, var13);
				var5.method323(var10);
			}

			this.field2857[var7[var8]] = new class369(var9, var10);
		}

	}

	public boolean method1922(int var1) {
		return this.field2857[var1].field2555;
	}

	public static class421 method1923(class5 var0, class5 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method22(var2);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method37(var2, var6[var7]);
			if (null == var8) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var1.method37(var9, 0);
				if (null == var10) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new class421(var0, var1, var2, false);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
