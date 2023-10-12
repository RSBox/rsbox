public class class328 {
	static class86 field2346;
	class444 field2344;
	long field2343;
	public long field2345;

	public class328(Buffer var1) {
		this.field2345 = -1L;
		this.field2344 = new class444();
		this.method1591(var1);
	}

	void method1591(Buffer var1) {
		this.field2343 = var1.readLong();
		this.field2345 = var1.readLong();

		for (int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class49(this);
			} else if (var3 == 4) {
				var4 = new class172(this);
			} else if (var3 == 3) {
				var4 = new class446(this);
			} else if (var3 == 2) {
				var4 = new class461(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class342(this);
			}

			((class551)var4).method2632(var1);
			this.field2344.method2095((class359)var4);
		}

	}

	public void method1592(class398 var1) {
		if (this.field2343 == var1.field2472 && var1.field2742 == this.field2345) {
			for (class551 var3 = (class551)this.field2344.method2088(); null != var3; var3 = (class551)this.field2344.method2097()) {
				var3.method2633(var1);
			}

			++var1.field2742;
		} else {
			throw new RuntimeException("");
		}
	}
}
