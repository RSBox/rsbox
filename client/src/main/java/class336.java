public class class336 extends class458 {
	long field2384;

	class336() {
		this.field2384 = System.nanoTime();
	}

	@Override
	public void method2143() {
		this.field2384 = System.nanoTime();
	}

	@Override
	public int method2144(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field2384 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class325.method1587(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field2384 < var8); this.field2384 += (long)var1 * 1000000L) {
			++var10;
		}

		if (this.field2384 < var8) {
			this.field2384 = var8;
		}

		return var10;
	}
}
