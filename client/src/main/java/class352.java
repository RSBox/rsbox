public final class class352 {
	class292 field2434;
	class301 field2435;
	class530 field2436;
	int field2432;
	int field2433;

	public class352(int var1) {
		this.field2434 = new class292();
		this.field2436 = new class530();
		this.field2433 = var1;
		this.field2432 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field2435 = new class301(var2);
	}

	public class292 method1678(long var1) {
		class292 var3 = (class292)this.field2435.method1533(var1);
		if (var3 != null) {
			this.field2436.method2542(var3);
		}

		return var3;
	}

	public void method1677(long var1) {
		class292 var3 = (class292)this.field2435.method1533(var1);
		if (var3 != null) {
			var3.method1719();
			var3.method1517();
			++this.field2432;
		}

	}

	public void method1680(class292 var1, long var2) {
		if (this.field2432 == 0) {
			class292 var4 = this.field2436.method2543();
			var4.method1719();
			var4.method1517();
			if (var4 == this.field2434) {
				var4 = this.field2436.method2543();
				var4.method1719();
				var4.method1517();
			}
		} else {
			--this.field2432;
		}

		this.field2435.method1534(var1, var2);
		this.field2436.method2542(var1);
	}

	public void method1679() {
		this.field2436.method2545();
		this.field2435.method1535();
		this.field2434 = new class292();
		this.field2432 = this.field2433;
	}
}
