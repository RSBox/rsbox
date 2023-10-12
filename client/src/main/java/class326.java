public final class class326 {
	class292 field2342;

	public class326() {
		this.field2342 = new class292();
		this.field2342.field2176 = this.field2342;
		this.field2342.field2178 = this.field2342;
	}

	public void method1588(class292 var1) {
		if (var1.field2178 != null) {
			var1.method1517();
		}

		var1.field2178 = this.field2342.field2178;
		var1.field2176 = this.field2342;
		var1.field2178.field2176 = var1;
		var1.field2176.field2178 = var1;
	}

	public void method1589(class292 var1) {
		if (var1.field2178 != null) {
			var1.method1517();
		}

		var1.field2178 = this.field2342;
		var1.field2176 = this.field2342.field2176;
		var1.field2178.field2176 = var1;
		var1.field2176.field2178 = var1;
	}

	public class292 method1590() {
		class292 var1 = this.field2342.field2176;
		return var1 == this.field2342 ? null : var1;
	}
}
