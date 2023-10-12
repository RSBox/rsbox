public class class448 extends class147 {
	final boolean field2984;

	public class448(boolean var1) {
		this.field2984 = var1;
	}

	int method2107(class111 var1, class111 var2) {
		if (var1.field704 != 0 && var2.field704 != 0) {
			return this.field2984 ? var1.field703 - var2.field703 : var2.field703 - var1.field703;
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2107((class111)var1, (class111)var2);
	}
}
