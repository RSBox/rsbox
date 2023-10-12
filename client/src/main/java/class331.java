public class class331 extends class147 {
	static class282 field2352;
	static int[][][] field2353;
	final boolean field2354;

	public class331(boolean var1) {
		this.field2354 = var1;
	}

	int method1597(class111 var1, class111 var2) {
		if (var1.field704 != 0 && var2.field704 != 0) {
			return this.field2354 ? var1.method1490().method2400(var2.method1490()) : var2.method1490().method2400(var1.method1490());
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1597((class111)var1, (class111)var2);
	}
}
