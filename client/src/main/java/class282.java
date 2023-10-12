public final class class282 extends class229 {
	public class282(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public class282(byte[] var1) {
		super(var1);
	}

	@Override
	final void method1057(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class433.field2894;
		int var8 = class433.field2894 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class433.field2899) {
			var11 = class433.field2899 - var3;
			var5 -= var11;
			var3 = class433.field2899;
			var10 = 0 + var11 * var4;
			var7 += var11 * class433.field2894;
		}

		if (var3 + var5 > class433.field2895) {
			var5 -= var3 + var5 - class433.field2895;
		}

		if (var2 < class433.field2900) {
			var11 = class433.field2900 - var2;
			var4 -= var11;
			var2 = class433.field2900;
			var10 += var11;
			var7 += var11;
			var9 = 0 + var11;
			var8 += var11;
		}

		if (var2 + var4 > class433.field2901) {
			var11 = var2 + var4 - class433.field2901;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method1051(class433.field2898, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@Override
	final void method1052(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class433.field2894;
		int var9 = class433.field2894 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class433.field2899) {
			var12 = class433.field2899 - var3;
			var5 -= var12;
			var3 = class433.field2899;
			var11 = 0 + var12 * var4;
			var8 += var12 * class433.field2894;
		}

		if (var3 + var5 > class433.field2895) {
			var5 -= var3 + var5 - class433.field2895;
		}

		if (var2 < class433.field2900) {
			var12 = class433.field2900 - var2;
			var4 -= var12;
			var2 = class433.field2900;
			var11 += var12;
			var8 += var12;
			var10 = 0 + var12;
			var9 += var12;
		}

		if (var2 + var4 > class433.field2901) {
			var12 = var2 + var4 - class433.field2901;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method1056(class433.field2898, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
