public class class7 extends class22 {
	int field32;
	public boolean field36;
	public byte[] field35;
	public int field33;
	public int field34;

	class7(int var1, byte[] var2, int var3, int var4) {
		this.field34 = var1;
		this.field35 = var2;
		this.field33 = var3;
		this.field32 = var4;
	}

	class7(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field34 = var1;
		this.field35 = var2;
		this.field33 = var3;
		this.field32 = var4;
		this.field36 = var5;
	}

	public class7 method41(class388 var1) {
		this.field35 = var1.method1823(this.field35);
		this.field34 = var1.method1824(this.field34);
		if (this.field33 == this.field32) {
			this.field33 = this.field32 = var1.method1826(this.field33);
		} else {
			this.field33 = var1.method1826(this.field33);
			this.field32 = var1.method1826(this.field32);
			if (this.field33 == this.field32) {
				--this.field33;
			}
		}

		return this;
	}
}
