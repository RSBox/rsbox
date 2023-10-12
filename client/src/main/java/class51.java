public class class51 implements class281 {
	int field239;
	int field240;
	int field241;
	int field242;
	int field243;
	int field244;

	class51() {
	}

	@Override
	public void method1481(class353 var1) {
		if (var1.field2442 > this.field242) {
			var1.field2442 = this.field242;
		}

		if (var1.field2444 < this.field242) {
			var1.field2444 = this.field242;
		}

		if (var1.field2450 > this.field243) {
			var1.field2450 = this.field243;
		}

		if (var1.field2447 < this.field243) {
			var1.field2447 = this.field243;
		}

	}

	@Override
	public boolean method1476(int var1, int var2, int var3) {
		if (var1 >= this.field244 && var1 < this.field244 + this.field240) {
			return var2 >> 6 == this.field241 && this.field239 == var3 >> 6;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1477(int var1, int var2) {
		return this.field242 == var1 >> 6 && this.field243 == var2 >> 6;
	}

	@Override
	public int[] method1478(int var1, int var2, int var3) {
		if (!this.method1476(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field242 * 64 - this.field241 * 64 + var2, var3 + (this.field243 * 64 - this.field239 * 64)};
			return var5;
		}
	}

	@Override
	public class370 method1480(int var1, int var2) {
		if (!this.method1477(var1, var2)) {
			return null;
		} else {
			int var4 = this.field241 * 64 - this.field242 * 64 + var1;
			int var5 = this.field239 * 64 - this.field243 * 64 + var2;
			return new class370(this.field244, var4, var5);
		}
	}

	@Override
	public void method1479(Buffer var1) {
		this.field244 = var1.readUnsignedByte();
		this.field240 = var1.readUnsignedByte();
		this.field241 = var1.readUnsignedShort();
		this.field239 = var1.readUnsignedShort();
		this.field242 = var1.readUnsignedShort();
		this.field243 = var1.readUnsignedShort();
		this.method207();
	}

	void method207() {
	}
}
