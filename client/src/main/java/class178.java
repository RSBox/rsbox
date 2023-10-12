import java.lang.management.GarbageCollectorMXBean;
import java.util.Comparator;

final class class178 implements Comparator {
	static GarbageCollectorMXBean field1229;

	int method926(class70 var1, class70 var2) {
		return var1.field443.field3372 < var2.field443.field3372 ? -1 : (var1.field443.field3372 == var2.field443.field3372 ? 0 : 1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method926((class70)var1, (class70)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
