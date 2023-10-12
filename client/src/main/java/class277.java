public final class class277 {
	final int[] field2137;

	class277() {
		this.field2137 = new int[4096];
	}

	class277(int[] var1) {
		this.field2137 = var1;
	}

	final int method1470(int var1, int var2) {
		return this.field2137[var1 + var2 * 64];
	}

	static class277 method1471(byte[] var0) {
		return var0 == null ? new class277() : new class277(class412.method1902(var0).field205);
	}
}
