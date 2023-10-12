public class class523 extends class147 {
	static class471 field4109;
	final boolean field4108;

	public class523(boolean var1) {
		this.field4108 = var1;
	}

	int method2454(class111 var1, class111 var2) {
		if (Client.field1832 == var1.field704 && var2.field704 == Client.field1832) {
			return this.field4108 ? var1.field703 - var2.field703 : var2.field703 - var1.field703;
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2454((class111)var1, (class111)var2);
	}
}
