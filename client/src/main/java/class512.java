public class class512 extends class283 {
	static int[] field3748;
	final class40 field3744;
	final int field3745;
	final int field3746;
	final int field3747;

	class512(class370 var1, class370 var2, int var3, class40 var4) {
		super(var1, var2);
		this.field3745 = var3;
		this.field3744 = var4;
		class63 var5 = class63.method269(this.method1483());
		class42 var6 = var5.method264(false);
		if (var6 != null) {
			this.field3746 = var6.field207;
			this.field3747 = var6.field209;
		} else {
			this.field3746 = 0;
			this.field3747 = 0;
		}

	}

	@Override
	public int method1483() {
		return this.field3745;
	}

	@Override
	class40 method1484() {
		return this.field3744;
	}

	@Override
	int method1485() {
		return this.field3746;
	}

	@Override
	int method1486() {
		return this.field3747;
	}
}
