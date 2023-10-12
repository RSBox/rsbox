import java.util.Comparator;

public class class167 implements Comparator {
	final boolean field1182;

	public class167(boolean var1) {
		this.field1182 = var1;
	}

	int method883(class284 var1, class284 var2) {
		return this.field1182 ? var1.method1490().method2400(var2.method1490()) : var2.method1490().method2400(var1.method1490());
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method883((class284)var1, (class284)var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
