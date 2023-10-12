public class class247 extends class362 {
	class69 field1653;
	class69 field1654;
	int field1652;
	int field1655;

	public class247() {
		this.field1654 = new class69();
		this.field1653 = new class69();
		this.field1652 = 0;
		this.field1655 = -1;
	}

	public final synchronized void method1140(class362 var1) {
		this.field1654.method330(var1);
	}

	public final synchronized void method1131(class362 var1) {
		var1.method1719();
	}

	void method1132() {
		if (this.field1652 > 0) {
			for (class50 var1 = (class50)this.field1653.method327(); var1 != null; var1 = (class50)this.field1653.method331()) {
				var1.field238 -= this.field1652;
			}

			this.field1655 -= this.field1652;
			this.field1652 = 0;
		}

	}

	void method1133(class359 var1, class50 var2) {
		while (var1 != this.field1653.field439 && ((class50)var1).field238 <= var2.field238) {
			var1 = var1.field2471;
		}

		class69.method332(var2, var1);
		this.field1655 = ((class50)this.field1653.field439.field2471).field238;
	}

	void method1134(class50 var1) {
		var1.method1719();
		var1.method203();
		class359 var2 = this.field1653.field439.field2471;
		if (var2 == this.field1653.field439) {
			this.field1655 = -1;
		} else {
			this.field1655 = ((class50)var2).field238;
		}

	}

	@Override
	protected class362 method1727() {
		return (class362)this.field1654.method327();
	}

	@Override
	protected class362 method1728() {
		return (class362)this.field1654.method331();
	}

	@Override
	protected int method1723() {
		return 0;
	}

	@Override
	public final synchronized void method1725(int[] var1, int var2, int var3) {
		do {
			if (this.field1655 < 0) {
				this.method1138(var1, var2, var3);
				return;
			}

			if (this.field1652 + var3 < this.field1655) {
				this.field1652 += var3;
				this.method1138(var1, var2, var3);
				return;
			}

			int var4 = this.field1655 - this.field1652;
			this.method1138(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1652 += var4;
			this.method1132();
			class50 var5 = (class50)this.field1653.method327();
			synchronized(var5) {
				int var7 = var5.method202(this);
				if (var7 < 0) {
					var5.field238 = 0;
					this.method1134(var5);
				} else {
					var5.field238 = var7;
					this.method1133(var5.field2471, var5);
				}
			}
		} while(var3 != 0);

	}

	void method1138(int[] var1, int var2, int var3) {
		for (class362 var4 = (class362)this.field1654.method327(); var4 != null; var4 = (class362)this.field1654.method331()) {
			var4.method1724(var1, var2, var3);
		}

	}

	@Override
	public final synchronized void method1726(int var1) {
		do {
			if (this.field1655 < 0) {
				this.method1139(var1);
				return;
			}

			if (this.field1652 + var1 < this.field1655) {
				this.field1652 += var1;
				this.method1139(var1);
				return;
			}

			int var2 = this.field1655 - this.field1652;
			this.method1139(var2);
			var1 -= var2;
			this.field1652 += var2;
			this.method1132();
			class50 var3 = (class50)this.field1653.method327();
			synchronized(var3) {
				int var5 = var3.method202(this);
				if (var5 < 0) {
					var3.field238 = 0;
					this.method1134(var3);
				} else {
					var3.field238 = var5;
					this.method1133(var3.field2471, var3);
				}
			}
		} while(var1 != 0);

	}

	void method1139(int var1) {
		for (class362 var2 = (class362)this.field1654.method327(); var2 != null; var2 = (class362)this.field1654.method331()) {
			var2.method1726(var1);
		}

	}
}
