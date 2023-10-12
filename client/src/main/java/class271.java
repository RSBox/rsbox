import java.util.Comparator;

class class271 implements Comparator {
	// $FF: synthetic field
	final class157 this$0;

	class271(class157 var1) {
		this.this$0 = var1;
	}

	int method1264(class360 var1, class360 var2) {
		if (var1.field2476 > var2.field2476) {
			return 1;
		} else {
			return var1.field2476 < var2.field2476 ? -1 : 0;
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1264((class360)var1, (class360)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
