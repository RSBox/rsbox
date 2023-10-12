public class class386 implements class281 {
	static int field2656;
	int field2646;
	int field2647;
	int field2648;
	int field2649;
	int field2650;
	int field2651;
	int field2652;
	int field2653;
	int field2654;
	int field2655;

	class386() {
	}

	@Override
	public void method1481(class353 var1) {
		if (var1.field2442 > this.field2647) {
			var1.field2442 = this.field2647;
		}

		if (var1.field2444 < this.field2647) {
			var1.field2444 = this.field2647;
		}

		if (var1.field2450 > this.field2651) {
			var1.field2450 = this.field2651;
		}

		if (var1.field2447 < this.field2651) {
			var1.field2447 = this.field2651;
		}

	}

	@Override
	public boolean method1476(int var1, int var2, int var3) {
		if (var1 >= this.field2652 && var1 < this.field2652 + this.field2655) {
			return var2 >= (this.field2648 << 6) + (this.field2650 << 3) && var2 <= (this.field2650 << 3) + (this.field2648 << 6) + 7 && var3 >= (this.field2649 << 6) + (this.field2646 << 3) && var3 <= 7 + (this.field2646 << 3) + (this.field2649 << 6);
		} else {
			return false;
		}
	}

	@Override
	public boolean method1477(int var1, int var2) {
		return var1 >= (this.field2647 << 6) + (this.field2654 << 3) && var1 <= 7 + (this.field2654 << 3) + (this.field2647 << 6) && var2 >= (this.field2651 << 6) + (this.field2653 << 3) && var2 <= 7 + (this.field2653 << 3) + (this.field2651 << 6);
	}

	@Override
	public int[] method1478(int var1, int var2, int var3) {
		if (!this.method1476(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2654 * 8 - this.field2650 * 8 + this.field2647 * 64 - this.field2648 * 64 + var2, var3 + (this.field2651 * 64 - this.field2649 * 64) + (this.field2653 * 8 - this.field2646 * 8)};
			return var5;
		}
	}

	@Override
	public class370 method1480(int var1, int var2) {
		if (!this.method1477(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2650 * 8 - this.field2654 * 8 + var1 + (this.field2648 * 64 - this.field2647 * 64);
			int var5 = this.field2646 * 8 - this.field2653 * 8 + this.field2649 * 64 - this.field2651 * 64 + var2;
			return new class370(this.field2652, var4, var5);
		}
	}

	@Override
	public void method1479(Buffer var1) {
		this.field2652 = var1.readUnsignedByte();
		this.field2655 = var1.readUnsignedByte();
		this.field2648 = var1.readUnsignedShort();
		this.field2650 = var1.readUnsignedByte();
		this.field2649 = var1.readUnsignedShort();
		this.field2646 = var1.readUnsignedByte();
		this.field2647 = var1.readUnsignedShort();
		this.field2654 = var1.readUnsignedByte();
		this.field2651 = var1.readUnsignedShort();
		this.field2653 = var1.readUnsignedByte();
		this.method1821();
	}

	void method1821() {
	}
}
