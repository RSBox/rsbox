public class class366 extends class283 {
	static int field2540;
	class40 field2538;
	int field2535;
	int field2537;
	int field2539;
	final class438 field2536;
	final int field2541;

	class366(class370 var1, class370 var2, int var3, class438 var4) {
		super(var1, var2);
		this.field2541 = var3;
		this.field2536 = var4;
		this.method1731();
	}

	void method1731() {
		this.field2537 = class109.method504(this.field2541).method1845().field2714;
		this.field2538 = this.field2536.method2015(class63.method269(this.field2537));
		class63 var2 = class63.method269(this.method1483());
		class42 var3 = var2.method264(false);
		if (null != var3) {
			this.field2539 = var3.field207;
			this.field2535 = var3.field209;
		} else {
			this.field2539 = 0;
			this.field2535 = 0;
		}

	}

	@Override
	public int method1483() {
		return this.field2537;
	}

	@Override
	class40 method1484() {
		return this.field2538;
	}

	@Override
	int method1485() {
		return this.field2539;
	}

	@Override
	int method1486() {
		return this.field2535;
	}
}
