public class class370 {
	public static short[] field2558;
	public int field2559;
	public int field2560;
	public int field2561;

	public class370(int var1, int var2, int var3) {
		this.field2560 = var1;
		this.field2561 = var2;
		this.field2559 = var3;
	}

	public class370(class370 var1) {
		this.field2560 = var1.field2560;
		this.field2561 = var1.field2561;
		this.field2559 = var1.field2559;
	}

	public class370(int var1) {
		if (var1 == -1) {
			this.field2560 = -1;
		} else {
			this.field2560 = var1 >> 28 & 3;
			this.field2561 = var1 >> 14 & 16383;
			this.field2559 = var1 & 16383;
		}

	}

	public int method1737() {
		return Player.method2129(this.field2560, this.field2561, this.field2559);
	}

	@Override
	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof class370) ? false : this.method1736((class370)var1);
		}
	}

	boolean method1736(class370 var1) {
		if (this.field2560 != var1.field2560) {
			return false;
		} else if (this.field2561 != var1.field2561) {
			return false;
		} else {
			return var1.field2559 == this.field2559;
		}
	}

	@Override
	public int hashCode() {
		return this.method1737();
	}

	@Override
	public String toString() {
		return this.method1738(",");
	}

	String method1738(String var1) {
		return this.field2560 + var1 + (this.field2561 >> 6) + var1 + (this.field2559 >> 6) + var1 + (this.field2561 & 63) + var1 + (this.field2559 & 63);
	}
}
