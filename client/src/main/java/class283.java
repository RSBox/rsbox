public abstract class class283 {
	static class138 field2153;
	int field2151;
	int field2152;
	public final class370 field2149;
	public final class370 field2150;

	class283(class370 var1, class370 var2) {
		this.field2149 = var1;
		this.field2150 = var2;
	}

	abstract class40 method1484();

	abstract int method1485();

	abstract int method1486();

	public abstract int method1483();

	boolean method1482(int var1, int var2) {
		if (this.method1489(var1, var2, (byte)-74)) {
			return true;
		} else {
			return this.method1488(var1, var2);
		}
	}

	boolean method1487() {
		return this.method1483() >= 0;
	}

	boolean method1489(int var1, int var2, byte var3) {
		if (!this.method1487()) {
			return false;
		} else {
			class63 var4 = class63.method269(this.method1483());
			int var5 = this.method1485();
			int var6 = this.method1486();
			switch(var4.field316.field4075) {
			case 0:
				if (var1 < this.field2152 - var5 / 2 || var1 > var5 / 2 + this.field2152) {
					return false;
				}
				break;
			case 1:
				if (var1 > this.field2152 - var5 && var1 <= this.field2152) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.field2152 || var1 >= this.field2152 + var5) {
					return false;
				}
			}

			switch(var4.field299.field3298) {
			case 0:
				if (var2 < this.field2151 - var6 / 2 || var2 > var6 / 2 + this.field2151) {
					return false;
				}
				break;
			case 1:
				if (var2 <= this.field2151 - var6 || var2 > this.field2151) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.field2151 || var2 >= this.field2151 + var6) {
					return false;
				}
			}

			return true;
		}
	}

	boolean method1488(int var1, int var2) {
		class40 var4 = this.method1484();
		if (var4 == null) {
			return false;
		} else if (var1 >= this.field2152 - var4.field200 / 2 && var1 <= var4.field200 / 2 + this.field2152) {
			return var2 >= this.field2151 && var2 <= var4.field198 + this.field2151;
		} else {
			return false;
		}
	}
}
