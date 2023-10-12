import java.util.Comparator;

public abstract class class147 implements Comparator {
	static boolean[] field1024;
	static int field1026;
	Comparator field1025;

	protected class147() {
	}

	final void method791(Comparator var1) {
		if (this.field1025 == null) {
			this.field1025 = var1;
		} else if (this.field1025 instanceof class147) {
			((class147)this.field1025).method791(var1);
		}

	}

	protected final int method792(class284 var1, class284 var2) {
		return null == this.field1025 ? 0 : this.field1025.compare(var1, var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
