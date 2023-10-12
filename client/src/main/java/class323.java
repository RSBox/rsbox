public class class323 implements Runnable {
	static class143 field2341;
	static class198 field2337;
	static int field2339;
	static int field2340;
	public volatile class67[] field2338;

	public class323() {
		this.field2338 = new class67[2];
	}

	@Override
	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class67 var2 = this.field2338[var1];
				if (var2 != null) {
					var2.method304();
				}
			}
		} catch (Exception var3) {
			class2.method1((String)null, var3);
		}

	}
}
