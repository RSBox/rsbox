public class class69 {
	class359 field440;
	public class359 field439;

	public class69() {
		this.field439 = new class359();
		this.field439.field2471 = this.field439;
		this.field439.field2473 = this.field439;
	}

	public void method329() {
		while (true) {
			class359 var1 = this.field439.field2471;
			if (var1 == this.field439) {
				this.field440 = null;
				return;
			}

			var1.method1719();
		}
	}

	public void method323(class359 var1) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		var1.field2473 = this.field439.field2473;
		var1.field2471 = this.field439;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
	}

	public void method330(class359 var1) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		var1.field2473 = this.field439;
		var1.field2471 = this.field439.field2471;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
	}

	public class359 method326() {
		class359 var1 = this.field439.field2471;
		if (var1 == this.field439) {
			return null;
		} else {
			var1.method1719();
			return var1;
		}
	}

	public class359 method328() {
		class359 var1 = this.field439.field2473;
		if (var1 == this.field439) {
			return null;
		} else {
			var1.method1719();
			return var1;
		}
	}

	public class359 method327() {
		class359 var1 = this.field439.field2471;
		if (var1 == this.field439) {
			this.field440 = null;
			return null;
		} else {
			this.field440 = var1.field2471;
			return var1;
		}
	}

	public class359 method324() {
		class359 var1 = this.field439.field2473;
		if (var1 == this.field439) {
			this.field440 = null;
			return null;
		} else {
			this.field440 = var1.field2473;
			return var1;
		}
	}

	public class359 method331() {
		class359 var1 = this.field440;
		if (var1 == this.field439) {
			this.field440 = null;
			return null;
		} else {
			this.field440 = var1.field2471;
			return var1;
		}
	}

	public class359 method325() {
		class359 var1 = this.field440;
		if (var1 == this.field439) {
			this.field440 = null;
			return null;
		} else {
			this.field440 = var1.field2473;
			return var1;
		}
	}

	public boolean method333() {
		return this.field439.field2471 == this.field439;
	}

	public static void method332(class359 var0, class359 var1) {
		if (var0.field2473 != null) {
			var0.method1719();
		}

		var0.field2473 = var1.field2473;
		var0.field2471 = var1;
		var0.field2473.field2471 = var0;
		var0.field2471.field2473 = var0;
	}
}
