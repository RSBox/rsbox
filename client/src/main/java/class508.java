public class class508 {
	class39 field3709;
	int field3710;
	int field3711;

	class508(class39 var1, int var2, int var3) {
		this.field3711 = 0;
		this.field3710 = 0;
		this.field3709 = var1;
		this.field3711 = var2;
		this.field3710 = var3;
	}

	public String method2395() {
		if (this.method2391()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method2392());

			for (int var3 = this.field3711; var3 < this.field3710; ++var3) {
				class101 var4 = this.field3709.method109(var3);
				var2.append(var4.field657);
			}

			return var2.toString();
		}
	}

	boolean method2390(int var1) {
		return this.field3709.method134() == 2 || this.field3709.method134() == 1 && (!this.field3709.field194 || var1 != this.field3710 - 1);
	}

	public boolean method2391() {
		return this.field3710 == this.field3711;
	}

	public int method2392() {
		return this.field3710 - this.field3711;
	}

	boolean method2397(class101 var1) {
		if (this.field3709.field197 == 2) {
			return true;
		} else if (this.field3709.field197 == 0) {
			return false;
		} else {
			return this.field3709.method149() != var1;
		}
	}

	int method2396() {
		if (this.method2391()) {
			return 0;
		} else {
			class101 var2 = this.field3709.method109(this.field3710 - 1);
			if (var2.field657 == '\n') {
				return 0;
			} else if (this.method2397(var2)) {
				return this.field3709.field190.field1480[42];
			} else {
				int var3 = this.field3709.field190.field1480[var2.field657];
				if (var3 == 0) {
					return var2.field657 == '\t' ? 3 * this.field3709.field190.field1480[32] : this.field3709.field190.field1480[32];
				} else {
					return var3;
				}
			}
		}
	}

	public class203 method2393() {
		if (this.method2391()) {
			return new class203(0, 0);
		} else {
			class101 var2 = this.field3709.method109(this.field3710 - 1);
			return new class203(var2.field658 + this.method2396(), var2.field659);
		}
	}

	public class101 method2394(int var1) {
		return var1 >= 0 && var1 < this.method2392() ? this.field3709.method109(this.field3711 + var1) : null;
	}
}
