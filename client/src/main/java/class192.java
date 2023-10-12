public class class192 {
	public static final class192 field1325;
	static final class192 field1323;
	static final class192 field1324;
	public final int field1322;

	static {
		field1323 = new class192(0);
		field1325 = new class192(1);
		field1324 = new class192(2);
	}

	class192(int var1) {
		this.field1322 = var1;
	}

	public static class192 method945(int var0) {
		class192[] var2 = new class192[]{field1323, field1324, field1325};
		class192[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class192 var5 = var3[var4];
			if (var0 == var5.field1322) {
				return var5;
			}
		}

		return null;
	}
}
