import java.util.Comparator;

final class class322 implements Comparator {
	int method1585(class70 var1, class70 var2) {
		return var1.field446 < var2.field446 ? -1 : (var1.field446 == var2.field446 ? 0 : 1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1585((class70)var1, (class70)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
