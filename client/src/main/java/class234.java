public class class234 {
	boolean field1548;
	boolean field1552;
	boolean field1556;
	boolean field1558;
	class166 field1547;
	class166 field1553;
	class220[] field1541;
	float field1538;
	float field1540;
	float field1542;
	float field1543;
	float field1544;
	float field1545;
	float field1546;
	float field1549;
	float field1550;
	float field1551;
	float field1554;
	float field1559;
	float[] field1555;
	int field1537;
	int field1539;
	int field1557;

	class234() {
		this.field1552 = true;
		this.field1539 = 0;
	}

	int method1084(Buffer var1, int var2) {
		int var4 = var1.readUnsignedShort();
		class244.method1128(var1.readUnsignedByte());
		int var6 = var1.readUnsignedByte();
		class166 var7 = (class166)class26.method87(class166.method882(), var6);
		if (var7 == null) {
			var7 = class166.field1176;
		}

		this.field1547 = var7;
		int var8 = var1.readUnsignedByte();
		class166 var9 = (class166)class26.method87(class166.method882(), var8);
		if (null == var9) {
			var9 = class166.field1176;
		}

		this.field1553 = var9;
		this.field1558 = var1.readUnsignedByte() != 0;
		this.field1541 = new class220[var4];
		class220 var12 = null;

		for (int var10 = 0; var10 < var4; ++var10) {
			class220 var11 = new class220();
			var11.method1016(var1, var2);
			this.field1541[var10] = var11;
			if (null != var12) {
				var12.field1446 = var11;
			}

			var12 = var11;
		}

		return var4;
	}

	void method1080() {
		this.field1537 = this.field1541[0].field1445;
		this.field1557 = this.field1541[this.method1077() - 1].field1445;
		this.field1555 = new float[this.method1082() + 1];

		for (int var2 = this.method1078(); var2 <= this.method1079(); ++var2) {
			this.field1555[var2 - this.method1078()] = class384.method1805(this, (float)var2);
		}

		this.field1541 = null;
		this.field1540 = class384.method1805(this, (float)(this.method1078() - 1));
		this.field1559 = class384.method1805(this, (float)(this.method1079() + 1));
	}

	public float method1081(int var1) {
		if (var1 < this.method1078()) {
			return this.field1540;
		} else {
			return var1 > this.method1079() ? this.field1559 : this.field1555[var1 - this.method1078()];
		}
	}

	int method1078() {
		return this.field1537;
	}

	int method1079() {
		return this.field1557;
	}

	int method1082() {
		return this.method1079() - this.method1078();
	}

	int method1083(float var1) {
		if (this.field1539 < 0 || (float)this.field1541[this.field1539].field1445 > var1 || null != this.field1541[this.field1539].field1446 && (float)this.field1541[this.field1539].field1446.field1445 <= var1) {
			if (var1 >= (float)this.method1078() && var1 <= (float)this.method1079()) {
				int var3 = this.method1077();
				int var4 = this.field1539;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < (float)this.field1541[var7].field1445) {
							if (var1 > (float)this.field1541[var7 - 1].field1445) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (var1 <= (float)this.field1541[var7].field1445) {
								var4 = var7;
								break;
							}

							if (var1 < (float)this.field1541[var7 + 1].field1445) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while(var5 <= var6);
				}

				if (this.field1539 != var4) {
					this.field1539 = var4;
					this.field1552 = true;
				}

				return this.field1539;
			} else {
				return -1;
			}
		} else {
			return this.field1539;
		}
	}

	class220 method1085(float var1) {
		int var3 = this.method1083(var1);
		return var3 >= 0 && var3 < this.field1541.length ? this.field1541[var3] : null;
	}

	int method1077() {
		return null == this.field1541 ? 0 : this.field1541.length;
	}
}
