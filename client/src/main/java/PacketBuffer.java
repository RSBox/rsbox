public class PacketBuffer extends Buffer {
	static final int[] field2157;
	class534 field2156;
	int field2158;

	static {
		field2157 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	public void method1495(int[] var1) {
		this.field2156 = new class534(var1);
	}

	public void method1503(class534 var1) {
		this.field2156 = var1;
	}

	public void method1502(int var1) {
		super.data[++super.offset - 1] = (byte)(var1 + this.field2156.method2552());
	}

	public int method1505() {
		return super.data[++super.offset - 1] - this.field2156.method2552() & 255;
	}

	public boolean method1500() {
		int var2 = super.data[super.offset] - this.field2156.method2555() & 255;
		return var2 >= 128;
	}

	public int method1498() {
		int var2 = super.data[++super.offset - 1] - this.field2156.method2552() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.data[++super.offset - 1] - this.field2156.method2552() & 255);
	}

	public void method1496(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[0 + var5] = (byte)(super.data[++super.offset - 1] - this.field2156.method2552());
		}

	}

	public void method1497() {
		this.field2158 = super.offset * 8;
	}

	public int method1501(int var1) {
		int var3 = this.field2158 >> 3;
		int var4 = 8 - (this.field2158 & 7);
		int var5 = 0;

		for (this.field2158 += var1; var1 > var4; var4 = 8) {
			var5 += (super.data[var3++] & field2157[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.data[var3] & field2157[var4];
		} else {
			var5 += super.data[var3] >> var4 - var1 & field2157[var1];
		}

		return var5;
	}

	public void method1504() {
		super.offset = (7 + this.field2158) / 8;
	}

	public int method1499(int var1) {
		return var1 * 8 - this.field2158;
	}
}
