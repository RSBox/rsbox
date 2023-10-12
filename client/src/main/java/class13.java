public class class13 {
	public static final class13 field69;
	public static final class13 field70;
	public static final class13 field74;
	static class66 field75;
	final int field71;
	final int field72;
	final int field73;

	static {
		field74 = new class13(1, 0, 4);
		field69 = new class13(0, 1, 2);
		field70 = new class13(2, 2, 0);
	}

	class13(int var1, int var2, int var3) {
		this.field71 = var1;
		this.field72 = var2;
		this.field73 = var3;
	}

	boolean method60(float var1) {
		return var1 >= (float)this.field73;
	}

	static class13 method59(int var0) {
		class13[] var2 = new class13[]{field69, field70, field74};
		class13[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class13 var5 = var3[var4];
			if (var0 == var5.field72) {
				return var5;
			}
		}

		return null;
	}
}
