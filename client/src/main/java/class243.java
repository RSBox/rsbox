import java.lang.ref.SoftReference;

public class class243 extends class297 {
	SoftReference field1620;

	class243(Object var1, int var2) {
		super(var2);
		this.field1620 = new SoftReference(var1);
	}

	@Override
	Object method1529() {
		return this.field1620.get();
	}

	@Override
	boolean method1530() {
		return true;
	}
}
