public class class232 extends class124 {
	int field1529;
	int field1530;
	int field1531;
	int field1532;

	class232() {
	}

	void method1071(Buffer var1) {
		int var3 = var1.readUnsignedByte();
		if (var3 != class58.field274.field273) {
			throw new IllegalStateException("");
		} else {
			super.field805 = var1.readUnsignedByte();
			super.field806 = var1.readUnsignedByte();
			super.field804 = var1.readUnsignedShort();
			super.field802 = var1.readUnsignedShort();
			this.field1531 = var1.readUnsignedByte();
			this.field1530 = var1.readUnsignedByte();
			super.field803 = var1.readUnsignedShort();
			super.field816 = var1.readUnsignedShort();
			this.field1532 = var1.readUnsignedByte();
			this.field1529 = var1.readUnsignedByte();
			super.field807 = var1.method2482();
			super.field812 = var1.method2482();
		}
	}

	@Override
	void method589(Buffer var1) {
		super.field806 = Math.min(super.field806, 4);
		super.field808 = new short[1][64][64];
		super.field815 = new short[super.field806][64][64];
		super.field809 = new byte[super.field806][64][64];
		super.field810 = new byte[super.field806][64][64];
		super.field811 = new class222[super.field806][64][64][];
		int var3 = var1.readUnsignedByte();
		if (var3 != class216.field1410.field1408) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			int var7 = var1.readUnsignedByte();
			if (super.field803 == var4 && var5 == super.field816 && var6 == this.field1532 && var7 == this.field1529) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method586(this.field1532 * 8 + var8, this.field1529 * 8 + var9, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class232)) {
			return false;
		} else {
			class232 var2 = (class232)var1;
			if (var2.field803 == super.field803 && var2.field816 == super.field816) {
				return var2.field1532 == this.field1532 && var2.field1529 == this.field1529;
			} else {
				return false;
			}
		}
	}

	@Override
	public int hashCode() {
		return super.field803 | super.field816 << 8 | this.field1532 << 16 | this.field1529 << 24;
	}

	int method1072() {
		return this.field1531;
	}

	int method1075() {
		return this.field1530;
	}

	int method1074() {
		return this.field1532;
	}

	int method1073() {
		return this.field1529;
	}
}
