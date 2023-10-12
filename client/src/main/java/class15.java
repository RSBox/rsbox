public class class15 extends class359 {
	static int field82;
	class161 field80;
	class444 field81;

	class15(class161 var1) {
		this.field81 = new class444();
		this.field80 = var1;
	}

	void method65(int var1, int var2, int var3, int var4) {
		class12 var6 = null;
		int var7 = 0;

		for (class12 var8 = (class12)this.field81.method2088(); null != var8; var8 = (class12)this.field81.method2097()) {
			++var7;
			if (var8.field66 == var1) {
				var8.method58(var1, var2, var3, var4);
				return;
			}

			if (var8.field66 <= var1) {
				var6 = var8;
			}
		}

		if (null == var6) {
			if (var7 < 4) {
				this.field81.method2094(new class12(var1, var2, var3, var4));
			}

		} else {
			class444.method2087(new class12(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field81.method2088().method1719();
			}

		}
	}

	class12 method67(int var1) {
		class12 var3 = (class12)this.field81.method2088();
		if (null != var3 && var3.field66 <= var1) {
			for (class12 var4 = (class12)this.field81.method2097(); var4 != null && var4.field66 <= var1; var4 = (class12)this.field81.method2097()) {
				var3.method1719();
				var3 = var4;
			}

			if (this.field80.field1155 + var3.field66 + var3.field67 > var1) {
				return var3;
			} else {
				var3.method1719();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method66() {
		return this.field81.method2090();
	}
}
