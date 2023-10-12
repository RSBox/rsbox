public class class91 extends class147 {
	final boolean field587;

	public class91(boolean var1) {
		this.field587 = var1;
	}

	int method418(class111 var1, class111 var2) {
		if (var1.field704 != 0) {
			if (var2.field704 == 0) {
				return this.field587 ? -1 : 1;
			}
		} else if (var2.field704 != 0) {
			return this.field587 ? 1 : -1;
		}

		return this.method792(var1, var2);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method418((class111)var1, (class111)var2);
	}
}
