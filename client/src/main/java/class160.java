public class class160 {
	public int field1146;
	public int field1147;
	public int field1148;
	public int field1149;

	public class160(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public class160(int var1, int var2, int var3, int var4) {
		this.method862(var1, var2);
		this.method863(var3, var4);
	}

	public void method862(int var1, int var2) {
		this.field1147 = var1;
		this.field1149 = var2;
	}

	public void method863(int var1, int var2) {
		this.field1146 = var1;
		this.field1148 = var2;
	}

	public boolean method867(int var1, int var2) {
		return var1 >= this.field1147 && var1 < this.field1147 + this.field1146 && var2 >= this.field1149 && var2 < this.field1149 + this.field1148;
	}

	@Override
	public String toString() {
		return null;
	}

	public void method869(class160 var1, class160 var2) {
		this.method864(var1, var2);
		this.method865(var1, var2);
	}

	void method864(class160 var1, class160 var2) {
		var2.field1147 = this.field1147;
		var2.field1146 = this.field1146;
		if (this.field1147 < var1.field1147) {
			var2.field1146 = (var2.field1146 * 801752255 - (var1.field1147 * 801752255 - this.field1147 * 801752255)) * -1823233217;
			var2.field1147 = var1.field1147;
		}

		if (var2.method868() > var1.method868()) {
			var2.field1146 -= var2.method868() - var1.method868();
		}

		if (var2.field1146 < 0) {
			var2.field1146 = 0;
		}

	}

	void method865(class160 var1, class160 var2) {
		var2.field1149 = this.field1149;
		var2.field1148 = this.field1148;
		if (this.field1149 < var1.field1149) {
			var2.field1148 = (var2.field1148 * 110199335 - (var1.field1149 * 110199335 - this.field1149 * 110199335)) * -61485673;
			var2.field1149 = var1.field1149;
		}

		if (var2.method866() > var1.method866()) {
			var2.field1148 -= var2.method866() - var1.method866();
		}

		if (var2.field1148 < 0) {
			var2.field1148 = 0;
		}

	}

	int method868() {
		return this.field1146 + this.field1147;
	}

	int method866() {
		return this.field1148 + this.field1149;
	}
}
