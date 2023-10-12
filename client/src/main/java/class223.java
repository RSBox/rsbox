public class class223 {
	int field1453;
	int field1456;
	int field1457;
	int field1458;
	int field1459;
	int field1460;
	int field1461;
	int field1462;
	int field1463;
	int[] field1454;
	int[] field1455;

	class223() {
		this.field1458 = 2;
		this.field1454 = new int[2];
		this.field1455 = new int[2];
		this.field1454[0] = 0;
		this.field1454[1] = 65535;
		this.field1455[0] = 0;
		this.field1455[1] = 65535;
	}

	final void method1018(Buffer var1) {
		this.field1453 = var1.readUnsignedByte();
		this.field1456 = var1.readInt();
		this.field1457 = var1.readInt();
		this.method1019(var1);
	}

	final void method1019(Buffer var1) {
		this.field1458 = var1.readUnsignedByte();
		this.field1454 = new int[this.field1458];
		this.field1455 = new int[this.field1458];

		for (int var2 = 0; var2 < this.field1458; ++var2) {
			this.field1454[var2] = var1.readUnsignedShort();
			this.field1455[var2] = var1.readUnsignedShort();
		}

	}

	final void method1020() {
		this.field1459 = 0;
		this.field1460 = 0;
		this.field1461 = 0;
		this.field1462 = 0;
		this.field1463 = 0;
	}

	final int method1021(int var1) {
		if (this.field1463 >= this.field1459) {
			this.field1462 = this.field1455[this.field1460++] << 15;
			if (this.field1460 >= this.field1458) {
				this.field1460 = this.field1458 - 1;
			}

			this.field1459 = (int)((double)this.field1454[this.field1460] / 65536.0D * (double)var1);
			if (this.field1459 > this.field1463) {
				this.field1461 = ((this.field1455[this.field1460] << 15) - this.field1462) / (this.field1459 - this.field1463);
			}
		}

		this.field1462 += this.field1461;
		++this.field1463;
		return this.field1462 - this.field1461 >> 15;
	}
}
