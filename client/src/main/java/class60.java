public class class60 extends class124 {
	class60() {
	}

	void method256(Buffer var1) {
		int var3 = var1.readUnsignedByte();
		if (class58.field275.field273 != var3) {
			throw new IllegalStateException("");
		} else {
			super.field805 = var1.readUnsignedByte();
			super.field806 = var1.readUnsignedByte();
			super.field804 = var1.readUnsignedShort();
			super.field802 = var1.readUnsignedShort();
			super.field803 = var1.readUnsignedShort();
			super.field816 = var1.readUnsignedShort();
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
		if (class216.field1409.field1408 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			if (super.field803 == var4 && super.field816 == var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method586(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class60)) {
			return false;
		} else {
			class60 var2 = (class60)var1;
			return var2.field803 == super.field803 && var2.field816 == super.field816;
		}
	}

	@Override
	public int hashCode() {
		return super.field803 | super.field816 << 8;
	}
}
