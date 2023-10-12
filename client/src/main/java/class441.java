public final class class441 extends class462 {
	int field2967;
	int field2968;
	int field2969;

	class441() {
		this.field2968 = 31;
	}

	void method2081(int var1) {
		this.field2968 = var1;
	}

	boolean method2083(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field2968 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@Override
	protected final class490 method2152() {
		return class158.method857(this.field2967).method849(this.field2969);
	}

	static boolean method2084(class397 var0) {
		if (null != var0.field2727) {
			int[] var2 = var0.field2727;

			for (int var3 = 0; var3 < var2.length; ++var3) {
				int var4 = var2[var3];
				class397 var5 = class109.method504(var4);
				if (var5.field2714 != -1) {
					return true;
				}
			}
		} else if (var0.field2714 != -1) {
			return true;
		}

		return false;
	}
}
