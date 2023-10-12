import java.util.Comparator;

public class class36 implements Comparator {
	final boolean field178;

	public class36(boolean var1) {
		this.field178 = var1;
	}

	int method107(class284 var1, class284 var2) {
		return this.field178 ? var1.method1492(var2) : var2.method1492(var1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method107((class284)var1, (class284)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
