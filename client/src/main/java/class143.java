public class class143 {
	static final class143 field1000;
	static final class143 field996;
	static final class143 field997;
	static final class143 field999;
	final int field1001;
	public final String field998;

	static {
		field996 = new class143("LIVE", 0);
		field997 = new class143("BUILDLIVE", 3);
		field1000 = new class143("RC", 1);
		field999 = new class143("WIP", 2);
	}

	class143(String var1, int var2) {
		this.field998 = var1;
		this.field1001 = var2;
	}

	static class143[] method784() {
		return new class143[]{field996, field997, field1000, field999};
	}

	public static class143 method785(int var0) {
		class143[] var2 = method784();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class143 var4 = var2[var3];
			if (var0 == var4.field1001) {
				return var4;
			}
		}

		return null;
	}
}
