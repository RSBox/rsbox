public class class337 {
	static int field2385;

	static int method1652(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var4;
	}
}
