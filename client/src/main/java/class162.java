public class class162 {
	static final int[] field1166;
	static final int[] field1167;

	static {
		field1166 = new int[2048];
		field1167 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field1166[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field1167[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
