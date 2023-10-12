public class class217 extends class362 {
	public static int field1414;
	class118 field1412;
	class247 field1415;
	class69 field1413;

	class217(class118 var1) {
		this.field1413 = new class69();
		this.field1415 = new class247();
		this.field1412 = var1;
	}

	@Override
	protected class362 method1727() {
		class273 var1 = (class273)this.field1413.method327();
		if (var1 == null) {
			return null;
		} else {
			return (class362)(null != var1.field1805 ? var1.field1805 : this.method1728());
		}
	}

	@Override
	protected class362 method1728() {
		class273 var1;
		do {
			var1 = (class273)this.field1413.method331();
			if (null == var1) {
				return null;
			}
		} while(null == var1.field1805);

		return var1.field1805;
	}

	@Override
	protected int method1723() {
		return 0;
	}

	@Override
	protected void method1725(int[] var1, int var2, int var3) {
		this.field1415.method1725(var1, var2, var3);

		for (class273 var6 = (class273)this.field1413.method327(); null != var6; var6 = (class273)this.field1413.method331()) {
			if (!this.field1412.method573(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field1817) {
						this.method1000(var6, var1, var4, var5, var5 + var4);
						var6.field1817 -= var5;
						break;
					}

					this.method1000(var6, var1, var4, var6.field1817, var4 + var5);
					var4 += var6.field1817;
					var5 -= var6.field1817;
				} while(!this.field1412.method568(var6, var1, var4, var5));
			}
		}

	}

	@Override
	protected void method1726(int var1) {
		this.field1415.method1726(var1);

		for (class273 var3 = (class273)this.field1413.method327(); var3 != null; var3 = (class273)this.field1413.method331()) {
			if (!this.field1412.method573(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field1817) {
						this.method1003(var3, var2);
						var3.field1817 -= var2;
						break;
					}

					this.method1003(var3, var3.field1817);
					var2 -= var3.field1817;
				} while(!this.field1412.method568(var3, (int[])null, 0, var2));
			}
		}

	}

	void method1000(class273 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field1412.field765[var1.field1798] & 4) != 0 && var1.field1806 < 0) {
			int var7 = this.field1412.field783[var1.field1798] / class67.field437;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field1816) / var7;
				if (var8 > var4) {
					var1.field1816 += var4 * var7;
					break;
				}

				var1.field1805.method1725(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field1816 += var8 * var7 - 1048576;
				int var9 = class67.field437 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				class335 var11 = var1.field1805;
				if (this.field1412.field768[var1.field1798] == 0) {
					var1.field1805 = class335.method1638(var1.field1797, var11.method1617(), var11.method1610(), var11.method1634());
				} else {
					var1.field1805 = class335.method1638(var1.field1797, var11.method1617(), 0, var11.method1634());
					this.field1412.method552(var1, var1.field1814.field129[var1.field1802] < 0);
					var1.field1805.method1613(var9, var11.method1610());
				}

				if (var1.field1814.field129[var1.field1802] < 0) {
					var1.field1805.method1623(-1);
				}

				var11.method1615(var9);
				var11.method1725(var2, var3, var5 - var3);
				if (var11.method1626()) {
					this.field1415.method1140(var11);
				}
			}
		}

		var1.field1805.method1725(var2, var3, var4);
	}

	void method1003(class273 var1, int var2) {
		if ((this.field1412.field765[var1.field1798] & 4) != 0 && var1.field1806 < 0) {
			int var4 = this.field1412.field783[var1.field1798] / class67.field437;
			int var5 = (var4 + 1048575 - var1.field1816) / var4;
			var1.field1816 = var1.field1816 + var2 * var4 & 1048575;
			if (var5 <= var2) {
				if (this.field1412.field768[var1.field1798] == 0) {
					var1.field1805 = class335.method1638(var1.field1797, var1.field1805.method1617(), var1.field1805.method1610(), var1.field1805.method1634());
				} else {
					var1.field1805 = class335.method1638(var1.field1797, var1.field1805.method1617(), 0, var1.field1805.method1634());
					this.field1412.method552(var1, var1.field1814.field129[var1.field1802] < 0);
				}

				if (var1.field1814.field129[var1.field1802] < 0) {
					var1.field1805.method1623(-1);
				}

				var2 = var1.field1816 / var4;
			}
		}

		var1.field1805.method1726(var2);
	}
}
