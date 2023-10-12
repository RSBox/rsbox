import java.util.Comparator;

final class class521 implements Comparator {
	int method2450(class70 var1, class70 var2) {
		return var1.field443.field3374 < var2.field443.field3374 ? -1 : (var1.field443.field3374 == var2.field443.field3374 ? 0 : 1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2450((class70)var1, (class70)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
