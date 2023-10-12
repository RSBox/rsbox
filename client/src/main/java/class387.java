public class class387 extends class147 {
	final boolean field2657;

	public class387(boolean var1) {
		this.field2657 = var1;
	}

	int method1822(class111 var1, class111 var2) {
		if (Client.field1832 == var1.field704 && var2.field704 == Client.field1832) {
			return this.field2657 ? var1.method1490().method2400(var2.method1490()) : var2.method1490().method2400(var1.method1490());
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1822((class111)var1, (class111)var2);
	}
}
