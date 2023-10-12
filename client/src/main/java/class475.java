public class class475 implements class281 {
	int field3326;
	int field3327;
	int field3328;
	int field3329;
	int field3330;
	int field3331;
	int field3332;
	int field3333;
	int field3334;
	int field3335;
	int field3336;
	int field3337;
	int field3338;
	int field3339;

	class475() {
	}

	@Override
	public void method1481(class353 var1) {
		if (var1.field2442 > this.field3330) {
			var1.field2442 = this.field3330;
		}

		if (var1.field2444 < this.field3330) {
			var1.field2444 = this.field3330;
		}

		if (var1.field2450 > this.field3331) {
			var1.field2450 = this.field3331;
		}

		if (var1.field2447 < this.field3331) {
			var1.field2447 = this.field3331;
		}

	}

	@Override
	public boolean method1476(int var1, int var2, int var3) {
		if (var1 >= this.field3329 && var1 < this.field3327 + this.field3329) {
			return var2 >= (this.field3328 << 6) + (this.field3332 << 3) && var2 <= (this.field3328 << 6) + (this.field3334 << 3) + 7 && var3 >= (this.field3338 << 6) + (this.field3336 << 3) && var3 <= (this.field3338 << 6) + (this.field3326 << 3) + 7;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1477(int var1, int var2) {
		return var1 >= (this.field3330 << 6) + (this.field3335 << 3) && var1 <= 7 + (this.field3333 << 3) + (this.field3330 << 6) && var2 >= (this.field3337 << 3) + (this.field3331 << 6) && var2 <= (this.field3331 << 6) + (this.field3339 << 3) + 7;
	}

	@Override
	public int[] method1478(int var1, int var2, int var3) {
		if (!this.method1476(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field3335 * 8 - this.field3332 * 8 + this.field3330 * 64 - this.field3328 * 64 + var2, this.field3331 * 64 - this.field3338 * 64 + var3 + (this.field3337 * 8 - this.field3336 * 8)};
			return var5;
		}
	}

	@Override
	public class370 method1480(int var1, int var2) {
		if (!this.method1477(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3332 * 8 - this.field3335 * 8 + var1 + (this.field3328 * 64 - this.field3330 * 64);
			int var5 = this.field3336 * 8 - this.field3337 * 8 + var2 + (this.field3338 * 64 - this.field3331 * 64);
			return new class370(this.field3329, var4, var5);
		}
	}

	@Override
	public void method1479(Buffer var1) {
		this.field3329 = var1.readUnsignedByte();
		this.field3327 = var1.readUnsignedByte();
		this.field3328 = var1.readUnsignedShort();
		this.field3332 = var1.readUnsignedByte();
		this.field3334 = var1.readUnsignedByte();
		this.field3338 = var1.readUnsignedShort();
		this.field3336 = var1.readUnsignedByte();
		this.field3326 = var1.readUnsignedByte();
		this.field3330 = var1.readUnsignedShort();
		this.field3335 = var1.readUnsignedByte();
		this.field3333 = var1.readUnsignedByte();
		this.field3331 = var1.readUnsignedShort();
		this.field3337 = var1.readUnsignedByte();
		this.field3339 = var1.readUnsignedByte();
		this.method2190();
	}

	void method2190() {
	}

	static void method2191() {
		class153.field1057 = null;
		class47.field233 = null;
		class11.field63 = null;
		class472.field3311 = null;
		class49.field236 = null;
		class108.field683 = null;
		class312.field2266 = null;
		class500.field3691 = null;
		class274.field1826 = null;
		class9.field41 = null;
		class94.field602 = null;
	}
}
