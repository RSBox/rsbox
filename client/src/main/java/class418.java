import java.util.Comparator;

final class class418 implements Comparator {
	int method1919(class70 var1, class70 var2) {
		return var1.field442 < var2.field442 ? -1 : (var2.field442 == var1.field442 ? 0 : 1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1919((class70)var1, (class70)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
