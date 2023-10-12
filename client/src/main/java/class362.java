public abstract class class362 extends class359 {
	class22 field2483;
	class362 field2481;
	int field2482;
	volatile boolean field2484;

	protected class362() {
		this.field2484 = true;
	}

	protected abstract class362 method1727();

	protected abstract class362 method1728();

	protected abstract int method1723();

	protected abstract void method1725(int[] var1, int var2, int var3);

	protected abstract void method1726(int var1);

	int method1722() {
		return 255;
	}

	final void method1724(int[] var1, int var2, int var3) {
		if (this.field2484) {
			this.method1725(var1, var2, var3);
		} else {
			this.method1726(var3);
		}

	}
}
