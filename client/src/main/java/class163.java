public class class163 {
	static final int[] field1168;
	static final int[] field1169;

	static {
		field1168 = new int[16384];
		field1169 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field1168[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field1169[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	public static float method876(int var0) {
		var0 &= 16383;
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F));
	}

	public static int method875(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	public static int method878(int var0) {
		return field1168[var0 & 16383];
	}

	public static int method877(int var0) {
		return field1169[var0 & 16383];
	}
}
