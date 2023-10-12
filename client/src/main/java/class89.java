public class class89 {
	static int field585;
	class56[] field583;
	int field584;

	class89() {
		this.field583 = new class56[100];
	}

	class56 method414(int var1, String var2, String var3, String var4) {
		class56 var6 = this.field583[99];

		for (int var7 = this.field584; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field583[var7] = this.field583[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new class56(var1, var2, var4, var3);
		} else {
			var6.method1719();
			var6.method1517();
			var6.method227(var1, var2, var4, var3);
		}

		this.field583[0] = var6;
		if (this.field584 < 100) {
			++this.field584;
		}

		return var6;
	}

	class56 method415(int var1) {
		return var1 >= 0 && var1 < this.field584 ? this.field583[var1] : null;
	}

	int method416() {
		return this.field584;
	}
}
