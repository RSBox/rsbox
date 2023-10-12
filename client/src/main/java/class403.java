public class class403 {
	class245 field2757;
	class245 field2758;

	public class403() {
		this.field2758 = new class245();
		this.field2758.field1634 = this.field2758;
		this.field2758.field1633 = this.field2758;
	}

	public void method1860(class245 var1) {
		if (var1.field1633 != null) {
			var1.method1129();
		}

		var1.field1633 = this.field2758.field1633;
		var1.field1634 = this.field2758;
		var1.field1633.field1634 = var1;
		var1.field1634.field1633 = var1;
	}

	public class245 method1861() {
		class245 var1 = this.field2758.field1634;
		if (var1 == this.field2758) {
			this.field2757 = null;
			return null;
		} else {
			this.field2757 = var1.field1634;
			return var1;
		}
	}

	public class245 method1862() {
		class245 var1 = this.field2757;
		if (var1 == this.field2758) {
			this.field2757 = null;
			return null;
		} else {
			this.field2757 = var1.field1634;
			return var1;
		}
	}
}
