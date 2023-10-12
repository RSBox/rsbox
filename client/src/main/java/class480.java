public class class480 {
	byte field3375;
	public int field3372;
	public int field3373;
	public int field3374;
	public int field3376;
	public int field3377;

	public class480() {
	}

	public class480(Buffer var1, boolean var2) {
		this.field3375 = var1.readByte();
		this.field3373 = var1.readUnsignedShort();
		this.field3374 = var1.readInt();
		this.field3372 = var1.readInt();
		this.field3376 = var1.readInt();
		this.field3377 = var1.readInt();
	}

	void method2204(Integer var1) {
	}

	public int method2205() {
		return this.field3375 & 7;
	}

	public int method2208() {
		return (this.field3375 & 8) == 8 ? 1 : 0;
	}

	void method2206(int var1) {
		this.field3375 &= -8;
		this.field3375 = (byte)(this.field3375 | 2);
	}

	void method2207(int var1) {
		this.field3375 &= -9;
		if (var1 == 1) {
			this.field3375 = (byte)(this.field3375 | 8);
		}

	}
}
