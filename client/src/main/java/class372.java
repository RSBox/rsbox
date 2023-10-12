public class class372 {
	int field2569;
	int field2570;
	int field2571;
	int field2573;
	long field2564;
	long field2565;
	long field2566;
	long field2567;
	long field2568;
	public boolean field2572;

	public class372() {
		this.field2564 = -1L;
		this.field2565 = -1L;
		this.field2572 = false;
		this.field2567 = 0L;
		this.field2568 = 0L;
		this.field2566 = 0L;
		this.field2570 = 0;
		this.field2571 = 0;
		this.field2569 = 0;
		this.field2573 = 0;
	}

	public void method1741() {
		this.field2564 = class38.method108();
	}

	public void method1745() {
		if (-1L != this.field2564) {
			this.field2568 = class38.method108() - this.field2564;
			this.field2564 = -1L;
		}

	}

	public void method1742(int var1) {
		this.field2565 = class38.method108();
		this.field2570 = var1;
	}

	public void method1743() {
		if (-1L != this.field2565) {
			this.field2567 = class38.method108() - this.field2565;
			this.field2565 = -1L;
		}

		++this.field2569;
		this.field2572 = true;
	}

	public void method1744() {
		this.field2572 = false;
		this.field2571 = 0;
	}

	public void method1746() {
		this.method1743();
	}

	public void method1740(Buffer var1) {
		long var3 = this.field2568;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.writeShort((int)var3);
		long var5 = this.field2567;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.writeShort((int)var5);
		long var7 = this.field2566;
		var7 /= 10L;
		if (var7 < 0L) {
			var7 = 0L;
		} else if (var7 > 65535L) {
			var7 = 65535L;
		}

		var1.writeShort((int)var7);
		var1.writeShort(this.field2570);
		var1.writeShort(this.field2571);
		var1.writeShort(this.field2569);
		var1.writeShort(this.field2573);
	}
}
