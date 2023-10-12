public class class233 extends class147 {
	static class426[] field1534;
	static String field1535;
	static Thread field1536;
	final boolean field1533;

	public class233(boolean var1) {
		this.field1533 = var1;
	}

	int method1076(class111 var1, class111 var2) {
		if (var2.field704 != var1.field704) {
			return this.field1533 ? var1.field704 - var2.field704 : var2.field704 - var1.field704;
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1076((class111)var1, (class111)var2);
	}
}
