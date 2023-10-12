public final class class45 {
	class301 field220;
	class505 field224;
	class530 field223;
	int field221;
	int field222;

	public class45(int var1) {
		this(var1, var1);
	}

	public class45(int var1, int var2) {
		this.field223 = new class530();
		this.field221 = var1;
		this.field222 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field220 = new class301(var3);
	}

	public Object method186(long var1) {
		class297 var3 = (class297)this.field220.method1533(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method1529();
			if (var4 == null) {
				var3.method1719();
				var3.method1517();
				this.field222 += var3.field2191;
				return null;
			} else {
				if (var3.method1530()) {
					class260 var5 = new class260(var4, var3.field2191);
					this.field220.method1534(var5, var3.field2472);
					this.field223.method2542(var5);
					var5.field2177 = 0L;
					var3.method1719();
					var3.method1517();
				} else {
					this.field223.method2542(var3);
					var3.field2177 = 0L;
				}

				return var4;
			}
		}
	}

	void method187(long var1) {
		class297 var3 = (class297)this.field220.method1533(var1);
		this.method188(var3);
	}

	void method188(class297 var1) {
		if (var1 != null) {
			var1.method1719();
			var1.method1517();
			this.field222 += var1.field2191;
		}

	}

	public void method191(Object var1, long var2) {
		this.method185(var1, var2, 1);
	}

	public void method185(Object var1, long var2, int var4) {
		if (var4 > this.field221) {
			throw new IllegalStateException();
		} else {
			this.method187(var2);
			this.field222 -= var4;

			while (this.field222 < 0) {
				class297 var5 = (class297)this.field223.method2543();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method1530()) {
				}

				this.method188(var5);
				if (this.field224 != null) {
					this.field224.method2387(var5.method1529());
				}
			}

			class260 var6 = new class260(var1, var4);
			this.field220.method1534(var6, var2);
			this.field223.method2542(var6);
			var6.field2177 = 0L;
		}
	}

	public void method189(int var1) {
		for (class297 var2 = (class297)this.field223.method2544(); var2 != null; var2 = (class297)this.field223.method2546()) {
			if (var2.method1530()) {
				if (var2.method1529() == null) {
					var2.method1719();
					var2.method1517();
					this.field222 += var2.field2191;
				}
			} else if (++var2.field2177 > (long)5) {
				class243 var3 = new class243(var2.method1529(), var2.field2191);
				this.field220.method1534(var3, var2.field2472);
				class530.method2547(var3, var2);
				var2.method1719();
				var2.method1517();
			}
		}

	}

	public void method190() {
		this.field223.method2545();
		this.field220.method1535();
		this.field222 = this.field221;
	}
}
