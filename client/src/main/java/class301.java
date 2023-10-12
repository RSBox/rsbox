import java.util.Iterator;

public final class class301 implements Iterable {
	class359 field2209;
	class359 field2210;
	class359[] field2208;
	int field2207;
	int field2211;

	public class301(int var1) {
		this.field2207 = 0;
		this.field2211 = var1;
		this.field2208 = new class359[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class359 var3 = this.field2208[var2] = new class359();
			var3.field2471 = var3;
			var3.field2473 = var3;
		}

	}

	public class359 method1533(long var1) {
		class359 var3 = this.field2208[(int)(var1 & (long)(this.field2211 - 1))];

		for (this.field2209 = var3.field2471; this.field2209 != var3; this.field2209 = this.field2209.field2471) {
			if (this.field2209.field2472 == var1) {
				class359 var4 = this.field2209;
				this.field2209 = this.field2209.field2471;
				return var4;
			}
		}

		this.field2209 = null;
		return null;
	}

	public void method1534(class359 var1, long var2) {
		if (var1.field2473 != null) {
			var1.method1719();
		}

		class359 var4 = this.field2208[(int)(var2 & (long)(this.field2211 - 1))];
		var1.field2473 = var4.field2473;
		var1.field2471 = var4;
		var1.field2473.field2471 = var1;
		var1.field2471.field2473 = var1;
		var1.field2472 = var2;
	}

	public void method1535() {
		for (int var1 = 0; var1 < this.field2211; ++var1) {
			class359 var2 = this.field2208[var1];

			while (true) {
				class359 var3 = var2.field2471;
				if (var3 == var2) {
					break;
				}

				var3.method1719();
			}
		}

		this.field2209 = null;
		this.field2210 = null;
	}

	public class359 method1536() {
		this.field2207 = 0;
		return this.method1537();
	}

	public class359 method1537() {
		class359 var1;
		if (this.field2207 > 0 && this.field2210 != this.field2208[this.field2207 - 1]) {
			var1 = this.field2210;
			this.field2210 = var1.field2471;
			return var1;
		} else {
			do {
				if (this.field2207 >= this.field2211) {
					return null;
				}

				var1 = this.field2208[this.field2207++].field2471;
			} while(var1 == this.field2208[this.field2207 - 1]);

			this.field2210 = var1.field2471;
			return var1;
		}
	}

	@Override
	public Iterator iterator() {
		return new class287(this);
	}
}
