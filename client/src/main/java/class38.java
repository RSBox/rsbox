public final class class38 {
	static long field187;

	public static final synchronized long method108() {
		long var1 = System.currentTimeMillis();
		if (var1 < class315.field2298) {
			field187 += class315.field2298 - var1;
		}

		class315.field2298 = var1;
		return var1 + field187;
	}
}
