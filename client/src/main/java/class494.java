public abstract class class494 {
	static class198 field3514;

	class494() {
	}

	abstract byte[] method2299();

	public abstract void method2300(byte[] var1);

	public static byte[] method2301(Object var0, boolean var1) {
		if (null == var0) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[])((byte[])var0);
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof class494) {
			class494 var3 = (class494)var0;
			return var3.method2299();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
