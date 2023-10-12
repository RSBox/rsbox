public class class256 implements class477 {
	public static final class256 field1742;
	public static final class256 field1743;
	public static final class256 field1744;
	public static final class256 field1747;
	static final class256 field1741;
	static final class256 field1745;
	static final class256[] field1748;
	public final int field1746;

	static {
		field1743 = new class256(14, 0);
		field1741 = new class256(15, 4);
		field1742 = new class256(16, -2);
		field1747 = new class256(18, -2);
		field1744 = new class256(19, -2);
		field1745 = new class256(27, 0);
		field1748 = new class256[32];
		class256[] var0 = method1222();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field1748[var0[var1].field1746] = var0[var1];
		}

	}

	class256(int var1, int var2) {
		this.field1746 = var1;
	}

	static class256[] method1222() {
		return new class256[]{field1745, field1742, field1743, field1741, field1747, field1744};
	}
}
