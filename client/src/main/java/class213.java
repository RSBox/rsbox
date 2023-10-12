public final class class213 {
	static class213[] field1395;
	static int field1394;
	static int field1396;
	float field1397;
	float field1398;
	float field1399;
	float field1400;

	static {
		field1395 = new class213[0];
		method991(100);
		new class213();
	}

	class213() {
		this.method987();
	}

	public void method990() {
		synchronized(field1395) {
			if (field1394 < field1396 - 1) {
				field1395[++field1394 - 1] = this;
			}

		}
	}

	void method988(float var1, float var2, float var3, float var4) {
		this.field1397 = var1;
		this.field1398 = var2;
		this.field1399 = var3;
		this.field1400 = var4;
	}

	public void method986(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field1397 = var1 * var6;
		this.field1398 = var6 * var2;
		this.field1399 = var6 * var3;
		this.field1400 = var7;
	}

	final void method987() {
		this.field1399 = 0.0F;
		this.field1398 = 0.0F;
		this.field1397 = 0.0F;
		this.field1400 = 1.0F;
	}

	public final void method989(class213 var1) {
		this.method988(this.field1400 * var1.field1397 + this.field1397 * var1.field1400 + var1.field1398 * this.field1399 - var1.field1399 * this.field1398, this.field1397 * var1.field1399 + this.field1400 * var1.field1398 + (this.field1398 * var1.field1400 - this.field1399 * var1.field1397), var1.field1399 * this.field1400 + (var1.field1400 * this.field1399 + this.field1398 * var1.field1397 - this.field1397 * var1.field1398), var1.field1400 * this.field1400 - this.field1397 * var1.field1397 - var1.field1398 * this.field1398 - var1.field1399 * this.field1399);
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class213)) {
			return false;
		} else {
			class213 var2 = (class213)var1;
			return this.field1397 == var2.field1397 && var2.field1398 == this.field1398 && this.field1399 == var2.field1399 && this.field1400 == var2.field1400;
		}
	}

	@Override
	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field1397 + var2 * 31.0F;
		var2 = this.field1398 + var2 * 31.0F;
		var2 = var2 * 31.0F + this.field1399;
		var2 = this.field1400 + var2 * 31.0F;
		return (int)var2;
	}

	@Override
	public String toString() {
		return this.field1397 + "," + this.field1398 + "," + this.field1399 + "," + this.field1400;
	}

	static void method991(int var0) {
		field1396 = 100;
		field1395 = new class213[100];
		field1394 = 0;
	}

	public static class213 method992() {
		synchronized(field1395) {
			if (field1394 == 0) {
				return new class213();
			} else {
				field1395[--field1394].method987();
				return field1395[field1394];
			}
		}
	}
}
