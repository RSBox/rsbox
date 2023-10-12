public class class311 implements class281 {
	static int[] field2257;
	int field2255;
	int field2256;
	int field2258;
	int field2259;
	int field2260;
	int field2261;
	int field2262;
	int field2263;
	int field2264;
	int field2265;

	class311() {
	}

	@Override
	public void method1481(class353 var1) {
		if (var1.field2442 > this.field2261) {
			var1.field2442 = this.field2261;
		}

		if (var1.field2444 < this.field2259) {
			var1.field2444 = this.field2259;
		}

		if (var1.field2450 > this.field2262) {
			var1.field2450 = this.field2262;
		}

		if (var1.field2447 < this.field2264) {
			var1.field2447 = this.field2264;
		}

	}

	@Override
	public boolean method1476(int var1, int var2, int var3) {
		if (var1 >= this.field2255 && var1 < this.field2255 + this.field2256) {
			return var2 >> 6 >= this.field2258 && var2 >> 6 <= this.field2265 && var3 >> 6 >= this.field2263 && var3 >> 6 <= this.field2260;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1477(int var1, int var2) {
		return var1 >> 6 >= this.field2261 && var1 >> 6 <= this.field2259 && var2 >> 6 >= this.field2262 && var2 >> 6 <= this.field2264;
	}

	@Override
	public int[] method1478(int var1, int var2, int var3) {
		if (!this.method1476(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2261 * 64 - this.field2258 * 64), var3 + (this.field2262 * 64 - this.field2263 * 64)};
			return var5;
		}
	}

	@Override
	public class370 method1480(int var1, int var2) {
		if (!this.method1477(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2258 * 64 - this.field2261 * 64 + var1;
			int var5 = this.field2263 * 64 - this.field2262 * 64 + var2;
			return new class370(this.field2255, var4, var5);
		}
	}

	@Override
	public void method1479(Buffer var1) {
		this.field2255 = var1.readUnsignedByte();
		this.field2256 = var1.readUnsignedByte();
		this.field2258 = var1.readUnsignedShort();
		this.field2263 = var1.readUnsignedShort();
		this.field2265 = var1.readUnsignedShort();
		this.field2260 = var1.readUnsignedShort();
		this.field2261 = var1.readUnsignedShort();
		this.field2262 = var1.readUnsignedShort();
		this.field2259 = var1.readUnsignedShort();
		this.field2264 = var1.readUnsignedShort();
		this.method1569();
	}

	void method1569() {
	}
}
