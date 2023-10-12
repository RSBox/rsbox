import java.util.Iterator;

public class class530 implements Iterable {
	class292 field4143;
	public class292 field4142;

	public class530() {
		this.field4142 = new class292();
		this.field4142.field2176 = this.field4142;
		this.field4142.field2178 = this.field4142;
	}

	public void method2545() {
		while (this.field4142.field2176 != this.field4142) {
			this.field4142.field2176.method1517();
		}

	}

	public void method2542(class292 var1) {
		if (var1.field2178 != null) {
			var1.method1517();
		}

		var1.field2178 = this.field4142.field2178;
		var1.field2176 = this.field4142;
		var1.field2178.field2176 = var1;
		var1.field2176.field2178 = var1;
	}

	public class292 method2543() {
		class292 var1 = this.field4142.field2176;
		if (var1 == this.field4142) {
			return null;
		} else {
			var1.method1517();
			return var1;
		}
	}

	public class292 method2544() {
		return this.method2541((class292)null);
	}

	class292 method2541(class292 var1) {
		class292 var2;
		if (var1 == null) {
			var2 = this.field4142.field2176;
		} else {
			var2 = var1;
		}

		if (var2 == this.field4142) {
			this.field4143 = null;
			return null;
		} else {
			this.field4143 = var2.field2176;
			return var2;
		}
	}

	public class292 method2546() {
		class292 var1 = this.field4143;
		if (var1 == this.field4142) {
			this.field4143 = null;
			return null;
		} else {
			this.field4143 = var1.field2176;
			return var1;
		}
	}

	@Override
	public Iterator iterator() {
		return new class165(this);
	}

	public static void method2547(class292 var0, class292 var1) {
		if (var0.field2178 != null) {
			var0.method1517();
		}

		var0.field2178 = var1;
		var0.field2176 = var1.field2176;
		var0.field2178.field2176 = var0;
		var0.field2176.field2178 = var0;
	}
}
