public class class238 extends class458 {
	int field1568;
	int field1569;
	int field1570;
	int field1571;
	long field1567;
	long[] field1572;

	class238() {
		this.field1572 = new long[10];
		this.field1568 = 256;
		this.field1569 = 1;
		this.field1570 = 0;
		this.field1567 = class38.method108();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1572[var1] = this.field1567;
		}

	}

	@Override
	public void method2143() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1572[var2] = 0L;
		}

	}

	@Override
	public int method2144(int var1, int var2) {
		int var4 = this.field1568;
		int var5 = this.field1569;
		this.field1568 = 300;
		this.field1569 = 1;
		this.field1567 = class38.method108();
		if (this.field1572[this.field1571] == 0L) {
			this.field1568 = var4;
			this.field1569 = var5;
		} else if (this.field1567 > this.field1572[this.field1571]) {
			this.field1568 = (int)((long)(var1 * 2560) / (this.field1567 - this.field1572[this.field1571]));
		}

		if (this.field1568 < 25) {
			this.field1568 = 25;
		}

		if (this.field1568 > 256) {
			this.field1568 = 256;
			this.field1569 = (int)((long)var1 - (this.field1567 - this.field1572[this.field1571]) / 10L);
		}

		if (this.field1569 > var1) {
			this.field1569 = var1;
		}

		this.field1572[this.field1571] = this.field1567;
		this.field1571 = (this.field1571 + 1) % 10;
		int var6;
		if (this.field1569 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (this.field1572[var6] != 0L) {
					this.field1572[var6] += (long)this.field1569;
				}
			}
		}

		if (this.field1569 < var2) {
			this.field1569 = var2;
		}

		class325.method1587((long)this.field1569);

		for (var6 = 0; this.field1570 < 256; this.field1570 += this.field1568) {
			++var6;
		}

		this.field1570 &= 255;
		return var6;
	}
}
