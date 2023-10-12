public final class class375 {
	class359 field2582;
	class359 field2583;
	class359[] field2581;
	int field2579;
	int field2580;

	public class375(int var1) {
		this.field2579 = 0;
		this.field2580 = var1;
		this.field2581 = new class359[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class359 var3 = this.field2581[var2] = new class359();
			var3.field2471 = var3;
			var3.field2473 = var3;
		}

	}

	public class359 get(long var1) {
		class359 var3 = this.field2581[(int)(var1 & (long)(this.field2580 - 1))];

		for (this.field2583 = var3.field2471; this.field2583 != var3; this.field2583 = this.field2583.field2471) {
			if (this.field2583.field2472 == var1) {
				class359 var4 = this.field2583;
				this.field2583 = this.field2583.field2471;
				return var4;
			}
		}

		this.field2583 = null;
		return null;
	}

	public int method1752() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.field2580; ++var2) {
			class359 var3 = this.field2581[var2];

			for (class359 var4 = var3.field2471; var4 != var3; var4 = var4.field2471) {
				++var1;
			}
		}

		return var1;
	}

	public void put(class359 var1, long var2) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		class359 var4 = this.field2581[(int)(var2 & (long)(this.field2580 - 1))];
		var1.field2473 = var4.field2473;
		var1.field2471 = var4;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
		var1.field2472 = var2;
	}

	public class359 method1753() {
		this.field2579 = 0;
		return this.method1754();
	}

	public class359 method1754() {
		class359 var1;
		if (this.field2579 > 0 && this.field2582 != this.field2581[this.field2579 - 1]) {
			var1 = this.field2582;
			this.field2582 = var1.field2471;
			return var1;
		} else {
			do {
				if (this.field2579 >= this.field2580) {
					return null;
				}

				var1 = this.field2581[this.field2579++].field2471;
			} while(var1 == this.field2581[this.field2579 - 1]);

			this.field2582 = var1.field2471;
			return var1;
		}
	}
}
