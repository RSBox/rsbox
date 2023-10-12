public class class90 extends class147 {
	final boolean field586;

	public class90(boolean var1) {
		this.field586 = var1;
	}

	int method417(class111 var1, class111 var2) {
		if (var1.field705 != var2.field705) {
			return this.field586 ? var1.field705 - var2.field705 : var2.field705 - var1.field705;
		} else {
			return this.method792(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method417((class111)var1, (class111)var2);
	}
}
